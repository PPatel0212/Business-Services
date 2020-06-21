package be.e1.bssv.J564304.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowF43121Field extends InternalGetF43121WhereFields implements Serializable {
    /**
     * Document (Voucher, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DOC <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F43121_DOC = null;

    public void setF43121_DOC(MathNumeric F43121_DOC) {
        this.F43121_DOC = F43121_DOC;
    }

    public MathNumeric getF43121_DOC() {
        return F43121_DOC;
    }
}
