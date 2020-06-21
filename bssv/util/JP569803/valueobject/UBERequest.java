package be.e1.bssv.util.JP569803.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class UBERequest extends ValueObject implements Serializable {
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
    private String RunAsynch = null;
    
    private String PrintQueue = null;
    
    private String BiLinkFlag = null;

    /**
     * TODO: Default public constructor for instantiating: UBERequest
     */
    public UBERequest() {
    }

    public void setReportName(String objectName) {
        this.ReportName = objectName;
    }

    public String getReportName() {
        return ReportName;
    }
    
  public void setPrintQueue(String queue) {
      this.PrintQueue = queue;
  }

  public String getPrintQueue() {
      return PrintQueue;
  }

    public void setReportVersion(String versionHistory) {
        this.ReportVersion = versionHistory;
    }

    public String getReportVersion() {
        return ReportVersion;
    }

    public void setRunAsynch(String flag) {
        this.RunAsynch = flag;
    }

    public String getRunAsynch() {
        return RunAsynch;
    }
    
  public void setBiLinkFlag(String flag) {
      this.BiLinkFlag = flag;
  }

  public String getBiLinkFlag() {
      return BiLinkFlag;
  }
}
