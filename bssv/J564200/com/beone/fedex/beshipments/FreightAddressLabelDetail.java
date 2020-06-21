/**
 * Generated from schema type t=FreightAddressLabelDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class FreightAddressLabelDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat getFormat() {
    return this.format;
  }

  public void setFormat(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format) {
    this.format = format;
  }

  private java.math.BigInteger copies;

  public java.math.BigInteger getCopies() {
    return this.copies;
  }

  public void setCopies(java.math.BigInteger copies) {
    this.copies = copies;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PageQuadrantType startingPosition;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PageQuadrantType getStartingPosition() {
    return this.startingPosition;
  }

  public void setStartingPosition(be.e1.bssv.J564200.com.beone.fedex.beshipments.PageQuadrantType startingPosition) {
    this.startingPosition = startingPosition;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent docTabContent;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent getDocTabContent() {
    return this.docTabContent;
  }

  public void setDocTabContent(be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent docTabContent) {
    this.docTabContent = docTabContent;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RelativeVerticalPositionType customContentPosition;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RelativeVerticalPositionType getCustomContentPosition() {
    return this.customContentPosition;
  }

  public void setCustomContentPosition(be.e1.bssv.J564200.com.beone.fedex.beshipments.RelativeVerticalPositionType customContentPosition) {
    this.customContentPosition = customContentPosition;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail customContent;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail getCustomContent() {
    return this.customContent;
  }

  public void setCustomContent(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail customContent) {
    this.customContent = customContent;
  }

}
