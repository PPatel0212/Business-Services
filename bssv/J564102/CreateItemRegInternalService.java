package be.e1.bssv.J564102;

import be.e1.bssv.J564102.valueobject.InternalCreateItemRegistry;

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
public abstract class CreateItemRegInternalService extends BusinessService {
    /**
     * TODO: Create Java Doc for: CreateItemRegInternalMethod
     * Method CreateItemRegInternalMethod is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList CreateItemRegInternalMethod(IContext context, IConnection connection, InternalCreateItemRegistry internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "CreateItemRegInternalMethod", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        E1MessageList bsfnMessages = callCreateItemRegistry(context, connection, internalVO);
        //TODO:  add messages returned from E1 processing to BusinessService message list.
       
        //Call finish internal method passing context.
        finishInternalMethod(context, "CreateItemRegInternalMethod");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the CreateItemRegistry(N5641015) business function which has the D5641015 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callCreateItemRegistry(IContext context, IConnection connection, InternalCreateItemRegistry internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szPLMID", internalVO.getSzPLMID());
        bsfnParams.setValue("szItemNumber", internalVO.getSzItemNumber());
        bsfnParams.setValue("szDescription1", internalVO.getSzDescription1());
        bsfnParams.setValue("szDescription2", internalVO.getSzDescription2());
        bsfnParams.setValue("szPLMSource", internalVO.getSzPLMSource());
        bsfnParams.setValue("szTypeCode", internalVO.getSzTypeCode());
        bsfnParams.setValue("mnIdentifierShortItem", internalVO.getMnItemNumberShort());
        bsfnParams.setValue("szSourceSystem",internalVO.getSzSourceSystem());
        bsfnParams.setValue("szItemTypePLM",internalVO.getSzItemType());
       
        

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "CreateItemRegistry", bsfnParams);
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
        internalVO.setSzErrorID((String)bsfnParams.getValue("szErrorID"));
        internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));
        // As per new changes Added Short Item number to o/p - Rohit K
        internalVO.setMnItemNumberShort((MathNumeric)bsfnParams.getValue("mnIdentifierShortItem"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }


}
