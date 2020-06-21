package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageStatusType;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntUploadImageStatusType extends ValueObject implements Serializable
{
  private String value;

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public static IntUploadImageStatusType createFromUploadImageStatusType(UploadImageStatusType inData)
  {
    IntUploadImageStatusType iUploadImageStatusType = null;
    if(inData != null)
    {
      iUploadImageStatusType = new IntUploadImageStatusType();
      iUploadImageStatusType.setValue(inData.getValue());
    }
    return iUploadImageStatusType;
  }
}
