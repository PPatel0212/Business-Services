package be.e1.bssv.J560201.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WrkFlowReq_D5602000F
  extends ValueObject
  implements Serializable
{
  /**
   * Message ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STSKID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnMessageId = null;

  /**
   * Process Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56WLTP <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szProcessType = null;

  /**
   * Process Origin
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56WLTP <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szProcessOrigin = null;

  /**
   * Payload
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMAILMSG <br>
   * EnterpriseOne field length:  32000 <br>
   */
  private String szPayload = null;

  /**
   * Status Flag
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cStatusFlag = null;

  /**
   * Status Message
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMAILMSG <br>
   * EnterpriseOne field length:  32000 <br>
   */
  private String szStatusMessage = null;

  /**
   * Composite ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMAILMSG <br>
   * EnterpriseOne field length:  32000 <br>
   */
  private String szCompositeId = null;

  public void setMnMessageId(MathNumeric mnMessageId)
  {
    this.mnMessageId = mnMessageId;
  }

  public MathNumeric getMnMessageId()
  {
    return mnMessageId;
  }

  public void setSzProcessType(String szProcessType)
  {
    this.szProcessType = szProcessType;
  }

  public String getSzProcessType()
  {
    return szProcessType;
  }

  public void setSzProcessOrigin(String szProcessOrigin)
  {
    this.szProcessOrigin = szProcessOrigin;
  }

  public String getSzProcessOrigin()
  {
    return szProcessOrigin;
  }

  public void setSzPayload(String szPayload)
  {
    this.szPayload = szPayload;
  }

  public String getSzPayload()
  {
    return szPayload;
  }

  public void setCStatusFlag(String cStatusFlag)
  {
    this.cStatusFlag = cStatusFlag;
  }

  public String getCStatusFlag()
  {
    return cStatusFlag;
  }

  public void setSzStatusMessage(String szStatusMessage)
  {
    this.szStatusMessage = szStatusMessage;
  }

  public String getSzStatusMessage()
  {
    return szStatusMessage;
  }

  public void setSzCompositeId(String szCompositeId)
  {
    this.szCompositeId = szCompositeId;
  }

  public String getSzCompositeId()
  {
    return szCompositeId;
  }
}
