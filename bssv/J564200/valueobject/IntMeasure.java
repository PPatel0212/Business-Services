package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Measure;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntMeasure extends ValueObject implements Serializable
{
  private MathNumeric quantity = null;
  private String units = null;

  public void setQuantity(MathNumeric quantity)
  {
    this.quantity = quantity;
  }

  public MathNumeric getQuantity()
  {
    return quantity;
  }

  public void setUnits(String units)
  {
    this.units = units;
  }

  public String getUnits()
  {
    return units;
  }
  
  public void copyToMeasure(Measure outData)
  {
    if(outData != null)
    {
      outData.setUnits(this.units);
      if(this.quantity != null)
      {
        outData.setQuantity(this.quantity.asBigDecimal());
      }
    }
  }
}
