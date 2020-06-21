package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetNextUKIDF5642008 extends ValueObject implements Serializable {
    /**
     * Object Name
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OBNM <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szObjectName = null;

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
    private MathNumeric mnUniqueKeyID = null;

    public void setSzObjectName(String szObjectName) {
        this.szObjectName = szObjectName;
    }

    public String getSzObjectName() {
        return szObjectName;
    }

    public void setMnUniqueKeyID(MathNumeric mnUniqueKeyID) {
        this.mnUniqueKeyID = mnUniqueKeyID;
    }

    public MathNumeric getMnUniqueKeyID() {
        return mnUniqueKeyID;
    }
}
