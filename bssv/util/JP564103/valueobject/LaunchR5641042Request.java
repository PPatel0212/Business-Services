package be.e1.bssv.util.JP564103.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LaunchR5641042Request extends ValueObject implements Serializable
{
  /**
   * Transaction ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TCID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer transactionID = null;

  /**
   * Object Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OBNM <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String reportName = null;

  /**
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String reportVersion = null;

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
  private String cRunAsynchronousYN = null;

  /**
   * TODO: Default public constructor for instantiating: LaunchR5641042Request
   */
  public LaunchR5641042Request()
  {
  }

  public void setTransactionID(Integer transactionID)
  {
    this.transactionID = transactionID;
  }

  public Integer getTransactionID()
  {
    return transactionID;
  }

  public void setReportName(String reportName)
  {
    this.reportName = reportName;
  }

  public String getReportName()
  {
    return reportName;
  }

  public void setReportVersion(String reportVersion)
  {
    this.reportVersion = reportVersion;
  }

  public String getReportVersion()
  {
    return reportVersion;
  }

  public void setPrintQueue(String printQueue)
  {
    this.printQueue = printQueue;
  }

  public String getPrintQueue()
  {
    return printQueue;
  }

  public void setCRunAsynchronousYN(String cRunAsynchronousYN)
  {
    this.cRunAsynchronousYN = cRunAsynchronousYN;
  }

  public String getCRunAsynchronousYN()
  {
    return cRunAsynchronousYN;
  }
}
