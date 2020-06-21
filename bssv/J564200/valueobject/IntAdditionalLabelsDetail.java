package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsType;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntAdditionalLabelsDetail extends ValueObject implements Serializable
{
  private IntAdditionalLabelsType type = null;
  private Integer count = null;

  public void setType(IntAdditionalLabelsType type)
  {
    this.type = type;
  }

  public IntAdditionalLabelsType getType()
  {
    return type;
  }

  public void setCount(Integer count)
  {
    this.count = count;
  }

  public Integer getCount()
  {
    return count;
  }
  
  public void copyToAdditionalLabelsDetail(AdditionalLabelsDetail outData)
  {
    if(outData != null)
    {
      if(this.count != null)
        outData.setCount(BigInteger.valueOf(this.count.intValue()));
      if(this.type != null)
      {
        AdditionalLabelsType alt = AdditionalLabelsType.fromString(this.type.getValue());
        outData.setType(alt);
      }
    }
  }
}
