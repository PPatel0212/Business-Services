package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Surcharge;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntSurcharge extends ValueObject implements Serializable
{
  private IntSurchargeType surchargeType = null;
  private IntSurchargeLevelType level = null;
  private String description = null;
  private IntMoney amount = null;

  public void setSurchargeType(IntSurchargeType surchargeType)
  {
    this.surchargeType = surchargeType;
  }

  public IntSurchargeType getSurchargeType()
  {
    return surchargeType;
  }

  public void setLevel(IntSurchargeLevelType level)
  {
    this.level = level;
  }

  public IntSurchargeLevelType getLevel()
  {
    return level;
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
  
  public static IntSurcharge createFromSurcharge(Surcharge inData)
  {
    IntSurcharge schg = null;
    if(inData != null)
    {
      schg = new IntSurcharge();
      
      schg.amount = IntMoney.createFromMoney(inData.getAmount());
      schg.setDescription(inData.getDescription());
      schg.level = IntSurchargeLevelType.createFromSurchargeLevelType(inData.getLevel());
      schg.surchargeType = IntSurchargeType.createFromSurchargeType(inData.getSurchargeType());
    }
    return schg;
  }
}
