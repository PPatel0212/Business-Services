package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntTransitTimeType extends ValueObject implements Serializable
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
  
  public static IntTransitTimeType createFromTransitTimeType(TransitTimeType inData)
  {
    IntTransitTimeType ttt = null;
    if(inData != null)
    {
      ttt = new IntTransitTimeType();
      ttt.setValue(inData.getValue());
    }
    return ttt;
  }
}
