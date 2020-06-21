package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightChargeBasisType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightChargeBasisType extends ValueObject implements Serializable
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
  
  public static IntFreightChargeBasisType createFromFreightChargeBasisType(FreightChargeBasisType inData)
  {
    IntFreightChargeBasisType fcbt = null;
    if(inData != null)
    {
      fcbt = new IntFreightChargeBasisType();
      fcbt.setValue(inData.getValue());
    }
    return fcbt;
  }
}
