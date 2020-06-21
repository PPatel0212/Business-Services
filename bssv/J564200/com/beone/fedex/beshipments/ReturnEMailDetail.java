/**
 * Generated from schema type t=ReturnEMailDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ReturnEMailDetail implements java.io.Serializable {

  private java.lang.String merchantPhoneNumber;

  public java.lang.String getMerchantPhoneNumber() {
    return this.merchantPhoneNumber;
  }

  public void setMerchantPhoneNumber(java.lang.String merchantPhoneNumber) {
    this.merchantPhoneNumber = merchantPhoneNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailAllowedSpecialServiceType[] allowedSpecialServices;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailAllowedSpecialServiceType[] getAllowedSpecialServices() {
    return this.allowedSpecialServices;
  }

  public void setAllowedSpecialServices(be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailAllowedSpecialServiceType[] allowedSpecialServices) {
    this.allowedSpecialServices = allowedSpecialServices;
  }

}
