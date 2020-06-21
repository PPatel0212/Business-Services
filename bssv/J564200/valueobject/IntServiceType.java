package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ServiceType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntServiceType extends ValueObject implements Serializable
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
  
  public static IntServiceType createFromServiceType(ServiceType inData)
  {
    IntServiceType st = null;
    if(inData != null)
    {
      st = new IntServiceType();
      st.setValue(inData.getValue());
    }
    return st;
  }
}
