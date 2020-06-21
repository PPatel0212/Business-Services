/**
 * Generated from schema type t=DangerousGoodsShippersDeclarationDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class DangerousGoodsShippersDeclarationDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat getFormat() {
    return this.format;
  }

  public void setFormat(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format) {
    this.format = format;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] customerImageUsages;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] getCustomerImageUsages() {
    return this.customerImageUsages;
  }

  public void setCustomerImageUsages(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] customerImageUsages) {
    this.customerImageUsages = customerImageUsages;
  }

}
