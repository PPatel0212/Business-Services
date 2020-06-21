/**
 * Generated from schema type t=ShippingDocumentDispositionDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShippingDocumentDispositionDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionType dispositionType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionType getDispositionType() {
    return this.dispositionType;
  }

  public void setDispositionType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionType dispositionType) {
    this.dispositionType = dispositionType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentGroupingType grouping;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentGroupingType getGrouping() {
    return this.grouping;
  }

  public void setGrouping(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentGroupingType grouping) {
    this.grouping = grouping;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailDetail eMailDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailDetail getEMailDetail() {
    return this.eMailDetail;
  }

  public void setEMailDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailDetail eMailDetail) {
    this.eMailDetail = eMailDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPrintDetail printDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPrintDetail getPrintDetail() {
    return this.printDetail;
  }

  public void setPrintDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPrintDetail printDetail) {
    this.printDetail = printDetail;
  }

}
