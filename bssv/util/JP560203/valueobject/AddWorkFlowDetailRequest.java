package be.e1.bssv.util.JP560203.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class AddWorkFlowDetailRequest
  extends ValueObject
  implements Serializable
{
  /**
   * Task ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STSKID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer MessageID = null;

  /**
   * Element 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ELM01 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String XmlTag = null;

  /**
   * Node Text
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: BTNTEXT <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String XmlData = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String programID = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorCode = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String description = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cSuppressErrorMessage = null;

  /**
   * TODO: Default public constructor for instantiating: AddWorkFlowDetailRequest
   */
  public AddWorkFlowDetailRequest()
  {
  }

  public void setMessageID(Integer MessageID)
  {
    this.MessageID = MessageID;
  }

  public Integer getMessageID()
  {
    return MessageID;
  }


  public void setXmlTag(String XmlTag)
  {
    this.XmlTag = XmlTag;
  }

  public String getXmlTag()
  {
    return XmlTag;
  }

  public void setXmlData(String XmlData)
  {
    this.XmlData = XmlData;
  }

  public String getXmlData()
  {
    return XmlData;
  }

  public void setProgramID(String programID)
  {
    this.programID = programID;
  }

  public String getProgramID()
  {
    return programID;
  }

  public void setErrorCode(String errorCode)
  {
    this.errorCode = errorCode;
  }

  public String getErrorCode()
  {
    return errorCode;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }

  public void setcSuppressErrorMessage(String cSuppressErrorMessage)
  {
    this.cSuppressErrorMessage = cSuppressErrorMessage;
  }

  public String getcSuppressErrorMessage()
  {
    return cSuppressErrorMessage;
  }
}
