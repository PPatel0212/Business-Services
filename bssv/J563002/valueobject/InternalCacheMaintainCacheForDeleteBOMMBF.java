package be.e1.bssv.J563002.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalCacheMaintainCacheForDeleteBOMMBF extends ValueObject implements Serializable {
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
    private MathNumeric mnPreviousComponentNumber = null;

    /**
     * Substitute Item Sequence Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SBNT <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnPreviousSubstituteItemSeqNo = null;

    /**
     * Co-Products/By-Products/Intermediate
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: COBY <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: C <br>
     * EnterpriseOne User Defined Code: H40/CO <br>
     */
    private String cPreviousCoproductsByproducts = null;

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
    private MathNumeric mnNewComponentNumber = null;

    /**
     * Substitute Item Sequence Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SBNT <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnNewSubstituteItemSeqNo = null;

    /**
     * Co-Products/By-Products/Intermediate
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: COBY <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: C <br>
     * EnterpriseOne User Defined Code: H40/CO <br>
     */
    private String cNewCoproductsByproducts = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cError = null;

    /**
     * Job Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JOBS <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 00/4 <br>
     */
    private MathNumeric mnJobNumber = null;

    public void setMnPreviousComponentNumber(MathNumeric mnPreviousComponentNumber) {
        this.mnPreviousComponentNumber = mnPreviousComponentNumber;
    }

    public MathNumeric getMnPreviousComponentNumber() {
        return mnPreviousComponentNumber;
    }

    public void setMnPreviousSubstituteItemSeqNo(MathNumeric mnPreviousSubstituteItemSeqNo) {
        this.mnPreviousSubstituteItemSeqNo = mnPreviousSubstituteItemSeqNo;
    }

    public MathNumeric getMnPreviousSubstituteItemSeqNo() {
        return mnPreviousSubstituteItemSeqNo;
    }

    public void setCPreviousCoproductsByproducts(String cPreviousCoproductsByproducts) {
        this.cPreviousCoproductsByproducts = cPreviousCoproductsByproducts;
    }

    public String getCPreviousCoproductsByproducts() {
        return cPreviousCoproductsByproducts;
    }

    public void setMnNewComponentNumber(MathNumeric mnNewComponentNumber) {
        this.mnNewComponentNumber = mnNewComponentNumber;
    }

    public MathNumeric getMnNewComponentNumber() {
        return mnNewComponentNumber;
    }

    public void setMnNewSubstituteItemSeqNo(MathNumeric mnNewSubstituteItemSeqNo) {
        this.mnNewSubstituteItemSeqNo = mnNewSubstituteItemSeqNo;
    }

    public MathNumeric getMnNewSubstituteItemSeqNo() {
        return mnNewSubstituteItemSeqNo;
    }

    public void setCNewCoproductsByproducts(String cNewCoproductsByproducts) {
        this.cNewCoproductsByproducts = cNewCoproductsByproducts;
    }

    public String getCNewCoproductsByproducts() {
        return cNewCoproductsByproducts;
    }

    public void setCError(String cError) {
        this.cError = cError;
    }

    public String getCError() {
        return cError;
    }

    public void setMnJobNumber(MathNumeric mnJobNumber) {
        this.mnJobNumber = mnJobNumber;
    }

    public MathNumeric getMnJobNumber() {
        return mnJobNumber;
    }
}
