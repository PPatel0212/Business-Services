package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.OversizeClassType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntOversizeClassType extends ValueObject implements Serializable
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
  
  public static IntOversizeClassType createFromOversizeClassType(OversizeClassType inData)
  {
    IntOversizeClassType oct = null;
    if(inData != null)
    {
      oct = new IntOversizeClassType();
      oct.setValue(inData.getValue());
    }
    return oct;
  }
}
