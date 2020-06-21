/**
 * Generated from schema type t=ShipmentReply@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShipmentReply implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType highestSeverity;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType getHighestSeverity() {
    return this.highestSeverity;
  }

  public void setHighestSeverity(be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType highestSeverity) {
    this.highestSeverity = highestSeverity;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Notification[] notifications;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Notification[] getNotifications() {
    return this.notifications;
  }

  public void setNotifications(be.e1.bssv.J564200.com.beone.fedex.beshipments.Notification[] notifications) {
    this.notifications = notifications;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail transactionDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail getTransactionDetail() {
    return this.transactionDetail;
  }

  public void setTransactionDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail transactionDetail) {
    this.transactionDetail = transactionDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId version;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId getVersion() {
    return this.version;
  }

  public void setVersion(be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId version) {
    this.version = version;
  }

}
