package be.e1.bssv.util.J564209;

import be.e1.bssv.util.J564209.valueobject.InternalSOCatchupDS;

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
public abstract class SOCatchupMgr extends BusinessService {
    /**
     * TODO: Create Java Doc for: createSOCatchupData
     * Method createSOCatchupData is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList createSOCatchupData(IContext context, IConnection connection, InternalSOCatchupDS internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "createSOCatchupData", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(callSalesOrderCatchUpAPIProcess(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "createSOCatchupData");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the SalesOrderCatchUpAPIProcess(N564211E) business function which has the D564211E datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callSalesOrderCatchUpAPIProcess(IContext context, IConnection connection, InternalSOCatchupDS internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szCompanyKeyOrderNo", internalVO.getSzOrderCompany());
        bsfnParams.setValue("mnDocumentOrderInvoiceE", internalVO.getMnOrderNumber());
        bsfnParams.setValue("szOrderType", internalVO.getSzOrderType());
        bsfnParams.setValue("mnAddressNumberSoldTo", internalVO.getMnSoldToNumber());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "SalesOrderCatchUpAPIProcess", bsfnParams);
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
        internalVO.setSzOrderCompany((String)bsfnParams.getValue("szCompanyKeyOrderNo"));
        internalVO.setMnOrderNumber((MathNumeric)bsfnParams.getValue("mnDocumentOrderInvoiceE"));
        internalVO.setSzOrderType((String)bsfnParams.getValue("szOrderType"));
        internalVO.setMnSoldToNumber((MathNumeric)bsfnParams.getValue("mnAddressNumberSoldTo"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
