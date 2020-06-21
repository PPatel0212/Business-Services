/**
 * Generated from schema type t|e=partyResponse|t|e=serviceResponse|t|e=CompiantScreeningResponse|d=CompiantScreeningResponse@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class PartyResponse implements java.io.Serializable {

  private java.lang.String userDefined;

  public java.lang.String getUserDefined() {
    return this.userDefined;
  }

  public void setUserDefined(java.lang.String userDefined) {
    this.userDefined = userDefined;
  }

  private java.lang.String redFlagWords;

  public java.lang.String getRedFlagWords() {
    return this.redFlagWords;
  }

  public void setRedFlagWords(java.lang.String redFlagWords) {
    this.redFlagWords = redFlagWords;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.DeniedParties[] deniedParties;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.DeniedParties[] getDeniedParties() {
    return this.deniedParties;
  }

  public void setDeniedParties(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.DeniedParties[] deniedParties) {
    this.deniedParties = deniedParties;
  }

}
