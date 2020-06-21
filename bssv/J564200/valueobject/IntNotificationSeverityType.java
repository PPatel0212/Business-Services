package be.e1.bssv.J564200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntNotificationSeverityType extends ValueObject implements Serializable
{
  private String value = null;

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public static IntNotificationSeverityType createFromNotificationSeverityType(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.NotificationSeverityType inData)
  {
    IntNotificationSeverityType iNotifySevereType = null;
    if(inData != null)
    {
      iNotifySevereType = new IntNotificationSeverityType();
      iNotifySevereType.setValue(inData.getValue());
    }
    return iNotifySevereType;
  }
 
  public static IntNotificationSeverityType createFromNotificationSeverityType(be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType inData)
  {
    IntNotificationSeverityType iNotifySevereType = null;
    if(inData != null)
    {
      iNotifySevereType = new IntNotificationSeverityType();
      iNotifySevereType.setValue(inData.getValue());
    }
    return iNotifySevereType;
  }
}
