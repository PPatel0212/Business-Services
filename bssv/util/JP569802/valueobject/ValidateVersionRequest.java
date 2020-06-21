package be.e1.bssv.util.JP569802.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ValidateVersionRequest extends ValueObject implements Serializable {
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
     * Version History
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VERS <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String versionHistory = null;

    /**
     * TODO: Default public constructor for instantiating: ValidateVersionRequest
     */
    public ValidateVersionRequest() {
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getProgramID() {
        return programID;
    }

    public void setVersionHistory(String versionHistory) {
        this.versionHistory = versionHistory;
    }

    public String getVersionHistory() {
        return versionHistory;
    }
}
