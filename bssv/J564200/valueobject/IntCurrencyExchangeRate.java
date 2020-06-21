package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CurrencyExchangeRate;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntCurrencyExchangeRate extends ValueObject implements Serializable
{
  private String fromCurrency = null;
  private String intoCurrency = null;
  private MathNumeric rate = null;

  public void setFromCurrency(String fromCurrency)
  {
    this.fromCurrency = fromCurrency;
  }

  public String getFromCurrency()
  {
    return fromCurrency;
  }

  public void setIntoCurrency(String intoCurrency)
  {
    this.intoCurrency = intoCurrency;
  }

  public String getIntoCurrency()
  {
    return intoCurrency;
  }

  public void setRate(MathNumeric rate)
  {
    this.rate = rate;
  }

  public MathNumeric getRate()
  {
    return rate;
  }
  
  public static IntCurrencyExchangeRate createFromCurrencyExchangeRate(CurrencyExchangeRate inData)
  {
    IntCurrencyExchangeRate cer = null;
    if(inData != null)
    {
      cer = new IntCurrencyExchangeRate();
      cer.setFromCurrency(inData.getFromCurrency());
      cer.setIntoCurrency(inData.getIntoCurrency());
      
      BigDecimal val = inData.getRate();
      if(val != null)
      {
        cer.setRate(new MathNumeric(val));
      }
    }
    return cer;
  }
}
