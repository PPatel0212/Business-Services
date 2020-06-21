package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Notification;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationParameter;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntNotification extends ValueObject implements Serializable
{
  private IntNotificationSeverityType severity = null;
  private String source = null;
  private String code = null;
  private String message = null;
  private String localizedMessage = null;
  private IntNotificationParameter[] messageParameters = null;

  public void setSeverity(IntNotificationSeverityType severity)
  {
    this.severity = severity;
  }

  public IntNotificationSeverityType getSeverity()
  {
    return severity;
  }

  public void setSource(String source)
  {
    this.source = source;
  }

  public String getSource()
  {
    return source;
  }

  public void setCode(String code)
  {
    this.code = code;
  }

  public String getCode()
  {
    return code;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  public void setLocalizedMessage(String localizedMessage)
  {
    this.localizedMessage = localizedMessage;
  }

  public String getLocalizedMessage()
  {
    return localizedMessage;
  }

  public void setMessageParameters(IntNotificationParameter[] messageParameters)
  {
    this.messageParameters = messageParameters;
  }

  public IntNotificationParameter[] getMessageParameters()
  {
    return messageParameters;
  }
  
  public static IntNotification createFromNotification(Notification inData)
  {
    IntNotification notify = null;
    if(inData != null)
    {
      notify = new IntNotification();
      notify.setCode(inData.getCode());
      notify.setLocalizedMessage(inData.getLocalizedMessage());
      notify.setMessage(inData.getMessage());
      notify.setSource(inData.getSource());
      
      notify.setSeverity(IntNotificationSeverityType.createFromNotificationSeverityType(inData.getSeverity()));
      
      NotificationParameter[] notifyParmArr = inData.getMessageParameters();
      if(notifyParmArr != null)
      {
        IntNotificationParameter[] iNotifyParmArr = new IntNotificationParameter[notifyParmArr.length];
        for(int x=0; x<notifyParmArr.length; x++)
        {
          iNotifyParmArr[x] = IntNotificationParameter.createFromNotificationParameter(notifyParmArr[x]);
        }
        notify.setMessageParameters(iNotifyParmArr);
      }
    }
    return notify;
  }
}
