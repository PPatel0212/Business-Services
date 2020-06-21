package be.e1.bssv.util.J569802.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ValidateVersion_D4002400 extends ValueObject implements Serializable {
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
     * Version History
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VERS <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szVersion = null;

    /**
     * Version Title
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JD <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String szVersionTitle = null;

    public void setSzProgramId(String szProgramId) {
        this.szProgramId = szProgramId;
    }

    public String getSzProgramId() {
        return szProgramId;
    }

    public void setSzVersion(String szVersion) {
        this.szVersion = szVersion;
    }

    public String getSzVersion() {
        return szVersion;
    }

    public void setSzVersionTitle(String szVersionTitle) {
        this.szVersionTitle = szVersionTitle;
    }

    public String getSzVersionTitle() {
        return szVersionTitle;
    }
}
