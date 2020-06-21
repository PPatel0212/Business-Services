/**
 * Generated from schema type t=Notification@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Notification implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType severity;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType getSeverity() {
    return this.severity;
  }

  public void setSeverity(be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationSeverityType severity) {
    this.severity = severity;
  }

  private java.lang.String source;

  public java.lang.String getSource() {
    return this.source;
  }

  public void setSource(java.lang.String source) {
    this.source = source;
  }

  private java.lang.String code;

  public java.lang.String getCode() {
    return this.code;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  private java.lang.String message;

  public java.lang.String getMessage() {
    return this.message;
  }

  public void setMessage(java.lang.String message) {
    this.message = message;
  }

  private java.lang.String localizedMessage;

  public java.lang.String getLocalizedMessage() {
    return this.localizedMessage;
  }

  public void setLocalizedMessage(java.lang.String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationParameter[] messageParameters;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationParameter[] getMessageParameters() {
    return this.messageParameters;
  }

  public void setMessageParameters(be.e1.bssv.J564200.com.beone.fedex.beshipments.NotificationParameter[] messageParameters) {
    this.messageParameters = messageParameters;
  }

}
