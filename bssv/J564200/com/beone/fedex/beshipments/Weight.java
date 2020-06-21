/**
 * Generated from schema type t=Weight@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Weight implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.WeightUnits units;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.WeightUnits getUnits() {
    return this.units;
  }

  public void setUnits(be.e1.bssv.J564200.com.beone.fedex.beshipments.WeightUnits units) {
    this.units = units;
  }

  private java.math.BigDecimal value;

  public java.math.BigDecimal getValue() {
    return this.value;
  }

  public void setValue(java.math.BigDecimal value) {
    this.value = value;
  }

}
