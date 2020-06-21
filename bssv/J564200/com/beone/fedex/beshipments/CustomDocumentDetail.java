/**
 * Generated from schema type t=CustomDocumentDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomDocumentDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat getFormat() {
    return this.format;
  }

  public void setFormat(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format) {
    this.format = format;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelPrintingOrientationType labelPrintingOrientation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelPrintingOrientationType getLabelPrintingOrientation() {
    return this.labelPrintingOrientation;
  }

  public void setLabelPrintingOrientation(be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelPrintingOrientationType labelPrintingOrientation) {
    this.labelPrintingOrientation = labelPrintingOrientation;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelRotationType labelRotation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelRotationType getLabelRotation() {
    return this.labelRotation;
  }

  public void setLabelRotation(be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelRotationType labelRotation) {
    this.labelRotation = labelRotation;
  }

  private java.lang.String specificationId;

  public java.lang.String getSpecificationId() {
    return this.specificationId;
  }

  public void setSpecificationId(java.lang.String specificationId) {
    this.specificationId = specificationId;
  }

  private java.lang.String customDocumentIdentifier;

  public java.lang.String getCustomDocumentIdentifier() {
    return this.customDocumentIdentifier;
  }

  public void setCustomDocumentIdentifier(java.lang.String customDocumentIdentifier) {
    this.customDocumentIdentifier = customDocumentIdentifier;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent docTabContent;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent getDocTabContent() {
    return this.docTabContent;
  }

  public void setDocTabContent(be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent docTabContent) {
    this.docTabContent = docTabContent;
  }

}
