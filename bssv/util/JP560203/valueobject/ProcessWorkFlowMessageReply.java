package be.e1.bssv.util.JP560203.valueobject;

import be.e1.bssv.util.J560203.valueobject.BE_ProcessWorkflowMessage_D5602000F;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ProcessWorkFlowMessageReply
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

  /**
   * TODO: Default public constructor for instantiating: ProcessWorkFlowMessageReply
   */
  public ProcessWorkFlowMessageReply()
  {
  }

  public ProcessWorkFlowMessageReply(BE_ProcessWorkflowMessage_D5602000F vo)
  {
    setErrorCode(vo.getCErrorFlag());
    setDescription(vo.getSzErrorDescription());
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
}
