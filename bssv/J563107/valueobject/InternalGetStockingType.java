package be.e1.bssv.J563107.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetStockingType extends ValueObject implements Serializable {
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
  private MathNumeric F4102_ITM = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String F4102_MCU = null;

  /**
   * Stocking Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STKT <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne User Defined Code: 41/I <br>
   */
  private String F4102_STKT = null;

  /**
   * Serial Number Required
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRNR <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne Default value: N <br>
   * EnterpriseOne User Defined Code: H41/NR <br>
   */
  private String F4102_SRNR = null;

 // This flag will be used in Processor class to set SRNR Flag or STKT Flag
  private String SRNR_Flag = null;

  public void setF4102_ITM(MathNumeric F4102_ITM) {
    this.F4102_ITM = F4102_ITM;
  }

  public MathNumeric getF4102_ITM() {
    return F4102_ITM;
  }

  public void setF4102_MCU(String F4102_MCU) {
    this.F4102_MCU = F4102_MCU;
  }

  public String getF4102_MCU() {
    return F4102_MCU;
  }

  public void setF4102_STKT(String F4102_STKT) {
    this.F4102_STKT = F4102_STKT;
  }

  public String getF4102_STKT() {
    return F4102_STKT;
  }

  public void setF4102_SRNR(String F4102_SRNR) {
    this.F4102_SRNR = F4102_SRNR;
  }

  public String getF4102_SRNR() {
    return F4102_SRNR;
  }

  public void setSRNR_Flag(String SRNR_Flag) {
    this.SRNR_Flag = SRNR_Flag;
  }

  public String getSRNR_Flag() {
    return SRNR_Flag;
  }
}
