package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackagingDetail;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityPackagingDetail extends ValueObject implements Serializable
{
  Integer count = null;
  String units = null;

  public void setCount(Integer count)
  {
    this.count = count;
  }

  public Integer getCount()
  {
    return count;
  }

  public void setUnits(String units)
  {
    this.units = units;
  }

  public String getUnits()
  {
    return units;
  }
  
  public void copyToContentRecord(HazardousCommodityPackagingDetail outData)
  {
    if(outData != null)
    {
      outData.setUnits(this.units);
      if(count != null)
        outData.setCount(BigInteger.valueOf(this.count.intValue()));
    }
  }
}
