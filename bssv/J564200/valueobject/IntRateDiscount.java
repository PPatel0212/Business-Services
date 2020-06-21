package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscount;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntRateDiscount extends ValueObject implements Serializable
{
  private IntRateDiscountType rateDiscountType = null;
  private String description = null;
  private IntMoney amount = null;
  private MathNumeric percent = null;

  public void setRateDiscountType(IntRateDiscountType rateDiscountType)
  {
    this.rateDiscountType = rateDiscountType;
  }

  public IntRateDiscountType getRateDiscountType()
  {
    return rateDiscountType;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }

  public void setAmount(IntMoney amount)
  {
    this.amount = amount;
  }

  public IntMoney getAmount()
  {
    return amount;
  }

  public void setPercent(MathNumeric percent)
  {
    this.percent = percent;
  }

  public MathNumeric getPercent()
  {
    return percent;
  }
  
  public static IntRateDiscount createFromRateDiscount(RateDiscount inData)
  {
    IntRateDiscount rd = null;
    if(inData != null)
    {
      rd = new IntRateDiscount();
      rd.amount = IntMoney.createFromMoney(inData.getAmount());
      rd.rateDiscountType = IntRateDiscountType.createFromRateDiscountType(inData.getRateDiscountType());
      
      BigDecimal val = inData.getPercent();
      if(val != null)
      {
        rd.setPercent(new MathNumeric(val));
      }
      
      rd.setDescription(inData.getDescription());
    }
    return rd;
  }
}
