package be.e1.bssv.J5643001;

import be.e1.bssv.J5643001.valueobject.InternalPaymentTerms_D48S0350;

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
public abstract class InternalPaymentTerms extends BusinessService {
    /**
     * TODO: Create Java Doc for: getPaymentTerms
     * Method getPaymentTerms is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getPaymentTerms(IContext context, IConnection connection, InternalPaymentTerms_D48S0350 internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getPaymentTerms", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(callGetPaymentTermsInfo(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "getPaymentTerms");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the GetPaymentTermsInfo(N48S0350) business function which has the D48S0350 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetPaymentTermsInfo(IContext context, IConnection connection,InternalPaymentTerms_D48S0350 internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szPaymentTermsCode01", internalVO.getSzPaymentTermsCode01());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetPaymentTermsInfo", bsfnParams);
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
        internalVO.setSzDescriptPaymentTerms((String)bsfnParams.getValue("szDescriptPaymentTerms"));
        internalVO.setMnDiscountPaymentTerms((MathNumeric)bsfnParams.getValue("mnDiscountPaymentTerms"));
        internalVO.setMnDiscountDays((MathNumeric)bsfnParams.getValue("mnDiscountDays"));
        internalVO.setMnNetDaysToPay((MathNumeric)bsfnParams.getValue("mnNetDaysToPay"));
        internalVO.setJdDateDueJulian((Date)bsfnParams.getValue("jdDateDueJulian"));
        internalVO.setMnNumberOfSplitPayments((MathNumeric)bsfnParams.getValue("mnNumberOfSplitPayments"));
        internalVO.setMnDaysToPayAging((MathNumeric)bsfnParams.getValue("mnDaysToPayAging"));
        internalVO.setMnPerEffectiveInteretRt((MathNumeric)bsfnParams.getValue("mnPerEffectiveInteretRt"));
        internalVO.setMnProxDateMonth((MathNumeric)bsfnParams.getValue("mnProxDateMonth"));
        internalVO.setMnProxDateDay((MathNumeric)bsfnParams.getValue("mnProxDateDay"));
        internalVO.setSzErrorMessageID((String)bsfnParams.getValue("szErrorMessageID"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
