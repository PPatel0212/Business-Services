/**
 * Generated from schema type t=CustomLabelGraphicEntry@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomLabelGraphicEntry implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition position;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition getPosition() {
    return this.position;
  }

  public void setPosition(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition position) {
    this.position = position;
  }

  private java.lang.String printerGraphicId;

  public java.lang.String getPrinterGraphicId() {
    return this.printerGraphicId;
  }

  public void setPrinterGraphicId(java.lang.String printerGraphicId) {
    this.printerGraphicId = printerGraphicId;
  }

  private java.lang.String fileGraphicFullName;

  public java.lang.String getFileGraphicFullName() {
    return this.fileGraphicFullName;
  }

  public void setFileGraphicFullName(java.lang.String fileGraphicFullName) {
    this.fileGraphicFullName = fileGraphicFullName;
  }

}
