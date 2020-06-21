package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnAssociationDetail;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntReturnAssociationDetail extends ValueObject implements Serializable
{
  private String trackingNumber = null;
  private Date shipDate = null;

  public void setTrackingNumber(String trackingNumber)
  {
    this.trackingNumber = trackingNumber;
  }

  public String getTrackingNumber()
  {
    return trackingNumber;
  }

  public void setShipDate(Date shipDate)
  {
    this.shipDate = shipDate;
  }

  public Date getShipDate()
  {
    return shipDate;
  }
  
  public void copyToReturnAssociationDetail(ReturnAssociationDetail outData)
  {
    if(outData != null)
    {
      outData.setTrackingNumber(this.trackingNumber);
      if(this.shipDate != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.shipDate);
        outData.setShipDate(cal);
      }
    }
  }
}
