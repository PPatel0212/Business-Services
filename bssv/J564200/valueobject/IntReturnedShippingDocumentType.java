package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedShippingDocumentType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntReturnedShippingDocumentType extends ValueObject implements Serializable
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
  
  public static IntReturnedShippingDocumentType createFromReturnedShippingDocumentType(ReturnedShippingDocumentType outData)
  {
    IntReturnedShippingDocumentType retShipDocType = null;
    if(outData != null)
    {
      retShipDocType = new IntReturnedShippingDocumentType();
      retShipDocType.setValue(outData.getValue());
    }
    return retShipDocType;
  }
}
