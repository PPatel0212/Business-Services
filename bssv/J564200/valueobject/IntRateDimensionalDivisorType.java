package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDimensionalDivisorType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRateDimensionalDivisorType extends ValueObject implements Serializable
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
  
  public static IntRateDimensionalDivisorType createFromRateDimensionalDivisorType(RateDimensionalDivisorType inData)
  {
    IntRateDimensionalDivisorType rddt = null;
    if(inData != null)
    {
      rddt = new IntRateDimensionalDivisorType();
      rddt.setValue(inData.getValue());
    }
    return rddt;
  }
}
