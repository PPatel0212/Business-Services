/**
 * Generated from schema type t=EMailNotificationRecipient@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class EMailNotificationRecipient implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipientType eMailNotificationRecipientType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipientType getEMailNotificationRecipientType() {
    return this.eMailNotificationRecipientType;
  }

  public void setEMailNotificationRecipientType(be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipientType eMailNotificationRecipientType) {
    this.eMailNotificationRecipientType = eMailNotificationRecipientType;
  }

  private java.lang.String eMailAddress;

  public java.lang.String getEMailAddress() {
    return this.eMailAddress;
  }

  public void setEMailAddress(java.lang.String eMailAddress) {
    this.eMailAddress = eMailAddress;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationEventType[] notificationEventsRequested;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationEventType[] getNotificationEventsRequested() {
    return this.notificationEventsRequested;
  }

  public void setNotificationEventsRequested(be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationEventType[] notificationEventsRequested) {
    this.notificationEventsRequested = notificationEventsRequested;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationFormatType format;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationFormatType getFormat() {
    return this.format;
  }

  public void setFormat(be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationFormatType format) {
    this.format = format;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization localization;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization getLocalization() {
    return this.localization;
  }

  public void setLocalization(be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization localization) {
    this.localization = localization;
  }

}
