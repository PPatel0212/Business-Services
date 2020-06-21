package be.e1.bssv.JP564201.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CustomerOrdersReply extends MessageValueObject implements Serializable
{
  /**
   * Error Flag
   * A value of 0 indicates there were no errors. 
   * A value of 1 indicates that errors occured.
   */
  private String cErrorFlag = null;

  /**
   * Error Message
   * This field contains a description of the error encountered.
   * This field is only populated when cErrorFlag is not zero.
   */
  private String szErrorMessage = null;

  /**
   * Array of order numbers which is the data returned from the query.
   */
  private OrderData orderInfo[] = null;
  
  /**
   * TODO: Default public constructor for instantiating: CustomerOrdersReply
   */
  public CustomerOrdersReply()
  {
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
  }

  public void setSzErrorMessage(String szErrorMessage)
  {
    this.szErrorMessage = szErrorMessage;
  }

  public String getSzErrorMessage()
  {
    return szErrorMessage;
  }

  public void setOrderInfo(OrderData[] orderInfo)
  {
    this.orderInfo = orderInfo;
  }

  public OrderData[] getOrderInfo()
  {
    return orderInfo;
  }
}
