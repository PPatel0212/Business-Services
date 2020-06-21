package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightClassType extends ValueObject implements Serializable
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
  
  public static IntFreightClassType createFromFreightClassType(FreightClassType inData)
  {
    IntFreightClassType fct = null;
    if(inData != null)
    {
      fct = new IntFreightClassType();
      fct.setValue(inData.getValue());
    }
    return fct;
  }
}
