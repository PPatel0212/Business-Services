package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentProducerType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntUploadDocumentProducerType extends ValueObject implements Serializable
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
  
  public static IntUploadDocumentProducerType createFromUploadDocumentProducerType(UploadDocumentProducerType inData)
  {
    IntUploadDocumentProducerType udpt = null;
    if(inData != null)
    {
      udpt = new IntUploadDocumentProducerType();
      udpt.setValue(inData.getValue());
    }
    return udpt;
  }
}
