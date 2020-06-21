package be.e1.bssv.util.J560000;

import be.e1.bssv.util.J560000.valueobject.ItemRevisions_D59RC001A;
import be.e1.bssv.util.J560000.valueobject.SupDataF4211A_D564211B;
import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;

import be.e1.bssv.util.J560000.valueobject.SupDataF4311_D5600007B;

import java.util.Date;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class DataEnrichmentMgr
    extends BusinessService
{
    /**
     * TODO: Create Java Doc for: InternalF4211SupData
     * Method InternalF4211SupData is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList InternalF4211SupData(IContext context, IConnection connection, SupDataF4211_D5600007C internalVO)
    {
        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalF4211SupData", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        //call function business function
        messages.addMessages(callBE_F4211SupplementalData(context, connection, internalVO));

        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalF4211SupData");
        //Call finish internal method passing context.
        return messages;
    }

    /**
     * TODO: Create Java Doc for: InternalF4311SupData
     * Method InternalF4311SupData is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList InternalF4311SupData(IContext context, IConnection connection, SupDataF4311_D5600007B internalVO)
    {
        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalF4311SupData", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        /* Fetch or update F4311 data */
        messages.addMessages(callBE_F4311SupplementalData(context, connection, internalVO));

        /* Retrieve Item Rev Lsevel */
        ItemRevisions_D59RC001A itemRev = new ItemRevisions_D59RC001A();
        itemRev.setCActionCode("1");
        itemRev.setSzItemNoUnknownFormat(internalVO.getSzSecondItemNumber());
        messages.addMessages(callCheckAndRetrieveItemRev(context, connection, itemRev));

        String currentItem = internalVO.getSzSecondItemNumber();
        String baseItem = itemRev.getSzItemNoUnknownFormat();
        if (baseItem != null && currentItem != null)
        {
            currentItem = currentItem.trim();
            baseItem = baseItem.trim();
            if (!currentItem.equals(baseItem))
            {
                internalVO.setSzSecondItemNumber(baseItem);
            }
            else
            {
                internalVO.setSzSecondItemNumber(null);
            }
        }
        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalF4311SupData");
        //Call finish internal method passing context.
        return messages;
    }

    public static E1MessageList InternalF4211SupDataA(IContext context, IConnection connection, SupDataF4211A_D564211B internalVO)
    {
        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalF4211SupDataA", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        //call function business function
        messages.addMessages(callF4211DataEnrichmentEnhanced(context, connection, internalVO));
        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalF4211SupDataA");
        //Call finish internal method passing context.
        return messages;
    }


    /**
     * Calls the BE_F4211SupplementalData(N5600007) business function which has the D5600007C datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_F4211SupplementalData(IContext context, IConnection connection, SupDataF4211_D5600007C internalVO)
    {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("cActionCode", internalVO.getCActionCode());
        bsfnParams.setValue("szOrderCompanySO", internalVO.getSzOrderCompanySO());
        bsfnParams.setValue("mnOrderNumberSO", internalVO.getMnOrderNumberSO());
        bsfnParams.setValue("szOrderTypeSO", internalVO.getSzOrderTypeSO());
        bsfnParams.setValue("mnOrderLineSO", internalVO.getMnOrderLineSO());
        bsfnParams.setValue("szAuditUser", internalVO.getSzAuditUser());
        bsfnParams.setValue("szAuditProgram", internalVO.getSzAuditProgram());
        bsfnParams.setValue("cErrorFlag", internalVO.getCErrorFlag());
        bsfnParams.setValue("szErrorMessage", internalVO.getSzErrorMessage());
        bsfnParams.setValue("szRevisionLevel", internalVO.getSzRevisionLevel());

        try
        {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();
            //execute business function
            bsfnService.execute(context, connection, "BE_F4211SupplementalData", bsfnParams);
        }
        catch (BSFNServiceInvalidArgException invalidArgEx)
        {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx)
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }

        //map output parameters to output value object
        internalVO.setCActionCode(bsfnParams.getValue("cActionCode").toString());
        internalVO.setSzOrderCompanySO((String) bsfnParams.getValue("szOrderCompanySO"));
        internalVO.setMnOrderNumberSO((MathNumeric) bsfnParams.getValue("mnOrderNumberSO"));
        internalVO.setSzOrderTypeSO((String) bsfnParams.getValue("szOrderTypeSO"));
        internalVO.setMnOrderLineSO((MathNumeric) bsfnParams.getValue("mnOrderLineSO"));
        internalVO.setSzAuditUser((String) bsfnParams.getValue("szAuditUser"));
        internalVO.setSzAuditProgram((String) bsfnParams.getValue("szAuditProgram"));
        internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
        internalVO.setSzErrorMessage((String) bsfnParams.getValue("szErrorMessage"));
        internalVO.setSzRevisionLevel((String) bsfnParams.getValue("szRevisionLevel"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the BE_F4311SupplementalData(N5600007) business function which has the D5600007B datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_F4311SupplementalData(IContext context, IConnection connection, SupDataF4311_D5600007B internalVO)
    {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("cActionCode", internalVO.getCActionCode());
        bsfnParams.setValue("szOrderCompanyPO", internalVO.getSzOrderCompanyPO());
        bsfnParams.setValue("mnOrderNumberPO", internalVO.getMnOrderNumberPO());
        bsfnParams.setValue("szOrderTypePO", internalVO.getSzOrderTypePO());
        bsfnParams.setValue("szOrderSuffixPO", internalVO.getSzOrderSuffixPO());
        bsfnParams.setValue("mnOrderLineNumberPO", internalVO.getMnOrderLineNumberPO());
        bsfnParams.setValue("szRevisionLevel", internalVO.getSzRevisionLevel());
        bsfnParams.setValue("szBSPStatus", internalVO.getSzBSPStatus());
        bsfnParams.setValue("szAuditUserId", internalVO.getSzAuditUserId());
        bsfnParams.setValue("szAuditProgramId", internalVO.getSzAuditProgramId());
        bsfnParams.setValue("cErrorFlag", internalVO.getCErrorFlag());
        bsfnParams.setValue("szErrorDescription", internalVO.getSzErrorDescription());
        bsfnParams.setValue("szProductionNumber", internalVO.getSzProductionNumber());
        bsfnParams.setValue("cRevCntrlLineSplitIndicator", internalVO.getCRevControlLineSplitFlag());
        bsfnParams.setValue("szIdentifier2ndItem", internalVO.getSzSecondItemNumber());

        try
        {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();
            //execute business function
            bsfnService.execute(context, connection, "BE_F4311SupplementalData", bsfnParams);
        }
        catch (BSFNServiceInvalidArgException invalidArgEx)
        {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx)
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }

        //map output parameters to output value object
        internalVO.setCActionCode(bsfnParams.getValue("cActionCode").toString());
        internalVO.setSzOrderCompanyPO((String) bsfnParams.getValue("szOrderCompanyPO"));
        internalVO.setMnOrderNumberPO((MathNumeric) bsfnParams.getValue("mnOrderNumberPO"));
        internalVO.setSzOrderTypePO((String) bsfnParams.getValue("szOrderTypePO"));
        internalVO.setSzOrderSuffixPO((String) bsfnParams.getValue("szOrderSuffixPO"));
        internalVO.setMnOrderLineNumberPO((MathNumeric) bsfnParams.getValue("mnOrderLineNumberPO"));
        internalVO.setSzRevisionLevel((String) bsfnParams.getValue("szRevisionLevel"));
        internalVO.setSzBSPStatus((String) bsfnParams.getValue("szBSPStatus"));
        internalVO.setSzAuditUserId((String) bsfnParams.getValue("szAuditUserId"));
        internalVO.setSzAuditProgramId((String) bsfnParams.getValue("szAuditProgramId"));
        internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
        internalVO.setSzErrorDescription((String) bsfnParams.getValue("szErrorDescription"));
        internalVO.setSzProductionNumber((String) bsfnParams.getValue("szProductionNumber"));
        internalVO.setCRevControlLineSplitFlag((String) bsfnParams.getValue("cRevCntrlLineSplitIndicator"));
        internalVO.setSzSecondItemNumber((String) bsfnParams.getValue("szIdentifier2ndItem"));
        internalVO.setMnBuyerNumber((MathNumeric) bsfnParams.getValue("mnBuyerNumber"));
        internalVO.setSzRelatedOrderCompany((String)bsfnParams.getValue("szRelatedOrderCompany"));
        internalVO.setSzRelatedOrderNumber((String)bsfnParams.getValue("szRelatedOrderNumber"));
        internalVO.setSzRelatedOrderType((String)bsfnParams.getValue("szRelatedOrderType"));
        internalVO.setMnRelatedOrderLine((MathNumeric)bsfnParams.getValue("mnRelatedOrderLine"));
        internalVO.setSzBuyerName((String)bsfnParams.getValue("szBuyerName"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the CheckAndRetrieveItemRev(N59RC001) business function which has the D59RC001A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callCheckAndRetrieveItemRev(IContext context, IConnection connection, ItemRevisions_D59RC001A internalVO)
    {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("cActionCode", internalVO.getCActionCode());
        bsfnParams.setValue("cErrorCode", internalVO.getCErrorCode());
        bsfnParams.setValue("cSuppressErrorMessage", internalVO.getCSuppressErrorMessage());
        bsfnParams.setValue("szDataItem", internalVO.getSzDataItem());
        bsfnParams.setValue("szItemNoUnknownFormat", internalVO.getSzItemNoUnknownFormat());
        bsfnParams.setValue("cItemRevControl", internalVO.getCItemRevControl());
        bsfnParams.setValue("szRCBaseItemId", internalVO.getSzRCBaseItemId());
        bsfnParams.setValue("szRCRevItemId", internalVO.getSzRCRevItemId());
        bsfnParams.setValue("szRCRevisionBusinessUnit", internalVO.getSzRCRevisionBusinessUnit());
        bsfnParams.setValue("szRCLatestRev", internalVO.getSzRCLatestRev());
        bsfnParams.setValue("szRCRevisionId", internalVO.getSzRCRevisionId());
        bsfnParams.setValue("szEnteredItem_UITM", internalVO.getSzEnteredItem_UITM());

        try
        {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "CheckAndRetrieveItemRev", bsfnParams);
        }
        catch (BSFNServiceInvalidArgException invalidArgEx)
        {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx)
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }
        //map output parameters to output value object
        internalVO.setSzItemNoUnknownFormat((String) bsfnParams.getValue("szItemNoUnknownFormat"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the F4211DataEnrichmentEnhanced(N564211B) business function which has the D564211B datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callF4211DataEnrichmentEnhanced(IContext context, IConnection connection, SupDataF4211A_D564211B internalVO)
    {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szCompanyKeyOrderNo_KCOO", internalVO.getSzOrderCompany_KCOO());
        bsfnParams.setValue("mnDocumentOrderInvoiceE_DOCO", internalVO.getMnOrderNumber_DOCO());
        bsfnParams.setValue("szOrderType_DCTO", internalVO.getSzOrderType_DCTO());
        bsfnParams.setValue("mnLineNumber_LNID", internalVO.getMnLineNumber_LNID());

        try
        {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();
            //execute business function
            bsfnService.execute(context, connection, "F4211DataEnrichmentEnhanced", bsfnParams);
        }
        catch (BSFNServiceInvalidArgException invalidArgEx)
        {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx)
        {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }

        //map output parameters to output value object
        internalVO.setSzOrderCompany_KCOO((String) bsfnParams.getValue("szCompanyKeyOrderNo_KCOO"));
        internalVO.setMnOrderNumber_DOCO((MathNumeric) bsfnParams.getValue("mnDocumentOrderInvoiceE_DOCO"));
        internalVO.setSzOrderType_DCTO((String) bsfnParams.getValue("szOrderType_DCTO"));
        internalVO.setMnLineNumber_LNID((MathNumeric) bsfnParams.getValue("mnLineNumber_LNID"));
        internalVO.setSzProductionNumber_PMPN((String) bsfnParams.getValue("szProductionNumber_PMPN"));
        internalVO.setSzOperatorCode_Z56OPC((String) bsfnParams.getValue("szOperatorCode_Z56OPC"));
        internalVO.setSzAircraftType_Z56ACTS((String) bsfnParams.getValue("szAircraftType_Z56ACTS"));
        internalVO.setSzItemRevisionLevel_MERL((String) bsfnParams.getValue("szRevisionSODetail_MERL"));
        internalVO.setSzModel_RP27((String) bsfnParams.getValue("szModel_RP27"));
        internalVO.setSzModelName_DL01((String) bsfnParams.getValue("szModelName_DL01"));
        internalVO.setMnPassengerCount_SQOR((MathNumeric) bsfnParams.getValue("mnPassengerCount_SQOR"));
        internalVO.setJdBuildDate_STRT((Date) bsfnParams.getValue("jdBuildDate_STRT"));
        internalVO.setSzProductionLine_URRF((String) bsfnParams.getValue("szProductionLine_URRF"));
        internalVO.setSzProgramName_Z56MPGM((String) bsfnParams.getValue("szProgramName_Z56MPGM"));
        internalVO.setSzShipSetNumber_Z56SSN((String) bsfnParams.getValue("szShipSetNumber_Z56SSN"));
        internalVO.setSzTestSeatFLag_Z56SSN((String) bsfnParams.getValue("szTestSeatFLag_Z56SSN"));
        internalVO.setMnFinalDestinationAB_FTAN((MathNumeric) bsfnParams.getValue("mnFinalDestinationAB_FTAN"));
        internalVO.setSzFinalDestName_ALPH((String) bsfnParams.getValue("szFinalDestName_ALPH"));
        internalVO.setSzFinalDestAddressLine1_ADD1((String) bsfnParams.getValue("szFinalDestAddressLine1_ADD1"));
        internalVO.setSzFinalDestAddressLine2_ADD2((String) bsfnParams.getValue("szFinalDestAddressLine2_ADD2"));
        internalVO.setSzFinalDestAddressLine3_ADD3((String) bsfnParams.getValue("szFinalDestAddressLine3_ADD3"));
        internalVO.setSzFinalDestAddressLine4_ADD4((String) bsfnParams.getValue("szFinalDestAddressLine4_ADD4"));
        internalVO.setSzFinalDestCity_CTY1((String) bsfnParams.getValue("szFinalDestCity_CTY1"));
        internalVO.setSzFinalDestState_ADDS((String) bsfnParams.getValue("szFinalDestState_ADDS"));
        internalVO.setSzFinalDestCountry_CTR((String) bsfnParams.getValue("szFinalDestCountry_CTR"));
        internalVO.setSzFinalDestZipCode_ADDZ((String) bsfnParams.getValue("szFinalDestZipCode_ADDZ"));
        internalVO.setSzRecurringJobNumber_EMCU((String) bsfnParams.getValue("szRecurringJobNumber_EMCU"));
        internalVO.setSzNonRecurringJobNumber_EMCU((String) bsfnParams.getValue("szNonRecurringJobNumber_EMCU"));
        internalVO.setSzParentJobNumber_Z56PGM((String) bsfnParams.getValue("szParentJobNumber_Z56PGM"));
        internalVO.setSzRFQNumber_VR02((String) bsfnParams.getValue("szRFQNumber_VR02"));
        internalVO.setSzIncoterms_Z56INC((String) bsfnParams.getValue("szIncoterms_Z56INC"));
        internalVO.setSzFreightDescription_DL01((String) bsfnParams.getValue("szFreightDescription_DL01"));
        internalVO.setJdInvoiceDate_IVD((Date) bsfnParams.getValue("jdInvoiceDate_IVD"));
        internalVO.setSzTranckingNum_CNID((String) bsfnParams.getValue("szTranckingNum_CNID"));
        internalVO.setCStockingType_STKT(bsfnParams.getValue("cStockingType_STKT").toString());
        internalVO.setMnPlannerNumber_ANPL((MathNumeric) bsfnParams.getValue("mnAddressNumberPlanner_ANPL"));
        internalVO.setSzPlannerName_ALPH((String) bsfnParams.getValue("szPlannerName_ALPH"));
        internalVO.setMnBuyer_BUYR((MathNumeric) bsfnParams.getValue("mnBuyer_BUYR"));
        internalVO.setSzBuyerName_ALPH((String) bsfnParams.getValue("szBuyerName_ALPH"));
        internalVO.setSzSalesReportingCode5_SRP5((String) bsfnParams.getValue("szSalesReportingCode5_SRP5"));
        internalVO.setSzOperatorCodeDescription_DL01((String) bsfnParams.getValue("szOperatorCodeDescription_DL01"));
        internalVO.setSzProgramNumberDesc_DL01((String) bsfnParams.getValue("szProgramNumberDesc_DL01"));
        internalVO.setCFAIShipsetFlag_EV01(bsfnParams.getValue("cFAIShipsetFlag_EV01").toString());
        internalVO.setSzProgramManagerName_ALPH((String) bsfnParams.getValue("szProgramManagerName_ALPH"));
        internalVO.setSzOEMName_DL02((String) bsfnParams.getValue("szOEMName_DL02"));
        internalVO.setSzRevControlBaseItem_RCITMB((String) bsfnParams.getValue("szRCBaseItem_RCITMB"));
        internalVO.setSzAircraftTypeName_DL01((String) bsfnParams.getValue("szAircraftTypeName_DL01"));
        internalVO.setSzDetailCustomerPO_VR01((String) bsfnParams.getValue("szDetailCustomerPO_VR01"));
        internalVO.setSzCarrierName_ALPH((String) bsfnParams.getValue("szCarrierName_ALPH"));
        internalVO.setSzSpecialInstructions_COMMENT((String) bsfnParams.getValue("szSpecialInstructions_COMMENT"));
        internalVO.setSzSecondaryPONumber_Z56SPO((String) bsfnParams.getValue("szSecondaryPONumber"));
        internalVO.setSzTailNumber_Z56TAIL((String) bsfnParams.getValue("szTailNumber"));
        internalVO.setMnInvoiceNumber_DOC((MathNumeric) bsfnParams.getValue("mnInvoiceNumber_DOC"));
        internalVO.setSzSoldToName_ALPH((String) bsfnParams.getValue("szSoldToName_ALPH"));
        internalVO.setSzSoldToAddress1_ADD1((String) bsfnParams.getValue("szSoldToAddress1_ADD1"));
        internalVO.setSzSoldToAddress2_ADD2((String) bsfnParams.getValue("szSoldToAddress2_ADD2"));
        internalVO.setSzSoldToAddress3_ADD3((String) bsfnParams.getValue("szSoldToAddress3_ADD3"));
        internalVO.setSzSoldToAddress4_ADD4((String) bsfnParams.getValue("szSoldToAddress4_ADD4"));
        internalVO.setSzSoldToCity_CTY1((String) bsfnParams.getValue("szSoldToCity_CTY1"));
        internalVO.setSzSoldToState_ADDS((String) bsfnParams.getValue("szSoldToState_ADDS"));
        internalVO.setSzSoldToZip_ADDZ((String) bsfnParams.getValue("szSoldToZip_ADDZ"));
        internalVO.setSzSoldToCountry_CTR((String) bsfnParams.getValue("szSoldToCountry_CTR"));
        internalVO.setCPriorityCode_PRIO((String) bsfnParams.getValue("cPriorityCode_PRIO"));
        internalVO.setSzManufacturerSerialNum((String) bsfnParams.getValue("szManufacturerSerialNum"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
