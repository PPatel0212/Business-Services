/**
 * Generated from schema type t=PickupDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class PickupDetail implements java.io.Serializable {

  private java.util.Calendar readyDateTime;

  public java.util.Calendar getReadyDateTime() {
    return this.readyDateTime;
  }

  public void setReadyDateTime(java.util.Calendar readyDateTime) {
    this.readyDateTime = readyDateTime;
  }

  private java.util.Calendar latestPickupDateTime;

  public java.util.Calendar getLatestPickupDateTime() {
    return this.latestPickupDateTime;
  }

  public void setLatestPickupDateTime(java.util.Calendar latestPickupDateTime) {
    this.latestPickupDateTime = latestPickupDateTime;
  }

  private java.lang.String courierInstructions;

  public java.lang.String getCourierInstructions() {
    return this.courierInstructions;
  }

  public void setCourierInstructions(java.lang.String courierInstructions) {
    this.courierInstructions = courierInstructions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupRequestType requestType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupRequestType getRequestType() {
    return this.requestType;
  }

  public void setRequestType(be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupRequestType requestType) {
    this.requestType = requestType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupRequestSourceType requestSource;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupRequestSourceType getRequestSource() {
    return this.requestSource;
  }

  public void setRequestSource(be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupRequestSourceType requestSource) {
    this.requestSource = requestSource;
  }

}
