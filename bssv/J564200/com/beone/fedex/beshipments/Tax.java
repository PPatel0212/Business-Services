/**
 * Generated from schema type t=Tax@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Tax implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxType taxType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxType getTaxType() {
    return this.taxType;
  }

  public void setTaxType(be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxType taxType) {
    this.taxType = taxType;
  }

  private java.lang.String description;

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money amount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getAmount() {
    return this.amount;
  }

  public void setAmount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money amount) {
    this.amount = amount;
  }

}
