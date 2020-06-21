package be.e1.bssv.J564335.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LaunchBSPCatchUpaPIInternal extends ValueObject implements Serializable {
  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   * EnterpriseOne Next Number: 01/1 <br>
   */
  private MathNumeric mnSupplierNumber_AN8 = null;
  
  private String successFlag = null;


  public void setMnSupplierNumber_AN8(MathNumeric mnSupplierNumber_AN8) {
    this.mnSupplierNumber_AN8 = mnSupplierNumber_AN8;
  }

  public MathNumeric getMnSupplierNumber_AN8() {
    return mnSupplierNumber_AN8;
  }

  public void setSuccessFlag(String successFlag) {
    this.successFlag = successFlag;
  }

  public String getSuccessFlag() {
    return successFlag;
  }
}
