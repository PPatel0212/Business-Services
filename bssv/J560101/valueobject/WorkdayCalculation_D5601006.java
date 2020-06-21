package be.e1.bssv.J560101.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WorkdayCalculation_D5601006 extends ValueObject implements Serializable {
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

    public void setSzBranchPlant(String szBranchPlant) {
        this.szBranchPlant = szBranchPlant;
    }

    public String getSzBranchPlant() {
        return szBranchPlant;
    }

    public void setMnBranchPlantOffset(MathNumeric mnBranchPlantOffset) {
        this.mnBranchPlantOffset = mnBranchPlantOffset;
    }

    public MathNumeric getMnBranchPlantOffset() {
        return mnBranchPlantOffset;
    }

    public void setCTypeofCalculation(String cTypeofCalculation) {
        this.cTypeofCalculation = cTypeofCalculation;
    }

    public String getCTypeofCalculation() {
        return cTypeofCalculation;
    }

    public void setMnCalculatedBranchPlantOffset(MathNumeric mnCalculatedBranchPlantOffset) {
        this.mnCalculatedBranchPlantOffset = mnCalculatedBranchPlantOffset;
    }

    public MathNumeric getMnCalculatedBranchPlantOffset() {
        return mnCalculatedBranchPlantOffset;
    }

    /**
     * Math Numeric - 8 length, 0 decimal
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MATH80 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnBranchPlantOffset = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cTypeofCalculation = null;

   public void setSzErrorId(String szErrorId) {
        this.szErrorId = szErrorId;
    }

    public String getSzErrorId() {
        return szErrorId;
    }

    public void setSzErrorDescription(String szErrorDescription) {
        this.szErrorDescription = szErrorDescription;
    }

    public String getSzErrorDescription() {
        return szErrorDescription;
    }


    /**
     * Math Numeric - 8 length, 0 decimal
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MATH80 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnCalculatedBranchPlantOffset = null;

    
    private String szErrorId=null;
    private String szErrorDescription=null;
}
