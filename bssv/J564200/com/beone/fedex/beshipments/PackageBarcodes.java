/**
 * Generated from schema type t=PackageBarcodes@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class PackageBarcodes implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcode[] binaryBarcodes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcode[] getBinaryBarcodes() {
    return this.binaryBarcodes;
  }

  public void setBinaryBarcodes(be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcode[] binaryBarcodes) {
    this.binaryBarcodes = binaryBarcodes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.StringBarcode[] stringBarcodes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.StringBarcode[] getStringBarcodes() {
    return this.stringBarcodes;
  }

  public void setStringBarcodes(be.e1.bssv.J564200.com.beone.fedex.beshipments.StringBarcode[] stringBarcodes) {
    this.stringBarcodes = stringBarcodes;
  }

}
