/**
 * Generated from schema type t=EMailNotificationDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class EMailNotificationDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationAggregationType aggregationType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationAggregationType getAggregationType() {
    return this.aggregationType;
  }

  public void setAggregationType(be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationAggregationType aggregationType) {
    this.aggregationType = aggregationType;
  }

  private java.lang.String personalMessage;

  public java.lang.String getPersonalMessage() {
    return this.personalMessage;
  }

  public void setPersonalMessage(java.lang.String personalMessage) {
    this.personalMessage = personalMessage;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipient[] recipients;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipient[] getRecipients() {
    return this.recipients;
  }

  public void setRecipients(be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationRecipient[] recipients) {
    this.recipients = recipients;
  }

}
