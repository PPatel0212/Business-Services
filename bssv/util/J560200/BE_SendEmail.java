package be.e1.bssv.util.J560200;

import be.e1.bssv.util.J560200.valueobject.SendEmail_D5602000A;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_SendEmail extends BusinessService {
    /**
     * TODO: Create Java Doc for: InternalSendEmail_B560200
     * Method InternalSendEmail_B560200 is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList InternalSendEmail_B560200(IContext context, IConnection connection, SendEmail_D5602000A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalSendEmail_B560200", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(callBE_SendEmailMessage(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalSendEmail_B560200");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the BE_SendEmailMessage(B5602000) business function which has the D5602000A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_SendEmailMessage(IContext context, IConnection connection, SendEmail_D5602000A internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szEmailAddressTo", internalVO.getSzEmailAddressTo());
        bsfnParams.setValue("szEmailAddressCc", internalVO.getSzEmailAddressCc());
        bsfnParams.setValue("szEmailAddressBcc", internalVO.getSzEmailAddressBcc());
        bsfnParams.setValue("szSubject", internalVO.getSzSubject());
        bsfnParams.setValue("szEmailMessage", internalVO.getSzEmailMessage());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "BE_SendEmailMessage", bsfnParams);
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
        internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
        internalVO.setSzErrorMessage((String)bsfnParams.getValue("szErrorMessage"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
