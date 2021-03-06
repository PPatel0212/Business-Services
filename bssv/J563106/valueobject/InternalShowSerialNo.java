package be.e1.bssv.J563106.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowSerialNo extends ValueObject implements Serializable {
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
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String F4801_DCTO = null;

  /**
   * Serial Number 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRL1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String F4220_SRL1 = null;
  
  /**
   * Serial No Required YN
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRNR <br>
   * EnterpriseOne field length:  1 <br>
   *
   */
  
  private String F4102_SRNR = null;

  public void setF4801_DOCO(MathNumeric F4801_DOCO) {
    this.F4801_DOCO = F4801_DOCO;
  }

  public MathNumeric getF4801_DOCO() {
    return F4801_DOCO;
  }

  public void setF4801_DCTO(String F4801_DCTO) {
    this.F4801_DCTO = F4801_DCTO;
  }

  public String getF4801_DCTO() {
    return F4801_DCTO;
  }

  public void setF4220_SRL1(String F4220_SRL1) {
    this.F4220_SRL1 = F4220_SRL1;
  }

  public String getF4220_SRL1() {
    return F4220_SRL1;
  }

  public void setF4102_SRNR(String F4102_SRNR) {
    this.F4102_SRNR = F4102_SRNR;
  }

  public String getF4102_SRNR() {
    return F4102_SRNR;
  }
}
