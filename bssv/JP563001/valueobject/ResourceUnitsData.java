package be.e1.bssv.JP563001.valueobject;

import be.e1.bssv.J563001.valueobject.InternalResourceUnitsData;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ResourceUnitsData extends ValueObject implements Serializable {
    /**
     * Branch
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MMCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String branch = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String businessUnit = null;

    /**
     * Shift Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SHFT <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String shiftCode = null;

    /**
     * Date - Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateUpdated = null;

    /**
     * Unit - Resource 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RU01 <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private BigDecimal unitResource01 = null;
    
    /**
     * Successfully Processed
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EDSP <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String successfullyProcessed = null;

    /**
     * TODO: Default public constructor for instantiating: ResourceUnitsData
     */
    public ResourceUnitsData() {
    }
    /**
    * TODO: Default public constructor for instantiating: ResourceUnitsData
    */
       public ResourceUnitsData(InternalResourceUnitsData internalResourceUnitsData) {
           this.setBranch(internalResourceUnitsData.getSzBranchPlant_MMCU().trim());
           this.setBusinessUnit(internalResourceUnitsData.getSzWorkCenter_MCU().trim());
           this.setDateUpdated(internalResourceUnitsData.getJdDate_UPMJ());
           this.setShiftCode(internalResourceUnitsData.getCShiftCode_SHFT());
           this.setUnitResource01(internalResourceUnitsData.getMnHours_RU01());
            if (internalResourceUnitsData.getCErrorCode_ERRC().equals(" ")) {
                this.setSuccessfullyProcessed("Y");
            } else {
                this.setSuccessfullyProcessed("N");
            }
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setShiftCode(String shiftCode) {
        this.shiftCode = shiftCode;
    }

    public String getShiftCode() {
        return shiftCode;
    }

    public void setDateUpdated(Calendar dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    public void setDateUpdated(Date dateUpdated) {
        if(dateUpdated !=null){
        Calendar updDate = Calendar.getInstance();
        updDate.setTime(dateUpdated);
        this.dateUpdated = updDate; 
        }
    }

    public Calendar getDateUpdated() {
        return dateUpdated;
    }

    public void setUnitResource01(BigDecimal unitResource01) {
        this.unitResource01 = unitResource01;
    }

    public void setUnitResource01(MathNumeric unitResource01) {
        this.unitResource01 = unitResource01.asBigDecimal();
    }
    
    public BigDecimal getUnitResource01() {
        return unitResource01;
    }

    public void setSuccessfullyProcessed(String successfullyProcessed) {
        this.successfullyProcessed = successfullyProcessed;
    }

    public String getSuccessfullyProcessed() {
        return successfullyProcessed;
    }
}
