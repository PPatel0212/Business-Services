package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseChargeCalculationType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightBaseChargeCalculationType extends ValueObject implements Serializable
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
  
  public static IntFreightBaseChargeCalculationType createFromFreightBaseChargeCalculationType(FreightBaseChargeCalculationType inData)
  {
    IntFreightBaseChargeCalculationType fbcct = null;
    if(inData != null)
    {
      fbcct = new IntFreightBaseChargeCalculationType();
      fbcct.setValue(inData.getValue());
    }
    return fbcct;
  }
}
