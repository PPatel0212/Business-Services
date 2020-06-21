package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.WeightUnits;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntWeightUnits extends ValueObject implements Serializable
{
  private String value;

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public static IntWeightUnits createFromWeightUnits(WeightUnits inData)
  {
    IntWeightUnits wUnits = null;
    if(inData != null)
    {
      wUnits = new IntWeightUnits();
      wUnits.setValue(inData.getValue());
    }
    return wUnits;
  }
}
