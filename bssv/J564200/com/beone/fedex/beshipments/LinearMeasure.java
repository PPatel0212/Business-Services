/**
 * Generated from schema type t=LinearMeasure@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class LinearMeasure implements java.io.Serializable {

  private java.math.BigDecimal value;

  public java.math.BigDecimal getValue() {
    return this.value;
  }

  public void setValue(java.math.BigDecimal value) {
    this.value = value;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearUnits units;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearUnits getUnits() {
    return this.units;
  }

  public void setUnits(be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearUnits units) {
    this.units = units;
  }

}
