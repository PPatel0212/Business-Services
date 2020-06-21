package be.e1.bssv.J564305.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CreatePOLine_D5643006
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
  private MathNumeric mnDocumentOrderInvoiceE_DOCO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String szOrderType_DCTO = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String szCompanyKeyOrderNo_KCOO = null;

  /**
   * Order Suffix
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SFXO <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szOrderSuffix_SFXO = null;

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
  private MathNumeric mnLineNumber_LNID = null;

  /**
   * Rev Control Item Base Id.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCITMB <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szRCBaseItemId_RCITMB = null;

  /**
   * Rev Control Item Revision Id.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: RCITMR <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szRCRevItemId_RCITMR = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorCode_EV01 = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: D200 <br>
   * EnterpriseOne field length:  200 <br>
   */
  private String szErrorDescription_D200 = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szMeRevisionLevel_MERL = null;

  /**
   * Data Item
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTAI <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szDataItem_DATI = null;

  /**
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szVersion_VERS = null;

  public void setMnDocumentOrderInvoiceE_DOCO(MathNumeric mnDocumentOrderInvoiceE_DOCO)
  {
    this.mnDocumentOrderInvoiceE_DOCO = mnDocumentOrderInvoiceE_DOCO;
  }

  public MathNumeric getMnDocumentOrderInvoiceE_DOCO()
  {
    return mnDocumentOrderInvoiceE_DOCO;
  }

  public void setSzOrderType_DCTO(String szOrderType_DCTO)
  {
    this.szOrderType_DCTO = szOrderType_DCTO;
  }

  public String getSzOrderType_DCTO()
  {
    return szOrderType_DCTO;
  }

  public void setSzCompanyKeyOrderNo_KCOO(String szCompanyKeyOrderNo_KCOO)
  {
    this.szCompanyKeyOrderNo_KCOO = szCompanyKeyOrderNo_KCOO;
  }

  public String getSzCompanyKeyOrderNo_KCOO()
  {
    return szCompanyKeyOrderNo_KCOO;
  }

  public void setSzOrderSuffix_SFXO(String szOrderSuffix_SFXO)
  {
    this.szOrderSuffix_SFXO = szOrderSuffix_SFXO;
  }

  public String getSzOrderSuffix_SFXO()
  {
    return szOrderSuffix_SFXO;
  }

  public void setMnLineNumber_LNID(MathNumeric mnLineNumber_LNID)
  {
    this.mnLineNumber_LNID = mnLineNumber_LNID;
  }

  public MathNumeric getMnLineNumber_LNID()
  {
    return mnLineNumber_LNID;
  }

  public void setSzRCBaseItemId_RCITMB(String szRCBaseItemId_RCITMB)
  {
    this.szRCBaseItemId_RCITMB = szRCBaseItemId_RCITMB;
  }

  public String getSzRCBaseItemId_RCITMB()
  {
    return szRCBaseItemId_RCITMB;
  }

  public void setSzRCRevItemId_RCITMR(String szRCRevItemId_RCITMR)
  {
    this.szRCRevItemId_RCITMR = szRCRevItemId_RCITMR;
  }

  public String getSzRCRevItemId_RCITMR()
  {
    return szRCRevItemId_RCITMR;
  }

  public void setCErrorCode_EV01(String cErrorCode_EV01)
  {
    this.cErrorCode_EV01 = cErrorCode_EV01;
  }

  public String getCErrorCode_EV01()
  {
    return cErrorCode_EV01;
  }

  public void setSzErrorDescription_D200(String szErrorDescription_D200)
  {
    this.szErrorDescription_D200 = szErrorDescription_D200;
  }

  public String getSzErrorDescription_D200()
  {
    return szErrorDescription_D200;
  }

  public void setSzMeRevisionLevel_MERL(String szMeRevisionLevel_MERL)
  {
    this.szMeRevisionLevel_MERL = szMeRevisionLevel_MERL;
  }

  public String getSzMeRevisionLevel_MERL()
  {
    return szMeRevisionLevel_MERL;
  }

  public void setSzDataItem_DATI(String szDataItem_DATI)
  {
    this.szDataItem_DATI = szDataItem_DATI;
  }

  public String getSzDataItem_DATI()
  {
    return szDataItem_DATI;
  }

  public void setSzVersion_VERS(String szVersion_VERS)
  {
    this.szVersion_VERS = szVersion_VERS;
  }

  public String getSzVersion_VERS()
  {
    return szVersion_VERS;
  }
}
