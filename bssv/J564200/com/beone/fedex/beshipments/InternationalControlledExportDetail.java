/**
 * Generated from schema type t=InternationalControlledExportDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class InternationalControlledExportDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalControlledExportType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalControlledExportType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalControlledExportType type) {
    this.type = type;
  }

  private java.lang.String foreignTradeZoneCode;

  public java.lang.String getForeignTradeZoneCode() {
    return this.foreignTradeZoneCode;
  }

  public void setForeignTradeZoneCode(java.lang.String foreignTradeZoneCode) {
    this.foreignTradeZoneCode = foreignTradeZoneCode;
  }

  private java.lang.String entryNumber;

  public java.lang.String getEntryNumber() {
    return this.entryNumber;
  }

  public void setEntryNumber(java.lang.String entryNumber) {
    this.entryNumber = entryNumber;
  }

  private java.lang.String licenseOrPermitNumber;

  public java.lang.String getLicenseOrPermitNumber() {
    return this.licenseOrPermitNumber;
  }

  public void setLicenseOrPermitNumber(java.lang.String licenseOrPermitNumber) {
    this.licenseOrPermitNumber = licenseOrPermitNumber;
  }

  private java.util.Calendar licenseOrPermitExpirationDate;

  public java.util.Calendar getLicenseOrPermitExpirationDate() {
    return this.licenseOrPermitExpirationDate;
  }

  public void setLicenseOrPermitExpirationDate(java.util.Calendar licenseOrPermitExpirationDate) {
    this.licenseOrPermitExpirationDate = licenseOrPermitExpirationDate;
  }

}
