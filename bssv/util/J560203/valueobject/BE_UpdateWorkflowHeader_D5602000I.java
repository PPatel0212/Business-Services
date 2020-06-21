package be.e1.bssv.util.J560203.valueobject;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BE_UpdateWorkflowHeader_D5602000I
  extends ValueObject
  implements Serializable
{
  /**
   * Task ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: STSKID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnTaskId = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String szCompanyKeyOrderNo = null;

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
  private MathNumeric mnDocumentOrderInvoiceE = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String szOrderType = null;

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
  private MathNumeric mnLineNumber = null;

  /**
   * Business Unit - Header
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMCU <br>
   * EnterpriseOne field length:  12 <br>
   * EnterpriseOne Edit Rule:SERVER <br>
   */
  private String szCostCenterHeader = null;

  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnIdentifierShortItem = null;

  /**
   * Account ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AID <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne Next Number: 09/1 <br>
   */
  private String szAccountId = null;

  /**
   * Sequence Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SEQ <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric mnSequenceNumber1 = null;

  /**
   * Line Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LNTY <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne Default value: S <br>
   */
  private String szLineType = null;

  /**
   * Generic Key
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GENKEY <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szGenericKey = null;

  /**
   * Composite Key Values
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CKYS <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnCompositeKeyValues = null;

  /**
   * Document (Voucher, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DOC <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnDocVoucherInvoiceE = null;

  /**
   * Document Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCT <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String szDocumentType = null;

  /**
   * Company
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String szCompany = null;

  /**
   * User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: USER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szUserId = null;

  /**
   * Date - Updated
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UPMJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date jdDateUpdated = null;

  /**
   * Time - Last Updated
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UPMT <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnTimeLastUpdated = null;

  /**
   * Work Station ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: JOBN <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szWorkStationId = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne Edit Rule:CHKOBJ <br>
   */
  private String szProgramId = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorCode = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String szErrorDescription = null;

  public void setMnTaskId(MathNumeric mnTaskId)
  {
    this.mnTaskId = mnTaskId;
  }

  public MathNumeric getMnTaskId()
  {
    return mnTaskId;
  }

  public void setSzCompanyKeyOrderNo(String szCompanyKeyOrderNo)
  {
    this.szCompanyKeyOrderNo = szCompanyKeyOrderNo;
  }

  public String getSzCompanyKeyOrderNo()
  {
    return szCompanyKeyOrderNo;
  }

  public void setMnDocumentOrderInvoiceE(MathNumeric mnDocumentOrderInvoiceE)
  {
    this.mnDocumentOrderInvoiceE = mnDocumentOrderInvoiceE;
  }

  public MathNumeric getMnDocumentOrderInvoiceE()
  {
    return mnDocumentOrderInvoiceE;
  }

  public void setSzOrderType(String szOrderType)
  {
    this.szOrderType = szOrderType;
  }

  public String getSzOrderType()
  {
    return szOrderType;
  }

  public void setMnLineNumber(MathNumeric mnLineNumber)
  {
    this.mnLineNumber = mnLineNumber;
  }

  public MathNumeric getMnLineNumber()
  {
    return mnLineNumber;
  }

  public void setSzCostCenterHeader(String szCostCenterHeader)
  {
    this.szCostCenterHeader = szCostCenterHeader;
  }

  public String getSzCostCenterHeader()
  {
    return szCostCenterHeader;
  }

  public void setMnIdentifierShortItem(MathNumeric mnIdentifierShortItem)
  {
    this.mnIdentifierShortItem = mnIdentifierShortItem;
  }

  public MathNumeric getMnIdentifierShortItem()
  {
    return mnIdentifierShortItem;
  }

  public void setSzAccountId(String szAccountId)
  {
    this.szAccountId = szAccountId;
  }

  public String getSzAccountId()
  {
    return szAccountId;
  }

  public void setMnSequenceNumber1(MathNumeric mnSequenceNumber1)
  {
    this.mnSequenceNumber1 = mnSequenceNumber1;
  }

  public MathNumeric getMnSequenceNumber1()
  {
    return mnSequenceNumber1;
  }

  public void setSzLineType(String szLineType)
  {
    this.szLineType = szLineType;
  }

  public String getSzLineType()
  {
    return szLineType;
  }

  public void setSzGenericKey(String szGenericKey)
  {
    this.szGenericKey = szGenericKey;
  }

  public String getSzGenericKey()
  {
    return szGenericKey;
  }

  public void setMnCompositeKeyValues(MathNumeric mnCompositeKeyValues)
  {
    this.mnCompositeKeyValues = mnCompositeKeyValues;
  }

  public MathNumeric getMnCompositeKeyValues()
  {
    return mnCompositeKeyValues;
  }

  public void setMnDocVoucherInvoiceE(MathNumeric mnDocVoucherInvoiceE)
  {
    this.mnDocVoucherInvoiceE = mnDocVoucherInvoiceE;
  }

  public MathNumeric getMnDocVoucherInvoiceE()
  {
    return mnDocVoucherInvoiceE;
  }

  public void setSzDocumentType(String szDocumentType)
  {
    this.szDocumentType = szDocumentType;
  }

  public String getSzDocumentType()
  {
    return szDocumentType;
  }

  public void setSzCompany(String szCompany)
  {
    this.szCompany = szCompany;
  }

  public String getSzCompany()
  {
    return szCompany;
  }

  public void setSzUserId(String szUserId)
  {
    this.szUserId = szUserId;
  }

  public String getSzUserId()
  {
    return szUserId;
  }

  public void setJdDateUpdated(Date jdDateUpdated)
  {
    this.jdDateUpdated = jdDateUpdated;
  }

  public Date getJdDateUpdated()
  {
    return jdDateUpdated;
  }
  
  public void setJdDateUpdated(Calendar calDateUpdated){
                  if (calDateUpdated == null){
                                  Calendar currentDate = Calendar.getInstance();
                                  this.jdDateUpdated = currentDate.getTime();
  }else{
                  this.jdDateUpdated = calDateUpdated.getTime();
  }
  }
  public void setMnTimeLastUpdated(MathNumeric mnTimeLastUpdated)
  {
    this.mnTimeLastUpdated = mnTimeLastUpdated;
  }

  public MathNumeric getMnTimeLastUpdated()
  {
    return mnTimeLastUpdated;
  }

  public void setSzWorkStationId(String szWorkStationId)
  {
    this.szWorkStationId = szWorkStationId;
  }

  public String getSzWorkStationId()
  {
    return szWorkStationId;
  }

  public void setSzProgramId(String szProgramId)
  {
    this.szProgramId = szProgramId;
  }

  public String getSzProgramId()
  {
    return szProgramId;
  }

  public void setCErrorCode(String cErrorCode)
  {
    this.cErrorCode = cErrorCode;
  }

  public String getCErrorCode()
  {
    return cErrorCode;
  }

  public void setSzErrorDescription(String szErrorDescription)
  {
    this.szErrorDescription = szErrorDescription;
  }

  public String getSzErrorDescription()
  {
    return szErrorDescription;
  }
}
