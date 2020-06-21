package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CarrierCodeType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCarrierCodeType extends ValueObject implements Serializable
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
  
  public static IntCarrierCodeType createFromCarrierCodeType(CarrierCodeType inData)
  {
    IntCarrierCodeType carrCode = null;
    if(inData != null)
    {
      carrCode = new IntCarrierCodeType();
      carrCode.setValue(inData.getValue());
    }
    return carrCode;
  }
}
