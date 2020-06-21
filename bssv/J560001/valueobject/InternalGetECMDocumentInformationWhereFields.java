package be.e1.bssv.J560001.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetECMDocumentInformationWhereFields extends ValueObject implements Serializable {
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
  
  private String mode = null;

  public void setF5600028_SESSID(String F5600028_SESSID) {
    this.F5600028_SESSID = F5600028_SESSID;
  }

  public String getF5600028_SESSID() {
    return F5600028_SESSID;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public String getMode() {
    return mode;
  }
}
