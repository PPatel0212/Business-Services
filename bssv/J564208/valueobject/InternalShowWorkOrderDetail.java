package be.e1.bssv.J564208.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowWorkOrderDetail extends ValueObject implements Serializable {
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
   * Serial No
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: SRL1 <br>
   * EnterpriseOne field length:  20 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private String F4220_SRL1 = null;

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

  public void setF564803_Z56SCAP(MathNumeric F564803_Z56SCAP) {
    this.F564803_Z56SCAP = F564803_Z56SCAP;
  }

  public MathNumeric getF564803_Z56SCAP() {
    return F564803_Z56SCAP;
  }
}
