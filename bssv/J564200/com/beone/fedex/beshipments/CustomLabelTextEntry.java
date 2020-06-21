/**
 * Generated from schema type t=CustomLabelTextEntry@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomLabelTextEntry implements java.io.Serializable {

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

  private java.lang.String thermalFontId;

  public java.lang.String getThermalFontId() {
    return this.thermalFontId;
  }

  public void setThermalFontId(java.lang.String thermalFontId) {
    this.thermalFontId = thermalFontId;
  }

  private java.lang.String fontName;

  public java.lang.String getFontName() {
    return this.fontName;
  }

  public void setFontName(java.lang.String fontName) {
    this.fontName = fontName;
  }

  private java.math.BigInteger fontSize;

  public java.math.BigInteger getFontSize() {
    return this.fontSize;
  }

  public void setFontSize(java.math.BigInteger fontSize) {
    this.fontSize = fontSize;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RotationType rotation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RotationType getRotation() {
    return this.rotation;
  }

  public void setRotation(be.e1.bssv.J564200.com.beone.fedex.beshipments.RotationType rotation) {
    this.rotation = rotation;
  }

}
