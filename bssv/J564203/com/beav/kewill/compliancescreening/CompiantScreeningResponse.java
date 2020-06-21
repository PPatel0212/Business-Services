/**
 * Generated from schema type t|e=CompiantScreeningResponse|d=CompiantScreeningResponse@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class CompiantScreeningResponse implements java.io.Serializable {

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

  private boolean compliant;

  public boolean getCompliant() {
    return this.compliant;
  }

  public boolean isCompliant() {
    return this.compliant;
  }

  public void setCompliant(boolean compliant) {
    this.compliant = compliant;
  }

  private java.lang.String[] denialType;

  public java.lang.String[] getDenialType() {
    return this.denialType;
  }

  public void setDenialType(java.lang.String[] denialType) {
    this.denialType = denialType;
  }

  private java.lang.String denailMessage;

  public java.lang.String getDenailMessage() {
    return this.denailMessage;
  }

  public void setDenailMessage(java.lang.String denailMessage) {
    this.denailMessage = denailMessage;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ServiceResponse serviceResponse;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ServiceResponse getServiceResponse() {
    return this.serviceResponse;
  }

  public void setServiceResponse(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ServiceResponse serviceResponse) {
    this.serviceResponse = serviceResponse;
  }

}
