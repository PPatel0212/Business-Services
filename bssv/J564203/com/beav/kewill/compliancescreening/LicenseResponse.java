/**
 * Generated from schema type t|e=licenseResponse|t|e=serviceResponse|t|e=CompiantScreeningResponse|d=CompiantScreeningResponse@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class LicenseResponse implements java.io.Serializable {

  private java.lang.String userDefined;

  public java.lang.String getUserDefined() {
    return this.userDefined;
  }

  public void setUserDefined(java.lang.String userDefined) {
    this.userDefined = userDefined;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseRequired licenseRequired;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseRequired getLicenseRequired() {
    return this.licenseRequired;
  }

  public void setLicenseRequired(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseRequired licenseRequired) {
    this.licenseRequired = licenseRequired;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseException licenseException;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseException getLicenseException() {
    return this.licenseException;
  }

  public void setLicenseException(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseException licenseException) {
    this.licenseException = licenseException;
  }

  private java.lang.String exceptionType;

  public java.lang.String getExceptionType() {
    return this.exceptionType;
  }

  public void setExceptionType(java.lang.String exceptionType) {
    this.exceptionType = exceptionType;
  }

}
