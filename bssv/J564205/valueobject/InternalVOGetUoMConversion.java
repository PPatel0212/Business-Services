package be.e1.bssv.J564205.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalVOGetUoMConversion extends ValueObject implements Serializable {
    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szBranchPlant = null;                                    

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
    private String szFromUnitOfMeasure = null;

    /**
     * Related Unit of Measure
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RUM <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String szToUnitOfMeasure = null;

    /**
     * Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: QTY <br>
     * EnterpriseOne field length:  7 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnQuantityToConvert = null;

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
    private MathNumeric mnShortItemNumber = null;

    /**
     * Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: QTY <br>
     * EnterpriseOne field length:  7 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric mnQuantityConvertedFromtoTo = null;

    public void setSzBranchPlant(String szBranchPlant) {
        this.szBranchPlant = szBranchPlant;
    }

    public String getSzBranchPlant() {
        return szBranchPlant;
    }

    public void setSzFromUnitOfMeasure(String szFromUnitOfMeasure) {
        this.szFromUnitOfMeasure = szFromUnitOfMeasure;
    }

    public String getSzFromUnitOfMeasure() {
        return szFromUnitOfMeasure;
    }

    public void setSzToUnitOfMeasure(String szToUnitOfMeasure) {
        this.szToUnitOfMeasure = szToUnitOfMeasure;
    }

    public String getSzToUnitOfMeasure() {
        return szToUnitOfMeasure;
    }

    public void setMnQuantityToConvert(MathNumeric mnQuantityToConvert) {
        this.mnQuantityToConvert = mnQuantityToConvert;
    }

    public MathNumeric getMnQuantityToConvert() {
        return mnQuantityToConvert;
    }

    public void setMnShortItemNumber(MathNumeric mnShortItemNumber) {
        this.mnShortItemNumber = mnShortItemNumber;
    }

    public MathNumeric getMnShortItemNumber() {
        return mnShortItemNumber;
    }

    public void setMnQuantityConvertedFromtoTo(MathNumeric mnQuantityConvertedFromtoTo) {
        this.mnQuantityConvertedFromtoTo = mnQuantityConvertedFromtoTo;
    }

    public MathNumeric getMnQuantityConvertedFromtoTo() {
        return mnQuantityConvertedFromtoTo;
    }
}
