/**
 * Generated from schema type t|e=ApprovalGatewayRequest|d=ApprovalGatewayRequest@http://www.beaerospace.com/ApprovalGateway
 */
package be.e1.bssv.J560201.com.beaerospace.approvalgateway;

public class ApprovalGatewayRequest implements java.io.Serializable {

  private int messageId;

  public int getMessageId() {
    return this.messageId;
  }

  public void setMessageId(int messageId) {
    this.messageId = messageId;
  }

  private java.lang.String processType;

  public java.lang.String getProcessType() {
    return this.processType;
  }

  public void setProcessType(java.lang.String processType) {
    this.processType = processType;
  }

  private java.lang.String originalProcess;

  public java.lang.String getOriginalProcess() {
    return this.originalProcess;
  }

  public void setOriginalProcess(java.lang.String originalProcess) {
    this.originalProcess = originalProcess;
  }

  private java.lang.String processPayload;

  public java.lang.String getProcessPayload() {
    return this.processPayload;
  }

  public void setProcessPayload(java.lang.String processPayload) {
    this.processPayload = processPayload;
  }

}
