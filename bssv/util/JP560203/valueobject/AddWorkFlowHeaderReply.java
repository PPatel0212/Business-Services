package be.e1.bssv.util.JP560203.valueobject;

import be.e1.bssv.util.J560203.valueobject.BE_AddWorkFlowHeader_D5602000B;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class AddWorkFlowHeaderReply
  extends MessageValueObject
  implements Serializable
{
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
  private Integer MessageID = null;
  private Integer groupNumber = null;

  /**
   * TODO: Default public constructor for instantiating: AddWorkFlowHeaderReply
   */
  public AddWorkFlowHeaderReply()
  {
  }

  public AddWorkFlowHeaderReply(BE_AddWorkFlowHeader_D5602000B vo)
  {
    this.setErrorCode(vo.getCErrorFlag());
    this.setDescription(vo.getSzErrorMessage());
    this.setGroupNumber(new Integer (vo.getMnGroupId().intValue()));
    this.setMessageID(new Integer(vo.getMnMessageId().intValue()));
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

  public void setMessageID(Integer MessageID)
  {
    this.MessageID = MessageID;
  }

  public Integer getMessageID()
  {
    return MessageID;
  }

  public void setGroupNumber(Integer groupNumber)
  {
    this.groupNumber = groupNumber;
  }

  public Integer getGroupNumber()
  {
    return groupNumber;
  }
}
