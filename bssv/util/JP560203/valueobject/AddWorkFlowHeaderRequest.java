package be.e1.bssv.util.JP560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class AddWorkFlowHeaderRequest
  extends ValueObject
  implements Serializable
{
  /**
   * Group Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GRPID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer groupNumber = null;

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
   * Lead Id
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LEADID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer ParentId = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String businessUnit = null;

  /**
   * Workflow Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56WFTP <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String workflowType = null;

  /**
   * Transaction Originator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TORG <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String transactionOriginator = null;

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
   * TODO: Default public constructor for instantiating: AddWorkFlowHeaderRequest
   */
  public AddWorkFlowHeaderRequest()
  {
   this.groupNumber=0;
   this.ParentId=0;
   this.MessageID=0;
   }

  public void setGroupNumber(Integer groupNumber)
  {
    this.groupNumber = groupNumber;
  }

  public Integer getGroupNumber()
  {
    return groupNumber;
  }

  public void setMessageID(Integer MesssageID)
  {
    this.MessageID = MessageID;
  }

  public Integer getMessageID()
  {
    return MessageID;
  }

  public void setParentId(Integer ParentId)
  {
    this.ParentId = ParentId;
  }

  public Integer getLeadId()
  {
    return ParentId;
  }

  public void setBusinessUnit(String businessUnit)
  {
    this.businessUnit = businessUnit;
  }

  public String getBusinessUnit()
  {
    return businessUnit;
  }

  public void setWorkflowType(String workflowType)
  {
    this.workflowType = workflowType;
  }

  public String getWorkflowType()
  {
    return workflowType;
  }

  public void setTransactionOriginator(String transactionOriginator)
  {
    this.transactionOriginator = transactionOriginator;
  }

  public String getTransactionOriginator()
  {
    return transactionOriginator;
  }

  public void setProgramID(String programID)
  {
    this.programID = programID;
  }

  public String getProgramID()
  {
    return programID;
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
