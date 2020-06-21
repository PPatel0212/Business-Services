/**
 * Generated from schema type t|e=ItemBOMNotificationResponse|d=ItemBOMNotificationResponse@http://www.beav.com/plm/itembomnotification
 */
package be.e1.bssv.J563000.com.beav.plm.itembomnotification;

public class ItemBOMNotificationResponse implements java.io.Serializable {

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
