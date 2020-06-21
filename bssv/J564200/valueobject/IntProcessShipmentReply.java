package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Notification;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ProcessShipmentReply;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntProcessShipmentReply extends ValueObject implements Serializable
{
  private IntNotificationSeverityType highestSeverity = null;
  private IntBEStatus bEStatus = null;
  private IntNotification[] notifications = null;
  private IntTransactionDetail transactionDetail = null;
  private IntVersionId version = null;
  private String jobId = null;
  private IntCompletedShipmentDetail completedShipmentDetail = null;
  private IntShippingDocument[] errorLabels = null;

  public void setHighestSeverity(IntNotificationSeverityType highestSeverity)
  {
    this.highestSeverity = highestSeverity;
  }

  public IntNotificationSeverityType getHighestSeverity()
  {
    return highestSeverity;
  }

  public void setBEStatus(IntBEStatus bEStatus)
  {
    this.bEStatus = bEStatus;
  }

  public IntBEStatus getBEStatus()
  {
    return bEStatus;
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

  public void setJobId(String jobId)
  {
    this.jobId = jobId;
  }

  public String getJobId()
  {
    return jobId;
  }

  public void setCompletedShipmentDetail(IntCompletedShipmentDetail completedShipmentDetail)
  {
    this.completedShipmentDetail = completedShipmentDetail;
  }

  public IntCompletedShipmentDetail getCompletedShipmentDetail()
  {
    return completedShipmentDetail;
  }

  public void setErrorLabels(IntShippingDocument[] errorLabels)
  {
    this.errorLabels = errorLabels;
  }

  public IntShippingDocument[] getErrorLabels()
  {
    return errorLabels;
  }
  
  public static IntProcessShipmentReply createFromProcessShipmentReply(ProcessShipmentReply inData)
  {
    IntProcessShipmentReply procShipReply = null;
    if(inData != null)
    {
      procShipReply = new IntProcessShipmentReply();
      
      procShipReply.setBEStatus(IntBEStatus.createFromBEStatus(inData.getBEStatus()));
      procShipReply.setCompletedShipmentDetail(IntCompletedShipmentDetail.createFromCompletedShipmentDetail(inData.getCompletedShipmentDetail()));
      
      ShippingDocument[] shipDocArr = inData.getErrorLabels();
      if(shipDocArr != null)
      {
        IntShippingDocument[] iShipDocArr = new IntShippingDocument[shipDocArr.length];
        for(int x=0; x<shipDocArr.length; x++)
        {
          iShipDocArr[x] = IntShippingDocument.createFromShippingDocument(shipDocArr[x]);
        }
        procShipReply.setErrorLabels(iShipDocArr);
      }
      
      procShipReply.setHighestSeverity(IntNotificationSeverityType.createFromNotificationSeverityType(inData.getHighestSeverity()));
      procShipReply.setJobId(inData.getJobId());
      
      Notification[] notifyArr = inData.getNotifications();
      if(notifyArr != null)
      {
        IntNotification[] iNotifyArr = new IntNotification[notifyArr.length];
        for(int x=0; x<notifyArr.length; x++)
        {
          iNotifyArr[x] = IntNotification.createFromNotification(notifyArr[x]);
        }
        procShipReply.setNotifications(iNotifyArr);
      }
      
      procShipReply.setTransactionDetail(IntTransactionDetail.createFromTransactionDetail(inData.getTransactionDetail()));
      procShipReply.setVersion(IntVersionId.createFromVersionId(inData.getVersion()));
    }
    return procShipReply;
  }
}
