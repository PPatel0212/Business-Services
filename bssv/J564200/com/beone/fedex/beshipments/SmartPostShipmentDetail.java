/**
 * Generated from schema type t=SmartPostShipmentDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class SmartPostShipmentDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostIndiciaType indicia;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostIndiciaType getIndicia() {
    return this.indicia;
  }

  public void setIndicia(be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostIndiciaType indicia) {
    this.indicia = indicia;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostAncillaryEndorsementType ancillaryEndorsement;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostAncillaryEndorsementType getAncillaryEndorsement() {
    return this.ancillaryEndorsement;
  }

  public void setAncillaryEndorsement(be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostAncillaryEndorsementType ancillaryEndorsement) {
    this.ancillaryEndorsement = ancillaryEndorsement;
  }

  private java.lang.String hubId;

  public java.lang.String getHubId() {
    return this.hubId;
  }

  public void setHubId(java.lang.String hubId) {
    this.hubId = hubId;
  }

  private java.lang.String customerManifestId;

  public java.lang.String getCustomerManifestId() {
    return this.customerManifestId;
  }

  public void setCustomerManifestId(java.lang.String customerManifestId) {
    this.customerManifestId = customerManifestId;
  }

}
