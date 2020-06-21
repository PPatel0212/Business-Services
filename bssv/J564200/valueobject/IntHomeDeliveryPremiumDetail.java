package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HomeDeliveryPremiumDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HomeDeliveryPremiumType;

import java.io.Serializable;

import java.util.Date;
import be.e1.bssv.J564200.valueobject.IntHomeDeliveryPremiumType;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHomeDeliveryPremiumDetail extends ValueObject implements Serializable
{
  private IntHomeDeliveryPremiumType homeDeliveryPremiumType = null;
  private Date date = null;
  private String phoneNumber = null;

  public void setHomeDeliveryPremiumType(IntHomeDeliveryPremiumType homeDeliveryPremiumType)
  {
    this.homeDeliveryPremiumType = homeDeliveryPremiumType;
  }

  public IntHomeDeliveryPremiumType getHomeDeliveryPremiumType()
  {
    return homeDeliveryPremiumType;
  }

  public void setDate(Date date)
  {
    this.date = date;
  }

  public Date getDate()
  {
    return date;
  }

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }
  
  public void copyToHomeDeliveryPremiumDetail(HomeDeliveryPremiumDetail outData)
  {
    if(outData != null)
    {
      outData.setPhoneNumber(this.phoneNumber);

      if(this.date != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.date);
        outData.setDate(cal);
      }   
      
      if(this.homeDeliveryPremiumType != null)
      {
        HomeDeliveryPremiumType hdpt = HomeDeliveryPremiumType.fromString(this.homeDeliveryPremiumType.getValue());
        outData.setHomeDeliveryPremiumType(hdpt);
      }
    }
  }
}
