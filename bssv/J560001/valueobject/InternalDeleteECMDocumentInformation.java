package be.e1.bssv.J560001.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalDeleteECMDocumentInformation extends ValueObject implements Serializable {
  /**
   * Action Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ACTION <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cActionType_ACTION = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorCode_ERRC = null;

  /**
   * Error Message Key
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EKEY <br>
   * EnterpriseOne field length:  4 <br>
   */
  private String szErrorMessageKey_EKEY = null;

  /**
   * Primary Object Attribute
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: ATRP <br>
   * EnterpriseOne field length:  6 <br>
   */
  private String szSystemIdentifier = null;
  
  /**
   * Session ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: SESSID <br>
   * EnterpriseOne field length:  32 <br>
   */
  private String szBarCodeID = null;

  public void setCActionType_ACTION(String cActionType_ACTION) {
    this.cActionType_ACTION = cActionType_ACTION;
  }

  public String getCActionType_ACTION() {
    return cActionType_ACTION;
  }

  public void setCErrorCode_ERRC(String cErrorCode_ERRC) {
    this.cErrorCode_ERRC = cErrorCode_ERRC;
  }

  public String getCErrorCode_ERRC() {
    return cErrorCode_ERRC;
  }

  public void setSzErrorMessageKey_EKEY(String szErrorMessageKey_EKEY) {
    this.szErrorMessageKey_EKEY = szErrorMessageKey_EKEY;
  }

  public String getSzErrorMessageKey_EKEY() {
    return szErrorMessageKey_EKEY;
  }

  public void setSzSystemIdentifier(String szSystemIdentifier) {
    this.szSystemIdentifier = szSystemIdentifier;
  }

  public String getSzSystemIdentifier() {
    return szSystemIdentifier;
  }

  public void setSzBarCodeID(String szBarCodeID) {
    this.szBarCodeID = szBarCodeID;
  }

  public String getSzBarCodeID() {
    return szBarCodeID;
  }
}
