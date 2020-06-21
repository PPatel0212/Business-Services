package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntMoney extends ValueObject implements Serializable
{
  private String currency = null;
  private MathNumeric amount = null;

  public void setCurrency(String currency)
  {
    this.currency = currency;
  }

  public String getCurrency()
  {
    return currency;
  }

  public void setAmount(MathNumeric amount)
  {
    this.amount = amount;
  }

  public MathNumeric getAmount()
  {
    return amount;
  }
  
  public void copyToMoney(Money outData)
  {
    if(outData != null)
    {
      outData.setCurrency(this.currency);
      if(this.amount != null)
      {
        outData.setAmount(this.amount.asBigDecimal());
      }
    }
  }
  
  public static IntMoney createFromMoney(Money inData)
  {
    IntMoney mny = null;
    if(inData != null)
    {
      mny = new IntMoney();
      mny.setCurrency(inData.getCurrency());
      
      BigDecimal val = inData.getAmount();
      if(val != null)
      {
        mny.setAmount(new MathNumeric(val));
      }
    }
    return mny;
  }
}
