package be.e1.bssv.J563401.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalMessageCancellationRequest extends ValueObject implements Serializable {
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
    private MathNumeric mnUniqueKeyIDInternal = null;

    /**
     * Mode - Processing
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MODE <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cModeProcessing = null;

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

    public void setMnUniqueKeyIDInternal(MathNumeric mnUniqueKeyIDInternal) {
        this.mnUniqueKeyIDInternal = mnUniqueKeyIDInternal;
    }

    public MathNumeric getMnUniqueKeyIDInternal() {
        return mnUniqueKeyIDInternal;
    }

    public void setCModeProcessing(String cModeProcessing) {
        this.cModeProcessing = cModeProcessing;
    }

    public String getCModeProcessing() {
        return cModeProcessing;
    }

    public void setSzProgramId(String szProgramId) {
        this.szProgramId = szProgramId;
    }

    public String getSzProgramId() {
        return szProgramId;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }
}
