/**
 * Generated from schema type t=DeliveryOnInvoiceAcceptanceDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class DeliveryOnInvoiceAcceptanceDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Party recipient;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Party getRecipient() {
    return this.recipient;
  }

  public void setRecipient(be.e1.bssv.J564200.com.beone.fedex.beshipments.Party recipient) {
    this.recipient = recipient;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId trackingId;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId getTrackingId() {
    return this.trackingId;
  }

  public void setTrackingId(be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId trackingId) {
    this.trackingId = trackingId;
  }

}
