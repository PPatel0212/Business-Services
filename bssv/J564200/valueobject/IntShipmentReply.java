package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Notification;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentReply;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShipmentReply extends ValueObject implements Serializable
{
  private IntNotificationSeverityType highestSeverity;
  private IntNotification[] notifications;
  private IntTransactionDetail transactionDetail;
  private IntVersionId version;

  public void setHighestSeverity(IntNotificationSeverityType highestSeverity)
  {
    this.highestSeverity = highestSeverity;
  }

  public IntNotificationSeverityType getHighestSeverity()
  {
    return highestSeverity;
  }

  public void setNotifications(IntNotification[] notifications)
  {
    this.notifications = notifications;
  }

  public IntNotification[] getNotifications()
  {
    return notifications;
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
  
  public static IntShipmentReply createFromShipmentReply(ShipmentReply inData)
  {
    IntShipmentReply iShipReply = null;
    if(inData != null)
    {
      iShipReply = new IntShipmentReply();
      
      iShipReply.setHighestSeverity(IntNotificationSeverityType.createFromNotificationSeverityType(inData.getHighestSeverity()));

      Notification[] notifyArr = inData.getNotifications();
      if(notifyArr != null)
      {
        IntNotification[] iNotifyArr = new IntNotification[notifyArr.length];
        for(int x=0; x<notifyArr.length; x++)
        {
          iNotifyArr[x] = IntNotification.createFromNotification(notifyArr[x]);
        }
        iShipReply.setNotifications(iNotifyArr);
      }
      
      iShipReply.setTransactionDetail(IntTransactionDetail.createFromTransactionDetail(inData.getTransactionDetail()));
      iShipReply.setVersion(IntVersionId.createFromVersionId(inData.getVersion()));
    }
    return iShipReply;
  }
}
