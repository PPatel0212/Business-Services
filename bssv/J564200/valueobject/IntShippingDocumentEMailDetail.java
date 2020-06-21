package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailGroupingType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailRecipient;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentEMailDetail extends ValueObject implements Serializable
{
  private IntShippingDocumentEMailRecipient[] emailRecipients = null;
  private IntShippingDocumentEMailGroupingType grouping = null;

  public void setEmailRecipients(IntShippingDocumentEMailRecipient[] emailRecipients)
  {
    this.emailRecipients = emailRecipients;
  }

  public IntShippingDocumentEMailRecipient[] getEmailRecipients()
  {
    return emailRecipients;
  }

  public void setGrouping(IntShippingDocumentEMailGroupingType grouping)
  {
    this.grouping = grouping;
  }

  public IntShippingDocumentEMailGroupingType getGrouping()
  {
    return grouping;
  }

  public void copyToShippingDocumentEMailDetail(ShippingDocumentEMailDetail outData)
  {
    if(outData != null)
    {
      if(this.grouping != null)
      {
        ShippingDocumentEMailGroupingType grpType = ShippingDocumentEMailGroupingType.fromString(this.grouping.getValue());
        outData.setGrouping(grpType);
      }
      
      if(this.emailRecipients != null)
      {
        ShippingDocumentEMailRecipient[] recipients = new ShippingDocumentEMailRecipient[this.emailRecipients.length];
        for(int x=0; x<this.emailRecipients.length; x++)
        {
          recipients[x] = new ShippingDocumentEMailRecipient();
          this.emailRecipients[x].copyToShippingDocumentEMailRecipient(recipients[x]);
        }
        outData.setEMailRecipients(recipients);
      }
    }
  }
}
