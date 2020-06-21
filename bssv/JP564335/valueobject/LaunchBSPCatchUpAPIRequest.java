package be.e1.bssv.JP564335.valueobject;

import be.e1.bssv.J564335.valueobject.LaunchBSPCatchUpaPIInternal;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LaunchBSPCatchUpAPIRequest extends ValueObject implements Serializable {
  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer addressNumber = null;
  

  /**
   * TODO: Default public constructor for instantiating: LaunchBSPCatchUpAPIRequest
   */
  public LaunchBSPCatchUpAPIRequest() {
  }

  public void setAddressNumber(Integer addressNumber) {
    this.addressNumber = addressNumber;
  }

  public Integer getAddressNumber() {
    return addressNumber;
  }
  
  public void copyToInternalValueObject (LaunchBSPCatchUpaPIInternal inData){
    inData.setMnSupplierNumber_AN8(new MathNumeric(this.getAddressNumber()));
    }
}
