package be.e1.bssv.JP564201.valueobject;

import be.e1.bssv.J564201.valueobject.SOHeaderResult;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class OrderData extends ValueObject implements Serializable
{
  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String orderCompany = null;

  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer orderNumber = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String orderType = null;
  
  /** Start Mod -  as per change request by Joydeep Mukherjee on 07/16/2013 from Patrick Reily*/
  /** Adding fields Order status, order place date and Total Value on Order*/
  private String orderStatus = null;   
  
  private Calendar orderPlaceDate = null;
  
  private BigDecimal orderTotal = null;
  
  /** End Mod - as per change request by Joydeep Mukherjee on 07/16/2013 from Patrick Reily*/
  
  /** Start Mod -  as per change request by PATELB on 08/02/2013 from Patrick Reily*/
  /** Adding fields Customer PO*/
  private String customerPO = null;   
  /** End Mod -  as per change request by PATELB on 08/02/2013 from Patrick Reily*/

  /**
   * TODO: Default public constructor for instantiating: OrderData
   */
  public OrderData()
  {
  }
  
  public OrderData(SOHeaderResult inData)
  {
    this.orderCompany = inData.getF4201_KCOO();
    this.orderType = inData.getF4201_DCTO();
    this.orderNumber = new Integer(inData.getF4201_DOCO().intValue());
    this.orderStatus = inData.getOrderStatus();
    this.setOrderPlaceDate(inData.getF4201_TRDJ());
    this.setOrderTotal(inData.getOrderTotal());
    this.customerPO = inData.getF4211_VR01(); 
  }

  public void setOrderCompany(String orderCompany)
  {
    this.orderCompany = orderCompany;
  }

  public String getOrderCompany()
  {
    return orderCompany;
  }

  public void setOrderNumber(Integer orderNumber)
  {
    this.orderNumber = orderNumber;
  }

  public Integer getOrderNumber()
  {
    return orderNumber;
  }

  public void setOrderType(String orderType)
  {
    this.orderType = orderType;
  }

  public String getOrderType()
  {
    return orderType;
  }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderPlaceDate(Calendar orderPlaceDate) {
        this.orderPlaceDate = orderPlaceDate;
    }
    
    public void setOrderPlaceDate(Date orderPlaceDate) {
        if (orderPlaceDate != null) {
            Calendar calDate = Calendar.getInstance();
            calDate.setTime(orderPlaceDate);
            this.orderPlaceDate = calDate;
        }
    }

    public Calendar getOrderPlaceDate() {
        return orderPlaceDate;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }
    
    public void setOrderTotal(MathNumeric orderTotal) {  
        if(orderTotal !=null){
          this.orderTotal = orderTotal.asBigDecimal().setScale(2);
        }
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

  public void setCustomerPO(String customerPO) {
    this.customerPO = customerPO;
  }

  public String getCustomerPO() {
    return customerPO;
  }
}
