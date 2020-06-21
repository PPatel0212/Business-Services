package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RatedWeightMethod;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRatedWeightMethod extends ValueObject implements Serializable
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
  
  public static IntRatedWeightMethod createFromRatedWeightMethod(RatedWeightMethod inData)
  {
    IntRatedWeightMethod rwm = null;
    if(inData != null)
    {
      rwm = new IntRatedWeightMethod();
      rwm.setValue(inData.getValue());
    }
    return rwm;
  }
}
