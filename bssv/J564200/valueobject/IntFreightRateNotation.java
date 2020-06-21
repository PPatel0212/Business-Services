package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateNotation;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightRateNotation extends ValueObject implements Serializable
{
  private String code = null;
  private String description = null;

  public void setCode(String code)
  {
    this.code = code;
  }

  public String getCode()
  {
    return code;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }
  
  public static IntFreightRateNotation createFromFreightRateNotation(FreightRateNotation inData)
  {
    IntFreightRateNotation frn = null;
    if(inData != null)
    {
      frn = new IntFreightRateNotation();
      frn.setCode(inData.getCode());
      frn.setDescription(inData.getDescription());
    }
    return frn;
  }
}
