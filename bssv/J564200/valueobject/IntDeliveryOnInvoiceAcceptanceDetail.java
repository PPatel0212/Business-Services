package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DeliveryOnInvoiceAcceptanceDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDeliveryOnInvoiceAcceptanceDetail extends ValueObject implements Serializable
{
  private IntParty recipient = null;
  private IntTrackingId trackingId = null;

  public void setRecipient(IntParty recipient)
  {
    this.recipient = recipient;
  }

  public IntParty getRecipient()
  {
    return recipient;
  }

  public void setTrackingId(IntTrackingId trackingId)
  {
    this.trackingId = trackingId;
  }

  public IntTrackingId getTrackingId()
  {
    return trackingId;
  }
  
  public void copyToDeliveryOnInvoiceAcceptanceDetail(DeliveryOnInvoiceAcceptanceDetail outData)
  {
    if(outData != null)
    {
      if(this.recipient != null)
      {
        Party pty = new Party();
        this.recipient.copyToParty(pty);
        outData.setRecipient(pty);
      }
      
      if(this.trackingId != null)
      {
        TrackingId tid = new TrackingId();
        this.trackingId.copyToTrackingId(tid);
        outData.setTrackingId(tid);
      }
    }
  }
}
