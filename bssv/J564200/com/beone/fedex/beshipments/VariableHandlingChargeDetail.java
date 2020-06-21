/**
 * Generated from schema type t=VariableHandlingChargeDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class VariableHandlingChargeDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money fixedValue;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getFixedValue() {
    return this.fixedValue;
  }

  public void setFixedValue(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money fixedValue) {
    this.fixedValue = fixedValue;
  }

  private java.math.BigDecimal percentValue;

  public java.math.BigDecimal getPercentValue() {
    return this.percentValue;
  }

  public void setPercentValue(java.math.BigDecimal percentValue) {
    this.percentValue = percentValue;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RateElementBasisType rateElementBasis;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RateElementBasisType getRateElementBasis() {
    return this.rateElementBasis;
  }

  public void setRateElementBasis(be.e1.bssv.J564200.com.beone.fedex.beshipments.RateElementBasisType rateElementBasis) {
    this.rateElementBasis = rateElementBasis;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RateTypeBasisType rateTypeBasis;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RateTypeBasisType getRateTypeBasis() {
    return this.rateTypeBasis;
  }

  public void setRateTypeBasis(be.e1.bssv.J564200.com.beone.fedex.beshipments.RateTypeBasisType rateTypeBasis) {
    this.rateTypeBasis = rateTypeBasis;
  }

}
