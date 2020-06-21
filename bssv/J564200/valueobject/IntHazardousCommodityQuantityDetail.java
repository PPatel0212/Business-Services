package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityType;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntHazardousCommodityQuantityDetail extends ValueObject implements Serializable
{
  private MathNumeric amount = null;
  private String units = null;
  private IntHazardousCommodityQuantityType quantityType = null;

  public void setAmount(MathNumeric amount)
  {
    this.amount = amount;
  }

  public MathNumeric getAmount()
  {
    return amount;
  }

  public void setUnits(String units)
  {
    this.units = units;
  }

  public String getUnits()
  {
    return units;
  }

  public void setQuantityType(IntHazardousCommodityQuantityType quantityType)
  {
    this.quantityType = quantityType;
  }

  public IntHazardousCommodityQuantityType getQuantityType()
  {
    return quantityType;
  }
  
  public void copyToHazardousCommodityQuantityDetail(HazardousCommodityQuantityDetail outData)
  {
    if(outData != null)
    {
      outData.setUnits(this.units);
      if(this.amount != null)
        outData.setAmount(BigDecimal.valueOf(this.amount.intValue()));
      if(this.quantityType != null)
      {
        HazardousCommodityQuantityType hcqt = HazardousCommodityQuantityType.fromString(this.quantityType.getValue());
        outData.setQuantityType(hcqt);
      }
    }
  }
  
  public static IntHazardousCommodityQuantityDetail createFromHazardousCommodityQuantityDetail(HazardousCommodityQuantityDetail inData)
  {
    IntHazardousCommodityQuantityDetail hcqd = null;
    if(inData != null)
    {
      hcqd = new IntHazardousCommodityQuantityDetail();
      
      hcqd.setUnits(inData.getUnits());
      
      BigDecimal val = inData.getAmount();
      if(val != null)
      {
        hcqd.setAmount(new MathNumeric(val));
      }
      
      hcqd.quantityType = IntHazardousCommodityQuantityType.createFromHazardousCommodityQuantityType(inData.getQuantityType());
    }
    return hcqd;
  }
}
