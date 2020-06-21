package be.e1.bssv.JP564201.valueobject;

import java.io.Serializable;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CustomerOrdersRequest extends ValueObject implements Serializable
{
  /**
   * Address Number - Ship To
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SHAN <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer customerShipToNumber = null;

  /**
   * Date - Order/Transaction
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRDJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar beginTransactionDate = null;

  /**
   * Date - Order/Transaction
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRDJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar endTransactionDate = null;
  
  private String transactionOriginator = null;
  
  private String orderStatus = null;

  /**
   * TODO: Default public constructor for instantiating: CustomerOrdersRequest
   */
  public CustomerOrdersRequest()
  {
  }

  public void setCustomerShipToNumber(Integer customerShipToNumber)
  {
    this.customerShipToNumber = customerShipToNumber;
  }

  public Integer getCustomerShipToNumber()
  {
    return customerShipToNumber;
  }

  public void setBeginTransactionDate(Calendar beginTransactionDate)
  {
    this.beginTransactionDate = beginTransactionDate;
  }

  public Calendar getBeginTransactionDate()
  {
    return beginTransactionDate;
  }

  public void setEndTransactionDate(Calendar endTransactionDate)
  {
    this.endTransactionDate = endTransactionDate;
  }

  public Calendar getEndTransactionDate()
  {
    return endTransactionDate;
  }

    public void setTransactionOriginator(String transactionOriginator) {
        this.transactionOriginator = transactionOriginator;
    }

    public String getTransactionOriginator() {
        return transactionOriginator;
    }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public String getOrderStatus() {
    return orderStatus;
  }
}
