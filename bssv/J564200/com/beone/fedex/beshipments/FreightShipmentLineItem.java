/**
 * Generated from schema type t=FreightShipmentLineItem@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class FreightShipmentLineItem implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType freightClass;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType getFreightClass() {
    return this.freightClass;
  }

  public void setFreightClass(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType freightClass) {
    this.freightClass = freightClass;
  }

  private java.lang.Boolean classProvidedByCustomer;

  public java.lang.Boolean getClassProvidedByCustomer() {
    return this.classProvidedByCustomer;
  }

  public void setClassProvidedByCustomer(java.lang.Boolean classProvidedByCustomer) {
    this.classProvidedByCustomer = classProvidedByCustomer;
  }

  private java.math.BigInteger handlingUnits;

  public java.math.BigInteger getHandlingUnits() {
    return this.handlingUnits;
  }

  public void setHandlingUnits(java.math.BigInteger handlingUnits) {
    this.handlingUnits = handlingUnits;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalPackagingType packaging;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalPackagingType getPackaging() {
    return this.packaging;
  }

  public void setPackaging(be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalPackagingType packaging) {
    this.packaging = packaging;
  }

  private java.math.BigInteger pieces;

  public java.math.BigInteger getPieces() {
    return this.pieces;
  }

  public void setPieces(java.math.BigInteger pieces) {
    this.pieces = pieces;
  }

  private java.lang.String nmfcCode;

  public java.lang.String getNmfcCode() {
    return this.nmfcCode;
  }

  public void setNmfcCode(java.lang.String nmfcCode) {
    this.nmfcCode = nmfcCode;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionType hazardousMaterials;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionType getHazardousMaterials() {
    return this.hazardousMaterials;
  }

  public void setHazardousMaterials(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionType hazardousMaterials) {
    this.hazardousMaterials = hazardousMaterials;
  }

  private java.lang.String purchaseOrderNumber;

  public java.lang.String getPurchaseOrderNumber() {
    return this.purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(java.lang.String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  private java.lang.String description;

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight weight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getWeight() {
    return this.weight;
  }

  public void setWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight weight) {
    this.weight = weight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions dimensions;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions getDimensions() {
    return this.dimensions;
  }

  public void setDimensions(be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Volume volume;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Volume getVolume() {
    return this.volume;
  }

  public void setVolume(be.e1.bssv.J564200.com.beone.fedex.beshipments.Volume volume) {
    this.volume = volume;
  }

}
