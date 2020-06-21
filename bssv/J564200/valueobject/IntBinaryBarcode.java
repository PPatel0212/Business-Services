package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcode;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntBinaryBarcode extends ValueObject implements Serializable
{
  private IntBinaryBarcodeType type = null;
  private String value =null;

  public void setType(IntBinaryBarcodeType type)
  {
    this.type = type;
  }

  public IntBinaryBarcodeType getType()
  {
    return type;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public static IntBinaryBarcode createFromBinaryBarcode(BinaryBarcode inData)
  {
    IntBinaryBarcode bbCode = null;
    if(inData != null)
    {
      bbCode = new IntBinaryBarcode();
      bbCode.type = IntBinaryBarcodeType.createFromBinaryBarcodeType(inData.getType());
      bbCode.setValue(inData.getValue());
    }
    return bbCode;
  }
}
