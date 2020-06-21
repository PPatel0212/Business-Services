package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentDispositionType extends ValueObject implements Serializable
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
  
  public static IntShippingDocumentDispositionType createFromShippingDocumentDispositionType(ShippingDocumentDispositionType outData)
  {
    IntShippingDocumentDispositionType shipDocDispType = null;
    if(outData != null)
    {
      shipDocDispType = new IntShippingDocumentDispositionType();
      shipDocDispType.setValue(outData.getValue());
    }
    return shipDocDispType;
  }
}
