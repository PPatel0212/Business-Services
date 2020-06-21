package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomLabelPosition extends ValueObject implements Serializable
{
  private Integer x = null;
  private Integer y = null;

  public void setX(Integer x)
  {
    this.x = x;
  }

  public Integer getX()
  {
    return x;
  }

  public void setY(Integer y)
  {
    this.y = y;
  }

  public Integer getY()
  {
    return y;
  }
  
  public void copyToCustomLabelPosition(CustomLabelPosition outData)
  {
    outData.setX(BigInteger.valueOf(this.x.intValue()));
    outData.setY(this.y.intValue());
  }
}
