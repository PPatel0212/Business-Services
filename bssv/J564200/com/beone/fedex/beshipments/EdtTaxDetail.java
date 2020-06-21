/**
 * Generated from schema type t=EdtTaxDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class EdtTaxDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxType taxType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxType getTaxType() {
    return this.taxType;
  }

  public void setTaxType(be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxType taxType) {
    this.taxType = taxType;
  }

  private java.util.Calendar effectiveDate;

  public java.util.Calendar getEffectiveDate() {
    return this.effectiveDate;
  }

  public void setEffectiveDate(java.util.Calendar effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  private java.lang.String name;

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money taxableValue;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTaxableValue() {
    return this.taxableValue;
  }

  public void setTaxableValue(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money taxableValue) {
    this.taxableValue = taxableValue;
  }

  private java.lang.String description;

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  private java.lang.String formula;

  public java.lang.String getFormula() {
    return this.formula;
  }

  public void setFormula(java.lang.String formula) {
    this.formula = formula;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money amount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getAmount() {
    return this.amount;
  }

  public void setAmount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money amount) {
    this.amount = amount;
  }

}
