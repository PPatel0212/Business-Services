package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageId;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntImageId extends ValueObject implements Serializable
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
  
  public static IntImageId createFromImageId(ImageId inData)
  {
    IntImageId iImgId = null;
    if(inData != null)
    {
      iImgId = new IntImageId();
      iImgId.setValue(inData.getValue());
    }
    return iImgId;
  }
}
