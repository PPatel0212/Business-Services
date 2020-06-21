package be.e1.bssv.J564102.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalCreateItemRegistry extends ValueObject implements Serializable {
    /**
     * Item ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OTITEMID <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String szPLMID = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szItemNumber = null;

    /**
     * Item Revision Level
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MERL <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String szRevision = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szDescription1 = null;

    /**
     * Description - Line 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC2 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szDescription2 = null;

    /**
     * Name - Remark
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RMK <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szPLMSource = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szErrorID = null;

    /**
     * Large String
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LGSTRNG <br>
     * EnterpriseOne field length:  1500 <br>
     */
    private String szErrorDescription = null;

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
    private String szProgramId = null;

    /**
     * Item Group
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITTP <br>
     * EnterpriseOne field length:  8 <br>
     */
    private String szTypeCode = null;
    
    /**
     * Name - Remark
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RMK <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szSourceSystem = null;
    
    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szItemType = null;
    
  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnItemNumberShort = null;

    public void setSzPLMID(String szPLMID) {
        this.szPLMID = szPLMID;
    }

    public String getSzPLMID() {
        return szPLMID;
    }

    public void setSzItemNumber(String szItemNumber) {
        this.szItemNumber = szItemNumber;
    }

    public String getSzItemNumber() {
        return szItemNumber;
    }

    public void setSzRevision(String szRevision) {
        this.szRevision = szRevision;
    }

    public String getSzRevision() {
        return szRevision;
    }

    public void setSzDescription1(String szDescription1) {
        this.szDescription1 = szDescription1;
    }

    public String getSzDescription1() {
        return szDescription1;
    }

    public void setSzDescription2(String szDescription2) {
        this.szDescription2 = szDescription2;
    }

    public String getSzDescription2() {
        return szDescription2;
    }

    public void setSzPLMSource(String szPLMSource) {
        this.szPLMSource = szPLMSource;
    }

    public String getSzPLMSource() {
        return szPLMSource;
    }

    public void setSzErrorID(String szErrorID) {
        this.szErrorID = szErrorID;
    }

    public String getSzErrorID() {
        return szErrorID;
    }

    public void setSzErrorDescription(String szErrorDescription) {
        this.szErrorDescription = szErrorDescription;
    }

    public String getSzErrorDescription() {
        return szErrorDescription;
    }

    public void setSzProgramId(String szProgramId) {
        this.szProgramId = szProgramId;
    }

    public String getSzProgramId() {
        return szProgramId;
    }

    public void setSzTypeCode(String szTypeCode) {
        this.szTypeCode = szTypeCode;
    }

    public String getSzTypeCode() {
        return szTypeCode;
    }

  public void setMnItemNumberShort(MathNumeric mnItemNumberShort) {
    this.mnItemNumberShort = mnItemNumberShort;
  }

  public MathNumeric getMnItemNumberShort() {
    return mnItemNumberShort;
  }

    public void setSzSourceSystem(String szSourceSystem) {
        this.szSourceSystem = szSourceSystem;
    }

    public String getSzSourceSystem() {
        return szSourceSystem;
    }

    public void setSzItemType(String szItemType) {
        this.szItemType = szItemType;
    }

    public String getSzItemType() {
        return szItemType;
    }
}
