/**
 * Generated from schema type t=CertificateOfOriginDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CertificateOfOriginDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat documentFormat;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat getDocumentFormat() {
    return this.documentFormat;
  }

  public void setDocumentFormat(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat documentFormat) {
    this.documentFormat = documentFormat;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] customerImageUsages;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] getCustomerImageUsages() {
    return this.customerImageUsages;
  }

  public void setCustomerImageUsages(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] customerImageUsages) {
    this.customerImageUsages = customerImageUsages;
  }

}
