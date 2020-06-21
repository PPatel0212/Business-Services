/**
 * Generated from schema type t|e=ECNNotificationResponse|d=ECNNotificationResponse@http://www.beav.com/E1/ECNNotification
 */
package be.e1.bssv.J563004.com.beav.e1.ecnnotification;

public class ECNNotificationResponse implements java.io.Serializable {

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
