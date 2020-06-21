/**
 * Generated from schema type t=Commodity@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Commodity implements java.io.Serializable {

  private java.lang.String name;

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private java.math.BigInteger numberOfPieces;

  public java.math.BigInteger getNumberOfPieces() {
    return this.numberOfPieces;
  }

  public void setNumberOfPieces(java.math.BigInteger numberOfPieces) {
    this.numberOfPieces = numberOfPieces;
  }

  private java.lang.String description;

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  private java.lang.String countryOfManufacture;

  public java.lang.String getCountryOfManufacture() {
    return this.countryOfManufacture;
  }

  public void setCountryOfManufacture(java.lang.String countryOfManufacture) {
    this.countryOfManufacture = countryOfManufacture;
  }

  private java.lang.String harmonizedCode;

  public java.lang.String getHarmonizedCode() {
    return this.harmonizedCode;
  }

  public void setHarmonizedCode(java.lang.String harmonizedCode) {
    this.harmonizedCode = harmonizedCode;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight weight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getWeight() {
    return this.weight;
  }

  public void setWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight weight) {
    this.weight = weight;
  }

  private java.math.BigInteger quantity;

  public java.math.BigInteger getQuantity() {
    return this.quantity;
  }

  public void setQuantity(java.math.BigInteger quantity) {
    this.quantity = quantity;
  }

  private java.lang.String quantityUnits;

  public java.lang.String getQuantityUnits() {
    return this.quantityUnits;
  }

  public void setQuantityUnits(java.lang.String quantityUnits) {
    this.quantityUnits = quantityUnits;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Measure[] additionalMeasures;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Measure[] getAdditionalMeasures() {
    return this.additionalMeasures;
  }

  public void setAdditionalMeasures(be.e1.bssv.J564200.com.beone.fedex.beshipments.Measure[] additionalMeasures) {
    this.additionalMeasures = additionalMeasures;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money unitPrice;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getUnitPrice() {
    return this.unitPrice;
  }

  public void setUnitPrice(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money unitPrice) {
    this.unitPrice = unitPrice;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money customsValue;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getCustomsValue() {
    return this.customsValue;
  }

  public void setCustomsValue(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money customsValue) {
    this.customsValue = customsValue;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtExciseCondition[] exciseConditions;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtExciseCondition[] getExciseConditions() {
    return this.exciseConditions;
  }

  public void setExciseConditions(be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtExciseCondition[] exciseConditions) {
    this.exciseConditions = exciseConditions;
  }

  private java.lang.String exportLicenseNumber;

  public java.lang.String getExportLicenseNumber() {
    return this.exportLicenseNumber;
  }

  public void setExportLicenseNumber(java.lang.String exportLicenseNumber) {
    this.exportLicenseNumber = exportLicenseNumber;
  }

  private java.util.Calendar exportLicenseExpirationDate;

  public java.util.Calendar getExportLicenseExpirationDate() {
    return this.exportLicenseExpirationDate;
  }

  public void setExportLicenseExpirationDate(java.util.Calendar exportLicenseExpirationDate) {
    this.exportLicenseExpirationDate = exportLicenseExpirationDate;
  }

  private java.lang.String cIMarksAndNumbers;

  public java.lang.String getCIMarksAndNumbers() {
    return this.cIMarksAndNumbers;
  }

  public void setCIMarksAndNumbers(java.lang.String cIMarksAndNumbers) {
    this.cIMarksAndNumbers = cIMarksAndNumbers;
  }

  private java.lang.String partNumber;

  public java.lang.String getPartNumber() {
    return this.partNumber;
  }

  public void setPartNumber(java.lang.String partNumber) {
    this.partNumber = partNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaCommodityDetail naftaDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaCommodityDetail getNaftaDetail() {
    return this.naftaDetail;
  }

  public void setNaftaDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaCommodityDetail naftaDetail) {
    this.naftaDetail = naftaDetail;
  }

}
