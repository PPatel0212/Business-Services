/**
 * Generated from schema type t=ValidatedHazardousCommodityContent@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ValidatedHazardousCommodityContent implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityDescription description;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityDescription getDescription() {
    return this.description;
  }

  public void setDescription(be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityDescription description) {
    this.description = description;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail quantity;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail getQuantity() {
    return this.quantity;
  }

  public void setQuantity(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail quantity) {
    this.quantity = quantity;
  }

  private java.math.BigDecimal massPoints;

  public java.math.BigDecimal getMassPoints() {
    return this.massPoints;
  }

  public void setMassPoints(java.math.BigDecimal massPoints) {
    this.massPoints = massPoints;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionDetail options;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionDetail getOptions() {
    return this.options;
  }

  public void setOptions(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionDetail options) {
    this.options = options;
  }

}
