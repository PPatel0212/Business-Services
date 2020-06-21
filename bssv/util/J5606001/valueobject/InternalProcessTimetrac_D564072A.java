package be.e1.bssv.util.J5606001.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalProcessTimetrac_D564072A extends ValueObject implements Serializable {
    /**
     * Process String
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szProcessString = null;

    public void setSzProcessString(String szProcessString) {
        this.szProcessString = szProcessString;
    }

    public String getSzProcessString() {
        return szProcessString;
    }
}
