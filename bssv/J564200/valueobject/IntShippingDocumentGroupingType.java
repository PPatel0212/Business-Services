package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentGroupingType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentGroupingType extends ValueObject implements Serializable
{
  private String value = null;

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public static IntShippingDocumentGroupingType createFromShippingDocumentGroupingType(ShippingDocumentGroupingType inData)
  {
    IntShippingDocumentGroupingType shipDocGroupType = null;
    if(inData != null)
    {
      shipDocGroupType = new IntShippingDocumentGroupingType();
      shipDocGroupType.setValue(inData.getValue());
    }
    return shipDocGroupType;
  }
}
