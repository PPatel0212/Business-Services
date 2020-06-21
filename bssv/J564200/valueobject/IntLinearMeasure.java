package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearMeasure;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearUnits;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntLinearMeasure extends ValueObject implements Serializable
{
  private MathNumeric value = null;
  private IntLinearUnits units = null;

  public void setValue(MathNumeric value)
  {
    this.value = value;
  }

  public MathNumeric getValue()
  {
    return value;
  }

  public void setUnits(IntLinearUnits units)
  {
    this.units = units;
  }

  public IntLinearUnits getUnits()
  {
    return units;
  }
  
  public void copyToLinearMeasure(LinearMeasure outData)
  {
    if(this.value != null)
    {
      outData.setValue(this.value.asBigDecimal());
    }
    
    if(this.units != null)
    {
      LinearUnits lu = LinearUnits.fromString(this.units.getValue());
      outData.setUnits(lu);
    }
  }
}
