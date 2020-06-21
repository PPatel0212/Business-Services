package be.e1.bssv.J563002.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalF3015DeleteComponentLocator extends ValueObject implements Serializable {
    /**
     * Branch
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MMCU <br>
     * EnterpriseOne field length:  12 <br>
     * EnterpriseOne Edit Rule:SERVER <br>
     */
    private String szParentBranch = null;

    /**
     * Parent (short) Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KIT <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnParentItemShort = null;

    /**
     * Item Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITM <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnComponentShort = null;

    /**
     * Effective - From Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFFF <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdEffectiveFrom = null;

    /**
     * Effective - Thru Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFFT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdEffectiveThru = null;

    /**
     * Component Line Number BOM
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CPNB <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnLineNo = null;

    public void setSzParentBranch(String szParentBranch) {
        this.szParentBranch = szParentBranch;
    }

    public String getSzParentBranch() {
        return szParentBranch;
    }

    public void setMnParentItemShort(MathNumeric mnParentItemShort) {
        this.mnParentItemShort = mnParentItemShort;
    }

    public MathNumeric getMnParentItemShort() {
        return mnParentItemShort;
    }

    public void setMnComponentShort(MathNumeric mnComponentShort) {
        this.mnComponentShort = mnComponentShort;
    }

    public MathNumeric getMnComponentShort() {
        return mnComponentShort;
    }

    public void setJdEffectiveFrom(Date jdEffectiveFrom) {
        this.jdEffectiveFrom = jdEffectiveFrom;
    }

    public Date getJdEffectiveFrom() {
        return jdEffectiveFrom;
    }

    public void setJdEffectiveThru(Date jdEffectiveThru) {
        this.jdEffectiveThru = jdEffectiveThru;
    }

    public Date getJdEffectiveThru() {
        return jdEffectiveThru;
    }

    public void setMnLineNo(MathNumeric mnLineNo) {
        this.mnLineNo = mnLineNo;
    }

    public MathNumeric getMnLineNo() {
        return mnLineNo;
    }
}
