package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DayOfWeekType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDayOfWeekType extends ValueObject implements Serializable
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
  
  public static IntDayOfWeekType createFromDayOfWeekType(DayOfWeekType inData)
  {
    IntDayOfWeekType dowt = null;
    if(inData != null)
    {
      dowt = new IntDayOfWeekType();
      dowt.setValue(inData.getValue());
    }
    return dowt;
  }
}
