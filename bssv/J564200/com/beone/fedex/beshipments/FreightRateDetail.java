/**
 * Generated from schema type t=FreightRateDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class FreightRateDetail implements java.io.Serializable {

  private java.lang.String quoteNumber;

  public java.lang.String getQuoteNumber() {
    return this.quoteNumber;
  }

  public void setQuoteNumber(java.lang.String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateQuoteType quoteType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateQuoteType getQuoteType() {
    return this.quoteType;
  }

  public void setQuoteType(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateQuoteType quoteType) {
    this.quoteType = quoteType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseChargeCalculationType baseChargeCalculation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseChargeCalculationType getBaseChargeCalculation() {
    return this.baseChargeCalculation;
  }

  public void setBaseChargeCalculation(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseChargeCalculationType baseChargeCalculation) {
    this.baseChargeCalculation = baseChargeCalculation;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseCharge[] baseCharges;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseCharge[] getBaseCharges() {
    return this.baseCharges;
  }

  public void setBaseCharges(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseCharge[] baseCharges) {
    this.baseCharges = baseCharges;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateNotation[] notations;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateNotation[] getNotations() {
    return this.notations;
  }

  public void setNotations(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateNotation[] notations) {
    this.notations = notations;
  }

}
