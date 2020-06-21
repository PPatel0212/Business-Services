/**
 * Generated from schema type t=CodReturnPackageDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CodReturnPackageDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money collectionAmount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getCollectionAmount() {
    return this.collectionAmount;
  }

  public void setCollectionAmount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money collectionAmount) {
    this.collectionAmount = collectionAmount;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAdjustmentType adjustmentType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAdjustmentType getAdjustmentType() {
    return this.adjustmentType;
  }

  public void setAdjustmentType(be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAdjustmentType adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  private java.lang.Boolean electronic;

  public java.lang.Boolean getElectronic() {
    return this.electronic;
  }

  public void setElectronic(java.lang.Boolean electronic) {
    this.electronic = electronic;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageBarcodes barcodes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageBarcodes getBarcodes() {
    return this.barcodes;
  }

  public void setBarcodes(be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageBarcodes barcodes) {
    this.barcodes = barcodes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument label;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument getLabel() {
    return this.label;
  }

  public void setLabel(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument label) {
    this.label = label;
  }

}
