package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSODetailsWhereFields extends ValueObject implements Serializable {
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
    private MathNumeric F4211_PSN = null;

    public void setF4211_PSN(MathNumeric F4211_PSN) {
        this.F4211_PSN = F4211_PSN;
    }

    public MathNumeric getF4211_PSN() {
        return F4211_PSN;
    }
}
