/**
 * Generated from schema type t|e=product|t|e=TransactionLine|t|e=TransactionRequest|t|e=CompliantScreeningRequest|d=CompliantScreeningRequest@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class Product implements java.io.Serializable {

  private java.lang.String productId;

  public java.lang.String getProductId() {
    return this.productId;
  }

  public void setProductId(java.lang.String productId) {
    this.productId = productId;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CountryOfOrigin countryOfOrigin;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CountryOfOrigin getCountryOfOrigin() {
    return this.countryOfOrigin;
  }

  public void setCountryOfOrigin(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CountryOfOrigin countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  private java.lang.String value;

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  private java.lang.String endUseType;

  public java.lang.String getEndUseType() {
    return this.endUseType;
  }

  public void setEndUseType(java.lang.String endUseType) {
    this.endUseType = endUseType;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classifier_Element1 classifier;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classifier_Element1 getClassifier() {
    return this.classifier;
  }

  public void setClassifier(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classifier_Element1 classifier) {
    this.classifier = classifier;
  }

  private java.lang.String licenseException;

  public java.lang.String getLicenseException() {
    return this.licenseException;
  }

  public void setLicenseException(java.lang.String licenseException) {
    this.licenseException = licenseException;
  }

  private java.lang.String encryption;

  public java.lang.String getEncryption() {
    return this.encryption;
  }

  public void setEncryption(java.lang.String encryption) {
    this.encryption = encryption;
  }

}
