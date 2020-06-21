package be.e1.bssv.util.JP560000.valueobject;

import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class F4211DataRequest extends ValueObject implements Serializable
{
  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String actionCode = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String orderCompanySO = null;

  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer orderNumberSO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String orderTypeSO = null;

  /**
   * Line Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LNID <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 3 <br>
   */
  private BigDecimal orderLineSO = null;

  /**
   * User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: USER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String auditUser = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String auditProgram = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String itemRevisionLevel = null;

  /**
   * TODO: Default public constructor for instantiating: F4211DataRequest
   */
  public F4211DataRequest()
  {
  }

  public void setActionCode(String actionCode)
  {
    this.actionCode = actionCode;
  }

  public String getActionCode()
  {
    return actionCode;
  }

  public void setOrderCompanySO(String orderCompanySO)
  {
    this.orderCompanySO = orderCompanySO;
  }

  public String getOrderCompanySO()
  {
    return orderCompanySO;
  }

  public void setOrderNumberSO(Integer orderNumberSO)
  {
    this.orderNumberSO = orderNumberSO;
  }

  public Integer getOrderNumberSO()
  {
    return orderNumberSO;
  }

  public void setOrderTypeSO(String orderTypeSO)
  {
    this.orderTypeSO = orderTypeSO;
  }

  public String getOrderTypeSO()
  {
    return orderTypeSO;
  }

  public void setOrderLineSO(BigDecimal orderLineSO)
  {
    this.orderLineSO = orderLineSO;
  }

  public BigDecimal getOrderLineSO()
  {
    return orderLineSO;
  }

  public void setAuditUser(String auditUser)
  {
    this.auditUser = auditUser;
  }

  public String getAuditUser()
  {
    return auditUser;
  }

  public void setAuditProgram(String auditProgram)
  {
    this.auditProgram = auditProgram;
  }

  public String getAuditProgram()
  {
    return auditProgram;
  }

  public void setItemRevisionLevel(String itemRevisionLevel)
  {
    this.itemRevisionLevel = itemRevisionLevel;
  }

  public String getItemRevisionLevel()
  {
    return itemRevisionLevel;
  }
  
  public void copyToInternalValueObject(SupDataF4211_D5600007C inData)
  {
    inData.setCActionCode(this.actionCode);
    inData.setSzAuditProgram(this.auditProgram);
    inData.setSzAuditUser(this.auditUser);
    inData.setSzOrderCompanySO(this.orderCompanySO);
    inData.setSzOrderTypeSO(this.orderTypeSO);
    inData.setSzRevisionLevel(this.itemRevisionLevel);
    
    if(this.orderNumberSO != null)
    {
      inData.setMnOrderNumberSO(new MathNumeric(this.orderNumberSO));
    }
    if(this.orderLineSO != null)
    {
      inData.setMnOrderLineSO(new MathNumeric(this.orderLineSO));
    }
  }
}
