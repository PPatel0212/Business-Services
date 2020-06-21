package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentDryIceDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight;

import java.io.Serializable;

import java.math.BigDecimal;
import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShipmentDryIceDetail extends ValueObject implements Serializable
{
  private Integer packageCount = null;
  private IntWeight totalWeight = null;

  public void setPackageCount(Integer packageCount)
  {
    this.packageCount = packageCount;
  }

  public Integer getPackageCount()
  {
    return packageCount;
  }

  public void setTotalWeight(IntWeight totalWeight)
  {
    this.totalWeight = totalWeight;
  }

  public IntWeight getTotalWeight()
  {
    return totalWeight;
  }
  
  public void copyToShipmentDryIceDetail(ShipmentDryIceDetail outData)
  {
    if(outData != null)
    {
      if(this.packageCount != null)
        outData.setPackageCount(BigInteger.valueOf(this.packageCount.intValue()));
      if(this.totalWeight != null)
      {
        Weight weight = new Weight();
        this.totalWeight.copyToWeight(weight);
        outData.setTotalWeight(weight);
      }
    }
  }
  
  public static IntShipmentDryIceDetail createFromShipmentDryIceDetail(ShipmentDryIceDetail inData)
  {
    IntShipmentDryIceDetail sdid = null;
    if(inData != null)
    {
      sdid = new IntShipmentDryIceDetail();
      
      BigInteger val = inData.getPackageCount();
      if(val != null)
      {
        sdid.setPackageCount(val.intValue());
      }
      sdid.totalWeight = IntWeight.createFromWeight(inData.getTotalWeight());
    }
    return sdid;
  }
}
