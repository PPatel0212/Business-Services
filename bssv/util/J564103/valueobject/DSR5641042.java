package be.e1.bssv.util.J564103.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class DSR5641042 extends ValueObject implements Serializable {
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
    private MathNumeric mnTransactionID = null;

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

    public void setMnTransactionID(MathNumeric mnTransactionID) {
        this.mnTransactionID = mnTransactionID;
    }

    public MathNumeric getMnTransactionID() {
        return mnTransactionID;
    }

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

    public void setSzPrintQueue(String szPrintQueue) {
        this.szPrintQueue = szPrintQueue;
    }

    public String getSzPrintQueue() {
        return szPrintQueue;
    }

    public void setCRunAsynchronous(String cRunAsynchronous) {
        this.cRunAsynchronous = cRunAsynchronous;
    }

    public String getCRunAsynchronous() {
        return cRunAsynchronous;
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
}
