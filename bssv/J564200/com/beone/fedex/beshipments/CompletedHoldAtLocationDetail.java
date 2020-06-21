/**
 * Generated from schema type t=CompletedHoldAtLocationDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CompletedHoldAtLocationDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress holdingLocation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress getHoldingLocation() {
    return this.holdingLocation;
  }

  public void setHoldingLocation(be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress holdingLocation) {
    this.holdingLocation = holdingLocation;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FedExLocationType holdingLocationType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FedExLocationType getHoldingLocationType() {
    return this.holdingLocationType;
  }

  public void setHoldingLocationType(be.e1.bssv.J564200.com.beone.fedex.beshipments.FedExLocationType holdingLocationType) {
    this.holdingLocationType = holdingLocationType;
  }

}
