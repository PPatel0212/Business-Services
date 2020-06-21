package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationEventType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationFormatType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipient;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipientType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntEMailNotificationRecipient extends ValueObject implements Serializable
{
  private IntEMailNotificationRecipientType emailNotificationRecipientType = null;
  private String emailAddress = null;
  private IntEMailNotificationEventType[] notificationEventsRequested = null;
  private IntEMailNotificationFormatType format = null;
  private IntLocalization localization = null;

  public void setEmailNotificationRecipientType(IntEMailNotificationRecipientType emailNotificationRecipientType)
  {
    this.emailNotificationRecipientType = emailNotificationRecipientType;
  }

  public IntEMailNotificationRecipientType getEmailNotificationRecipientType()
  {
    return emailNotificationRecipientType;
  }

  public void setEmailAddress(String emailAddress)
  {
    this.emailAddress = emailAddress;
  }

  public String getEmailAddress()
  {
    return emailAddress;
  }

  public void setNotificationEventsRequested(IntEMailNotificationEventType[] notificationEventsRequested)
  {
    this.notificationEventsRequested = notificationEventsRequested;
  }

  public IntEMailNotificationEventType[] getNotificationEventsRequested()
  {
    return notificationEventsRequested;
  }

  public void setFormat(IntEMailNotificationFormatType format)
  {
    this.format = format;
  }

  public IntEMailNotificationFormatType getFormat()
  {
    return format;
  }

  public void setLocalization(IntLocalization localization)
  {
    this.localization = localization;
  }

  public IntLocalization getLocalization()
  {
    return localization;
  }
  
  public void copyToEMailNotificationRecipient(EMailNotificationRecipient outData)
  {
    if(outData != null)
    {
      outData.setEMailAddress(this.emailAddress);
      
      if(this.emailNotificationRecipientType != null)
      {
        EMailNotificationRecipientType notifyType = EMailNotificationRecipientType.fromString(this.emailNotificationRecipientType.getValue());
        outData.setEMailNotificationRecipientType(notifyType);
      }
      
      if(this.format != null)
      {
        EMailNotificationFormatType fmtType = EMailNotificationFormatType.fromString(this.format.getValue());
        outData.setFormat(fmtType);
      }
      
      if(this.localization != null)
      {
        Localization locale = new Localization();
        this.localization.copyToLocalization(locale);
        outData.setLocalization(locale);
      }
      
      if(this.notificationEventsRequested != null)
      {
        EMailNotificationEventType[] notifyArr = new EMailNotificationEventType[this.notificationEventsRequested.length];
        for(int x=0; x<this.notificationEventsRequested.length; x++)
        {
          notifyArr[x] = EMailNotificationEventType.fromString(this.notificationEventsRequested[x].getValue());
        }
        outData.setNotificationEventsRequested(notifyArr);
      }
    }
  }
}
