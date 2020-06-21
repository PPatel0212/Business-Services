package be.e1.bssv.JP563107;

import be.e1.bssv.J563107.BE_GetSumBOMDetailsProcessor;
import be.e1.bssv.J563107.valueobject.InternalGetSumBOMDetails;
import be.e1.bssv.JP563107.valueobject.GetSumBOMDetails;
import be.e1.bssv.JP563107.valueobject.ShowSumBOMDetails;


import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;



/**
 * TODO: Java Doc for PublishedBusinessService
 **/

public class BE_GetSumBOMDetailsManager extends PublishedBusinessService {
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_GetSumBOMDetailsManager() {
  }

  /**
   * Published method for getSumBOMDetails TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected getSumBOMDetails
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public ShowSumBOMDetails getSumBOMDetails(GetSumBOMDetails vo) throws BusinessServiceException {
    return getSumBOMDetails(null,null,vo);
  }

  /**
   * Protected method for BE_GetSumBOMDetailsManager PublishedBusinessService. getSumBOMDetails will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected ShowSumBOMDetails getSumBOMDetails(IContext context, IConnection connection, GetSumBOMDetails vo) throws BusinessServiceException {
    //perform all work within try block, finally will clean up any connections.
    try {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "getSumBOMDetails", vo,IConnection.AUTO);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      InternalGetSumBOMDetails internalVO = new InternalGetSumBOMDetails();
      //TODO: Call BusinessService passing context, connection and internal VO
      E1MessageList e1MessageList = vo.mapFromPublished(context, internalVO);
      messages.addMessages(e1MessageList);
      //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
      E1MessageList bssvMessage = BE_GetSumBOMDetailsProcessor.getSumBOMDetails(context, connection, internalVO); 
      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception
      messages.addMessages(bssvMessage);
      if (messages.hasErrors()) {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      ShowSumBOMDetails confirmVO = new ShowSumBOMDetails(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "getSumBOMDetails");
      //return outVO, filled with return values and messages
      return confirmVO;
    } finally {
      //Call close to clean up all remaining connections and resources.
      close(context, "getSumBOMDetails");
    }
  }
}
