package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionType;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntSignatureOptionType
  extends ValueObject
  implements Serializable
{
  private String value = null;

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public static IntSignatureOptionType createFromSignatureOptionType(SignatureOptionType inData)
  {
    IntSignatureOptionType sot = null;
    if(inData != null)
    {
      sot = new IntSignatureOptionType();
      sot.setValue(inData.getValue());
    }
    return sot;
  }
}
