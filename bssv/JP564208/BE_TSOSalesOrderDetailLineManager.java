package be.e1.bssv.JP564208;

import be.e1.bssv.J564208.BE_GetSalesDetailLineProcessor;
import be.e1.bssv.J564208.valueobject.InternalGetSalesDetailLine;
import be.e1.bssv.JP564208.valueobject.GetTSOSalesOrderDetailLine;
import be.e1.bssv.JP564208.valueobject.ShowTSOSalesOrderDetailLine;


import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;


/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_TSOSalesOrderDetailLineManager extends PublishedBusinessService {
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_TSOSalesOrderDetailLineManager() {
  }

  /**
   * Published method for tsoSalesOrderDetailLine TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected tsoSalesOrderDetailLine
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public ShowTSOSalesOrderDetailLine tsoSalesOrderDetailLine(GetTSOSalesOrderDetailLine vo) throws BusinessServiceException {
    return tsoSalesOrderDetailLine(null,null,vo);
  }

  /**
   * Protected method for BE_TSOSalesOrderDetailLineManager PublishedBusinessService. tsoSalesOrderDetailLine will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected ShowTSOSalesOrderDetailLine tsoSalesOrderDetailLine(IContext context, IConnection connection, GetTSOSalesOrderDetailLine vo) throws BusinessServiceException {
    //perform all work within try block, finally will clean up any connections.
    try {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "tsoSalesOrderDetailLine", vo,IConnection.AUTO);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      InternalGetSalesDetailLine internalVO = new InternalGetSalesDetailLine();
      //TODO: Call BusinessService passing context, connection and internal VO
      E1MessageList e1MessageList = vo.mapFromPublished(context, internalVO);
      messages.addMessages(e1MessageList);
      //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
      E1MessageList bssvMessage = BE_GetSalesDetailLineProcessor.getSalesDetailLine(context, connection, internalVO);
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
      ShowTSOSalesOrderDetailLine confirmVO = new ShowTSOSalesOrderDetailLine(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "tsoSalesOrderDetailLine");
      //return outVO, filled with return values and messages
      return confirmVO;
    } finally {
      //Call close to clean up all remaining connections and resources.
      close(context, "tsoSalesOrderDetailLine");
    }
  }
}
