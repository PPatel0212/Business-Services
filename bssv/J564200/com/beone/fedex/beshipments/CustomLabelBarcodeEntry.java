/**
 * Generated from schema type t=CustomLabelBarcodeEntry@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomLabelBarcodeEntry implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition position;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition getPosition() {
    return this.position;
  }

  public void setPosition(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition position) {
    this.position = position;
  }

  private java.lang.String format;

  public java.lang.String getFormat() {
    return this.format;
  }

  public void setFormat(java.lang.String format) {
    this.format = format;
  }

  private java.lang.String[] dataFields;

  public java.lang.String[] getDataFields() {
    return this.dataFields;
  }

  public void setDataFields(java.lang.String[] dataFields) {
    this.dataFields = dataFields;
  }

  private java.lang.Integer barHeight;

  public java.lang.Integer getBarHeight() {
    return this.barHeight;
  }

  public void setBarHeight(java.lang.Integer barHeight) {
    this.barHeight = barHeight;
  }

  private java.lang.Integer thinBarWidth;

  public java.lang.Integer getThinBarWidth() {
    return this.thinBarWidth;
  }

  public void setThinBarWidth(java.lang.Integer thinBarWidth) {
    this.thinBarWidth = thinBarWidth;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.BarcodeSymbologyType barcodeSymbology;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.BarcodeSymbologyType getBarcodeSymbology() {
    return this.barcodeSymbology;
  }

  public void setBarcodeSymbology(be.e1.bssv.J564200.com.beone.fedex.beshipments.BarcodeSymbologyType barcodeSymbology) {
    this.barcodeSymbology = barcodeSymbology;
  }

}
