package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalCreatePickSlipDetails extends ValueObject implements Serializable {
    /**
     * Pick Slip Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PSN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnPickSlipNumber = null;

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
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cRecordSuccefullyUpdatedYN = null;

    public void setMnPickSlipNumber(MathNumeric mnPickSlipNumber) {
        this.mnPickSlipNumber = mnPickSlipNumber;
    }

    public MathNumeric getMnPickSlipNumber() {
        return mnPickSlipNumber;
    }

    public void setMnUniqueKeyIDInternal(MathNumeric mnUniqueKeyIDInternal) {
        this.mnUniqueKeyIDInternal = mnUniqueKeyIDInternal;
    }

    public MathNumeric getMnUniqueKeyIDInternal() {
        return mnUniqueKeyIDInternal;
    }

    public void setCRecordSuccefullyUpdatedYN(String cRecordSuccefullyUpdatedYN) {
        this.cRecordSuccefullyUpdatedYN = cRecordSuccefullyUpdatedYN;
    }

    public String getCRecordSuccefullyUpdatedYN() {
        return cRecordSuccefullyUpdatedYN;
    }
}
