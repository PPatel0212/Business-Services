package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxDetail;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntEdtTaxDetail extends ValueObject implements Serializable
{
  private IntEdtTaxType taxType = null;
  private Date effectiveDate = null;
  private String name = null;
  private IntMoney taxableValue = null;
  private String description = null;
  private String formula = null;
  private IntMoney amount = null;

  public void setTaxType(IntEdtTaxType taxType)
  {
    this.taxType = taxType;
  }

  public IntEdtTaxType getTaxType()
  {
    return taxType;
  }

  public void setEffectiveDate(Date effectiveDate)
  {
    this.effectiveDate = effectiveDate;
  }

  public Date getEffectiveDate()
  {
    return effectiveDate;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setTaxableValue(IntMoney taxableValue)
  {
    this.taxableValue = taxableValue;
  }

  public IntMoney getTaxableValue()
  {
    return taxableValue;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }

  public void setFormula(String formula)
  {
    this.formula = formula;
  }

  public String getFormula()
  {
    return formula;
  }

  public void setAmount(IntMoney amount)
  {
    this.amount = amount;
  }

  public IntMoney getAmount()
  {
    return amount;
  }
  
  public static IntEdtTaxDetail createFromEdtTaxDetail(EdtTaxDetail inData)  
  {
    IntEdtTaxDetail etd = null;
    if(inData != null)
    {
      etd = new IntEdtTaxDetail();
      
      etd.setAmount(IntMoney.createFromMoney(inData.getAmount()));
      etd.setTaxableValue(IntMoney.createFromMoney(inData.getTaxableValue()));
      
      etd.setDescription(inData.getDescription());
      etd.setFormula(inData.getFormula());
      etd.setName(inData.getName());
      
      Calendar cal = inData.getEffectiveDate();
      if(cal != null)
      {
        etd.setEffectiveDate(cal.getTime());
      }
      
      etd.setTaxType(IntEdtTaxType.createFromEdtTaxType(inData.getTaxType()));
    }
    return etd;
  }
}
