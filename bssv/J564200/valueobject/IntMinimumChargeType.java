package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.MinimumChargeType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntMinimumChargeType extends ValueObject implements Serializable
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
  
  public static IntMinimumChargeType createFromMinimumChargeType(MinimumChargeType inData)
  {
    IntMinimumChargeType mct = null;
    if(inData != null)
    {
      mct = new IntMinimumChargeType();
      mct.setValue(inData.getValue());
    }
    return mct;
  }
}
