package be.e1.bssv.J563001.valueobject;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalResourceUnitsData extends ValueObject implements Serializable {
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
    private String szBranchPlant_MMCU = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szWorkCenter_MCU = null;

    /**
     * Shift Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SHFT <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne User Defined Code: 06/SH <br>
     */
    private String cShiftCode_SHFT = null;

    /**
     * Date - Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDate_UPMJ = null;

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
    private MathNumeric mnHours_RU01 = null;

    /**
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cErrorCode_ERRC = null;
    
    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szDataItem = null;

    /**
     * Alpha Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSCA <br>
     * EnterpriseOne field length:  40 <br>
     * EnterpriseOne Edit Rule:NE <br>
     */
    private String szDescriptionAlpha = null;

    public void setSzBranchPlant_MMCU(String szBranchPlant_MMCU) {
        this.szBranchPlant_MMCU = szBranchPlant_MMCU;
    }

    public String getSzBranchPlant_MMCU() {
        return szBranchPlant_MMCU;
    }

    public void setSzWorkCenter_MCU(String szWorkCenter_MCU) {
        this.szWorkCenter_MCU = szWorkCenter_MCU;
    }

    public String getSzWorkCenter_MCU() {
        return szWorkCenter_MCU;
    }

    public void setCShiftCode_SHFT(String cShiftCode_SHFT) {
        this.cShiftCode_SHFT = cShiftCode_SHFT;
    }

    public String getCShiftCode_SHFT() {
        return cShiftCode_SHFT;
    }

    public void setJdDate_UPMJ(Date jdDate_UPMJ) {
        this.jdDate_UPMJ = jdDate_UPMJ;
    }
    public void setJdDate_UPMJ(Calendar jdDate_UPMJ)
    {
      if (jdDate_UPMJ != null)
      {
        this.jdDate_UPMJ = jdDate_UPMJ.getTime();
      }
    }
    public Date getJdDate_UPMJ() {
        return jdDate_UPMJ;
    }

    public void setMnHours_RU01(MathNumeric mnHours_RU01) {
        this.mnHours_RU01 = mnHours_RU01;
    }

    public MathNumeric getMnHours_RU01() {
        return mnHours_RU01;
    }

    public void setCErrorCode_ERRC(String cErrorCode_ERRC) {
        this.cErrorCode_ERRC = cErrorCode_ERRC;
    }

    public String getCErrorCode_ERRC() {
        return cErrorCode_ERRC;
    }

    public void setSzDataItem(String szDataItem) {
        this.szDataItem = szDataItem;
    }

    public String getSzDataItem() {
        return szDataItem;
    }

    public void setSzDescriptionAlpha(String szDescriptionAlpha) {
        this.szDescriptionAlpha = szDescriptionAlpha;
    }

    public String getSzDescriptionAlpha() {
        return szDescriptionAlpha;
    }
}
