package be.e1.bssv.JP560202.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WorkflowAckRequest extends ValueObject implements Serializable
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
  private Integer messageId = null;

  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer responderNumber = null;

  /**
   * Name - Alpha
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ALPH <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String responderName = null;

  /**
   * Professional Title
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ATTL <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String responderTitle = null;

  /**
   * Status
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STTUS <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String workflowStatus = null;

  /**
   * Service Level Custom Function
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SLCUSTFN <br>
   * EnterpriseOne field length:  32 <br>
   */
  private String workflowRouteLevel = null;

  /**
   * Translator Comment
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: COMMENT <br>
   * EnterpriseOne field length:  2000 <br>
   */
  private String responderComment = null;

  /**
   * Workflow Line Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56WLTP <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String workflowLineType = null;

  /**
   * TODO: Default public constructor for instantiating: WorkflowAckRequest
   */
  public WorkflowAckRequest()
  {
  }

  public void setMessageId(Integer messageId)
  {
    this.messageId = messageId;
  }

  public Integer getMessageId()
  {
    return messageId;
  }

  public void setResponderNumber(Integer responderNumber)
  {
    this.responderNumber = responderNumber;
  }

  public Integer getResponderNumber()
  {
    return responderNumber;
  }

  public void setResponderName(String responderName)
  {
    this.responderName = responderName;
  }

  public String getResponderName()
  {
    return responderName;
  }

  public void setResponderTitle(String responderTitle)
  {
    this.responderTitle = responderTitle;
  }

  public String getResponderTitle()
  {
    return responderTitle;
  }

  public void setWorkflowStatus(String workflowStatus)
  {
    this.workflowStatus = workflowStatus;
  }

  public String getWorkflowStatus()
  {
    return workflowStatus;
  }

  public void setWorkflowRouteLevel(String workflowRouteLevel)
  {
    this.workflowRouteLevel = workflowRouteLevel;
  }

  public String getWorkflowRouteLevel()
  {
    return workflowRouteLevel;
  }

  public void setResponderComment(String responderComment)
  {
    this.responderComment = responderComment;
  }

  public String getResponderComment()
  {
    return responderComment;
  }

  public void setWorkflowLineType(String workflowLineType)
  {
    this.workflowLineType = workflowLineType;
  }

  public String getWorkflowLineType()
  {
    return workflowLineType;
  }
}
