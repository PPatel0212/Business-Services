package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateQuoteType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightRateQuoteType extends ValueObject implements Serializable
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
  
  public static IntFreightRateQuoteType createFromFreightRateQuoteType(FreightRateQuoteType inData)
  {
    IntFreightRateQuoteType frqt = null;
    if(inData != null)
    {
      frqt = new IntFreightRateQuoteType();
      frqt.setValue(inData.getValue());
    }
    return frqt;
  }
}
