/**
 * Generated from schema type t=FreightShipmentDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class FreightShipmentDetail implements java.io.Serializable {

  private java.lang.String fedExFreightAccountNumber;

  public java.lang.String getFedExFreightAccountNumber() {
    return this.fedExFreightAccountNumber;
  }

  public void setFedExFreightAccountNumber(java.lang.String fedExFreightAccountNumber) {
    this.fedExFreightAccountNumber = fedExFreightAccountNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress fedExFreightBillingContactAndAddress;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress getFedExFreightBillingContactAndAddress() {
    return this.fedExFreightBillingContactAndAddress;
  }

  public void setFedExFreightBillingContactAndAddress(be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress fedExFreightBillingContactAndAddress) {
    this.fedExFreightBillingContactAndAddress = fedExFreightBillingContactAndAddress;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Party alternateBilling;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Party getAlternateBilling() {
    return this.alternateBilling;
  }

  public void setAlternateBilling(be.e1.bssv.J564200.com.beone.fedex.beshipments.Party alternateBilling) {
    this.alternateBilling = alternateBilling;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PrintedReference[] printedReferences;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PrintedReference[] getPrintedReferences() {
    return this.printedReferences;
  }

  public void setPrintedReferences(be.e1.bssv.J564200.com.beone.fedex.beshipments.PrintedReference[] printedReferences) {
    this.printedReferences = printedReferences;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentRoleType role;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentRoleType getRole() {
    return this.role;
  }

  public void setRole(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentRoleType role) {
    this.role = role;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightCollectTermsType collectTermsType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightCollectTermsType getCollectTermsType() {
    return this.collectTermsType;
  }

  public void setCollectTermsType(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightCollectTermsType collectTermsType) {
    this.collectTermsType = collectTermsType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money declaredValuePerUnit;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getDeclaredValuePerUnit() {
    return this.declaredValuePerUnit;
  }

  public void setDeclaredValuePerUnit(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money declaredValuePerUnit) {
    this.declaredValuePerUnit = declaredValuePerUnit;
  }

  private java.lang.String declaredValueUnits;

  public java.lang.String getDeclaredValueUnits() {
    return this.declaredValueUnits;
  }

  public void setDeclaredValueUnits(java.lang.String declaredValueUnits) {
    this.declaredValueUnits = declaredValueUnits;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageDetail liabilityCoverageDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageDetail getLiabilityCoverageDetail() {
    return this.liabilityCoverageDetail;
  }

  public void setLiabilityCoverageDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageDetail liabilityCoverageDetail) {
    this.liabilityCoverageDetail = liabilityCoverageDetail;
  }

  private java.lang.String[] coupons;

  public java.lang.String[] getCoupons() {
    return this.coupons;
  }

  public void setCoupons(java.lang.String[] coupons) {
    this.coupons = coupons;
  }

  private java.math.BigInteger totalHandlingUnits;

  public java.math.BigInteger getTotalHandlingUnits() {
    return this.totalHandlingUnits;
  }

  public void setTotalHandlingUnits(java.math.BigInteger totalHandlingUnits) {
    this.totalHandlingUnits = totalHandlingUnits;
  }

  private java.math.BigDecimal clientDiscountPercent;

  public java.math.BigDecimal getClientDiscountPercent() {
    return this.clientDiscountPercent;
  }

  public void setClientDiscountPercent(java.math.BigDecimal clientDiscountPercent) {
    this.clientDiscountPercent = clientDiscountPercent;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight palletWeight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getPalletWeight() {
    return this.palletWeight;
  }

  public void setPalletWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight palletWeight) {
    this.palletWeight = palletWeight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions shipmentDimensions;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions getShipmentDimensions() {
    return this.shipmentDimensions;
  }

  public void setShipmentDimensions(be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions shipmentDimensions) {
    this.shipmentDimensions = shipmentDimensions;
  }

  private java.lang.String comment;

  public java.lang.String getComment() {
    return this.comment;
  }

  public void setComment(java.lang.String comment) {
    this.comment = comment;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightSpecialServicePayment[] specialServicePayments;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightSpecialServicePayment[] getSpecialServicePayments() {
    return this.specialServicePayments;
  }

  public void setSpecialServicePayments(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightSpecialServicePayment[] specialServicePayments) {
    this.specialServicePayments = specialServicePayments;
  }

  private java.lang.String hazardousMaterialsEmergencyContactNumber;

  public java.lang.String getHazardousMaterialsEmergencyContactNumber() {
    return this.hazardousMaterialsEmergencyContactNumber;
  }

  public void setHazardousMaterialsEmergencyContactNumber(java.lang.String hazardousMaterialsEmergencyContactNumber) {
    this.hazardousMaterialsEmergencyContactNumber = hazardousMaterialsEmergencyContactNumber;
  }

  private java.lang.String hazardousMaterialsOfferor;

  public java.lang.String getHazardousMaterialsOfferor() {
    return this.hazardousMaterialsOfferor;
  }

  public void setHazardousMaterialsOfferor(java.lang.String hazardousMaterialsOfferor) {
    this.hazardousMaterialsOfferor = hazardousMaterialsOfferor;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentLineItem[] lineItems;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentLineItem[] getLineItems() {
    return this.lineItems;
  }

  public void setLineItems(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentLineItem[] lineItems) {
    this.lineItems = lineItems;
  }

}
