package be.e1.bssv.util.J560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BE_AddWorkFlowHeader_D5602000B
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
  private MathNumeric mnGroupId = null;

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
  private MathNumeric mnMessageId = null;

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
  private MathNumeric mnParentId = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String szBranch = null;

  /**
   * Workflow Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56WFTP <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String szWorkflowType = null;

  /**
   * Transaction Originator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TORG <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szWorkflowOriginator = null;

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
  private String szErrorMessage = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne Edit Rule:CHKOBJ <br>
   */
  private String szAuditProgramId = null;

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

  public void setMnGroupId(MathNumeric mnGroupId)
  {
    this.mnGroupId = mnGroupId;
  }

  public MathNumeric getMnGroupId()
  {
    return mnGroupId;
  }

  public void setMnMessageId(MathNumeric mnMessageId)
  {
    this.mnMessageId = mnMessageId;
  }

  public MathNumeric getMnMessageId()
  {
    return mnMessageId;
  }

  public void setMnParentId(MathNumeric mnParentId)
  {
    this.mnParentId = mnParentId;
  }

  public MathNumeric getMnParentId()
  {
    return mnParentId;
  }

  public void setSzBranch(String szBranch)
  {
    this.szBranch = szBranch;
  }

  public String getSzBranch()
  {
    return szBranch;
  }

  public void setSzWorkflowType(String szWorkflowType)
  {
    this.szWorkflowType = szWorkflowType;
  }

  public String getSzWorkflowType()
  {
    return szWorkflowType;
  }

  public void setSzWorkflowOriginator(String szWorkflowOriginator)
  {
    this.szWorkflowOriginator = szWorkflowOriginator;
  }

  public String getSzWorkflowOriginator()
  {
    return szWorkflowOriginator;
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
  }

  public void setSzErrorMessage(String szErrorMessage)
  {
    this.szErrorMessage = szErrorMessage;
  }

  public String getSzErrorMessage()
  {
    return szErrorMessage;
  }

  public void setSzAuditProgramId(String szAuditProgramId)
  {
    this.szAuditProgramId = szAuditProgramId;
  }

  public String getSzAuditProgramId()
  {
    return szAuditProgramId;
  }

  public void setCSuppressErrorMessage(String cSuppressErrorMessage)
  {
    this.cSuppressErrorMessage = cSuppressErrorMessage;
  }

  public String getCSuppressErrorMessage()
  {
    return cSuppressErrorMessage;
  }
}
