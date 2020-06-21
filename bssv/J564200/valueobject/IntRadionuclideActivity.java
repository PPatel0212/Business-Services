package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactivityUnitOfMeasure;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RadionuclideActivity;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntRadionuclideActivity extends ValueObject implements Serializable
{
  private MathNumeric value = null;
  private IntRadioactivityUnitOfMeasure unitOfMeasure = null;

  public void setValue(MathNumeric value)
  {
    this.value = value;
  }

  public MathNumeric getValue()
  {
    return value;
  }

  
  public void copyToRadionuclideActivity(RadionuclideActivity outData)
  {
    if(outData != null)
    {
      if(this.value != null )
        outData.setValue(this.value.asBigDecimal());
      if(this.unitOfMeasure != null)
      {
        RadioactivityUnitOfMeasure ruom = RadioactivityUnitOfMeasure.fromString(this.unitOfMeasure.getValue());
        outData.setUnitOfMeasure(ruom);
      }
    }
  }

  public void setUnitOfMeasure(IntRadioactivityUnitOfMeasure unitOfMeasure)
  {
    this.unitOfMeasure = unitOfMeasure;
  }

  public IntRadioactivityUnitOfMeasure getUnitOfMeasure()
  {
    return unitOfMeasure;
  }
}
