/**
 * Generated from schema type t=Op900Detail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Op900Detail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat getFormat() {
    return this.format;
  }

  public void setFormat(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format) {
    this.format = format;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReferenceType reference;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReferenceType getReference() {
    return this.reference;
  }

  public void setReference(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReferenceType reference) {
    this.reference = reference;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] customerImageUsages;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] getCustomerImageUsages() {
    return this.customerImageUsages;
  }

  public void setCustomerImageUsages(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] customerImageUsages) {
    this.customerImageUsages = customerImageUsages;
  }

  private java.lang.String signatureName;

  public java.lang.String getSignatureName() {
    return this.signatureName;
  }

  public void setSignatureName(java.lang.String signatureName) {
    this.signatureName = signatureName;
  }

}
