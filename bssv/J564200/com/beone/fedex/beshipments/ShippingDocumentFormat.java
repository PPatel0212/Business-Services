/**
 * Generated from schema type t=ShippingDocumentFormat@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShippingDocumentFormat implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail[] dispositions;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail[] getDispositions() {
    return this.dispositions;
  }

  public void setDispositions(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail[] dispositions) {
    this.dispositions = dispositions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearMeasure topOfPageOffset;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearMeasure getTopOfPageOffset() {
    return this.topOfPageOffset;
  }

  public void setTopOfPageOffset(be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearMeasure topOfPageOffset) {
    this.topOfPageOffset = topOfPageOffset;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType imageType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType getImageType() {
    return this.imageType;
  }

  public void setImageType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType imageType) {
    this.imageType = imageType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentStockType stockType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentStockType getStockType() {
    return this.stockType;
  }

  public void setStockType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentStockType stockType) {
    this.stockType = stockType;
  }

  private java.lang.Boolean provideInstructions;

  public java.lang.Boolean getProvideInstructions() {
    return this.provideInstructions;
  }

  public void setProvideInstructions(java.lang.Boolean provideInstructions) {
    this.provideInstructions = provideInstructions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization localization;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization getLocalization() {
    return this.localization;
  }

  public void setLocalization(be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization localization) {
    this.localization = localization;
  }

  private java.lang.String customDocumentIdentifier;

  public java.lang.String getCustomDocumentIdentifier() {
    return this.customDocumentIdentifier;
  }

  public void setCustomDocumentIdentifier(java.lang.String customDocumentIdentifier) {
    this.customDocumentIdentifier = customDocumentIdentifier;
  }

}
