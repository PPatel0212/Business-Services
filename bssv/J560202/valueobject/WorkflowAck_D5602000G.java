package be.e1.bssv.J560202.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WorkflowAck_D5602000G extends ValueObject implements Serializable
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
  private MathNumeric mnMessageId = null;

  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   * EnterpriseOne Next Number: 01/1 <br>
   */
  private MathNumeric mnResponderNumber = null;

  /**
   * Name - Alpha
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ALPH <br>
   * EnterpriseOne field length:  40 <br>
   * EnterpriseOne Edit Rule:NE <br>
   */
  private String szResponderName = null;

  /**
   * Professional Title
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ATTL <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szResponderTitleRole = null;

  /**
   * Status
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STTUS <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String szActionStatus = null;

  /**
   * Service Level Custom Function
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SLCUSTFN <br>
   * EnterpriseOne field length:  32 <br>
   */
  private String szActionLevel = null;

  /**
   * Translator Comment
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: COMMENT <br>
   * EnterpriseOne field length:  2000 <br>
   */
  private String szResponderComments = null;

  /**
   * Workflow Line Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56WLTP <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szWorkflowLineType = null;

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
  private String szErrorDescription = null;

  public void setMnMessageId(MathNumeric mnMessageId)
  {
    this.mnMessageId = mnMessageId;
  }

  public MathNumeric getMnMessageId()
  {
    return mnMessageId;
  }

  public void setMnResponderNumber(MathNumeric mnResponderNumber)
  {
    this.mnResponderNumber = mnResponderNumber;
  }

  public MathNumeric getMnResponderNumber()
  {
    return mnResponderNumber;
  }

  public void setSzResponderName(String szResponderName)
  {
    this.szResponderName = szResponderName;
  }

  public String getSzResponderName()
  {
    return szResponderName;
  }

  public void setSzResponderTitleRole(String szResponderTitleRole)
  {
    this.szResponderTitleRole = szResponderTitleRole;
  }

  public String getSzResponderTitleRole()
  {
    return szResponderTitleRole;
  }

  public void setSzActionStatus(String szActionStatus)
  {
    this.szActionStatus = szActionStatus;
  }

  public String getSzActionStatus()
  {
    return szActionStatus;
  }

  public void setSzActionLevel(String szActionLevel)
  {
    this.szActionLevel = szActionLevel;
  }

  public String getSzActionLevel()
  {
    return szActionLevel;
  }

  public void setSzResponderComments(String szResponderComments)
  {
    this.szResponderComments = szResponderComments;
  }

  public String getSzResponderComments()
  {
    return szResponderComments;
  }

  public void setSzWorkflowLineType(String szWorkflowLineType)
  {
    this.szWorkflowLineType = szWorkflowLineType;
  }

  public String getSzWorkflowLineType()
  {
    return szWorkflowLineType;
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
  }

  public void setSzErrorDescription(String szErrorDescription)
  {
    this.szErrorDescription = szErrorDescription;
  }

  public String getSzErrorDescription()
  {
    return szErrorDescription;
  }
}
