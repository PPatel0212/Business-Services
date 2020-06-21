package be.e1.bssv.J563002.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalF3002GetNextBillOfMaterial extends ValueObject implements Serializable {
    /**
     * Type Bill of Material
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TBM <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne Default value: M <br>
     * EnterpriseOne User Defined Code: 40/TB <br>
     */
    private String szTypeBOM = null;

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
    private String szBranchPlant = null;

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
    private MathNumeric mnParentItemNumber = null;

    /**
     * Units - Batch Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BQTY <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric mnBatchQuantity = null;

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
    private MathNumeric mnSubstituteItemSequenceNo = null;

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
    private String cCoproductsByproducts = null;

    /**
     * Component Branch
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CMCU <br>
     * EnterpriseOne field length:  12 <br>
     * EnterpriseOne Edit Rule:SERVER <br>
     */
    private String szComponentBranch = null;

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
    private MathNumeric mnItemNumberShort = null;

    /**
     * Sequence Number - Operations
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OPSQ <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     * EnterpriseOne Default value: 00100 <br>
     */
    private MathNumeric mnOperationSequenceNo = null;

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
     * Quantity - Standard Required Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: QNTY <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     * EnterpriseOne Default value: 10000 <br>
     */
    private MathNumeric mnQuantityPer = null;

    /**
     * Unit of Measure
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UM <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String szUnitOfMeasure = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cRequestType = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szErrorMessageID = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szIndex = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szKeys = null;

    /**
     * Unit of Measure as Input
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UOM <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String szUOMasInput = null;

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
     * Effective From Serial Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FSER <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szEffectiveFromNo = null;

    /**
     * Effective Thru Serial Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TSER <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szEffectiveThruNo = null;

    /**
     * Fixed or Variable Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FORQ <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: V <br>
     * EnterpriseOne User Defined Code: H40/FO <br>
     */
    private String cFixedOrVariableQty = null;

    /**
     * ECO Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ECO <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szECONumber = null;

    /**
     * Engineering Change Reason
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ECTY <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 40/CR <br>
     */
    private String szECOReason = null;

    /**
     * Date - Engineering Change Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ECOD <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdEngineeringChangeDate = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szDescription = null;

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
    private String szProgramID = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cEndOfFile = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cReturnFieldValues = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cSuppressErrorMessages = null;

    /**
     * Generid Long ID - EnterpriseOne
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: GENLNG <br>
     * EnterpriseOne field length:  11 <br>
     */
    private Integer idRequestHandleID = null;

    /**
     * Generid Long ID - EnterpriseOne
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: GENLNG <br>
     * EnterpriseOne field length:  11 <br>
     */
    private Integer idUserHandleID = null;

    /**
     * Partials Allowed (Y/N)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRTA <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: Y <br>
     * EnterpriseOne Edit Rule:VALUE <br>
     */
    private String cPartialsAllowed = null;

    /**
     * Required
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FTRC <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: N <br>
     * EnterpriseOne Edit Rule:VALUE <br>
     */
    private String cRequiredYN = null;

    /**
     * Optional Item (Kit)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OPTK <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: S <br>
     * EnterpriseOne User Defined Code: H40/OP <br>
     */
    private String cTypeOfItemFSO = null;

    /**
     * Line Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNTY <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne Default value: S <br>
     */
    private String szLineType = null;

    /**
     * Date - Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDateUpdated = null;

    /**
     * Unit Price per Primary
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRIC <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric mnUnitPrice = null;

    /**
     * Amount - Unit Cost
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UNCS <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric mnUnitCost = null;

    /**
     * Percent - Percent of Scrap
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SCRP <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnScrapPercent = null;

    /**
     * Issue Type Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITC <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: I <br>
     * EnterpriseOne User Defined Code: 41/IT <br>
     */
    private String cIssueTypeCode = null;

    /**
     * Leadtime Offset Days
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LOVD <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnLeadtimeOffsetDays = null;

    /**
     * Operation Scrap Percent
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: STPP <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnOperationScrapPercent = null;

    /**
     * Resource Percent
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RSCP <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     * EnterpriseOne Default value: 10000 <br>
     */
    private MathNumeric mnResourcePercent = null;

    /**
     * Component Revision Level
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CMRV <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String szComponentRevisionLevel = null;

    /**
     * Component Item Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CPIT <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnComponentItemNo = null;

    /**
     * From Potency
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FRMP <br>
     * EnterpriseOne field length:  7 <br>
     * EnterpriseOne decimal places: 3 <br>
     * EnterpriseOne Default value: 0000000 <br>
     * EnterpriseOne Edit Rule:RANGE <br>
     */
    private MathNumeric mnFromPotency = null;

    /**
     * Thru Potency
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: THRP <br>
     * EnterpriseOne field length:  7 <br>
     * EnterpriseOne decimal places: 3 <br>
     * EnterpriseOne Default value: 0000000 <br>
     * EnterpriseOne Edit Rule:RANGE <br>
     */
    private MathNumeric mnThruPotency = null;

    /**
     * From Grade
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FRGD <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 40/LG <br>
     */
    private String szFromGrade = null;

    /**
     * Thru Grade
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: THGD <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 40/LG <br>
     */
    private String szThruGrade = null;

    /**
     * Percent - Cumulative Planned Yield
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CPYP <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnCumulativeYieldPercent = null;

    /**
     * Feature Cost Percent
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: F$RP <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     * EnterpriseOne Default value: 10000 <br>
     */
    private MathNumeric mnFeatureCostPercent = null;

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
    private MathNumeric mnComponentLineNumber = null;

    public void setSzTypeBOM(String szTypeBOM) {
        this.szTypeBOM = szTypeBOM;
    }

    public String getSzTypeBOM() {
        return szTypeBOM;
    }

    public void setSzBranchPlant(String szBranchPlant) {
        this.szBranchPlant = szBranchPlant;
    }

    public String getSzBranchPlant() {
        return szBranchPlant;
    }

    public void setMnParentItemNumber(MathNumeric mnParentItemNumber) {
        this.mnParentItemNumber = mnParentItemNumber;
    }

    public MathNumeric getMnParentItemNumber() {
        return mnParentItemNumber;
    }

    public void setMnBatchQuantity(MathNumeric mnBatchQuantity) {
        this.mnBatchQuantity = mnBatchQuantity;
    }

    public MathNumeric getMnBatchQuantity() {
        return mnBatchQuantity;
    }

    public void setMnSubstituteItemSequenceNo(MathNumeric mnSubstituteItemSequenceNo) {
        this.mnSubstituteItemSequenceNo = mnSubstituteItemSequenceNo;
    }

    public MathNumeric getMnSubstituteItemSequenceNo() {
        return mnSubstituteItemSequenceNo;
    }

    public void setCCoproductsByproducts(String cCoproductsByproducts) {
        this.cCoproductsByproducts = cCoproductsByproducts;
    }

    public String getCCoproductsByproducts() {
        return cCoproductsByproducts;
    }

    public void setSzComponentBranch(String szComponentBranch) {
        this.szComponentBranch = szComponentBranch;
    }

    public String getSzComponentBranch() {
        return szComponentBranch;
    }

    public void setMnItemNumberShort(MathNumeric mnItemNumberShort) {
        this.mnItemNumberShort = mnItemNumberShort;
    }

    public MathNumeric getMnItemNumberShort() {
        return mnItemNumberShort;
    }

    public void setMnOperationSequenceNo(MathNumeric mnOperationSequenceNo) {
        this.mnOperationSequenceNo = mnOperationSequenceNo;
    }

    public MathNumeric getMnOperationSequenceNo() {
        return mnOperationSequenceNo;
    }

    public void setJdEffectiveThru(Date jdEffectiveThru) {
        this.jdEffectiveThru = jdEffectiveThru;
    }

    public Date getJdEffectiveThru() {
        return jdEffectiveThru;
    }

    public void setMnQuantityPer(MathNumeric mnQuantityPer) {
        this.mnQuantityPer = mnQuantityPer;
    }

    public MathNumeric getMnQuantityPer() {
        return mnQuantityPer;
    }

    public void setSzUnitOfMeasure(String szUnitOfMeasure) {
        this.szUnitOfMeasure = szUnitOfMeasure;
    }

    public String getSzUnitOfMeasure() {
        return szUnitOfMeasure;
    }

    public void setCRequestType(String cRequestType) {
        this.cRequestType = cRequestType;
    }

    public String getCRequestType() {
        return cRequestType;
    }

    public void setSzErrorMessageID(String szErrorMessageID) {
        this.szErrorMessageID = szErrorMessageID;
    }

    public String getSzErrorMessageID() {
        return szErrorMessageID;
    }

    public void setSzIndex(String szIndex) {
        this.szIndex = szIndex;
    }

    public String getSzIndex() {
        return szIndex;
    }

    public void setSzKeys(String szKeys) {
        this.szKeys = szKeys;
    }

    public String getSzKeys() {
        return szKeys;
    }

    public void setSzUOMasInput(String szUOMasInput) {
        this.szUOMasInput = szUOMasInput;
    }

    public String getSzUOMasInput() {
        return szUOMasInput;
    }

    public void setJdEffectiveFrom(Date jdEffectiveFrom) {
        this.jdEffectiveFrom = jdEffectiveFrom;
    }

    public Date getJdEffectiveFrom() {
        return jdEffectiveFrom;
    }

    public void setSzEffectiveFromNo(String szEffectiveFromNo) {
        this.szEffectiveFromNo = szEffectiveFromNo;
    }

    public String getSzEffectiveFromNo() {
        return szEffectiveFromNo;
    }

    public void setSzEffectiveThruNo(String szEffectiveThruNo) {
        this.szEffectiveThruNo = szEffectiveThruNo;
    }

    public String getSzEffectiveThruNo() {
        return szEffectiveThruNo;
    }

    public void setCFixedOrVariableQty(String cFixedOrVariableQty) {
        this.cFixedOrVariableQty = cFixedOrVariableQty;
    }

    public String getCFixedOrVariableQty() {
        return cFixedOrVariableQty;
    }

    public void setSzECONumber(String szECONumber) {
        this.szECONumber = szECONumber;
    }

    public String getSzECONumber() {
        return szECONumber;
    }

    public void setSzECOReason(String szECOReason) {
        this.szECOReason = szECOReason;
    }

    public String getSzECOReason() {
        return szECOReason;
    }

    public void setJdEngineeringChangeDate(Date jdEngineeringChangeDate) {
        this.jdEngineeringChangeDate = jdEngineeringChangeDate;
    }

    public Date getJdEngineeringChangeDate() {
        return jdEngineeringChangeDate;
    }

    public void setSzDescription(String szDescription) {
        this.szDescription = szDescription;
    }

    public String getSzDescription() {
        return szDescription;
    }

    public void setSzProgramID(String szProgramID) {
        this.szProgramID = szProgramID;
    }

    public String getSzProgramID() {
        return szProgramID;
    }

    public void setCEndOfFile(String cEndOfFile) {
        this.cEndOfFile = cEndOfFile;
    }

    public String getCEndOfFile() {
        return cEndOfFile;
    }

    public void setCReturnFieldValues(String cReturnFieldValues) {
        this.cReturnFieldValues = cReturnFieldValues;
    }

    public String getCReturnFieldValues() {
        return cReturnFieldValues;
    }

    public void setCSuppressErrorMessages(String cSuppressErrorMessages) {
        this.cSuppressErrorMessages = cSuppressErrorMessages;
    }

    public String getCSuppressErrorMessages() {
        return cSuppressErrorMessages;
    }

    public void setIdRequestHandleID(Integer idRequestHandleID) {
        this.idRequestHandleID = idRequestHandleID;
    }

    public Integer getIdRequestHandleID() {
        return idRequestHandleID;
    }

    public void setIdUserHandleID(Integer idUserHandleID) {
        this.idUserHandleID = idUserHandleID;
    }

    public Integer getIdUserHandleID() {
        return idUserHandleID;
    }

    public void setCPartialsAllowed(String cPartialsAllowed) {
        this.cPartialsAllowed = cPartialsAllowed;
    }

    public String getCPartialsAllowed() {
        return cPartialsAllowed;
    }

    public void setCRequiredYN(String cRequiredYN) {
        this.cRequiredYN = cRequiredYN;
    }

    public String getCRequiredYN() {
        return cRequiredYN;
    }

    public void setCTypeOfItemFSO(String cTypeOfItemFSO) {
        this.cTypeOfItemFSO = cTypeOfItemFSO;
    }

    public String getCTypeOfItemFSO() {
        return cTypeOfItemFSO;
    }

    public void setSzLineType(String szLineType) {
        this.szLineType = szLineType;
    }

    public String getSzLineType() {
        return szLineType;
    }

    public void setJdDateUpdated(Date jdDateUpdated) {
        this.jdDateUpdated = jdDateUpdated;
    }

    public Date getJdDateUpdated() {
        return jdDateUpdated;
    }

    public void setMnUnitPrice(MathNumeric mnUnitPrice) {
        this.mnUnitPrice = mnUnitPrice;
    }

    public MathNumeric getMnUnitPrice() {
        return mnUnitPrice;
    }

    public void setMnUnitCost(MathNumeric mnUnitCost) {
        this.mnUnitCost = mnUnitCost;
    }

    public MathNumeric getMnUnitCost() {
        return mnUnitCost;
    }

    public void setMnScrapPercent(MathNumeric mnScrapPercent) {
        this.mnScrapPercent = mnScrapPercent;
    }

    public MathNumeric getMnScrapPercent() {
        return mnScrapPercent;
    }

    public void setCIssueTypeCode(String cIssueTypeCode) {
        this.cIssueTypeCode = cIssueTypeCode;
    }

    public String getCIssueTypeCode() {
        return cIssueTypeCode;
    }

    public void setMnLeadtimeOffsetDays(MathNumeric mnLeadtimeOffsetDays) {
        this.mnLeadtimeOffsetDays = mnLeadtimeOffsetDays;
    }

    public MathNumeric getMnLeadtimeOffsetDays() {
        return mnLeadtimeOffsetDays;
    }

    public void setMnOperationScrapPercent(MathNumeric mnOperationScrapPercent) {
        this.mnOperationScrapPercent = mnOperationScrapPercent;
    }

    public MathNumeric getMnOperationScrapPercent() {
        return mnOperationScrapPercent;
    }

    public void setMnResourcePercent(MathNumeric mnResourcePercent) {
        this.mnResourcePercent = mnResourcePercent;
    }

    public MathNumeric getMnResourcePercent() {
        return mnResourcePercent;
    }

    public void setSzComponentRevisionLevel(String szComponentRevisionLevel) {
        this.szComponentRevisionLevel = szComponentRevisionLevel;
    }

    public String getSzComponentRevisionLevel() {
        return szComponentRevisionLevel;
    }

    public void setMnComponentItemNo(MathNumeric mnComponentItemNo) {
        this.mnComponentItemNo = mnComponentItemNo;
    }

    public MathNumeric getMnComponentItemNo() {
        return mnComponentItemNo;
    }

    public void setMnFromPotency(MathNumeric mnFromPotency) {
        this.mnFromPotency = mnFromPotency;
    }

    public MathNumeric getMnFromPotency() {
        return mnFromPotency;
    }

    public void setMnThruPotency(MathNumeric mnThruPotency) {
        this.mnThruPotency = mnThruPotency;
    }

    public MathNumeric getMnThruPotency() {
        return mnThruPotency;
    }

    public void setSzFromGrade(String szFromGrade) {
        this.szFromGrade = szFromGrade;
    }

    public String getSzFromGrade() {
        return szFromGrade;
    }

    public void setSzThruGrade(String szThruGrade) {
        this.szThruGrade = szThruGrade;
    }

    public String getSzThruGrade() {
        return szThruGrade;
    }

    public void setMnCumulativeYieldPercent(MathNumeric mnCumulativeYieldPercent) {
        this.mnCumulativeYieldPercent = mnCumulativeYieldPercent;
    }

    public MathNumeric getMnCumulativeYieldPercent() {
        return mnCumulativeYieldPercent;
    }

    public void setMnFeatureCostPercent(MathNumeric mnFeatureCostPercent) {
        this.mnFeatureCostPercent = mnFeatureCostPercent;
    }

    public MathNumeric getMnFeatureCostPercent() {
        return mnFeatureCostPercent;
    }

    public void setMnComponentLineNumber(MathNumeric mnComponentLineNumber) {
        this.mnComponentLineNumber = mnComponentLineNumber;
    }

    public MathNumeric getMnComponentLineNumber() {
        return mnComponentLineNumber;
    }
}
