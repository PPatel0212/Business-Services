/**
 * Generated from schema type t|e=Administration|t|e=CompliantScreeningRequest|d=CompliantScreeningRequest@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class Administration implements java.io.Serializable {

  private java.lang.String ticket;

  public java.lang.String getTicket() {
    return this.ticket;
  }

  public void setTicket(java.lang.String ticket) {
    this.ticket = ticket;
  }

  private java.lang.String subscriberId;

  public java.lang.String getSubscriberId() {
    return this.subscriberId;
  }

  public void setSubscriberId(java.lang.String subscriberId) {
    this.subscriberId = subscriberId;
  }

  private java.lang.String subscriberPassword;

  public java.lang.String getSubscriberPassword() {
    return this.subscriberPassword;
  }

  public void setSubscriberPassword(java.lang.String subscriberPassword) {
    this.subscriberPassword = subscriberPassword;
  }

  private java.util.Calendar requestDate;

  public java.util.Calendar getRequestDate() {
    return this.requestDate;
  }

  public void setRequestDate(java.util.Calendar requestDate) {
    this.requestDate = requestDate;
  }

  private java.lang.String outputFormat;

  public java.lang.String getOutputFormat() {
    return this.outputFormat;
  }

  public void setOutputFormat(java.lang.String outputFormat) {
    this.outputFormat = outputFormat;
  }

  private java.lang.String includedRequest;

  public java.lang.String getIncludedRequest() {
    return this.includedRequest;
  }

  public void setIncludedRequest(java.lang.String includedRequest) {
    this.includedRequest = includedRequest;
  }

  private java.lang.String comments;

  public java.lang.String getComments() {
    return this.comments;
  }

  public void setComments(java.lang.String comments) {
    this.comments = comments;
  }

}
