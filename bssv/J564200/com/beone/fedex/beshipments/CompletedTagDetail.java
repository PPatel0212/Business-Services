/**
 * Generated from schema type t=CompletedTagDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CompletedTagDetail implements java.io.Serializable {

  private java.lang.String confirmationNumber;

  public java.lang.String getConfirmationNumber() {
    return this.confirmationNumber;
  }

  public void setConfirmationNumber(java.lang.String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  private java.lang.String accessTime;

  public java.lang.String getAccessTime() {
    return this.accessTime;
  }

  public void setAccessTime(java.lang.String accessTime) {
    this.accessTime = accessTime;
  }

  private java.util.Calendar cutoffTime;

  public java.util.Calendar getCutoffTime() {
    return this.cutoffTime;
  }

  public void setCutoffTime(java.util.Calendar cutoffTime) {
    this.cutoffTime = cutoffTime;
  }

  private java.lang.String location;

  public java.lang.String getLocation() {
    return this.location;
  }

  public void setLocation(java.lang.String location) {
    this.location = location;
  }

  private java.util.Calendar deliveryCommitment;

  public java.util.Calendar getDeliveryCommitment() {
    return this.deliveryCommitment;
  }

  public void setDeliveryCommitment(java.util.Calendar deliveryCommitment) {
    this.deliveryCommitment = deliveryCommitment;
  }

  private java.util.Calendar dispatchDate;

  public java.util.Calendar getDispatchDate() {
    return this.dispatchDate;
  }

  public void setDispatchDate(java.util.Calendar dispatchDate) {
    this.dispatchDate = dispatchDate;
  }

}
