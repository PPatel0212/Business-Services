package be.e1.bssv.JP564305;

import be.e1.bssv.J564305.MrpOneMgr;
import be.e1.bssv.J564305.valueobject.CreatePOLine_D5643006;
import be.e1.bssv.JP564305.valueobject.POLineItemRevisionReply;
import be.e1.bssv.JP564305.valueobject.POLineItemRevisionRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class MRPOneManager
  extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public MRPOneManager()
  {
  }

  /**
   * Published method for CreatePOLineRevisedItem TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected CreatePOLineRevisedItem
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public POLineItemRevisionReply CreatePOLineRevisedItem(POLineItemRevisionRequest vo)
    throws BusinessServiceException
  {
    return CreatePOLineRevisedItem(null,null,vo);
  }

  /**
   * Protected method for MRPOneManager PublishedBusinessService. CreatePOLineRevisedItem will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected POLineItemRevisionReply CreatePOLineRevisedItem(IContext context, IConnection connection, POLineItemRevisionRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "CreatePOLineRevisedItem", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      
      //Create Internal Object and load values
      CreatePOLine_D5643006 internalVO = new CreatePOLine_D5643006();
      vo.mapToInternalValueObject(internalVO);

      messages.addMessages(MrpOneMgr.InternalCreatePOLineRevisedItem(context, connection, internalVO));

      if (messages.hasErrors())
      {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      POLineItemRevisionReply confirmVO = new POLineItemRevisionReply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "CreatePOLineRevisedItem");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "CreatePOLineRevisedItem");
    }
  }
}
