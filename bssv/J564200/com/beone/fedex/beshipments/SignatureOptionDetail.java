/**
 * Generated from schema type t=SignatureOptionDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class SignatureOptionDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionType optionType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionType getOptionType() {
    return this.optionType;
  }

  public void setOptionType(be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionType optionType) {
    this.optionType = optionType;
  }

  private java.lang.String signatureReleaseNumber;

  public java.lang.String getSignatureReleaseNumber() {
    return this.signatureReleaseNumber;
  }

  public void setSignatureReleaseNumber(java.lang.String signatureReleaseNumber) {
    this.signatureReleaseNumber = signatureReleaseNumber;
  }

}
