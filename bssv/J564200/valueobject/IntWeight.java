package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.WeightUnits;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntWeight extends ValueObject implements Serializable
{
  private IntWeightUnits units = null;
  private MathNumeric value = null;

  public void setUnits(IntWeightUnits units)
  {
    this.units = units;
  }

  public IntWeightUnits getUnits()
  {
    return units;
  }

  public void setValue(MathNumeric value)
  {
    this.value = value;
  }

  public MathNumeric getValue()
  {
    return value;
  }
  
  public void copyToWeight(Weight outData)
  {
    if(outData != null)
    {
      if(this.value != null)
        outData.setValue(this.value.asBigDecimal());
      if(this.units != null)
      {
        WeightUnits wu = WeightUnits.fromString(this.units.getValue());
        outData.setUnits(wu);
      }
    }
  }
  
  public static IntWeight createFromWeight(Weight inData)
  {
    IntWeight wgt = null;
    if(inData != null)
    {
      wgt = new IntWeight();
      wgt.setValue(new MathNumeric(inData.getValue()));
      wgt.setUnits(IntWeightUnits.createFromWeightUnits(inData.getUnits()));
    }
    return wgt;
  }
}
