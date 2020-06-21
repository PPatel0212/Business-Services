package be.e1.bssv.J564803.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetWorkOrderSerialNoWhereFields extends ValueObject implements Serializable {
  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F4801_DOCO = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String F4801_LITM = null;

  /**
   * Production Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PMPN <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String F4801T_PMPN = null;

  public void setF4801_DOCO(MathNumeric F4801_DOCO) {
    this.F4801_DOCO = F4801_DOCO;
  }

  public MathNumeric getF4801_DOCO() {
    return F4801_DOCO;
  }

  public void setF4801_LITM(String F4801_LITM) {
    this.F4801_LITM = F4801_LITM;
  }

  public String getF4801_LITM() {
    return F4801_LITM;
  }

  public void setF4801T_PMPN(String F4801T_PMPN) {
    this.F4801T_PMPN = F4801T_PMPN;
  }

  public String getF4801T_PMPN() {
    return F4801T_PMPN;
  }
}
