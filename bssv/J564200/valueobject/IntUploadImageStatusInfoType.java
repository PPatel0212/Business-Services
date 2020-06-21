package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageStatusInfoType;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntUploadImageStatusInfoType extends ValueObject implements Serializable
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
  
  public static IntUploadImageStatusInfoType createFromUploadImageStatusInfoType(UploadImageStatusInfoType inData)
  {
    IntUploadImageStatusInfoType iUploadImageStatusInfoType = null;
    if(inData != null)
    {
      iUploadImageStatusInfoType = new IntUploadImageStatusInfoType();
      iUploadImageStatusInfoType.setValue(inData.getValue());
    }
    return iUploadImageStatusInfoType;
  }
}
