package be.e1.bssv.J564205;

import be.e1.bssv.J564205.valueobject.InternalVOGetUDC;
import be.e1.bssv.J564205.valueobject.InternalVOGetUoMConversion;
import be.e1.bssv.J564205.valueobject.InternalVOSalesLineDetail;
import be.e1.bssv.J564205.valueobject.InternalVOTSOSalesLines;

import be.e1.bssv.J564205.valueobject.InternalVOWOHeaderTag;

import be.e1.bssv.J564205.valueobject.InternalVOWorkOrderDetail;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.exception.DBServiceException;
import oracle.e1.bssvfoundation.services.BSSVDBField;
import oracle.e1.bssvfoundation.services.BSSVDBFieldMap;
import oracle.e1.bssvfoundation.services.BSSVDBResultSet;
import oracle.e1.bssvfoundation.services.BSSVDBSortField;
import oracle.e1.bssvfoundation.services.BSSVDBWhereClauseBuilder;
import oracle.e1.bssvfoundation.services.BSSVDBWhereField;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.services.IDBService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_TSO_SalesLineProcessor extends BusinessService {
    /**
     * TODO: Create Java Doc for: GetSalesAndWorkOrderDetails
     * Method GetSalesAndWorkOrderDetails is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList GetSalesAndWorkOrderDetails(IContext context, IConnection connection, InternalVOTSOSalesLines internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "GetSalesAndWorkOrderDetails", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        InternalVOSalesLineDetail SalesDetailVO = new InternalVOSalesLineDetail();

        SalesDetailVO.setSizeOfWhereFieldsArray(internalVO.getNoOfWhereFields());
        SalesDetailVO.setF4211_DOCO_WhereField(internalVO.getF4211_DOCO());
        SalesDetailVO.setF4211_DCTO_WhereField(internalVO.getF4211_DCTO());
        SalesDetailVO.setF4211_MCU_WhereField(internalVO.getF4211_MCU());
        SalesDetailVO.setF4211_LNID_WhereField(internalVO.getF4211_LNID());

        E1MessageList SalesQryMsgs = new E1MessageList();
        SalesQryMsgs = selectFromV564201F(context, connection, SalesDetailVO, -1);
        messages.addMessages(SalesQryMsgs);

        if(SalesDetailVO.getQueryResults() != null && SalesDetailVO.getQueryResults().size() > 0){
            InternalVOSalesLineDetail[] SalesLinesFetchedVO = new InternalVOSalesLineDetail[SalesDetailVO.getQueryResults().size()];

            InternalVOGetUDC SRP3UDCVO = new InternalVOGetUDC();
            SRP3UDCVO.setSzSystemCode("41");
            SRP3UDCVO.setSzRecordTypeCode("S3");

            for(int i = 0; i < SalesDetailVO.getQueryResults().size(); i++){
                SalesLinesFetchedVO[i].setF4211_MCU(SalesDetailVO.getQueryResults().get(i).getF4211_MCU());
                SalesLinesFetchedVO[i].setF4211_DOCO(SalesDetailVO.getQueryResults().get(i).getF4211_DOCO());
                SalesLinesFetchedVO[i].setF4211_LNID(SalesDetailVO.getQueryResults().get(i).getF4211_LNID());
                SalesLinesFetchedVO[i].setF4211_LNTY(SalesDetailVO.getQueryResults().get(i).getF4211_LNTY());
                SalesLinesFetchedVO[i].setF4211_ITM(SalesDetailVO.getQueryResults().get(i).getF4211_ITM());
                SalesLinesFetchedVO[i].setF4201_VR01(SalesDetailVO.getQueryResults().get(i).getF4201_VR01());
                SalesLinesFetchedVO[i].setF4211_LITM(SalesDetailVO.getQueryResults().get(i).getF4211_LITM());
                SalesLinesFetchedVO[i].setF4211_DSC1(SalesDetailVO.getQueryResults().get(i).getF4211_DSC1());
                SalesLinesFetchedVO[i].setF4211_MERL(SalesDetailVO.getQueryResults().get(i).getF4211_MERL());
                SalesLinesFetchedVO[i].setF564211_Z56SSN(SalesDetailVO.getQueryResults().get(i).getF564211_Z56SSN());
                SalesLinesFetchedVO[i].setF4211_SRP3(SalesDetailVO.getQueryResults().get(i).getF4211_SRP3());
                //Logic to get SRP3 Desc & Code
                SRP3UDCVO.setSzUserDefinedCode(SalesDetailVO.getQueryResults().get(i).getF4211_SRP3());

                E1MessageList UDCFetchMsgs = new E1MessageList();
                UDCFetchMsgs.addMessages(callGetUDC(context, connection, SRP3UDCVO));
                messages.addMessages(UDCFetchMsgs);
                UDCFetchMsgs = null;

                SalesLinesFetchedVO[i].setF4211_SRP3_Desc(SRP3UDCVO.getSzDescription001());

                SalesLinesFetchedVO[i].setF564201_Z56RET(SalesDetailVO.getQueryResults().get(i).getF564201_Z56RET());
                SalesLinesFetchedVO[i].setF4211_PMPN(SalesDetailVO.getQueryResults().get(i).getF4211_PMPN());
                SalesLinesFetchedVO[i].setF4211_UOM(SalesDetailVO.getQueryResults().get(i).getF4211_UOM());
                SalesLinesFetchedVO[i].setF4211_UORG(SalesDetailVO.getQueryResults().get(i).getF4211_UORG());

                //Logic for PAXCount
                InternalVOGetUoMConversion UoMConvVO = new InternalVOGetUoMConversion();

                UoMConvVO.setSzBranchPlant(SalesDetailVO.getQueryResults().get(i).getF4211_MCU());
                UoMConvVO.setMnShortItemNumber(SalesDetailVO.getQueryResults().get(i).getF4211_ITM());
                UoMConvVO.setSzFromUnitOfMeasure(SalesDetailVO.getQueryResults().get(i).getF4211_UOM());
                UoMConvVO.setSzToUnitOfMeasure("PX");
                UoMConvVO.setMnQuantityToConvert(SalesDetailVO.getQueryResults().get(i).getF4211_UORG());

                E1MessageList UoMConvMsgs = new E1MessageList();
                UoMConvMsgs.addMessages(callGetItemUoMConversionFactor(context, connection, UoMConvVO));
                messages.addMessages(UoMConvMsgs);
                UoMConvMsgs = null;

                SalesLinesFetchedVO[i].setPaxCount(UoMConvVO.getMnQuantityConvertedFromtoTo());
                UoMConvVO = null;

                //LOgic for F564803.Z56SCAP
                InternalVOWOHeaderTag WOHeaderTagVO = new InternalVOWOHeaderTag();

                WOHeaderTagVO.setF564803_DOCO(SalesDetailVO.getQueryResults().get(i).getF4211_DOCO());

                E1MessageList F564803QryMsg = new E1MessageList();
                F564803QryMsg.addMessages(selectFromF564803(context, connection, WOHeaderTagVO, -1));
                messages.addMessages(F564803QryMsg);
                F564803QryMsg = null;

                if(WOHeaderTagVO.getQueryResults() != null  && WOHeaderTagVO.getQueryResults().size() > 0){
                    SalesLinesFetchedVO[i].setF564803_Z56SCAP(WOHeaderTagVO.getQueryResults().get(0).getF564803_Z56SCAP());
                }

                WOHeaderTagVO = null;

                //Logic for work orders Do a fetch on V564801K based on F4211.PMPN & F4211.LITM  & get F4801.DOCO/DCTO & F4220.SRL1
                InternalVOWorkOrderDetail GetWorkOrderVO = new InternalVOWorkOrderDetail();

                GetWorkOrderVO.setF4211_LITM_WhereField(SalesDetailVO.getQueryResults().get(i).getF4211_LITM());
                GetWorkOrderVO.setF4211_PMPN_WhereField(SalesDetailVO.getQueryResults().get(i).getF4211_PMPN());

                E1MessageList WOQryMsgs = new E1MessageList();
                WOQryMsgs.addMessages(selectFromV564801K(context, connection, GetWorkOrderVO, -1));
                messages.addMessages(WOQryMsgs);
                WOQryMsgs = null;
                
                if(GetWorkOrderVO.getQueryResults() != null && GetWorkOrderVO.getQueryResults().size() > 0){
                    InternalVOWorkOrderDetail[] WorkOrderDetailVO = new InternalVOWorkOrderDetail[GetWorkOrderVO.getQueryResults().size()];
                    
                    for(int j = 0; j < GetWorkOrderVO.getQueryResults().size(); j++){
                        WorkOrderDetailVO[j].setF4220_SRL1(GetWorkOrderVO.getQueryResults().get(j).getF4220_SRL1());
                        WorkOrderDetailVO[j].setF4801_DOCO(GetWorkOrderVO.getQueryResults().get(j).getF4801_DOCO());
                        WorkOrderDetailVO[j].setF4801_DCTO(GetWorkOrderVO.getQueryResults().get(j).getF4801_DCTO());
                    }    
                    SalesLinesFetchedVO[i].setRelatedWODetail(WorkOrderDetailVO);
                    
                    WorkOrderDetailVO = null;
                }
                GetWorkOrderVO = null;
            }
            internalVO.setTSOSalesLinesVO(SalesLinesFetchedVO);
        }

        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "GetSalesAndWorkOrderDetails");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Selects records from the V564201F business view.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F4211.DOCO, F4211.LNID, F4211.MCU, F4211.VR01, F4211.ITM, F4211.LITM, F4211.DSC1, F4211.LNTY, F564211.Z56SSN, F4211.MERL, F564201.Z56RET, F4211.SRP3, F4211.UOM, F4211.UORG
     *
     * FROM V564201F
     *
     * WHERE F4211.DOCO=? AND F4211.DCTO=? AND F4211.MCU=? AND F4211.LNID=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromV564201F(IContext context, IConnection connection, InternalVOSalesLineDetail internalVO,
        long maxReturnedRows) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        {new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
         new BSSVDBField("F4211.LNID"), // Numeric - LineNumber
         new BSSVDBField("F4211.MCU"), // String - CostCenter
         new BSSVDBField("F4201.VR01"), // String - Reference1
         new BSSVDBField("F4211.ITM"), // Numeric - IdentifierShortItem
         new BSSVDBField("F4211.LITM"), // String - Identifier2ndItem
         new BSSVDBField("F4211.DSC1"), // String - DescriptionLine1
         new BSSVDBField("F4211.LNTY"), // String - LineType
         new BSSVDBField("F564211.Z56SSN"), // String - 56ShipSetNumber
         new BSSVDBField("F4211.MERL"), // String - MeRevisionLevel
         new BSSVDBField("F564201.Z56RET"), // String - 56RetroCode
         new BSSVDBField("F4211.SRP3"), // String - SalesReportingCode3
         new BSSVDBField("F4211.UOM"), // String - UnitOfMeasureAsInput
         new BSSVDBField("F4211.UORG") // Numeric - UnitsTransactionQty
         } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields = new BSSVDBWhereField[internalVO.getSizeOfWhereFieldsArray()];
        
        int index = 0;
        
        if(index < internalVO.getSizeOfWhereFieldsArray()){
            if(internalVO.getF4211_DOCO_WhereField().intValue() > 0){
                whereFields[index] = new BSSVDBWhereField(null, new BSSVDBField("F4211.DOCO"), IDBService.EQUALS, internalVO.getF4211_DOCO_WhereField());
                index++;
            }
        }
        
        if(index < internalVO.getSizeOfWhereFieldsArray()){
            if(internalVO.getF4211_DCTO_WhereField() != null && (!internalVO.getF4211_DCTO_WhereField().equals(""))){
                whereFields[index] = new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.DCTO"), IDBService.EQUALS, internalVO.getF4211_DCTO_WhereField());
                index++;
            }
        }
        
        if(index < internalVO.getSizeOfWhereFieldsArray()){
            if(internalVO.getF4211_MCU_WhereField() != null && (!internalVO.getF4211_MCU_WhereField().equals(""))){
                whereFields[index] = new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.MCU"), IDBService.EQUALS, internalVO.getF4211_MCU_WhereField());
                index++;
            }
        }
         
        if(index < internalVO.getSizeOfWhereFieldsArray()){
            if(internalVO.getF4211_LNID_WhereField().intValue() > 0){
                whereFields[index] = new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.LNID"), IDBService.EQUALS, internalVO.getF4211_LNID_WhereField());
                index++;
            }
        }

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet = dbService.select(context, connection, "V564201F", IDBService.DB_BSVW, selectDistinct,
                 maxReturnedRows, selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalVOSalesLineDetail result = new InternalVOSalesLineDetail();
                    result.setF4211_DOCO((MathNumeric)map.getValue("F4211.DOCO"));
                    result.setF4211_LNID((MathNumeric)map.getValue("F4211.LNID"));
                    result.setF4211_MCU((String)map.getValue("F4211.MCU"));
                    result.setF4201_VR01((String)map.getValue("F4201.VR01"));
                    result.setF4211_ITM((MathNumeric)map.getValue("F4211.ITM"));
                    result.setF4211_LITM((String)map.getValue("F4211.LITM"));
                    result.setF4211_DSC1((String)map.getValue("F4211.DSC1"));
                    result.setF4211_LNTY((String)map.getValue("F4211.LNTY"));
                    result.setF564211_Z56SSN((String)map.getValue("F564211.Z56SSN"));
                    result.setF4211_MERL((String)map.getValue("F4211.MERL"));
                    result.setF564201_Z56RET((String)map.getValue("F564201.Z56RET"));
                    result.setF4211_SRP3((String)map.getValue("F4211.SRP3"));
                    result.setF4211_UOM((String)map.getValue("F4211.UOM"));
                    result.setF4211_UORG((MathNumeric)map.getValue("F4211.UORG"));
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }

    /**
     * Calls the GetUDC(X0005) business function which has the D0005 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetUDC(IContext context, IConnection connection, InternalVOGetUDC internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szSystemCode", internalVO.getSzSystemCode());
        bsfnParams.setValue("szRecordTypeCode", internalVO.getSzRecordTypeCode());
        bsfnParams.setValue("szUserDefinedCode", internalVO.getSzUserDefinedCode());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetUDC", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setSzDescription001((String)bsfnParams.getValue("szDescription001"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the GetItemUoMConversionFactor(B4000520) business function which has the D4000520 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetItemUoMConversionFactor(IContext context, IConnection connection, InternalVOGetUoMConversion internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szBranchPlant", internalVO.getSzBranchPlant());
        bsfnParams.setValue("szFromUnitOfMeasure", internalVO.getSzFromUnitOfMeasure());
        bsfnParams.setValue("szToUnitOfMeasure", internalVO.getSzToUnitOfMeasure());
        bsfnParams.setValue("mnQuantityToConvert", internalVO.getMnQuantityToConvert());
        bsfnParams.setValue("mnShortItemNumber", internalVO.getMnShortItemNumber());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetItemUoMConversionFactor", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setMnQuantityConvertedFromtoTo((MathNumeric)bsfnParams.getValue("mnQuantityConvertedFromtoTo"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Selects records from the F564803 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F564803.Z56SCAP
     *
     * FROM F564803
     *
     * WHERE F564803.DOCO=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF564803(IContext context, IConnection connection, InternalVOWOHeaderTag internalVO,
        long maxReturnedRows) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        {new BSSVDBField("F564803.Z56SCAP") // Numeric - LineCellCapacityPerDay
         } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields =
        {new BSSVDBWhereField(null, new BSSVDBField("F564803.DOCO"), IDBService.EQUALS, internalVO.getF564803_DOCO())};

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet = dbService.select(context, connection, "F564803", IDBService.DB_TABLE, selectDistinct,
                 maxReturnedRows, selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalVOWOHeaderTag result = new InternalVOWOHeaderTag();
                    result.setF564803_Z56SCAP((MathNumeric)map.getValue("F564803.Z56SCAP"));
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }

    /**
     * Selects records from the V564801K business view.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F4801.DOCO, F4801.DCTO, F4220.SRL1
     *
     * FROM V564801K
     *
     * WHERE F4220.LITM=? AND F4801T.PMPN=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromV564801K(IContext context, IConnection connection, InternalVOWorkOrderDetail internalVO,
        long maxReturnedRows) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        {new BSSVDBField("F4801.DOCO"), // Numeric - DocumentOrderInvoiceE
         new BSSVDBField("F4801.DCTO"), // String - OrderType
         new BSSVDBField("F4220.SRL1") // String - SerialNumber1
         } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields =
        {new BSSVDBWhereField(null, new BSSVDBField("F4220.LITM"), IDBService.EQUALS, internalVO.getF4211_LITM_WhereField()),
         new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4801T.PMPN"), IDBService.EQUALS, internalVO.getF4211_PMPN_WhereField())};

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet = dbService.select(context, connection, "V564801K", IDBService.DB_BSVW, selectDistinct,
                 maxReturnedRows, selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalVOWorkOrderDetail result = new InternalVOWorkOrderDetail();
                    result.setF4801_DOCO((MathNumeric)map.getValue("F4801.DOCO"));
                    result.setF4801_DCTO((String)map.getValue("F4801.DCTO"));
                    result.setF4220_SRL1((String)map.getValue("F4220.SRL1"));
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }
}
