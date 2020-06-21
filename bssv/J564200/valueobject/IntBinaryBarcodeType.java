package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcodeType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntBinaryBarcodeType extends ValueObject implements Serializable
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
  
  public static IntBinaryBarcodeType createFromBinaryBarcodeType(BinaryBarcodeType inData)
  {
    IntBinaryBarcodeType bbType = null;
    if(inData != null)
    {
      bbType = new IntBinaryBarcodeType();
      bbType.setValue(inData.getValue());
    }
    return bbType;
  }
}
