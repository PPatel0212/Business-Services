package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingIdType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntTrackingIdType extends ValueObject implements Serializable
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
  
  public static IntTrackingIdType createFromTrackingIdType(TrackingIdType inData)
  {
    IntTrackingIdType tidType = null;
    if(inData != null)
    {
      tidType = new IntTrackingIdType();
      tidType.setValue(inData.getValue());
    }
    return tidType;
  }
}
