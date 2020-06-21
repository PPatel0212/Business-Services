package be.e1.bssv.J560001.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowECMDocumentInformation extends ValueObject implements Serializable {
  /**
   * Session ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: SESSID <br>
   * EnterpriseOne field length:  32 <br>
   */
  private String F5600028_SESSID = null;

  /**
   * Generic String x 20
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GS2A <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F5600028_GS2A = null;

  /**
   * Generic String x 50
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GS5A <br>
   * EnterpriseOne field length:  50 <br>
   */
  private String F5600028_GS5A = null;
  
  private String erroCode = null;
    
    private String errorDescription = null;


  public void setF5600028_SESSID(String F5600028_SESSID) {
    this.F5600028_SESSID = F5600028_SESSID;
  }

  public String getF5600028_SESSID() {
    return F5600028_SESSID;
  }

  public void setF5600028_GS2A(String F5600028_GS2A) {
    this.F5600028_GS2A = F5600028_GS2A;
  }

  public String getF5600028_GS2A() {
    return F5600028_GS2A;
  }

  public void setF5600028_GS5A(String F5600028_GS5A) {
    this.F5600028_GS5A = F5600028_GS5A;
  }

  public String getF5600028_GS5A() {
    return F5600028_GS5A;
  }


  public void setErroCode(String erroCode) {
    this.erroCode = erroCode;
  }

  public String getErroCode() {
    return erroCode;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public String getErrorDescription() {
    return errorDescription;
  }
}
