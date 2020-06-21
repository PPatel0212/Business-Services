package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PendingShipmentAccessDetail;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntPendingShipmentAccessDetail extends ValueObject implements Serializable
{
  private String emailLabelUrl = null;
  private String userId = null;
  private String password = null;
  private Date expirationDate = null;
  private MathNumeric expiratonTime = null;

  public void setEmailLabelUrl(String emailLabelUrl)
  {
    this.emailLabelUrl = emailLabelUrl;
  }

  public String getEmailLabelUrl()
  {
    return emailLabelUrl;
  }

  public void setUserId(String userId)
  {
    this.userId = userId;
  }

  public String getUserId()
  {
    return userId;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public String getPassword()
  {
    return password;
  }

  public void setExpirationDate(Date expirationDate)
  {
    this.expirationDate = expirationDate;
  }

  public Date getExpirationDate()
  {
    return expirationDate;
  }

  public void setExpiratonTime(MathNumeric expiratonTime)
  {
    this.expiratonTime = expiratonTime;
  }

  public MathNumeric getExpiratonTime()
  {
    return expiratonTime;
  }
  
  public static IntPendingShipmentAccessDetail createFromPendingShipmentAccessDetail(PendingShipmentAccessDetail inData)
  {
    IntPendingShipmentAccessDetail shipAccess = null;
    if(inData != null)
    {
      shipAccess = new IntPendingShipmentAccessDetail();
      shipAccess.setUserId(inData.getUserId());
      shipAccess.setPassword(inData.getPassword());
      shipAccess.setEmailLabelUrl(inData.getEmailLabelUrl());
      
      Calendar cal = inData.getExpirationTimestamp();
      if(cal != null)
      {
        shipAccess.setExpirationDate(cal.getTime());
      }
    }
    return shipAccess;
  }
}
