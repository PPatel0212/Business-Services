package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedTagDetail;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntCompletedTagDetail extends ValueObject implements Serializable
{
  private String confirmationNumber = null;
  private String accessTime = null;
  private Date cutoffTime = null;
  private String location = null;
  private Date deliveryCommitment = null;
  private Date dispatchDate = null;

  public void setConfirmationNumber(String confirmationNumber)
  {
    this.confirmationNumber = confirmationNumber;
  }

  public String getConfirmationNumber()
  {
    return confirmationNumber;
  }

  public void setAccessTime(String accessTime)
  {
    this.accessTime = accessTime;
  }

  public String getAccessTime()
  {
    return accessTime;
  }

  public void setCutoffTime(Date cutoffTime)
  {
    this.cutoffTime = cutoffTime;
  }

  public Date getCutoffTime()
  {
    return cutoffTime;
  }

  public void setLocation(String location)
  {
    this.location = location;
  }

  public String getLocation()
  {
    return location;
  }

  public void setDeliveryCommitment(Date deliveryCommitment)
  {
    this.deliveryCommitment = deliveryCommitment;
  }

  public Date getDeliveryCommitment()
  {
    return deliveryCommitment;
  }

  public void setDispatchDate(Date dispatchDate)
  {
    this.dispatchDate = dispatchDate;
  }

  public Date getDispatchDate()
  {
    return dispatchDate;
  }
  
  public static IntCompletedTagDetail createFromCompletedTagDetail(CompletedTagDetail inData)
  {
    IntCompletedTagDetail ctd = null;
    if(inData != null)
    {
      ctd = new IntCompletedTagDetail();
      
      ctd.setAccessTime(inData.getAccessTime());
      ctd.setConfirmationNumber(inData.getConfirmationNumber());
      ctd.setLocation(inData.getLocation());
      
      Calendar cal = inData.getCutoffTime();
      if(cal != null)
      {
        ctd.cutoffTime = cal.getTime();
      }
      
      cal = inData.getDeliveryCommitment();
      if(cal != null)
      {
        ctd.deliveryCommitment = cal.getTime();
      }
      
      cal = inData.getDispatchDate();
      if(cal != null)
      {
        ctd.dispatchDate = cal.getTime();
      }
    }
    return ctd;
  }
}
