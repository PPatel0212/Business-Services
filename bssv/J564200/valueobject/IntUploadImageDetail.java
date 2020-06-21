package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageId;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageDetail;

import java.io.Serializable;

import java.nio.charset.Charset;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntUploadImageDetail extends ValueObject implements Serializable
{
  private IntImageId imageId = null;
  private String imageData = null;

  public void setImageData(String imageData)
  {
    this.imageData = imageData;
  }

  public String getImageData()
  {
    return imageData;
  }

  public void setImageId(IntImageId imageId)
  {
    this.imageId = imageId;
  }

  public IntImageId getImageId()
  {
    return imageId;
  }

  public void copyToUploadImageDetail(UploadImageDetail outData)
  {
    if (outData != null)
    {
      outData.setImage(this.imageData);
      if (this.imageId != null)
      {
        outData.setId(ImageId.fromString(this.imageId.getValue()));
      }
    }
  }
}
