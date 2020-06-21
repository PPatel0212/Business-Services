package be.e1.bssv.util.JP560203.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class UpdateWorkFlowHeaderRequest
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
  private Integer MessageID = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String orderCompanyOrderNumber = null;

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
  private Integer documentOrderNoInvoiceetc = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String orderType = null;

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
  private BigDecimal lineNumber = null;

  /**
   * Business Unit - Header
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String businessUnitHeader = null;

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
  private Integer itemNumberShort = null;

  /**
   * Account ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AID <br>
   * EnterpriseOne field length:  8 <br>
   */
  private String accountID = null;

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
  private BigDecimal sequenceNumber = null;

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
  private String lineType = null;

  /**
   * Generic Key
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GENKEY <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String genericKey = null;

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
  private Integer compositeKeyValues = null;

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
  private Integer documentVoucherInvoiceetc = null;

  /**
   * Document Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCT <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String documentType = null;

  /**
   * Company
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String company = null;

  /**
   * User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: USER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String userID = null;

  /**
   * Date - Updated
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UPMJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar dateUpdated = null;

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
  private Integer timeLastUpdated = null;

  /**
   * Work Station ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: JOBN <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String workStationID = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String programID = null;

  /**
   * TODO: Default public constructor for instantiating: UpdateWorkFlowHeaderRequest
   */
  public UpdateWorkFlowHeaderRequest()
  {
  }

  public void setMessageID(Integer MessageID)
  {
    this.MessageID = MessageID;
  }

  public Integer getMessageID()
  {
    return MessageID;
  }

  public void setOrderCompanyOrderNumber(String orderCompanyOrderNumber)
  {
    this.orderCompanyOrderNumber = orderCompanyOrderNumber;
  }

  public String getOrderCompanyOrderNumber()
  {
    return orderCompanyOrderNumber;
  }

  public void setDocumentOrderNoInvoiceetc(Integer documentOrderNoInvoiceetc)
  {
    this.documentOrderNoInvoiceetc = documentOrderNoInvoiceetc;
  }

  public Integer getDocumentOrderNoInvoiceetc()
  {
    return documentOrderNoInvoiceetc;
  }

  public void setOrderType(String orderType)
  {
    this.orderType = orderType;
  }

  public String getOrderType()
  {
    return orderType;
  }

  public void setLineNumber(BigDecimal lineNumber)
  {
    this.lineNumber = lineNumber;
  }

  public BigDecimal getLineNumber()
  {
    return lineNumber;
  }

  public void setBusinessUnitHeader(String businessUnitHeader)
  {
    this.businessUnitHeader = businessUnitHeader;
  }

  public String getBusinessUnitHeader()
  {
    return businessUnitHeader;
  }

  public void setItemNumberShort(Integer itemNumberShort)
  {
    this.itemNumberShort = itemNumberShort;
  }

  public Integer getItemNumberShort()
  {
    return itemNumberShort;
  }

  public void setAccountID(String accountID)
  {
    this.accountID = accountID;
  }

  public String getAccountID()
  {
    return accountID;
  }

  public void setSequenceNumber(BigDecimal sequenceNumber)
  {
    this.sequenceNumber = sequenceNumber;
  }

  public BigDecimal getSequenceNumber()
  {
    return sequenceNumber;
  }

  public void setLineType(String lineType)
  {
    this.lineType = lineType;
  }

  public String getLineType()
  {
    return lineType;
  }

  public void setGenericKey(String genericKey)
  {
    this.genericKey = genericKey;
  }

  public String getGenericKey()
  {
    return genericKey;
  }

  public void setCompositeKeyValues(Integer compositeKeyValues)
  {
    this.compositeKeyValues = compositeKeyValues;
  }

  public Integer getCompositeKeyValues()
  {
    return compositeKeyValues;
  }

  public void setDocumentVoucherInvoiceetc(Integer documentVoucherInvoiceetc)
  {
    this.documentVoucherInvoiceetc = documentVoucherInvoiceetc;
  }

  public Integer getDocumentVoucherInvoiceetc()
  {
    return documentVoucherInvoiceetc;
  }

  public void setDocumentType(String documentType)
  {
    this.documentType = documentType;
  }

  public String getDocumentType()
  {
    return documentType;
  }

  public void setCompany(String company)
  {
    this.company = company;
  }

  public String getCompany()
  {
    return company;
  }

  public void setUserID(String userID)
  {
    this.userID = userID;
  }

  public String getUserID()
  {
    return userID;
  }

  public void setDateUpdated(Calendar dateUpdated)
  {
    this.dateUpdated = dateUpdated;
  }

  public Calendar getDateUpdated()
  {
    return dateUpdated;
  }

  public void setTimeLastUpdated(Integer timeLastUpdated)
  {
    this.timeLastUpdated = timeLastUpdated;
  }

  public Integer getTimeLastUpdated()
  {
    return timeLastUpdated;
  }

  public void setWorkStationID(String workStationID)
  {
    this.workStationID = workStationID;
  }

  public String getWorkStationID()
  {
    return workStationID;
  }

  public void setProgramID(String programID)
  {
    this.programID = programID;
  }

  public String getProgramID()
  {
    return programID;
  }
}
