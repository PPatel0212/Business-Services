package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipientType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailRecipient;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentEMailRecipient extends ValueObject implements Serializable
{
  private IntEMailNotificationRecipientType recipientType = null;
  private String address = null;

  public void setRecipientType(IntEMailNotificationRecipientType recipientType)
  {
    this.recipientType = recipientType;
  }

  public IntEMailNotificationRecipientType getRecipientType()
  {
    return recipientType;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public String getAddress()
  {
    return address;
  }
  
  public void copyToShippingDocumentEMailRecipient(ShippingDocumentEMailRecipient outData)
  {
    if(outData != null)
    {
      outData.setAddress(this.address);
      if(this.recipientType != null)
      {
        EMailNotificationRecipientType enrt = EMailNotificationRecipientType.fromString(this.recipientType.getValue());
        outData.setRecipientType(enrt);
      }
    }
  }
}
