package be.e1.bssv.J560202;

import be.e1.bssv.J560202.valueobject.WorkflowAck_D5602000G;

import com.jdedwards.system.connector.dynamic.ServerFailureException;
import com.jdedwards.system.connector.dynamic.callmethod.InvalidBSFNMethodArgumentException;

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
public class BE_AcknowledgeWorkflow extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalAckWorkflow_N5602000
   * Method InternalAckWorkflow_N5602000 is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalAckWorkflow_N5602000(IContext context, IConnection connection, WorkflowAck_D5602000G internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalAckWorkflow_N5602000", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    messages.addMessages(jdeWorkflowAcknowledgement(context, connection, internalVO));
   
    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalAckWorkflow_N5602000");

    //Call finish internal method passing context.
    return messages;
  }
  
  private static E1MessageList jdeWorkflowAcknowledgement(IContext context, IConnection connection, WorkflowAck_D5602000G internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();
    E1MessageList messages = new E1MessageList();
    
    /* Copy the values to bsfn parameters */
    bsfnParams.setValue("mnMessageId", internalVO.getMnMessageId());
    bsfnParams.setValue("mnResponderNumber", internalVO.getMnResponderNumber());
    bsfnParams.setValue("szResponderName", internalVO.getSzResponderName());
    bsfnParams.setValue("szResponderTitleRole", internalVO.getSzResponderTitleRole());
    bsfnParams.setValue("szActionStatus", internalVO.getSzActionStatus());
    bsfnParams.setValue("szActionLevel", internalVO.getSzActionLevel());
    bsfnParams.setValue("szResponderComments", internalVO.getSzResponderComments());
    bsfnParams.setValue("szWorkflowLineType", internalVO.getSzWorkflowLineType());
    
    /* Call the jde business function */
    try
    {
      /* Execute the bsfn service */
      IBSFNService bsfnService = context.getBSFNService();
      bsfnService.execute(context, connection, "BE_WorkflowAcknowledgement", bsfnParams);
      
      /* Copy data back to value object */
      internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
      internalVO.setSzErrorDescription(bsfnParams.getValue("szErrorDescription").toString());
    }
    catch(Exception exp)
    {
        E1Message msg = new E1Message(context, "056WIM", "Insert Failed. Invalid value passed");
        messages.addMessage(msg);
    }
    messages.addMessages(bsfnParams.getE1MessageList());
    return messages;
  }
}
