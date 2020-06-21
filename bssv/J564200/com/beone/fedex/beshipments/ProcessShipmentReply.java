/**
 * Generated from schema type t=ProcessShipmentReply@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ProcessShipmentReply implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType highestSeverity;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType getHighestSeverity() {
    return this.highestSeverity;
  }

  public void setHighestSeverity(be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType highestSeverity) {
    this.highestSeverity = highestSeverity;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.BEStatus bEStatus;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.BEStatus getBEStatus() {
    return this.bEStatus;
  }

  public void setBEStatus(be.e1.bssv.J564200.com.beone.fedex.beshipments.BEStatus bEStatus) {
    this.bEStatus = bEStatus;
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

  private java.lang.String jobId;

  public java.lang.String getJobId() {
    return this.jobId;
  }

  public void setJobId(java.lang.String jobId) {
    this.jobId = jobId;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedShipmentDetail completedShipmentDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedShipmentDetail getCompletedShipmentDetail() {
    return this.completedShipmentDetail;
  }

  public void setCompletedShipmentDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedShipmentDetail completedShipmentDetail) {
    this.completedShipmentDetail = completedShipmentDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument[] errorLabels;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument[] getErrorLabels() {
    return this.errorLabels;
  }

  public void setErrorLabels(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument[] errorLabels) {
    this.errorLabels = errorLabels;
  }

}
