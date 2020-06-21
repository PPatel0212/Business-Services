/**
 * Generated from schema type t|e=BEStatus|t=ProcessShipmentReply@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class BEStatus implements java.io.Serializable {

  private java.math.BigInteger statusCode;

  public java.math.BigInteger getStatusCode() {
    return this.statusCode;
  }

  public void setStatusCode(java.math.BigInteger statusCode) {
    this.statusCode = statusCode;
  }

  private java.lang.String statusMessage;

  public java.lang.String getStatusMessage() {
    return this.statusMessage;
  }

  public void setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
  }

}
