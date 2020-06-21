/**
 * Generated from schema type t=CodDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CodDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money codCollectionAmount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getCodCollectionAmount() {
    return this.codCollectionAmount;
  }

  public void setCodCollectionAmount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money codCollectionAmount) {
    this.codCollectionAmount = codCollectionAmount;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAddTransportationChargesDetail addTransportationChargesDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAddTransportationChargesDetail getAddTransportationChargesDetail() {
    return this.addTransportationChargesDetail;
  }

  public void setAddTransportationChargesDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAddTransportationChargesDetail addTransportationChargesDetail) {
    this.addTransportationChargesDetail = addTransportationChargesDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CodCollectionType collectionType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CodCollectionType getCollectionType() {
    return this.collectionType;
  }

  public void setCollectionType(be.e1.bssv.J564200.com.beone.fedex.beshipments.CodCollectionType collectionType) {
    this.collectionType = collectionType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Party codRecipient;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Party getCodRecipient() {
    return this.codRecipient;
  }

  public void setCodRecipient(be.e1.bssv.J564200.com.beone.fedex.beshipments.Party codRecipient) {
    this.codRecipient = codRecipient;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress financialInstitutionContactAndAddress;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress getFinancialInstitutionContactAndAddress() {
    return this.financialInstitutionContactAndAddress;
  }

  public void setFinancialInstitutionContactAndAddress(be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress financialInstitutionContactAndAddress) {
    this.financialInstitutionContactAndAddress = financialInstitutionContactAndAddress;
  }

  private java.lang.String remitToName;

  public java.lang.String getRemitToName() {
    return this.remitToName;
  }

  public void setRemitToName(java.lang.String remitToName) {
    this.remitToName = remitToName;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CodReturnReferenceIndicatorType referenceIndicator;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CodReturnReferenceIndicatorType getReferenceIndicator() {
    return this.referenceIndicator;
  }

  public void setReferenceIndicator(be.e1.bssv.J564200.com.beone.fedex.beshipments.CodReturnReferenceIndicatorType referenceIndicator) {
    this.referenceIndicator = referenceIndicator;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId returnTrackingId;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId getReturnTrackingId() {
    return this.returnTrackingId;
  }

  public void setReturnTrackingId(be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId returnTrackingId) {
    this.returnTrackingId = returnTrackingId;
  }

}
