package be.e1.bssv.util.JP56CS01.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CompliancePartyRequest extends ValueObject implements Serializable
{
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
   * Type - Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ANTY <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String addressType = null;

  /**
   * TODO: Default public constructor for instantiating: CompliancePartyRequest
   */
  public CompliancePartyRequest()
  {
  }

  public void setAddressNumber(Integer addressNumber)
  {
    this.addressNumber = addressNumber;
  }

  public Integer getAddressNumber()
  {
    return addressNumber;
  }

  public void setAddressType(String addressType)
  {
    this.addressType = addressType;
  }

  public String getAddressType()
  {
    return addressType;
  }
}
