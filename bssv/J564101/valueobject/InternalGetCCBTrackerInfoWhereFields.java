package be.e1.bssv.J564101.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetCCBTrackerInfoWhereFields extends ValueObject implements Serializable {
  /**
   * Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VR01 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String CNNumber = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String F4101_LITM = null;
  
    /**
     *Item Revision
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MERL <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String F4101_MERL = null;

  public void setCNNumber(String CNNumber) {
    this.CNNumber = CNNumber;
  }

  public String getCNNumber() {
    return CNNumber;
  }

  public void setF4101_LITM(String F4101_LITM) {
    this.F4101_LITM = F4101_LITM;
  }

  public String getF4101_LITM() {
    return F4101_LITM;
  }

    public void setF4101_MERL(String F4101_MERL) {
        this.F4101_MERL = F4101_MERL;
    }

    public String getF4101_MERL() {
        return F4101_MERL;
    }
}
