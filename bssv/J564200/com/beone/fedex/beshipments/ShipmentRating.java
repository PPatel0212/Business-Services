/**
 * Generated from schema type t=ShipmentRating@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShipmentRating implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedRateType actualRateType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedRateType getActualRateType() {
    return this.actualRateType;
  }

  public void setActualRateType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedRateType actualRateType) {
    this.actualRateType = actualRateType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money effectiveNetDiscount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getEffectiveNetDiscount() {
    return this.effectiveNetDiscount;
  }

  public void setEffectiveNetDiscount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money effectiveNetDiscount) {
    this.effectiveNetDiscount = effectiveNetDiscount;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentRateDetail[] shipmentRateDetails;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentRateDetail[] getShipmentRateDetails() {
    return this.shipmentRateDetails;
  }

  public void setShipmentRateDetails(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentRateDetail[] shipmentRateDetails) {
    this.shipmentRateDetails = shipmentRateDetails;
  }

}
