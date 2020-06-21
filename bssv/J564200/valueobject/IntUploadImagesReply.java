package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageUploadStatusDetail;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImagesReply;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntUploadImagesReply extends ValueObject implements Serializable
{
  private IntNotificationSeverityType highestSeverity = null;
  private IntImageUploadStatusDetail[] imageStatuses = null;
  private IntTransactionDetail transactionDetail = null;
  private IntVersionId version = null;

  public void setHighestSeverity(IntNotificationSeverityType highestSeverity)
  {
    this.highestSeverity = highestSeverity;
  }

  public IntNotificationSeverityType getHighestSeverity()
  {
    return highestSeverity;
  }

  public void setImageStatuses(IntImageUploadStatusDetail[] imageStatuses)
  {
    this.imageStatuses = imageStatuses;
  }

  public IntImageUploadStatusDetail[] getImageStatuses()
  {
    return imageStatuses;
  }

  public void setTransactionDetail(IntTransactionDetail transactionDetail)
  {
    this.transactionDetail = transactionDetail;
  }

  public IntTransactionDetail getTransactionDetail()
  {
    return transactionDetail;
  }

  public void setVersion(IntVersionId version)
  {
    this.version = version;
  }

  public IntVersionId getVersion()
  {
    return version;
  }

  public static IntUploadImagesReply createFromUploadImagesReply(UploadImagesReply inData)
  {
    IntUploadImagesReply iUploadImagesReply = null;
    if(inData != null)
    {
      iUploadImagesReply = new IntUploadImagesReply();
      
      iUploadImagesReply.setHighestSeverity(IntNotificationSeverityType.createFromNotificationSeverityType(inData.getHighestSeverity()));
      iUploadImagesReply.setTransactionDetail(IntTransactionDetail.createFromTransactionDetail(inData.getTransactionDetail()));
      iUploadImagesReply.setVersion(IntVersionId.createFromVersionId(inData.getVersion()));
      
      ImageUploadStatusDetail[] imgUploadStatusDetailArr = inData.getImageStatuses();
      if(imgUploadStatusDetailArr != null)
      {
        IntImageUploadStatusDetail[] iImgUploadStatusDetailArr = new IntImageUploadStatusDetail [imgUploadStatusDetailArr.length];
        for(int idx=0; idx<imgUploadStatusDetailArr.length; idx++)
        {
          iImgUploadStatusDetailArr[idx] = IntImageUploadStatusDetail.createFromImageUploadStatusDetail(imgUploadStatusDetailArr[idx]);
        }
        iUploadImagesReply.setImageStatuses(iImgUploadStatusDetailArr);
      }
    }      
    return iUploadImagesReply;
  }
}
