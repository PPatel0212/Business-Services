package be.e1.bssv.J564208.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalMPSWOHeaderTagFile extends ValueObject implements Serializable {
  /**
   * Line / Cell Capacity per Day
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56SCAP <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric F564803_Z56SCAP = null;

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
  private MathNumeric F564803_DOCO = null;

  public void setF564803_Z56SCAP(MathNumeric F564803_Z56SCAP) {
    this.F564803_Z56SCAP = F564803_Z56SCAP;
  }

  public MathNumeric getF564803_Z56SCAP() {
    return F564803_Z56SCAP;
  }

  public void setF564803_DOCO(MathNumeric F564803_DOCO) {
    this.F564803_DOCO = F564803_DOCO;
  }

  public MathNumeric getF564803_DOCO() {
    return F564803_DOCO;
  }
}
