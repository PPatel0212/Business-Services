package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearUnits;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDimensions extends ValueObject implements Serializable
{
  private Integer length = null;
  private Integer width = null;
  private Integer height = null;
  private IntLinearUnits units = null;

  public void setLength(Integer length)
  {
    this.length = length;
  }

  public Integer getLength()
  {
    return length;
  }

  public void setWidth(Integer width)
  {
    this.width = width;
  }

  public Integer getWidth()
  {
    return width;
  }

  public void setHeight(Integer height)
  {
    this.height = height;
  }

  public Integer getHeight()
  {
    return height;
  }

  public void setUnits(IntLinearUnits units)
  {
    this.units = units;
  }

  public IntLinearUnits getUnits()
  {
    return units;
  }
  
  public void copyToDimensions(Dimensions outData)
  {
    if(outData != null)
    {
      if(this.length != null) 
        outData.setLength(BigInteger.valueOf(this.length.intValue()));
      if(this.width != null)
        outData.setWidth(BigInteger.valueOf(this.width.intValue()));
      if(this.height != null)
        outData.setHeight(BigInteger.valueOf(this.height.intValue()));
      if(this.units != null)
      {
        LinearUnits lu = LinearUnits.fromString(this.units.getValue());
        outData.setUnits(lu);
      }
    }
  }
}
