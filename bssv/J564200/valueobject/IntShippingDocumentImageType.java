package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentImageType extends ValueObject implements Serializable
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
  
  public static IntShippingDocumentImageType createFromShippingDocumentImageType(ShippingDocumentImageType inData)
  {
    IntShippingDocumentImageType shipDocImgType = null;
    if(inData != null)
    {
      shipDocImgType = new IntShippingDocumentImageType();
      shipDocImgType.setValue(inData.getValue());
    }
    return shipDocImgType;
  }
}
