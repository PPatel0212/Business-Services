package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupRequestSourceType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupRequestType;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPickupDetail extends ValueObject implements Serializable
{
  private Date readyDateTime = null;
  private Date latestPickupDateTime = null;
  private String courierInstructions = null;
  private IntPickupRequestType requestType = null;
  private IntPickupRequestSourceType requestSource = null;

  public void setReadyDateTime(Date readyDateTime)
  {
    this.readyDateTime = readyDateTime;
  }

  public Date getReadyDateTime()
  {
    return readyDateTime;
  }

  public void setLatestPickupDateTime(Date latestPickupDateTime)
  {
    this.latestPickupDateTime = latestPickupDateTime;
  }

  public Date getLatestPickupDateTime()
  {
    return latestPickupDateTime;
  }

  public void setCourierInstructions(String courierInstructions)
  {
    this.courierInstructions = courierInstructions;
  }

  public String getCourierInstructions()
  {
    return courierInstructions;
  }

  public void setRequestType(IntPickupRequestType requestType)
  {
    this.requestType = requestType;
  }

  public IntPickupRequestType getRequestType()
  {
    return requestType;
  }

  public void setRequestSource(IntPickupRequestSourceType requestSource)
  {
    this.requestSource = requestSource;
  }

  public IntPickupRequestSourceType getRequestSource()
  {
    return requestSource;
  }
  
  public void copyToPickupDetail(PickupDetail outData)
  {
    if(outData != null)
    {
      outData.setCourierInstructions(this.courierInstructions);
      
      if(this.latestPickupDateTime != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.latestPickupDateTime);
        outData.setLatestPickupDateTime(cal);
      }
      
      if(this.readyDateTime != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.readyDateTime);
        outData.setReadyDateTime(cal);
      }
      
      if(this.requestSource != null)
      {
        PickupRequestSourceType prst = PickupRequestSourceType.fromString(this.requestSource.getValue());
        outData.setRequestSource(prst);
      }
      
      if(this.requestType != null)
      {
        PickupRequestType prt = PickupRequestType.fromString(this.requestType.getValue());
        outData.setRequestType(prt);
      }
    }
  }
}
