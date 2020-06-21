/**
 * Generated from schema type t=Volume@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Volume implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.VolumeUnits units;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.VolumeUnits getUnits() {
    return this.units;
  }

  public void setUnits(be.e1.bssv.J564200.com.beone.fedex.beshipments.VolumeUnits units) {
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
