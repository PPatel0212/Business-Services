package be.e1.bssv.JP564201;

import be.e1.bssv.J564201.EcommerceSOInfo;
import be.e1.bssv.J564201.valueobject.SOHeaderQuery;
import be.e1.bssv.JP564201.valueobject.CustomerOrdersReply;
import be.e1.bssv.JP564201.valueobject.CustomerOrdersRequest;

import be.e1.bssv.JP564201.valueobject.OrderData;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class EcommerceOrderProcessor extends PublishedBusinessService {
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public EcommerceOrderProcessor() {
  }

  /**
   * Published method for getCustomerOrders TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected getCustomerOrders
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public CustomerOrdersReply getCustomerOrders(CustomerOrdersRequest vo) throws BusinessServiceException {
    return getCustomerOrders(null, null, vo);
  }

  /**
   * Protected method for EcommerceOrderProcessor PublishedBusinessService. getCustomerOrders will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected CustomerOrdersReply getCustomerOrders(IContext context,
                                                  IConnection connection,
                                                  CustomerOrdersRequest vo) throws BusinessServiceException {
    //perform all work within try block, finally will clean up any connections.
    try {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context =
          startPublishedMethod(context, "getCustomerOrders", vo, IConnection.AUTO);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();

      //load internal value object and make call
      SOHeaderQuery query = new SOHeaderQuery();
      query.setCustomerNumber(new MathNumeric(vo.getCustomerShipToNumber()));
      query.setFromDate(vo.getBeginTransactionDate().getTime());
      query.setThroughDate(vo.getEndTransactionDate().getTime());
      query.setTransactionOriginator(vo.getTransactionOriginator());
      query.setOrderStatus(vo.getOrderStatus());
      
      


      //Call BusinessService passing context, connection and internal VO
      messages.addMessages(EcommerceSOInfo.InternalGetCustomerOrders(context,
                                                                     connection,
                                                                     query));

      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception
      if (messages.hasErrors()) {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      CustomerOrdersReply confirmVO = new CustomerOrdersReply();
      int size = query.getResultSize();
      OrderData orders[] = new OrderData[size];
      for (int index = 0; index < size; index++) {
        orders[index] = new OrderData(query.getResultData(index));
      }
      confirmVO.setCErrorFlag(query.getCErrorFlag());
      confirmVO.setSzErrorMessage(query.getSzErrorMessage());
      confirmVO.setOrderInfo(orders);

      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "getCustomerOrders");
      //return outVO, filled with return values and messages
      return confirmVO;
    } finally {
      //Call close to clean up all remaining connections and resources.
      close(context, "getCustomerOrders");
    }
  }
}
