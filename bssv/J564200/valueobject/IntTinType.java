package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TinType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntTinType extends ValueObject implements Serializable
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

  public static IntTinType createFromTinType(TinType inData)
  {
    IntTinType tt = null;
    if(inData != null)
    {
      tt = new IntTinType();
      tt.setValue(inData.getValue());
    }
    return tt;
  }
}
