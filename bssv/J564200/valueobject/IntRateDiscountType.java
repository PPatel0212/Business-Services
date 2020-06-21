package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscountType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRateDiscountType extends ValueObject implements Serializable
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
  
  public static IntRateDiscountType createFromRateDiscountType(RateDiscountType inData)
  {
    IntRateDiscountType rdt = null;
    if(inData != null)
    {
      rdt = new IntRateDiscountType();
      rdt.setValue(inData.getValue());
    }
    return rdt;
  }
}
