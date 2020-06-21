package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationParameter;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntNotificationParameter extends ValueObject implements Serializable
{ 
  private String id = null;
  private String value = null;

  public void setId(String id)
  {
    this.id = id;
  }

  public String getId()
  {
    return id;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public static IntNotificationParameter createFromNotificationParameter(NotificationParameter inData)
  {
    IntNotificationParameter notifyParm = null;
    if(inData != null)
    {
      notifyParm = new IntNotificationParameter();
      
      notifyParm.setId(inData.getId());
      notifyParm.setValue(inData.getValue());
    }
    return notifyParm;
  }
}
