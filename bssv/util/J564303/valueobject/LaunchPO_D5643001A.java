package be.e1.bssv.util.J564303.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LaunchPO_D5643001A
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
  private String szReportName = null;

  /**
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szReportVersion = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorFlag = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String szErrorMessage = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szOutputFileLink = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cRunAsynchronous = null;

  /**
   * Print Queue
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PRTQ <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne Edit Rule:CHKOBJ <br>
   */
  private String szPrintQueue = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String szOutputFileName = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cGenerateBIPubLink = null;

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
  private MathNumeric mnPONumberRI = null;

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
  private String szPODocTypeRI = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String szPOCompanyRI = null;

  /**
   * Order Suffix
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SFXO <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szPOOrderSuffixRI = null;

  /**
   * Mode - Processing
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MODE <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cPOProcessModeRI = null;

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
  private MathNumeric mnPOChangeOrderNumRI = null;

  /**
   * PO Generator Source System
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: POGS <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cPOGenSourceSystemRI = null;

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
  private MathNumeric mnPOUniqueKeyRI = null;

  public void setSzReportName(String szReportName)
  {
    this.szReportName = szReportName;
  }

  public String getSzReportName()
  {
    return szReportName;
  }

  public void setSzReportVersion(String szReportVersion)
  {
    this.szReportVersion = szReportVersion;
  }

  public String getSzReportVersion()
  {
    return szReportVersion;
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
  }

  public void setSzErrorMessage(String szErrorMessage)
  {
    this.szErrorMessage = szErrorMessage;
  }

  public String getSzErrorMessage()
  {
    return szErrorMessage;
  }

  public void setSzOutputFileLink(String szOutputFileLink)
  {
    this.szOutputFileLink = szOutputFileLink;
  }

  public String getSzOutputFileLink()
  {
    return szOutputFileLink;
  }

  public void setCRunAsynchronous(String cRunAsynchronous)
  {
    this.cRunAsynchronous = cRunAsynchronous;
  }

  public String getCRunAsynchronous()
  {
    return cRunAsynchronous;
  }

  public void setSzPrintQueue(String szPrintQueue)
  {
    this.szPrintQueue = szPrintQueue;
  }

  public String getSzPrintQueue()
  {
    return szPrintQueue;
  }

  public void setSzOutputFileName(String szOutputFileName)
  {
    this.szOutputFileName = szOutputFileName;
  }

  public String getSzOutputFileName()
  {
    return szOutputFileName;
  }

  public void setCGenerateBIPubLink(String cGenerateBIPubLink)
  {
    this.cGenerateBIPubLink = cGenerateBIPubLink;
  }

  public String getCGenerateBIPubLink()
  {
    return cGenerateBIPubLink;
  }

  public void setMnPONumberRI(MathNumeric mnPONumberRI)
  {
    this.mnPONumberRI = mnPONumberRI;
  }

  public MathNumeric getMnPONumberRI()
  {
    return mnPONumberRI;
  }

  public void setSzPODocTypeRI(String szPODocTypeRI)
  {
    this.szPODocTypeRI = szPODocTypeRI;
  }

  public String getSzPODocTypeRI()
  {
    return szPODocTypeRI;
  }

  public void setSzPOCompanyRI(String szPOCompanyRI)
  {
    this.szPOCompanyRI = szPOCompanyRI;
  }

  public String getSzPOCompanyRI()
  {
    return szPOCompanyRI;
  }

  public void setSzPOOrderSuffixRI(String szPOOrderSuffixRI)
  {
    this.szPOOrderSuffixRI = szPOOrderSuffixRI;
  }

  public String getSzPOOrderSuffixRI()
  {
    return szPOOrderSuffixRI;
  }

  public void setCPOProcessModeRI(String cPOProcessModeRI)
  {
    this.cPOProcessModeRI = cPOProcessModeRI;
  }

  public String getCPOProcessModeRI()
  {
    return cPOProcessModeRI;
  }

  public void setMnPOChangeOrderNumRI(MathNumeric mnPOChangeOrderNumRI)
  {
    this.mnPOChangeOrderNumRI = mnPOChangeOrderNumRI;
  }

  public MathNumeric getMnPOChangeOrderNumRI()
  {
    return mnPOChangeOrderNumRI;
  }

  public void setCPOGenSourceSystemRI(String cPOGenSourceSystemRI)
  {
    this.cPOGenSourceSystemRI = cPOGenSourceSystemRI;
  }

  public String getCPOGenSourceSystemRI()
  {
    return cPOGenSourceSystemRI;
  }

  public void setMnPOUniqueKeyRI(MathNumeric mnPOUniqueKeyRI)
  {
    this.mnPOUniqueKeyRI = mnPOUniqueKeyRI;
  }

  public MathNumeric getMnPOUniqueKeyRI()
  {
    return mnPOUniqueKeyRI;
  }
}
