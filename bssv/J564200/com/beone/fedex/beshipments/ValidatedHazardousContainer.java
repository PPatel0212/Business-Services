/**
 * Generated from schema type t=ValidatedHazardousContainer@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ValidatedHazardousContainer implements java.io.Serializable {

  private java.math.BigDecimal qValue;

  public java.math.BigDecimal getQValue() {
    return this.qValue;
  }

  public void setQValue(java.math.BigDecimal qValue) {
    this.qValue = qValue;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityContent[] hazardousCommodities;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityContent[] getHazardousCommodities() {
    return this.hazardousCommodities;
  }

  public void setHazardousCommodities(be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityContent[] hazardousCommodities) {
    this.hazardousCommodities = hazardousCommodities;
  }

}
