package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsOptionDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsOptionType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomsOptionDetail extends ValueObject implements Serializable
{
  private IntCustomsOptionType type = null;
  private String description = null;

  public void setType(IntCustomsOptionType type)
  {
    this.type = type;
  }

  public IntCustomsOptionType getType()
  {
    return type;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }
  
  public void copyToCustomsOptionDetail(CustomsOptionDetail outData)
  {
    if(outData != null)
    {
      outData.setDescription(this.description);
      if(this.type != null)
      {
        CustomsOptionType cot = CustomsOptionType.fromString(this.type.getValue());
        outData.setType(cot);
      }
    }
  }
}
