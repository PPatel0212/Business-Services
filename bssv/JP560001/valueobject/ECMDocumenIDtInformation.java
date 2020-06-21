package be.e1.bssv.JP560001.valueobject;

import be.e1.bssv.J560001.valueobject.InternalShowECMDocumentInformation;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ECMDocumenIDtInformation extends ValueObject implements Serializable {
  /**
   * Session ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: SESSID <br>
   * EnterpriseOne field length:  32 <br>
   */
  private String sessionID = null;

  /**
   * Generic String x 20
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GS2A <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String szFieldName = null;

  /**
   * Generic String x 50
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GS5A <br>
   * EnterpriseOne field length:  50 <br>
   */
  private String szDataValue = null;


  /**
   * TODO: Default public constructor for instantiating: ECMDocumenIDtInformation
   */
  public ECMDocumenIDtInformation() {
  }

  public ECMDocumenIDtInformation(InternalShowECMDocumentInformation internalVO) {
   
    this.setSessionID(internalVO.getF5600028_SESSID());
    this.setSzFieldName(internalVO.getF5600028_GS2A());
    this.setSzDataValue(internalVO.getF5600028_GS5A()); 

  }

  public void setSessionID(String sessionID) {
    this.sessionID = sessionID;
  }

  public String getSessionID() {
    return sessionID;
  }

  public void setSzFieldName(String szFieldName) {
    this.szFieldName = szFieldName;
  }

  public String getSzFieldName() {
    return szFieldName;
  }

  public void setSzDataValue(String szDataValue) {
    this.szDataValue = szDataValue;
  }

  public String getSzDataValue() {
    return szDataValue;
  }


}
