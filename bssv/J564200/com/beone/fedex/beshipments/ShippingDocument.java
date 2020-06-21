/**
 * Generated from schema type t=ShippingDocument@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShippingDocument implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedShippingDocumentType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedShippingDocumentType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedShippingDocumentType type) {
    this.type = type;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentGroupingType grouping;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentGroupingType getGrouping() {
    return this.grouping;
  }

  public void setGrouping(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentGroupingType grouping) {
    this.grouping = grouping;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionType shippingDocumentDisposition;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionType getShippingDocumentDisposition() {
    return this.shippingDocumentDisposition;
  }

  public void setShippingDocumentDisposition(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionType shippingDocumentDisposition) {
    this.shippingDocumentDisposition = shippingDocumentDisposition;
  }

  private java.lang.String accessReference;

  public java.lang.String getAccessReference() {
    return this.accessReference;
  }

  public void setAccessReference(java.lang.String accessReference) {
    this.accessReference = accessReference;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType imageType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType getImageType() {
    return this.imageType;
  }

  public void setImageType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType imageType) {
    this.imageType = imageType;
  }

  private java.math.BigInteger resolution;

  public java.math.BigInteger getResolution() {
    return this.resolution;
  }

  public void setResolution(java.math.BigInteger resolution) {
    this.resolution = resolution;
  }

  private java.math.BigInteger copiesToPrint;

  public java.math.BigInteger getCopiesToPrint() {
    return this.copiesToPrint;
  }

  public void setCopiesToPrint(java.math.BigInteger copiesToPrint) {
    this.copiesToPrint = copiesToPrint;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPart[] parts;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPart[] getParts() {
    return this.parts;
  }

  public void setParts(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPart[] parts) {
    this.parts = parts;
  }

}
