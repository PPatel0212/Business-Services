package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SurchargeType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntSurchargeType extends ValueObject implements Serializable
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
  
  public static IntSurchargeType createFromSurchargeType(SurchargeType inData)
  {
    IntSurchargeType stype = null;
    if(inData != null)
    {
      stype = new IntSurchargeType();
      stype.setValue(inData.getValue());
    }
    return stype;
  }
}
