package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RecipientCustomsId;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RecipientCustomsIdType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRecipientCustomsId extends ValueObject implements Serializable
{
  private IntRecipientCustomsIdType type = null;
  private String value = null;

  public void setType(IntRecipientCustomsIdType type)
  {
    this.type = type;
  }

  public IntRecipientCustomsIdType getType()
  {
    return type;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public void copyToRecipientCustomsId(RecipientCustomsId outData)
  {
    if(outData != null)
    {
      if(this.type != null)
      {
        RecipientCustomsIdType idType = RecipientCustomsIdType.fromString(this.type.getValue());
        outData.setType(idType);
      }
      outData.setValue(this.value);
    }
  }
}
