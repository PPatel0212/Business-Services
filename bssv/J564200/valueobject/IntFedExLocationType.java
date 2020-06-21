package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FedExLocationType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFedExLocationType extends ValueObject implements Serializable
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
  
  public static IntFedExLocationType createFromFedExLocationType(FedExLocationType inData)
  {
    IntFedExLocationType flt = null;
    if(inData != null)
    {
      flt = new IntFedExLocationType();
      flt.setValue(inData.getValue());
    }
    return flt;
  }
}
