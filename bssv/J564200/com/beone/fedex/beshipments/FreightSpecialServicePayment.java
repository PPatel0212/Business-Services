/**
 * Generated from schema type t=FreightSpecialServicePayment@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class FreightSpecialServicePayment implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServiceType specialService;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServiceType getSpecialService() {
    return this.specialService;
  }

  public void setSpecialService(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServiceType specialService) {
    this.specialService = specialService;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentRoleType paymentType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentRoleType getPaymentType() {
    return this.paymentType;
  }

  public void setPaymentType(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentRoleType paymentType) {
    this.paymentType = paymentType;
  }

}
