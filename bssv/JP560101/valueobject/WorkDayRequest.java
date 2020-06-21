package be.e1.bssv.JP560101.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WorkDayRequest extends ValueObject implements Serializable {
    private String branchPlant;

    public void setBranchPlant(String branchPlant) {
        this.branchPlant = branchPlant;
    }

    public String getBranchPlant() {
        return branchPlant;
    }

    public void setOffsetNumber(Integer offsetNumber) {
        this.offsetNumber = offsetNumber;
    }

    public Integer getOffsetNumber() {
        return offsetNumber;
    }

    public void setTypeOfCalculation(String typeOfCalculation) {
        this.typeOfCalculation = typeOfCalculation;
    }

    public String getTypeOfCalculation() {
        return typeOfCalculation;
    }
    private Integer offsetNumber;
    private String typeOfCalculation;
}
