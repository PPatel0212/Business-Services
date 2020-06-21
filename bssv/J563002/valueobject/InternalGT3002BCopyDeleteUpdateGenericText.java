package be.e1.bssv.J563002.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGT3002BCopyDeleteUpdateGenericText extends ValueObject implements Serializable {
    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cProcessEdits = null;

    /**
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cErrorCode = null;

    /**
     * Suppress Error Message
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SUPPS <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cSuppressErrorMessage = null;

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
     * Parent (short) Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KIT <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnFromParentItemShort = null;

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
    private String szFromParentBranch = null;

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
    private String szFromTypeBill = null;

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
    private MathNumeric mnFromUnitsBatchQuantity = null;

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
    private MathNumeric mnFromItemNumberShort = null;

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
    private MathNumeric mnToParentItemShort = null;

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
    private String szToParentBranch = null;

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
    private String szToTypeBill = null;

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
    private MathNumeric mnToUnitsBatchQuantity = null;

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
    private MathNumeric mnToItemNumberShort = null;

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
    private MathNumeric mnFromComponentLineNumber = null;

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
    private MathNumeric mnToComponentLineNumber = null;

    public void setCProcessEdits(String cProcessEdits) {
        this.cProcessEdits = cProcessEdits;
    }

    public String getCProcessEdits() {
        return cProcessEdits;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }

    public void setCSuppressErrorMessage(String cSuppressErrorMessage) {
        this.cSuppressErrorMessage = cSuppressErrorMessage;
    }

    public String getCSuppressErrorMessage() {
        return cSuppressErrorMessage;
    }

    public void setSzErrorMessageID(String szErrorMessageID) {
        this.szErrorMessageID = szErrorMessageID;
    }

    public String getSzErrorMessageID() {
        return szErrorMessageID;
    }

    public void setMnFromParentItemShort(MathNumeric mnFromParentItemShort) {
        this.mnFromParentItemShort = mnFromParentItemShort;
    }

    public MathNumeric getMnFromParentItemShort() {
        return mnFromParentItemShort;
    }

    public void setSzFromParentBranch(String szFromParentBranch) {
        this.szFromParentBranch = szFromParentBranch;
    }

    public String getSzFromParentBranch() {
        return szFromParentBranch;
    }

    public void setSzFromTypeBill(String szFromTypeBill) {
        this.szFromTypeBill = szFromTypeBill;
    }

    public String getSzFromTypeBill() {
        return szFromTypeBill;
    }

    public void setMnFromUnitsBatchQuantity(MathNumeric mnFromUnitsBatchQuantity) {
        this.mnFromUnitsBatchQuantity = mnFromUnitsBatchQuantity;
    }

    public MathNumeric getMnFromUnitsBatchQuantity() {
        return mnFromUnitsBatchQuantity;
    }

    public void setMnFromItemNumberShort(MathNumeric mnFromItemNumberShort) {
        this.mnFromItemNumberShort = mnFromItemNumberShort;
    }

    public MathNumeric getMnFromItemNumberShort() {
        return mnFromItemNumberShort;
    }

    public void setMnToParentItemShort(MathNumeric mnToParentItemShort) {
        this.mnToParentItemShort = mnToParentItemShort;
    }

    public MathNumeric getMnToParentItemShort() {
        return mnToParentItemShort;
    }

    public void setSzToParentBranch(String szToParentBranch) {
        this.szToParentBranch = szToParentBranch;
    }

    public String getSzToParentBranch() {
        return szToParentBranch;
    }

    public void setSzToTypeBill(String szToTypeBill) {
        this.szToTypeBill = szToTypeBill;
    }

    public String getSzToTypeBill() {
        return szToTypeBill;
    }

    public void setMnToUnitsBatchQuantity(MathNumeric mnToUnitsBatchQuantity) {
        this.mnToUnitsBatchQuantity = mnToUnitsBatchQuantity;
    }

    public MathNumeric getMnToUnitsBatchQuantity() {
        return mnToUnitsBatchQuantity;
    }

    public void setMnToItemNumberShort(MathNumeric mnToItemNumberShort) {
        this.mnToItemNumberShort = mnToItemNumberShort;
    }

    public MathNumeric getMnToItemNumberShort() {
        return mnToItemNumberShort;
    }

    public void setMnFromComponentLineNumber(MathNumeric mnFromComponentLineNumber) {
        this.mnFromComponentLineNumber = mnFromComponentLineNumber;
    }

    public MathNumeric getMnFromComponentLineNumber() {
        return mnFromComponentLineNumber;
    }

    public void setMnToComponentLineNumber(MathNumeric mnToComponentLineNumber) {
        this.mnToComponentLineNumber = mnToComponentLineNumber;
    }

    public MathNumeric getMnToComponentLineNumber() {
        return mnToComponentLineNumber;
    }
}
