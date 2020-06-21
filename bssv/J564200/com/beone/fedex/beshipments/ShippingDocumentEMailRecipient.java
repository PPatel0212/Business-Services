/**
 * Generated from schema type t=ShippingDocumentEMailRecipient@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShippingDocumentEMailRecipient implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipientType recipientType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipientType getRecipientType() {
    return this.recipientType;
  }

  public void setRecipientType(be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipientType recipientType) {
    this.recipientType = recipientType;
  }

  private java.lang.String address;

  public java.lang.String getAddress() {
    return this.address;
  }

  public void setAddress(java.lang.String address) {
    this.address = address;
  }

}
