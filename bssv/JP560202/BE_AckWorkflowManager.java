package be.e1.bssv.JP560202;

import be.e1.bssv.J560202.BE_AcknowledgeWorkflow;
import be.e1.bssv.J560202.valueobject.WorkflowAck_D5602000G;
import be.e1.bssv.JP560202.valueobject.WorkflowAckReply;
import be.e1.bssv.JP560202.valueobject.WorkflowAckRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_AckWorkflowManager extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_AckWorkflowManager()
  {
  }

  /**
   * Published method for AcknowledgeWorkflow TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected AcknowledgeWorkflow
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public WorkflowAckReply AcknowledgeWorkflow(WorkflowAckRequest vo)
    throws BusinessServiceException
  {
    return AcknowledgeWorkflow(null,null,vo);
  }

  /**
   * Protected method for BE_AckWorkflowManager PublishedBusinessService. AcknowledgeWorkflow will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected WorkflowAckReply AcknowledgeWorkflow(IContext context, IConnection connection, WorkflowAckRequest vo) throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "AcknowledgeWorkflow", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();

      //TODO: Create a new internal value object.
      WorkflowAck_D5602000G internalVO = new WorkflowAck_D5602000G();
      internalVO.setMnMessageId(new MathNumeric(vo.getMessageId()));
      internalVO.setMnResponderNumber(new MathNumeric(vo.getResponderNumber()));
      internalVO.setSzActionLevel(vo.getWorkflowRouteLevel());
      internalVO.setSzActionStatus(vo.getWorkflowStatus());
      internalVO.setSzResponderComments(vo.getResponderComment());
      internalVO.setSzResponderName(vo.getResponderName());
      internalVO.setSzResponderTitleRole(vo.getResponderTitle());
      internalVO.setSzWorkflowLineType(vo.getWorkflowLineType());

      //TODO: Call BusinessService passing context, connection and internal VO
      BE_AcknowledgeWorkflow internalWrk = new BE_AcknowledgeWorkflow();
      messages.addMessages(internalWrk.InternalAckWorkflow_N5602000(context, connection, internalVO));

      //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception
      if (messages.hasErrors())
      {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      WorkflowAckReply confirmVO = new WorkflowAckReply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "AcknowledgeWorkflow");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "AcknowledgeWorkflow");
    }
  }
}
