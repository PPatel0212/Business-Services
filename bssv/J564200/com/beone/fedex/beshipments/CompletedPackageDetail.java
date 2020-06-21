/**
 * Generated from schema type t=CompletedPackageDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CompletedPackageDetail implements java.io.Serializable {

  private java.math.BigInteger sequenceNumber;

  public java.math.BigInteger getSequenceNumber() {
    return this.sequenceNumber;
  }

  public void setSequenceNumber(java.math.BigInteger sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId[] trackingIds;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId[] getTrackingIds() {
    return this.trackingIds;
  }

  public void setTrackingIds(be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId[] trackingIds) {
    this.trackingIds = trackingIds;
  }

  private java.math.BigInteger groupNumber;

  public java.math.BigInteger getGroupNumber() {
    return this.groupNumber;
  }

  public void setGroupNumber(java.math.BigInteger groupNumber) {
    this.groupNumber = groupNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.OversizeClassType oversizeClass;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.OversizeClassType getOversizeClass() {
    return this.oversizeClass;
  }

  public void setOversizeClass(be.e1.bssv.J564200.com.beone.fedex.beshipments.OversizeClassType oversizeClass) {
    this.oversizeClass = oversizeClass;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageRating packageRating;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageRating getPackageRating() {
    return this.packageRating;
  }

  public void setPackageRating(be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageRating packageRating) {
    this.packageRating = packageRating;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageOperationalDetail operationalDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageOperationalDetail getOperationalDetail() {
    return this.operationalDetail;
  }

  public void setOperationalDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageOperationalDetail operationalDetail) {
    this.operationalDetail = operationalDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument label;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument getLabel() {
    return this.label;
  }

  public void setLabel(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument label) {
    this.label = label;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument[] packageDocuments;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument[] getPackageDocuments() {
    return this.packageDocuments;
  }

  public void setPackageDocuments(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument[] packageDocuments) {
    this.packageDocuments = packageDocuments;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CodReturnPackageDetail codReturnDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CodReturnPackageDetail getCodReturnDetail() {
    return this.codReturnDetail;
  }

  public void setCodReturnDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.CodReturnPackageDetail codReturnDetail) {
    this.codReturnDetail = codReturnDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionType signatureOption;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionType getSignatureOption() {
    return this.signatureOption;
  }

  public void setSignatureOption(be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionType signatureOption) {
    this.signatureOption = signatureOption;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight dryIceWeight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getDryIceWeight() {
    return this.dryIceWeight;
  }

  public void setDryIceWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight dryIceWeight) {
    this.dryIceWeight = dryIceWeight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousPackageDetail hazardousPackageDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousPackageDetail getHazardousPackageDetail() {
    return this.hazardousPackageDetail;
  }

  public void setHazardousPackageDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousPackageDetail hazardousPackageDetail) {
    this.hazardousPackageDetail = hazardousPackageDetail;
  }

}
