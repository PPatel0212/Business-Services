package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailLabelDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntEmailLabelDetail extends ValueObject implements Serializable
{
  private String notificationEMailAddress = null;
  private String notificationMessage = null;

  public void setNotificationEMailAddress(String notificationEMailAddress)
  {
    this.notificationEMailAddress = notificationEMailAddress;
  }

  public String getNotificationEMailAddress()
  {
    return notificationEMailAddress;
  }

  public void setNotificationMessage(String notificationMessage)
  {
    this.notificationMessage = notificationMessage;
  }

  public String getNotificationMessage()
  {
    return notificationMessage;
  }
  
  public void copyToEmailLabelDetail(EMailLabelDetail outData)
  {
    if(outData != null)
    {
      outData.setNotificationEMailAddress(this.notificationEMailAddress);
      outData.setNotificationMessage(this.notificationMessage);
    }
  } 
}
