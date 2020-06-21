package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetPickSlipDetailsWhereFields extends ValueObject implements Serializable {
    /**
     * Unique Key ID (Internal)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_UKID = null;

    /**
     * Pick Slip Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PSN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_PSN = null;

    public void setF5642008_UKID(MathNumeric F5642008_UKID) {
        this.F5642008_UKID = F5642008_UKID;
    }

    public MathNumeric getF5642008_UKID() {
        return F5642008_UKID;
    }

    public void setF5642008_PSN(MathNumeric F5642008_PSN) {
        this.F5642008_PSN = F5642008_PSN;
    }

    public MathNumeric getF5642008_PSN() {
        return F5642008_PSN;
    }
}
