/**
 * Generated from schema type t=LabelSpecification@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class LabelSpecification implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail[] dispositions;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail[] getDispositions() {
    return this.dispositions;
  }

  public void setDispositions(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail[] dispositions) {
    this.dispositions = dispositions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelFormatType labelFormatType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelFormatType getLabelFormatType() {
    return this.labelFormatType;
  }

  public void setLabelFormatType(be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelFormatType labelFormatType) {
    this.labelFormatType = labelFormatType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType imageType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType getImageType() {
    return this.imageType;
  }

  public void setImageType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType imageType) {
    this.imageType = imageType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelStockType labelStockType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelStockType getLabelStockType() {
    return this.labelStockType;
  }

  public void setLabelStockType(be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelStockType labelStockType) {
    this.labelStockType = labelStockType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelPrintingOrientationType labelPrintingOrientation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelPrintingOrientationType getLabelPrintingOrientation() {
    return this.labelPrintingOrientation;
  }

  public void setLabelPrintingOrientation(be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelPrintingOrientationType labelPrintingOrientation) {
    this.labelPrintingOrientation = labelPrintingOrientation;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress printedLabelOrigin;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress getPrintedLabelOrigin() {
    return this.printedLabelOrigin;
  }

  public void setPrintedLabelOrigin(be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress printedLabelOrigin) {
    this.printedLabelOrigin = printedLabelOrigin;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerSpecifiedLabelDetail customerSpecifiedDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerSpecifiedLabelDetail getCustomerSpecifiedDetail() {
    return this.customerSpecifiedDetail;
  }

  public void setCustomerSpecifiedDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerSpecifiedLabelDetail customerSpecifiedDetail) {
    this.customerSpecifiedDetail = customerSpecifiedDetail;
  }

}
