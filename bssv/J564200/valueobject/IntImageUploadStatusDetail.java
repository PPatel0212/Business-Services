package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageUploadStatusDetail;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntImageUploadStatusDetail extends ValueObject implements Serializable
{
  private IntImageId id = null;
  private String message = null;
  private IntUploadImageStatusType status = null;
  private IntUploadImageStatusInfoType statusInfo = null;

  public void setId(IntImageId id)
  {
    this.id = id;
  }

  public IntImageId getId()
  {
    return id;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  public void setStatus(IntUploadImageStatusType status)
  {
    this.status = status;
  }

  public IntUploadImageStatusType getStatus()
  {
    return status;
  }

  public void setStatusInfo(IntUploadImageStatusInfoType statusInfo)
  {
    this.statusInfo = statusInfo;
  }

  public IntUploadImageStatusInfoType getStatusInfo()
  {
    return statusInfo;
  }
  
  public static IntImageUploadStatusDetail createFromImageUploadStatusDetail(ImageUploadStatusDetail inData)
  {
    IntImageUploadStatusDetail iImageUploadStatusDetail = null;
    if(inData != null)
    {
      iImageUploadStatusDetail = new IntImageUploadStatusDetail();
      iImageUploadStatusDetail.setMessage(inData.getMessage());
      iImageUploadStatusDetail.setId(IntImageId.createFromImageId(inData.getId()));
      iImageUploadStatusDetail.setStatus(IntUploadImageStatusType.createFromUploadImageStatusType(inData.getStatus()));
      iImageUploadStatusDetail.setStatusInfo(IntUploadImageStatusInfoType.createFromUploadImageStatusInfoType(inData.getStatusInfo()));
    }
    return iImageUploadStatusDetail;
  }
}
