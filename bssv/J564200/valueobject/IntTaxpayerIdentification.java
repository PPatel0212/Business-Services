package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxpayerIdentification;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TinType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntTaxpayerIdentification extends ValueObject implements Serializable
{
  private IntTinType tinType = null;
  private String number = null;
  private String usage = null;

  public void setTinType(IntTinType tinType)
  {
    this.tinType = tinType;
  }

  public IntTinType getTinType()
  {
    return tinType;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String getNumber()
  {
    return number;
  }

  public void setUsage(String usage)
  {
    this.usage = usage;
  }

  public String getUsage()
  {
    return usage;
  }
  
  public void copyToTaxpayerIdentification(TaxpayerIdentification outData)
  {
    if(outData != null)
    {
      outData.setNumber(this.number);
      outData.setUsage(this.usage);
      
      if(this.tinType != null)
      {
        TinType tmpData = TinType.fromString(this.tinType.getValue());
        outData.setTinType(tmpData);
      }
    }
  }
  
  public static IntTaxpayerIdentification createFromTaxpayerIdentification(TaxpayerIdentification inData)
  {
    IntTaxpayerIdentification ti = null;
    if(inData != null)
    {
      ti = new IntTaxpayerIdentification();
      ti.setUsage(inData.getUsage());
      ti.setNumber(inData.getNumber());
      ti.tinType = IntTinType.createFromTinType(inData.getTinType());
    }
    return ti;
  }
}
