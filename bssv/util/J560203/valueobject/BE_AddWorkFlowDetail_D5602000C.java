package be.e1.bssv.util.J560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BE_AddWorkFlowDetail_D5602000C
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
  private MathNumeric mnMessageId = null;

  /**
   * Line Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LNID <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 3 <br>
   */
  private MathNumeric mnLineNumber = null;

  /**
   * Data Item
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTAI <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szMessageTemplate = null;

  /**
   * Element 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ELM01 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String szXmlTag = null;

  /**
   * Node Text
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: BTNTEXT <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String szXmlData = null;

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
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cSuppressErrorMessage = null;

  public void setMnMessageId(MathNumeric mnMessageId)
  {
    this.mnMessageId = mnMessageId;
  }

  public MathNumeric getMnMessageId()
  {
    return mnMessageId;
  }

  public void setMnLineNumber(MathNumeric mnLineNumber)
  {
    this.mnLineNumber = mnLineNumber;
  }

  public MathNumeric getMnLineNumber()
  {
    return mnLineNumber;
  }

  public void setSzMessageTemplate(String szMessageTemplate)
  {
    this.szMessageTemplate = szMessageTemplate;
  }

  public String getSzMessageTemplate()
  {
    return szMessageTemplate;
  }

  public void setSzXmlTag(String szXmlTag)
  {
    this.szXmlTag = szXmlTag;
  }

  public String getSzXmlTag()
  {
    return szXmlTag;
  }

  public void setSzXmlData(String szXmlData)
  {
    this.szXmlData = szXmlData;
  }

  public String getSzXmlData()
  {
    return szXmlData;
  }

  public void setSzAuditProgramId(String szAuditProgramId)
  {
    this.szAuditProgramId = szAuditProgramId;
  }

  public String getSzAuditProgramId()
  {
    return szAuditProgramId;
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

  public void setCSuppressErrorMessage(String cSuppressErrorMessage)
  {
    this.cSuppressErrorMessage = cSuppressErrorMessage;
  }

  public String getCSuppressErrorMessage()
  {
    return cSuppressErrorMessage;
  }
}
