/**
 * Generated from schema type t=EdtCommodityTax@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class EdtCommodityTax implements java.io.Serializable {

  private java.lang.String harmonizedCode;

  public java.lang.String getHarmonizedCode() {
    return this.harmonizedCode;
  }

  public void setHarmonizedCode(java.lang.String harmonizedCode) {
    this.harmonizedCode = harmonizedCode;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxDetail[] taxes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxDetail[] getTaxes() {
    return this.taxes;
  }

  public void setTaxes(be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxDetail[] taxes) {
    this.taxes = taxes;
  }

}
