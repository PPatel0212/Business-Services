package be.e1.bssv.util.J564103;

import be.e1.bssv.util.J564103.valueobject.DSR5641042;
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
public abstract class PLMReportsLauncher extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalLaunchR5641042
   * Method InternalLaunchR5641042 is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalLaunchR5641042(IContext context, IConnection connection, DSR5641042 internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalLaunchR5641042", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    callBE_LaunchR5641042WithRI(context, connection, internalVO);

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalLaunchR5641042");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Calls the BE_LaunchR5641042WithRI(B5641042) business function which has the D5641042A datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callBE_LaunchR5641042WithRI(IContext context, IConnection connection, DSR5641042 internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnTransactionID", internalVO.getMnTransactionID());
    bsfnParams.setValue("szReportName", internalVO.getSzReportName());
    bsfnParams.setValue("szReportVersion", internalVO.getSzReportVersion());
    bsfnParams.setValue("szPrintQueue", internalVO.getSzPrintQueue());
    bsfnParams.setValue("cRunAsynchronous", internalVO.getCRunAsynchronous());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_LaunchR5641042WithRI", bsfnParams);
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
    internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
    internalVO.setSzErrorMessage((String)bsfnParams.getValue("szErrorMessage"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
}
