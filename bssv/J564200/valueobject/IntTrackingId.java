package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingIdType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntTrackingId extends ValueObject implements Serializable
{
  private IntTrackingIdType trackingIdType = null;
  private String formId = null;
  private String uspsApplicationId = null;
  private String trackingNumber = null;

  public void setTrackingIdType(IntTrackingIdType trackingIdType)
  {
    this.trackingIdType = trackingIdType;
  }

  public IntTrackingIdType getTrackingIdType()
  {
    return trackingIdType;
  }

  public void setFormId(String formId)
  {
    this.formId = formId;
  }

  public String getFormId()
  {
    return formId;
  }

  public void setUspsApplicationId(String uspsApplicationId)
  {
    this.uspsApplicationId = uspsApplicationId;
  }

  public String getUspsApplicationId()
  {
    return uspsApplicationId;
  }

  public void setTrackingNumber(String trackingNumber)
  {
    this.trackingNumber = trackingNumber;
  }

  public String getTrackingNumber()
  {
    return trackingNumber;
  }
  
  public void copyToTrackingId(TrackingId outData)
  {
    if(outData != null)
    {
      outData.setFormId(this.formId);
      outData.setTrackingNumber(this.trackingNumber);
      outData.setUspsApplicationId(this.uspsApplicationId);
      if(this.trackingIdType != null)
      {
        TrackingIdType tit = TrackingIdType.fromString(this.trackingIdType.getValue());
        outData.setTrackingIdType(tit);
      }
    }
  }
  
  public static IntTrackingId createFromTrackingId(TrackingId inData)
  {
    IntTrackingId tid = null;
    if(inData != null)
    {
      tid = new IntTrackingId();
      
      tid.setFormId(inData.getFormId());
      tid.setTrackingNumber(inData.getTrackingNumber());
      tid.setUspsApplicationId(inData.getUspsApplicationId());
      tid.setTrackingIdType(IntTrackingIdType.createFromTrackingIdType(inData.getTrackingIdType()));
    }
    return tid;
  }
}
