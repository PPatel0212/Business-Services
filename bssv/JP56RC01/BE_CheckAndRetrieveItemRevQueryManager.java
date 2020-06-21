package be.e1.bssv.JP56RC01;


import be.e1.bssv.J56RC01.BE_CheckandRetrieveItemRevQueryProcessor;
import be.e1.bssv.J56RC01.valueobject.InternalGetCheckandRetrieveItemRevInformation;
import be.e1.bssv.JP56RC01.valueobject.GetCheckandRetrieveItemRevInformation;
import be.e1.bssv.JP56RC01.valueobject.ShowCheckandRetrieveItemRevInformation;


import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;


/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_CheckAndRetrieveItemRevQueryManager extends PublishedBusinessService {
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_CheckAndRetrieveItemRevQueryManager() {
  }

  /**
   * Published method for getCheckAndRetrieveItemRevQueryManager TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected getCheckAndRetrieveItemRevQueryManager
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public ShowCheckandRetrieveItemRevInformation getCheckAndRetrieveItemRevQueryManager(GetCheckandRetrieveItemRevInformation vo) throws BusinessServiceException {
    return getCheckAndRetrieveItemRevQueryManager(null,null,vo);
  }

  /**
   * Protected method for BE_CheckAndRetrieveItemRevQueryManager PublishedBusinessService. getCheckAndRetrieveItemRevQueryManager will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected ShowCheckandRetrieveItemRevInformation getCheckAndRetrieveItemRevQueryManager(IContext context, IConnection connection, GetCheckandRetrieveItemRevInformation vo) throws BusinessServiceException {
    //perform all work within try block, finally will clean up any connections.
    try {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "getCheckAndRetrieveItemRevQueryManager", vo,IConnection.AUTO);
      
      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      InternalGetCheckandRetrieveItemRevInformation internalVO = new InternalGetCheckandRetrieveItemRevInformation();
      messages.addMessages(vo.mapFromPublished(context, internalVO));
      //TODO: Call BusinessService passing context, connection and internal VO
      E1MessageList bssvMessage = BE_CheckandRetrieveItemRevQueryProcessor.getCheckandRetrieveItemRevQueryProcessor(context, connection, internalVO);
      
      //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
      messages.addMessages(bssvMessage);
      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception

      if (messages.hasErrors()) {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      ShowCheckandRetrieveItemRevInformation confirmVO = new ShowCheckandRetrieveItemRevInformation(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "getCheckAndRetrieveItemRevQueryManager");
      //return outVO, filled with return values and messages
      return confirmVO;
    } finally {
      //Call close to clean up all remaining connections and resources.
      close(context, "getCheckAndRetrieveItemRevQueryManager");
    }
  }
}
