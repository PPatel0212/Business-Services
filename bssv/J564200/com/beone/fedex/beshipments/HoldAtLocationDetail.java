/**
 * Generated from schema type t=HoldAtLocationDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class HoldAtLocationDetail implements java.io.Serializable {

  private java.lang.String phoneNumber;

  public java.lang.String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress locationContactAndAddress;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress getLocationContactAndAddress() {
    return this.locationContactAndAddress;
  }

  public void setLocationContactAndAddress(be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress locationContactAndAddress) {
    this.locationContactAndAddress = locationContactAndAddress;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FedExLocationType locationType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FedExLocationType getLocationType() {
    return this.locationType;
  }

  public void setLocationType(be.e1.bssv.J564200.com.beone.fedex.beshipments.FedExLocationType locationType) {
    this.locationType = locationType;
  }

}
