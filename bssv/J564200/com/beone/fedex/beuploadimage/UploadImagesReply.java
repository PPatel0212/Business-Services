/**
 * Generated from schema type t=UploadImagesReply@http://www.beone.com/fedex/beuploadimage
 */
package be.e1.bssv.J564200.com.beone.fedex.beuploadimage;

public class UploadImagesReply implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.NotificationSeverityType highestSeverity;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.NotificationSeverityType getHighestSeverity() {
    return this.highestSeverity;
  }

  public void setHighestSeverity(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.NotificationSeverityType highestSeverity) {
    this.highestSeverity = highestSeverity;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Notification[] notifications;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Notification[] getNotifications() {
    return this.notifications;
  }

  public void setNotifications(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Notification[] notifications) {
    this.notifications = notifications;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail transactionDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail getTransactionDetail() {
    return this.transactionDetail;
  }

  public void setTransactionDetail(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail transactionDetail) {
    this.transactionDetail = transactionDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId version;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId getVersion() {
    return this.version;
  }

  public void setVersion(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId version) {
    this.version = version;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageUploadStatusDetail[] imageStatuses;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageUploadStatusDetail[] getImageStatuses() {
    return this.imageStatuses;
  }

  public void setImageStatuses(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageUploadStatusDetail[] imageStatuses) {
    this.imageStatuses = imageStatuses;
  }

}
