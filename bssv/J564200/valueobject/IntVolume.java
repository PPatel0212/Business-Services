package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Volume;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.VolumeUnits;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntVolume extends ValueObject implements Serializable
{
  private IntVolumeUnits units = null;
  private MathNumeric value = null;

  public void setUnits(IntVolumeUnits units)
  {
    this.units = units;
  }

  public IntVolumeUnits getUnits()
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
  
  public void copyToVolume(Volume outData)
  {
    if(outData != null)
    {
      if(this.units != null)
      {
        VolumeUnits volUnits = VolumeUnits.fromString(this.units.getValue());
        outData.setUnits(volUnits);
      }
      if(this.value != null)
      {
        outData.setValue(BigDecimal.valueOf(this.value.intValue()));
      }
    }
  }
}
