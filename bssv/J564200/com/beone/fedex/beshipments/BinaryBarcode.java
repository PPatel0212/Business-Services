/**
 * Generated from schema type t=BinaryBarcode@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class BinaryBarcode implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcodeType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcodeType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcodeType type) {
    this.type = type;
  }

  private java.lang.String value;

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

}
