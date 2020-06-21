package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Tax;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntTax extends ValueObject implements Serializable
{
  private IntTaxType taxType = null;
  private String description = null;
  private IntMoney amount = null;

  public void setTaxType(IntTaxType taxType)
  {
    this.taxType = taxType;
  }

  public IntTaxType getTaxType()
  {
    return taxType;
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
  
  public static IntTax createFromTax(Tax inData)
  {
    IntTax tx = null;
    if(inData != null)
    {
      tx = new IntTax();
      
      tx.amount = IntMoney.createFromMoney(inData.getAmount());
      tx.setDescription(inData.getDescription());
      tx.taxType = IntTaxType.createFromTaxType(inData.getTaxType());
    }
    return tx;
  }
}
