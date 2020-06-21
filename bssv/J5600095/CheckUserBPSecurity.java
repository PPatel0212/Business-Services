package be.e1.bssv.J5600095;

import be.e1.bssv.J5600095.valueobject.InternalGetUserBPSecuirty;

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
public abstract class CheckUserBPSecurity extends BusinessService {
    /**
     * TODO: Create Java Doc for: CheckUserBPSecurity
     * Method CheckUserBPSecurity is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList CheckUserBPSecurityRT(IContext context, IConnection connection, InternalGetUserBPSecuirty internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "CheckUserBPSecurity", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        
        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        callCheckUserBPSecurityIndividualBra(context, connection, internalVO);
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "CheckUserBPSecurityRT");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the CheckUserBPSecurityIndividualBra(N5600951) business function which has the D560095001 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callCheckUserBPSecurityIndividualBra(IContext context, IConnection connection, InternalGetUserBPSecuirty internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szCostCenter_MCU", internalVO.getSzCostCenter_MCU());
        bsfnParams.setValue("szUserId_USER", internalVO.getSzUserId_USER());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "CheckUserBPSecurityIndividualBra", bsfnParams);
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
        internalVO.setCAccessYN_EV01((String)bsfnParams.getValue("cAccessYN_EV01"));
        internalVO.setCReadWriteRW_EV01((String)bsfnParams.getValue("cReadWriteRW_EV01"));
        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
