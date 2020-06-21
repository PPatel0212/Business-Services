package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Rebate;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntRebate extends ValueObject implements Serializable
{
  private IntRebateType rebateType = null;
  private String description = null;
  private IntMoney amount = null;
  private MathNumeric percent = null;

  public void setRebateType(IntRebateType rebateType)
  {
    this.rebateType = rebateType;
  }

  public IntRebateType getRebateType()
  {
    return rebateType;
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
  
  public static IntRebate createFromRebate(Rebate inData)
  {
    IntRebate rb = new IntRebate();
    if(inData != null)
    {
      rb = new IntRebate();
      
      rb.setDescription(inData.getDescription());
      rb.amount = IntMoney.createFromMoney(inData.getAmount());
      rb.rebateType = IntRebateType.createFromRebateType(inData.getRebateType());
      
      BigDecimal val = inData.getPercent();
      if(val != null)
      {
        rb.setPercent(new MathNumeric(val));
      }
    }
    return rb;
  }
}
