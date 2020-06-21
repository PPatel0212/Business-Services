/**
 * Generated from schema type t=HazardousCommodityQuantityDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class HazardousCommodityQuantityDetail implements java.io.Serializable {

  private java.math.BigDecimal amount;

  public java.math.BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  private java.lang.String units;

  public java.lang.String getUnits() {
    return this.units;
  }

  public void setUnits(java.lang.String units) {
    this.units = units;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityType quantityType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityType getQuantityType() {
    return this.quantityType;
  }

  public void setQuantityType(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityType quantityType) {
    this.quantityType = quantityType;
  }

}
