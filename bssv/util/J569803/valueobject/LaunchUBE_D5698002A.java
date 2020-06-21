package be.e1.bssv.util.J569803.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LaunchUBE_D5698002A extends ValueObject implements Serializable {
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

    public void setSzReportName(String szReportName) {
        this.szReportName = szReportName;
    }

    public String getSzReportName() {
        return szReportName;
    }

    public void setSzReportVersion(String szReportVersion) {
        this.szReportVersion = szReportVersion;
    }

    public String getSzReportVersion() {
        return szReportVersion;
    }

    public void setCErrorFlag(String cErrorFlag) {
        this.cErrorFlag = cErrorFlag;
    }

    public String getCErrorFlag() {
        return cErrorFlag;
    }

    public void setSzErrorMessage(String szErrorMessage) {
        this.szErrorMessage = szErrorMessage;
    }

    public String getSzErrorMessage() {
        return szErrorMessage;
    }

    public void setSzOutputFileLink(String szOutputFileLink) {
        this.szOutputFileLink = szOutputFileLink;
    }

    public String getSzOutputFileLink() {
        return szOutputFileLink;
    }

    public void setCRunAsynchronous(String cRunAsynchronous) {
        this.cRunAsynchronous = cRunAsynchronous;
    }

    public String getCRunAsynchronous() {
        return cRunAsynchronous;
    }

    public void setSzPrintQueue(String szPrintQueue) {
        this.szPrintQueue = szPrintQueue;
    }

    public String getSzPrintQueue() {
        return szPrintQueue;
    }

    public void setSzOutputFileName(String szOutputFileName) {
        this.szOutputFileName = szOutputFileName;
    }

    public String getSzOutputFileName() {
        return szOutputFileName;
    }

    public void setCGenerateBIPubLink(String cGenerateBIPubLink) {
        this.cGenerateBIPubLink = cGenerateBIPubLink;
    }

    public String getCGenerateBIPubLink() {
        return cGenerateBIPubLink;
    }
}
