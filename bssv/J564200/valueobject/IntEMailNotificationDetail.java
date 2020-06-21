package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationAggregationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipient;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntEMailNotificationDetail extends ValueObject implements Serializable
{
  private IntEMailNotificationAggregationType aggregationType = null;
  private String personalMessage = null;
  private IntEMailNotificationRecipient[] recipients = null;

  public void setAggregationType(IntEMailNotificationAggregationType aggregationType)
  {
    this.aggregationType = aggregationType;
  }

  public IntEMailNotificationAggregationType getAggregationType()
  {
    return aggregationType;
  }

  public void setPersonalMessage(String personalMessage)
  {
    this.personalMessage = personalMessage;
  }

  public String getPersonalMessage()
  {
    return personalMessage;
  }

  public void setRecipients(IntEMailNotificationRecipient[] recipients)
  {
    this.recipients = recipients;
  }

  public IntEMailNotificationRecipient[] getRecipients()
  {
    return recipients;
  }
  
  public void copyToEMailNotificationDetail(EMailNotificationDetail outData)
  {
    if(outData != null)
    {
      outData.setPersonalMessage(this.personalMessage);
      
      if(this.aggregationType != null)
      {
        EMailNotificationAggregationType agg = EMailNotificationAggregationType.fromString(this.aggregationType.getValue());
        outData.setAggregationType(agg);
      }
      
      if(this.recipients != null)
      {
        EMailNotificationRecipient[] noticeArr = new EMailNotificationRecipient[this.recipients.length];
        for(int x=0; x<this.recipients.length; x++)
        {
          noticeArr[x] = new EMailNotificationRecipient();
          this.recipients[x].copyToEMailNotificationRecipient(noticeArr[x]);
        }
        outData.setRecipients(noticeArr);
      }
    }
  }
}
