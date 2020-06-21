/**
 * Generated from schema type t=TrackingId@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class TrackingId implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingIdType trackingIdType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingIdType getTrackingIdType() {
    return this.trackingIdType;
  }

  public void setTrackingIdType(be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingIdType trackingIdType) {
    this.trackingIdType = trackingIdType;
  }

  private java.lang.String formId;

  public java.lang.String getFormId() {
    return this.formId;
  }

  public void setFormId(java.lang.String formId) {
    this.formId = formId;
  }

  private java.lang.String uspsApplicationId;

  public java.lang.String getUspsApplicationId() {
    return this.uspsApplicationId;
  }

  public void setUspsApplicationId(java.lang.String uspsApplicationId) {
    this.uspsApplicationId = uspsApplicationId;
  }

  private java.lang.String trackingNumber;

  public java.lang.String getTrackingNumber() {
    return this.trackingNumber;
  }

  public void setTrackingNumber(java.lang.String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

}
