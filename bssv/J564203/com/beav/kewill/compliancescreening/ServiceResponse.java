/**
 * Generated from schema type t|e=serviceResponse|t|e=CompiantScreeningResponse|d=CompiantScreeningResponse@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class ServiceResponse implements java.io.Serializable {

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.EmbargoResponse[] embargoResponse;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.EmbargoResponse[] getEmbargoResponse() {
    return this.embargoResponse;
  }

  public void setEmbargoResponse(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.EmbargoResponse[] embargoResponse) {
    this.embargoResponse = embargoResponse;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.PartyResponse[] partyResponse;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.PartyResponse[] getPartyResponse() {
    return this.partyResponse;
  }

  public void setPartyResponse(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.PartyResponse[] partyResponse) {
    this.partyResponse = partyResponse;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseResponse[] licenseResponse;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseResponse[] getLicenseResponse() {
    return this.licenseResponse;
  }

  public void setLicenseResponse(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseResponse[] licenseResponse) {
    this.licenseResponse = licenseResponse;
  }

}
