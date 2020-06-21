package be.e1.bssv.JP564305.valueobject;

import be.e1.bssv.J564305.valueobject.CreatePOLine_D5643006;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class POLineItemRevisionRequest
  extends ValueObject
  implements Serializable
{
  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
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
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String orderType = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String orderCompany = null;

  /**
   * Order Suffix
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SFXO <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String orderSuffix = null;

  /**
   * Line Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LNID <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 3 <br>
   */
  private BigDecimal lineNumber = null;

  /**
   * Rev Control Item Base Id.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCITMB <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String revControlItemBaseId = null;

  /**
   * Rev Control Item Revision Id.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: RCITMR <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String revControlItemRevisionId = null;

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
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String programVersion = null;

  /**
   * TODO: Default public constructor for instantiating: POLineItemRevisionRequest
   */
  public POLineItemRevisionRequest()
  {
  }

  public void mapToInternalValueObject(CreatePOLine_D5643006 inData)
  {
    if(this.orderNumber != null)
    {
      inData.setMnDocumentOrderInvoiceE_DOCO(new MathNumeric(this.orderNumber));
    }
    if(this.lineNumber != null)
    {
      inData.setMnLineNumber_LNID(new MathNumeric(this.lineNumber));
    }
    inData.setSzCompanyKeyOrderNo_KCOO(this.orderCompany);
    inData.setSzMeRevisionLevel_MERL(this.itemRevisionLevel);
    inData.setSzOrderSuffix_SFXO(this.orderSuffix);
    inData.setSzOrderType_DCTO(this.orderType);
    inData.setSzRCBaseItemId_RCITMB(this.revControlItemBaseId);
    inData.setSzRCRevItemId_RCITMR(this.revControlItemRevisionId);
    inData.setSzVersion_VERS(this.programVersion);
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

  public void setOrderCompany(String orderCompany)
  {
    this.orderCompany = orderCompany;
  }

  public String getOrderCompany()
  {
    return orderCompany;
  }

  public void setOrderSuffix(String orderSuffix)
  {
    this.orderSuffix = orderSuffix;
  }

  public String getOrderSuffix()
  {
    return orderSuffix;
  }

  public void setLineNumber(BigDecimal lineNumber)
  {
    this.lineNumber = lineNumber;
  }

  public BigDecimal getLineNumber()
  {
    return lineNumber;
  }

  public void setRevControlItemBaseId(String revControlItemBaseId)
  {
    this.revControlItemBaseId = revControlItemBaseId;
  }

  public String getRevControlItemBaseId()
  {
    return revControlItemBaseId;
  }

  public void setRevControlItemRevisionId(String revControlItemRevisionId)
  {
    this.revControlItemRevisionId = revControlItemRevisionId;
  }

  public String getRevControlItemRevisionId()
  {
    return revControlItemRevisionId;
  }

  public void setItemRevisionLevel(String itemRevisionLevel)
  {
    this.itemRevisionLevel = itemRevisionLevel;
  }

  public String getItemRevisionLevel()
  {
    return itemRevisionLevel;
  }

  public void setProgramVersion(String programVersion)
  {
    this.programVersion = programVersion;
  }

  public String getProgramVersion()
  {
    return programVersion;
  }
}
