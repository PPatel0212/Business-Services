package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntUploadDocumentType extends ValueObject implements Serializable
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
  
  public static IntUploadDocumentType createFromUploadDocumentType(UploadDocumentType inData)
  {
    IntUploadDocumentType udt = null;
    if(inData != null)
    {
      udt = new IntUploadDocumentType();
      udt.setValue(inData.getValue());
    }
    return udt;
  }
}
