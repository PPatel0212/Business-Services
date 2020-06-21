/**
 * Generated from schema type t=PackageOperationalDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class PackageOperationalDetail implements java.io.Serializable {

  private java.lang.String astraHandlingText;

  public java.lang.String getAstraHandlingText() {
    return this.astraHandlingText;
  }

  public void setAstraHandlingText(java.lang.String astraHandlingText) {
    this.astraHandlingText = astraHandlingText;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.OperationalInstruction[] operationalInstructions;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.OperationalInstruction[] getOperationalInstructions() {
    return this.operationalInstructions;
  }

  public void setOperationalInstructions(be.e1.bssv.J564200.com.beone.fedex.beshipments.OperationalInstruction[] operationalInstructions) {
    this.operationalInstructions = operationalInstructions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageBarcodes barcodes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageBarcodes getBarcodes() {
    return this.barcodes;
  }

  public void setBarcodes(be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageBarcodes barcodes) {
    this.barcodes = barcodes;
  }

  private java.lang.String groundServiceCode;

  public java.lang.String getGroundServiceCode() {
    return this.groundServiceCode;
  }

  public void setGroundServiceCode(java.lang.String groundServiceCode) {
    this.groundServiceCode = groundServiceCode;
  }

}
