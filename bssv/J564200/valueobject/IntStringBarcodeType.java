package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.StringBarcodeType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntStringBarcodeType extends ValueObject implements Serializable
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
  
  public static IntStringBarcodeType createFromStringBarcodeType(StringBarcodeType inData)
  {
    IntStringBarcodeType sbt = null;
    if(inData != null)
    {
      sbt = new IntStringBarcodeType();
      sbt.setValue(inData.getValue());
    }
    return sbt;
  }
}
