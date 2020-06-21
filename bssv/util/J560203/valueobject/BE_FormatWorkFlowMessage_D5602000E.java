package be.e1.bssv.util.J560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BE_FormatWorkFlowMessage_D5602000E
  extends ValueObject
  implements Serializable
{
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
   * Parameter Data Item 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV01 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter01 = null;

  /**
   * Parameter Data Item 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV02 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter02 = null;

  /**
   * Parameter Data Item 03
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV03 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter03 = null;

  /**
   * Parameter Data Item 04
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV04 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter04 = null;

  /**
   * Parameter Data Item 05
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV05 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter05 = null;

  /**
   * Parameter Data Item 06
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV06 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter06 = null;

  /**
   * Parameter Data Item 07
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV07 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter07 = null;

  /**
   * Parameter Data Item 08
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV08 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter08 = null;

  /**
   * Parameter Data Item 09
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV09 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter09 = null;

  /**
   * Parameter Data Item 10
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV10 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter10 = null;

  /**
   * E-Mail Message
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMAILMSG <br>
   * EnterpriseOne field length:  32000 <br>
   */
  private String szEmailMsg = null;

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
  private MathNumeric mnMessageLineNum = null;
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
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorCode = null;

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

  public void setSzMessageTemplate(String szMessageTemplate)
  {
    this.szMessageTemplate = szMessageTemplate;
  }

  public String getSzMessageTemplate()
  {
    return szMessageTemplate;
  }

  public void setSzParameter01(String szParameter01)
  {
    this.szParameter01 = szParameter01;
  }

  public String getSzParameter01()
  {
    return szParameter01;
  }

  public void setSzParameter02(String szParameter02)
  {
    this.szParameter02 = szParameter02;
  }

  public String getSzParameter02()
  {
    return szParameter02;
  }

  public void setSzParameter03(String szParameter03)
  {
    this.szParameter03 = szParameter03;
  }

  public String getSzParameter03()
  {
    return szParameter03;
  }

  public void setSzParameter04(String szParameter04)
  {
    this.szParameter04 = szParameter04;
  }

  public String getSzParameter04()
  {
    return szParameter04;
  }

  public void setSzParameter05(String szParameter05)
  {
    this.szParameter05 = szParameter05;
  }

  public String getSzParameter05()
  {
    return szParameter05;
  }

  public void setSzParameter06(String szParameter06)
  {
    this.szParameter06 = szParameter06;
  }

  public String getSzParameter06()
  {
    return szParameter06;
  }

  public void setSzParameter07(String szParameter07)
  {
    this.szParameter07 = szParameter07;
  }

  public String getSzParameter07()
  {
    return szParameter07;
  }

  public void setSzParameter08(String szParameter08)
  {
    this.szParameter08 = szParameter08;
  }

  public String getSzParameter08()
  {
    return szParameter08;
  }

  public void setSzParameter09(String szParameter09)
  {
    this.szParameter09 = szParameter09;
  }

  public String getSzParameter09()
  {
    return szParameter09;
  }

  public void setSzParameter10(String szParameter10)
  {
    this.szParameter10 = szParameter10;
  }

  public String getSzParameter10()
  {
    return szParameter10;
  }

  public void setSzEmailMsg(String szEmailMsg)
  {
    this.szEmailMsg = szEmailMsg;
  }

  public String getSzEmailMsg()
  {
    return szEmailMsg;
  }

  public void setMnMessageId(MathNumeric mnMessageId)
  {
    this.mnMessageId = mnMessageId;
  }

  public MathNumeric getMnMessageId()
  {
    return mnMessageId;
  }

  public void setMnMessageLineNum(MathNumeric mnMessageLineNum)
  {
    this.mnMessageLineNum = mnMessageLineNum;
  }

  public MathNumeric getMnMessageLineNum()
  {
    return mnMessageLineNum;
  }
 
  public void setSzWorkflowLineType(String szWorkflowLineType)
  {
    this.szWorkflowLineType = szWorkflowLineType;
  }

  public String getSzWorkflowLineType()
  {
    return szWorkflowLineType;
  }

  public void setSzXmlTag(String szXmlTag)
  {
    this.szXmlTag = szXmlTag;
  }

  public String getSzXmlTag()
  {
    return szXmlTag;
  }
  public void setCErrorCode(String cErrorCode)
  {
    this.cErrorCode = cErrorCode;
  }

  public String getCErrorCode()
  {
    return cErrorCode;
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
