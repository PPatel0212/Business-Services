package be.e1.bssv.util.J564303;

import be.e1.bssv.util.J564303.valueobject.LaunchPO_D5643001A;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_LaunchPOManager
  extends BusinessService
{
  /**
   * TODO: Create Java Doc for: BE_LaunchR43500WithRI
   * Method BE_LaunchR43500WithRI is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalLaunchPO_B5643001(IContext context, IConnection connection, LaunchPO_D5643001A internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalLaunchPO_B5643001", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(jdeLaunchPO_B5643001(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.


    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalLaunchPO_B5643001");

    //Call finish internal method passing context.
    return messages;
  }
  private static E1MessageList jdeLaunchPO_B5643001 (IContext context, IConnection connection, LaunchPO_D5643001A internalVO)
  {
    
      BSFNParameters bsfnParams = new BSFNParameters();
      bsfnParams.setValue("szReportName", internalVO.getSzReportName());
      bsfnParams.setValue("szReportVersion", internalVO.getSzReportVersion());
      bsfnParams.setValue("cGenerateBIPubLink", internalVO.getCGenerateBIPubLink());
      bsfnParams.setValue("cRunAsynchronous", internalVO.getCRunAsynchronous());
      bsfnParams.setValue("szPrintQueue", internalVO.getSzPrintQueue());
      bsfnParams.setValue("mnPONumberRI", internalVO.getMnPONumberRI());
      bsfnParams.setValue("szPODocTypeRI", internalVO.getSzPODocTypeRI());
      bsfnParams.setValue("szPOCompanyRI", internalVO.getSzPOCompanyRI());
      bsfnParams.setValue("szPOOrderSuffixRI", internalVO.getSzPOOrderSuffixRI());
      bsfnParams.setValue("cPOProcessModeRI", internalVO.getCPOProcessModeRI());
      bsfnParams.setValue("mnPOChangeOrderNumRI", internalVO.getMnPOChangeOrderNumRI());
      bsfnParams.setValue("cPOGenSourceSystemRI", internalVO.getCPOGenSourceSystemRI());
           
  /* Call the jde business function */
     try
     { 
         /* Execute the bsfn service */
         IBSFNService bsfnService = context.getBSFNService();
         bsfnService.execute(context, connection, "BE_LaunchR43500WithRI", bsfnParams);
         internalVO.setSzPrintQueue(bsfnParams.getValue("szPrintQueue").toString());
         internalVO.setSzOutputFileName(bsfnParams.getValue("szOutputFileName").toString());
         internalVO.setSzOutputFileLink(bsfnParams.getValue("szOutputFileLink").toString());
         internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
         internalVO.setSzErrorMessage(bsfnParams.getValue("szErrorMessage").toString());
     }
     catch(Exception invExp)
     {
         //Create error message for Invalid Argument exception and return it in ErrorList
         E1MessageList returnMessages = new E1MessageList();
         returnMessages.addMessage(new E1Message(context, "018FIS", invExp.getMessage()));
         internalVO.setCErrorFlag("1");
         internalVO.setSzErrorMessage("An Exception Occurred");
         return returnMessages;
     }
     return bsfnParams.getE1MessageList();
    }
}
