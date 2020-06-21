package be.e1.bssv.util.J5601018;

import be.e1.bssv.util.J5601018.valueobject.BE_GetABSAddlData_D5601018A;

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
public abstract class BE_GetAbsAddlData extends BusinessService {
    /**
     * TODO: Create Java Doc for: BE_GetAbsAddlData
     * Method BE_GetAbsAddlData is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getAbsAddlData(IContext context, IConnection connection, BE_GetABSAddlData_D5601018A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getAbsAddlData", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(callBE_GetAdditionalABSData(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalBE_GetAbsAddlData");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the BE_GetAdditionalABSData(N5601018) business function which has the D5601018A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_GetAdditionalABSData(IContext context, IConnection connection, BE_GetABSAddlData_D5601018A internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnAddressNumber", internalVO.getMnAddressNumber());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "BE_GetAdditionalABSData", bsfnParams);
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
        internalVO.setMnAddressNumber((MathNumeric)bsfnParams.getValue("mnAddressNumber"));
        internalVO.setSz56RequestNumber((String)bsfnParams.getValue("sz56RequestNumber"));
        internalVO.setSz56Comments1((String)bsfnParams.getValue("sz56Comments1"));
        internalVO.setSz56Comments2((String)bsfnParams.getValue("sz56Comments2"));
        internalVO.setSz56Comments3((String)bsfnParams.getValue("sz56Comments3"));
        internalVO.setCBillingAddressType(bsfnParams.getValue("cBillingAddressType").toString());
        internalVO.setCPricePickListYN(bsfnParams.getValue("cPricePickListYN").toString());
        internalVO.setCPrintAdjustmentsonInvoic(bsfnParams.getValue("cPrintAdjustmentsonInvoic").toString());
        internalVO.setMnInvoiceCopies((MathNumeric)bsfnParams.getValue("mnInvoiceCopies"));
        internalVO.setSzFreightHandlingCode((String)bsfnParams.getValue("szFreightHandlingCode"));
        internalVO.setSzHoldOrdersCode((String)bsfnParams.getValue("szHoldOrdersCode"));
        internalVO.setCItemRestrictions(bsfnParams.getValue("cItemRestrictions").toString());
        internalVO.setCF0030BankTransitRecordType(bsfnParams.getValue("cF0030BankTransitRecordType").toString());
        internalVO.setSzF0030BankTransitNumber((String)bsfnParams.getValue("szF0030BankTransitNumber"));
        internalVO.setSzF0030CustBankAcctNumber((String)bsfnParams.getValue("szF0030CustBankAcctNumber"));
        internalVO.setSzF0030Description((String)bsfnParams.getValue("szF0030Description"));
        internalVO.setSzF0030ControlDigit((String)bsfnParams.getValue("szF0030ControlDigit"));
        internalVO.setSzF0030CurrencyCodeFrom((String)bsfnParams.getValue("szF0030CurrencyCodeFrom"));
        internalVO.setSzF0030ReferenceRollNumber((String)bsfnParams.getValue("szF0030ReferenceRollNumber"));
        internalVO.setSzCostCenter((String)bsfnParams.getValue("szCostCenter"));
        internalVO.setSzF0030SwiftCode((String)bsfnParams.getValue("szF0030SwiftCode"));
        internalVO.setCF0030CheckingorSavingsAccount(bsfnParams.getValue("cF0030CheckingorSavingsAccount").toString());
        internalVO.setSzRequestTransactionOriginator((String)bsfnParams.getValue("szRequestTransactionOriginator"));
        internalVO.setSzRequesterEmailAddress((String)bsfnParams.getValue("szRequesterEmailAddress"));
        internalVO.setMnF0030AddressNumberBank((MathNumeric)bsfnParams.getValue("mnF0030AddressNumberBank"));
        internalVO.setSzF0030InternationalBankAcct((String)bsfnParams.getValue("szF0030InternationalBankAcct"));
        internalVO.setMnRelatedAddressNo((MathNumeric)bsfnParams.getValue("mnRelatedAddressNo"));
        internalVO.setMnRequestLineNumber((MathNumeric)bsfnParams.getValue("mnRequestLineNumber"));
        internalVO.setCErrorCode(bsfnParams.getValue("cErrorCode").toString());
        internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));
        internalVO.setAmountDecimals((MathNumeric)bsfnParams.getValue("mnAmountDecimals"));
        internalVO.setQuantityDecimals((MathNumeric)bsfnParams.getValue("mnQuantityDecimals"));
        internalVO.setBatchProcessingMode((String)bsfnParams.getValue("cBatchProcessingMode"));
        internalVO.setPrintMessage((String)bsfnParams.getValue("szPrintMessage1"));
        internalVO.setMinimumOrderValue((MathNumeric)bsfnParams.getValue("mnMinimumOrderValue"));
        internalVO.setApplyFreight((String)bsfnParams.getValue("cApplyFreightYN"));
        internalVO.setPartialShipmentsAllowed((String)bsfnParams.getValue("cPartialShipmntsAllowY"));
        internalVO.setCustomerPORequired((String)bsfnParams.getValue("cCustomerPORequiredYN"));
        internalVO.setPartialOrderShipmentsAllowed((String)bsfnParams.getValue("cSpecialInstruction01"));
        internalVO.setSubstitutesAllowed((String)bsfnParams.getValue("cSubstitutesAllowedYN"));
        internalVO.setPriceAdjustmentSchedule((String)bsfnParams.getValue("szPriceAdjustmentScheduleN"));
        internalVO.setGroupCustomerPriceGp((String)bsfnParams.getValue("szGroupCustomerPriceGp"));
        internalVO.setCarrierNumber((MathNumeric)bsfnParams.getValue("mnCarrier"));
        internalVO.setPriorityCode((String)bsfnParams.getValue("cPriorityProcessing"));
        internalVO.setCheckCreditLevel((String)bsfnParams.getValue("cAccountsReceivableCps"));
        internalVO.setBackordersAllowed((String)bsfnParams.getValue("cBackordersAllowedYN"));
        

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
