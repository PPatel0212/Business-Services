/**
 * Generated from schema type t=CommercialInvoice@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CommercialInvoice implements java.io.Serializable {

  private java.lang.String[] comments;

  public java.lang.String[] getComments() {
    return this.comments;
  }

  public void setComments(java.lang.String[] comments) {
    this.comments = comments;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money freightCharge;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getFreightCharge() {
    return this.freightCharge;
  }

  public void setFreightCharge(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money freightCharge) {
    this.freightCharge = freightCharge;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money taxesOrMiscellaneousCharge;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTaxesOrMiscellaneousCharge() {
    return this.taxesOrMiscellaneousCharge;
  }

  public void setTaxesOrMiscellaneousCharge(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money taxesOrMiscellaneousCharge) {
    this.taxesOrMiscellaneousCharge = taxesOrMiscellaneousCharge;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxesOrMiscellaneousChargeType taxesOrMiscellaneousChargeType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxesOrMiscellaneousChargeType getTaxesOrMiscellaneousChargeType() {
    return this.taxesOrMiscellaneousChargeType;
  }

  public void setTaxesOrMiscellaneousChargeType(be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxesOrMiscellaneousChargeType taxesOrMiscellaneousChargeType) {
    this.taxesOrMiscellaneousChargeType = taxesOrMiscellaneousChargeType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money packingCosts;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getPackingCosts() {
    return this.packingCosts;
  }

  public void setPackingCosts(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money packingCosts) {
    this.packingCosts = packingCosts;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money handlingCosts;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getHandlingCosts() {
    return this.handlingCosts;
  }

  public void setHandlingCosts(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money handlingCosts) {
    this.handlingCosts = handlingCosts;
  }

  private java.lang.String specialInstructions;

  public java.lang.String getSpecialInstructions() {
    return this.specialInstructions;
  }

  public void setSpecialInstructions(java.lang.String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }

  private java.lang.String declarationStatement;

  public java.lang.String getDeclarationStatement() {
    return this.declarationStatement;
  }

  public void setDeclarationStatement(java.lang.String declarationStatement) {
    this.declarationStatement = declarationStatement;
  }

  private java.lang.String paymentTerms;

  public java.lang.String getPaymentTerms() {
    return this.paymentTerms;
  }

  public void setPaymentTerms(java.lang.String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PurposeOfShipmentType purpose;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PurposeOfShipmentType getPurpose() {
    return this.purpose;
  }

  public void setPurpose(be.e1.bssv.J564200.com.beone.fedex.beshipments.PurposeOfShipmentType purpose) {
    this.purpose = purpose;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] customerReferences;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] getCustomerReferences() {
    return this.customerReferences;
  }

  public void setCustomerReferences(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] customerReferences) {
    this.customerReferences = customerReferences;
  }

  private java.lang.String originatorName;

  public java.lang.String getOriginatorName() {
    return this.originatorName;
  }

  public void setOriginatorName(java.lang.String originatorName) {
    this.originatorName = originatorName;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TermsOfSaleType termsOfSale;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TermsOfSaleType getTermsOfSale() {
    return this.termsOfSale;
  }

  public void setTermsOfSale(be.e1.bssv.J564200.com.beone.fedex.beshipments.TermsOfSaleType termsOfSale) {
    this.termsOfSale = termsOfSale;
  }

}
