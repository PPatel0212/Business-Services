package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentIdProducer;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntUploadDocumentIdProducer extends ValueObject implements Serializable
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
  
  public static IntUploadDocumentIdProducer createFromUploadDocumentIdProducer(UploadDocumentIdProducer inData)
  {
    IntUploadDocumentIdProducer udip = null;
    if(inData != null)
    {
      udip = new IntUploadDocumentIdProducer();
      udip.setValue(inData.getValue());
    }
    return udip;
  }
}
