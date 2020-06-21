package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactivityDetail;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntRadioactivityDetail extends ValueObject implements Serializable
{
  private MathNumeric transportIndex = null;
  private MathNumeric surfaceReading = null;
  private MathNumeric criticalitySafetyIndex = null;
  private IntDimensions dimensions = null;

  public void setTransportIndex(MathNumeric transportIndex)
  {
    this.transportIndex = transportIndex;
  }

  public MathNumeric getTransportIndex()
  {
    return transportIndex;
  }

  public void setSurfaceReading(MathNumeric surfaceReading)
  {
    this.surfaceReading = surfaceReading;
  }

  public MathNumeric getSurfaceReading()
  {
    return surfaceReading;
  }

  public void setCriticalitySafetyIndex(MathNumeric criticalitySafetyIndex)
  {
    this.criticalitySafetyIndex = criticalitySafetyIndex;
  }

  public MathNumeric getCriticalitySafetyIndex()
  {
    return criticalitySafetyIndex;
  }

  public void setDimensions(IntDimensions dimensions)
  {
    this.dimensions = dimensions;
  }

  public IntDimensions getDimensions()
  {
    return dimensions;
  }
  
  public void copyToRadioactivityDetail(RadioactivityDetail outData)
  {
    if(outData != null)
    {
      if(this.transportIndex != null)
        outData.setTransportIndex(BigDecimal.valueOf(this.transportIndex.intValue()));
      if(this.surfaceReading != null)
        outData.setSurfaceReading(BigDecimal.valueOf(this.surfaceReading.intValue()));
      if(this.criticalitySafetyIndex != null)
        outData.setCriticalitySafetyIndex(BigDecimal.valueOf(this.criticalitySafetyIndex.intValue()));
      if(this.dimensions != null)
      {
        Dimensions dim = new Dimensions();
        this.dimensions.copyToDimensions(dim);
        outData.setDimensions(dim);
      }
    }
  }
}
