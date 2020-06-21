/**
 * Generated from schema type t=CompletedHazardousShipmentDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CompletedHazardousShipmentDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousSummaryDetail hazardousSummaryDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousSummaryDetail getHazardousSummaryDetail() {
    return this.hazardousSummaryDetail;
  }

  public void setHazardousSummaryDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousSummaryDetail hazardousSummaryDetail) {
    this.hazardousSummaryDetail = hazardousSummaryDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentDryIceDetail dryIceDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentDryIceDetail getDryIceDetail() {
    return this.dryIceDetail;
  }

  public void setDryIceDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentDryIceDetail dryIceDetail) {
    this.dryIceDetail = dryIceDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.AdrLicenseDetail adrLicense;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.AdrLicenseDetail getAdrLicense() {
    return this.adrLicense;
  }

  public void setAdrLicense(be.e1.bssv.J564200.com.beone.fedex.beshipments.AdrLicenseDetail adrLicense) {
    this.adrLicense = adrLicense;
  }

}
