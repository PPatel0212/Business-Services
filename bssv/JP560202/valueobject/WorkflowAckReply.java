package be.e1.bssv.JP560202.valueobject;

import be.e1.bssv.J560202.valueobject.WorkflowAck_D5602000G;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WorkflowAckReply extends MessageValueObject implements Serializable
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
  private String errorDescription = null;

  /**
   * TODO: Default public constructor for instantiating: WorkflowAckReply
   */
  public WorkflowAckReply()
  {
  }
  
  public WorkflowAckReply(WorkflowAck_D5602000G internalVO)
  {
    setErrorCode(internalVO.getCErrorFlag());
    setErrorDescription(internalVO.getSzErrorDescription());
  }

  public void setErrorCode(String errorCode)
  {
    this.errorCode = errorCode;
  }

  public String getErrorCode()
  {
    return errorCode;
  }

  public void setErrorDescription(String errorDescription)
  {
    this.errorDescription = errorDescription;
  }

  public String getErrorDescription()
  {
    return errorDescription;
  }
}
