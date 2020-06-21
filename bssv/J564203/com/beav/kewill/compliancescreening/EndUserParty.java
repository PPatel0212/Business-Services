/**
 * Generated from schema type t|e=endUserParty|t|e=party|t|e=TransactionRequest|t|e=CompliantScreeningRequest|d=CompliantScreeningRequest@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class EndUserParty implements java.io.Serializable {

  private java.lang.String endUser;

  public java.lang.String getEndUser() {
    return this.endUser;
  }

  public void setEndUser(java.lang.String endUser) {
    this.endUser = endUser;
  }

  private java.lang.String military;

  public java.lang.String getMilitary() {
    return this.military;
  }

  public void setMilitary(java.lang.String military) {
    this.military = military;
  }

  private java.lang.String endUserCertificate;

  public java.lang.String getEndUserCertificate() {
    return this.endUserCertificate;
  }

  public void setEndUserCertificate(java.lang.String endUserCertificate) {
    this.endUserCertificate = endUserCertificate;
  }

  private java.lang.String nonUSGovernment;

  public java.lang.String getNonUSGovernment() {
    return this.nonUSGovernment;
  }

  public void setNonUSGovernment(java.lang.String nonUSGovernment) {
    this.nonUSGovernment = nonUSGovernment;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Descriptor_Element1[] descriptor;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Descriptor_Element1[] getDescriptor() {
    return this.descriptor;
  }

  public void setDescriptor(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Descriptor_Element1[] descriptor) {
    this.descriptor = descriptor;
  }

}
