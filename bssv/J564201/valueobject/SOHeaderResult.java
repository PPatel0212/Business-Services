package be.e1.bssv.J564201.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SOHeaderResult extends ValueObject implements Serializable
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
  private String F4201_KCOO = null;

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
  private MathNumeric F4201_DOCO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String F4201_DCTO = null;
  
  /** Start Mod -  as per change request by Joydeep Mukherjee on 07/16/2013 from Patrick Reily*/
  /** Adding fields Order status, order place date and Total Value on Order*/
  private String orderStatus = null;   
  
  private String orderOpenClosed = null;
    
  private Date F4201_TRDJ = null;
    
  private MathNumeric orderTotal = null;
  
  private String F4201_TORG = null;
    
  /** End Mod - as per change request by Joydeep Mukherjee on 07/16/2013 from Patrick Reily*/
   
   /** Start Mod -  as per change request by PATELB on 08/02/2013 from Patrick Reily*/
   /** Get F4211.VR01 of very first record found*/
   private String F4211_VR01 = null;   
  /** End Mod -  as per change request by PATELB on 08/02/2013 from Patrick Reily*/

  public void setF4201_KCOO(String F4201_KCOO)
  {
    this.F4201_KCOO = F4201_KCOO;
  }

  public String getF4201_KCOO()
  {
    return F4201_KCOO;
  }

  public void setF4201_DOCO(MathNumeric F4201_DOCO)
  {
    this.F4201_DOCO = F4201_DOCO;
  }

  public MathNumeric getF4201_DOCO()
  {
    return F4201_DOCO;
  }

  public void setF4201_DCTO(String F4201_DCTO)
  {
    this.F4201_DCTO = F4201_DCTO;
  }

  public String getF4201_DCTO()
  {
    return F4201_DCTO;
  }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setF4201_TRDJ(Date F4201_TRDJ) {
        this.F4201_TRDJ = F4201_TRDJ;
    }

    public Date getF4201_TRDJ() {
        return F4201_TRDJ;
    }

    public void setOrderTotal(MathNumeric orderTotal) {
        this.orderTotal = orderTotal;
    }

    public MathNumeric getOrderTotal() {
        return orderTotal;
    }

  public void setF4211_VR01(String F4211_VR01) {
    this.F4211_VR01 = F4211_VR01;
  }

  public String getF4211_VR01() {
    return F4211_VR01;
  }

    public void setF4201_TORG(String F4201_TORG) {
        this.F4201_TORG = F4201_TORG;
    }

    public String getF4201_TORG() {
        return F4201_TORG;
    }


  public void setOrderOpenClosed(String orderOpenClosed) {
    this.orderOpenClosed = orderOpenClosed;
  }

  public String getOrderOpenClosed() {
    return orderOpenClosed;
  }
}
