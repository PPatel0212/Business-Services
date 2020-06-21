package be.e1.bssv.JP564800;

import be.e1.bssv.J564800.BE_WorkOrderMgr;
import be.e1.bssv.J564800.valueobject.WOMPSTag_D5648007;
import be.e1.bssv.J564800.valueobject.WOManager_D5648005;
import be.e1.bssv.JP564800.valueobject.ProcessWOReply;
import be.e1.bssv.JP564800.valueobject.ProcessWORequest;

import be.e1.bssv.JP564800.valueobject.ProcessWOTagReply;

import be.e1.bssv.JP564800.valueobject.ProcessWOTagRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_WorkOrderManager extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_WorkOrderManager()
  {
  }

  /**
   * Published method for ProcessWorkOrder TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected ProcessWorkOrder
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public ProcessWOReply ProcessWorkOrder(ProcessWORequest vo) throws BusinessServiceException
  {
    return ProcessWorkOrder(null,null,vo);
  }

  /**
   * Protected method for BE_WorkOrderManager PublishedBusinessService. ProcessWorkOrder will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected ProcessWOReply ProcessWorkOrder(IContext context, IConnection connection, ProcessWORequest vo) throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "ProcessWorkOrder", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      
      //create internal value object and load data elements to it
      WOManager_D5648005 internalVO = new WOManager_D5648005();
      vo.copyToInternalValueObject(internalVO);
      
      //call function in internal manager.
      messages.addMessages(BE_WorkOrderMgr.InternalProcessWorkOrder(context, connection, internalVO));
      
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
      ProcessWOReply confirmVO = new ProcessWOReply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "ProcessWorkOrder");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "ProcessWorkOrder");
    }
  }

  public ProcessWOTagReply ProcessWorkOrderTag(ProcessWOTagRequest vo) throws BusinessServiceException
  {
    return ProcessWorkOrderTag(null,null,vo);
  }
  
  protected ProcessWOTagReply ProcessWorkOrderTag(IContext context, IConnection connection, ProcessWOTagRequest vo) throws BusinessServiceException
  {
    try
    {
      context = startPublishedMethod(context, "ProcessWorkOrder", vo);
      
      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();   
      
      //create internal value object and load data elements to it
      WOMPSTag_D5648007 internalVO = new WOMPSTag_D5648007();
      vo.copyToInternalValueObject(internalVO);
      
      //call function in internal manager.
      messages.addMessages(BE_WorkOrderMgr.InternalProcessWOMPSTag(context, connection, internalVO));
      
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
      ProcessWOTagReply confirmVO = new ProcessWOTagReply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "ProcessWorkOrder");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "ProcessWorkOrder");
    }
  }  
}
