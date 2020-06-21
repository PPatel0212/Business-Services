package be.e1.bssv.util.JP560000.valueobject;

import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class F4211DataReply extends MessageValueObject implements Serializable
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
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorFlag = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String errorDescription = null;

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
   * TODO: Default public constructor for instantiating: F4211DataReply
   */
  public F4211DataReply()
  {
  }
  
  public F4211DataReply(SupDataF4211_D5600007C inData)
  {
    this.actionCode = inData.getCActionCode();
    this.errorFlag = inData.getCErrorFlag();
    this.errorDescription = inData.getSzErrorMessage();
    this.itemRevisionLevel = inData.getSzRevisionLevel();
    this.orderCompanySO = inData.getSzOrderCompanySO();
    this.orderTypeSO = inData.getSzOrderTypeSO();
    
    this.orderNumberSO = 0;
    if(inData.getMnOrderNumberSO() != null)
    {
      this.orderNumberSO = inData.getMnOrderNumberSO().intValue();
    }
    
    this.orderLineSO = BigDecimal.ZERO;
    if(inData.getMnOrderLineSO() != null)
    {
      this.orderLineSO = inData.getMnOrderLineSO().asBigDecimal();
    }
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

  public void setErrorFlag(String errorFlag)
  {
    this.errorFlag = errorFlag;
  }

  public String getErrorFlag()
  {
    return errorFlag;
  }

  public void setErrorDescription(String errorDescription)
  {
    this.errorDescription = errorDescription;
  }

  public String getErrorDescription()
  {
    return errorDescription;
  }

  public void setItemRevisionLevel(String itemRevisionLevel)
  {
    this.itemRevisionLevel = itemRevisionLevel;
  }

  public String getItemRevisionLevel()
  {
    return itemRevisionLevel;
  }
}
