package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.StringBarcode;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntStringBarcode extends ValueObject implements Serializable
{
  private IntStringBarcodeType type = null;
  private String value = null;

  public void setType(IntStringBarcodeType type)
  {
    this.type = type;
  }

  public IntStringBarcodeType getType()
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
  
  public static IntStringBarcode createFromStringBarcode(StringBarcode inData)
  {
    IntStringBarcode sb = null;
    if(inData != null)
    {
      sb = new IntStringBarcode();
      sb.type = IntStringBarcodeType.createFromStringBarcodeType(inData.getType());
      sb.setValue(inData.getValue());
    }
    return sb;
  }
}
