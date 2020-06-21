package be.e1.bssv.util.J569805.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FTPFileStatusInternal extends ValueObject implements Serializable {
  /**
   * Unique Key ID (Internal)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UKID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnUniqueKeyIDInternal = null;

  /**
   * Status
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STATUS <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cStatus = null;

  /**
   * Data Field 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTA1 <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String szFMWErrorMessages = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DL01 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String szSourceSystem = null;
  
  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorFlag = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String szErrorDescription = null;

  public void setMnUniqueKeyIDInternal(MathNumeric mnUniqueKeyIDInternal) {
    this.mnUniqueKeyIDInternal = mnUniqueKeyIDInternal;
  }

  public MathNumeric getMnUniqueKeyIDInternal() {
    return mnUniqueKeyIDInternal;
  }

  public void setCStatus(String cStatus) {
    this.cStatus = cStatus;
  }

  public String getCStatus() {
    return cStatus;
  }

  public void setSzFMWErrorMessages(String szFMWErrorMessages) {
    this.szFMWErrorMessages = szFMWErrorMessages;
  }

  public String getSzFMWErrorMessages() {
    return szFMWErrorMessages;
  }

  public void setSzSourceSystem(String szSourceSystem) {
    this.szSourceSystem = szSourceSystem;
  }

  public String getSzSourceSystem() {
    return szSourceSystem;
  }

  public void setCErrorFlag(String cErrorFlag) {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag() {
    return cErrorFlag;
  }

  public void setSzErrorDescription(String szErrorDescription) {
    this.szErrorDescription = szErrorDescription;
  }

  public String getSzErrorDescription() {
    return szErrorDescription;
  }
}
