package be.e1.bssv.util.JP564303.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PORequest
  extends ValueObject
  implements Serializable
{
  /**
   * Object Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OBNM <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String ReportName = null;

  /**
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String ReportVersion = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String BiLinkFlag = null;

  /**
   * Print Queue
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PRTQ <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String printQueue = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String RunAsynch = null;

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
  private Integer OrderNumber = null;

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
   * Mode - Processing
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MODE <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String modeProcessing = null;

  /**
   * Change Order Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CORD <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer changeOrderNumber = null;

  /**
   * PO Generator Source System
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: POGS <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String pOGeneratorSourceSystem = null;

  /**
   * Unique Key ID (Internal)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UKID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer uniqueKeyIDInternal = null;
  
  
 
  /**
   * TODO: Default public constructor for instantiating: PORequest
   */
  public PORequest()
  {
    this.uniqueKeyIDInternal=0;
  }

  public void setReportName(String objectName)
  {
    this.ReportName = objectName;
  }

  public String getReportName()
  {
    return ReportName;
  }

  public void setReportVersion(String versionHistory)
  {
    this.ReportVersion = versionHistory;
  }

  public String getReportVersion()
  {
    return ReportVersion;
  }

  public void setRunAsynch(String jDEnterpriseOneEventPoint01)
  {
    this.RunAsynch = jDEnterpriseOneEventPoint01;
  }

  public String getRunAsynch() 
  {
    return RunAsynch;
  }

  public void setPrintQueue(String printQueue)
  {
    this.printQueue = printQueue;
  }

  public String getPrintQueue()
  {
    return printQueue;
  }

  public void setBiLinkFlag(String jDEnterpriseOneEventPoint01)
  {
    this.BiLinkFlag = jDEnterpriseOneEventPoint01;
  }

  public String getBiLinkFlag()
  {
    return BiLinkFlag;
  }

  public void setOrderNumber(Integer documentOrderNoInvoiceetc)
  {
    this.OrderNumber = documentOrderNoInvoiceetc;
  }

  public Integer getOrderNumber()
  {
    return OrderNumber;
  }

  public void setOrderType(String orderType)
  {
    this.orderType = orderType;
  }

  public String getOrderType()
  {
    return orderType;
  }

  public void setOrderCompanyOrderNumber(String orderCompanyOrderNumber)
  {
    this.orderCompanyOrderNumber = orderCompanyOrderNumber;
  }

  public String getOrderCompanyOrderNumber()
  {
    return orderCompanyOrderNumber;
  }

  public void setOrderSuffix(String orderSuffix)
  {
    this.orderSuffix = orderSuffix;
  }

  public String getOrderSuffix()
  {
    return orderSuffix;
  }

  public void setModeProcessing(String modeProcessing)
  {
    this.modeProcessing = modeProcessing;
  }

  public String getModeProcessing()
  {
    return modeProcessing;
  }

  public void setChangeOrderNumber(Integer changeOrderNumber)
  {
    this.changeOrderNumber = changeOrderNumber;
  }

  public Integer getChangeOrderNumber()
  {
    return changeOrderNumber;
  }

  public void setPOGeneratorSourceSystem(String pOGeneratorSourceSystem)
  {
    this.pOGeneratorSourceSystem = pOGeneratorSourceSystem;
  }

  public String getPOGeneratorSourceSystem()
  {
    return pOGeneratorSourceSystem;
  }

  public void setUniqueKeyIDInternal(Integer uniqueKeyIDInternal)
  {
    this.uniqueKeyIDInternal = uniqueKeyIDInternal;
  }

  public Integer getUniqueKeyIDInternal()
  {
    return uniqueKeyIDInternal;
  }
}
