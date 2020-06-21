package be.e1.bssv.J560010;

import be.e1.bssv.J560010.valueobject.InternalGetNextItemNumber;

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
public abstract class BE_GetNextItemNumberProcessor extends BusinessService {
  /**
   * TODO: Create Java Doc for: getNextItemNumberProcessor
   * Method getNextItemNumberProcessor is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList getNextItemNumberProcessor(IContext context, IConnection connection, InternalGetNextItemNumber internalVO) {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "getNextItemNumberProcessor", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
      messages.addMessages(callF4101GetItemNumberFromNextNumber(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.


    //Call finish internal method passing context.
    finishInternalMethod(context, "getNextItemNumberProcessor");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Calls the F4101GetItemNumberFromNextNumber(B4000040) business function which has the D4000171 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callF4101GetItemNumberFromNextNumber(IContext context, IConnection connection, InternalGetNextItemNumber internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object

    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "F4101GetItemNumberFromNextNumber", bsfnParams);
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
    internalVO.setMnIdentifiershortitem((MathNumeric)bsfnParams.getValue("mnIdentifiershortitem"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
}
