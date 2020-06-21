/**
 * Generated from schema type t=LicenseOrPermitDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class LicenseOrPermitDetail implements java.io.Serializable {

  private java.lang.String number;

  public java.lang.String getNumber() {
    return this.number;
  }

  public void setNumber(java.lang.String number) {
    this.number = number;
  }

  private java.util.Calendar effectiveDate;

  public java.util.Calendar getEffectiveDate() {
    return this.effectiveDate;
  }

  public void setEffectiveDate(java.util.Calendar effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  private java.util.Calendar expirationDate;

  public java.util.Calendar getExpirationDate() {
    return this.expirationDate;
  }

  public void setExpirationDate(java.util.Calendar expirationDate) {
    this.expirationDate = expirationDate;
  }

}
