/**
 * Generated from schema type t=HomeDeliveryPremiumDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class HomeDeliveryPremiumDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HomeDeliveryPremiumType homeDeliveryPremiumType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HomeDeliveryPremiumType getHomeDeliveryPremiumType() {
    return this.homeDeliveryPremiumType;
  }

  public void setHomeDeliveryPremiumType(be.e1.bssv.J564200.com.beone.fedex.beshipments.HomeDeliveryPremiumType homeDeliveryPremiumType) {
    this.homeDeliveryPremiumType = homeDeliveryPremiumType;
  }

  private java.util.Calendar date;

  public java.util.Calendar getDate() {
    return this.date;
  }

  public void setDate(java.util.Calendar date) {
    this.date = date;
  }

  private java.lang.String phoneNumber;

  public java.lang.String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
