package be.e1.bssv.util.JP560203.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FormatWorkFlowMessageRequest
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
  private String MessageTemplate = null;

  /**
   * Parameter Data Item 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV01 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem01 = null;

  /**
   * Parameter Data Item 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV02 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem02 = null;

  /**
   * Parameter Data Item 03
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV03 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem03 = null;

  /**
   * Parameter Data Item 04
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV04 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem04 = null;

  /**
   * Parameter Data Item 05
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV05 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem05 = null;

  /**
   * Parameter Data Item 06
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV06 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem06 = null;

  /**
   * Parameter Data Item 07
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV07 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem07 = null;

  /**
   * Parameter Data Item 08
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV08 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem08 = null;

  /**
   * Parameter Data Item 09
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV09 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem09 = null;

  /**
   * Parameter Data Item 10
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV10 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parameterDataItem10 = null;

  /**
   * E-Mail Message
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMAILMSG <br>
   * EnterpriseOne field length:  32000 <br>
   */
  private String eMailMessage = null;

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
   * Element 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ELM01 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String element01 = null;
  private String WorkflowLineType = null;

  /**
   * TODO: Default public constructor for instantiating: FormatWorkFlowMessageRequest
   */
  public FormatWorkFlowMessageRequest()
  {
  }

  public void setDataItem(String MessageTemplate)
  {
    this.MessageTemplate = MessageTemplate;
  }

  public String getMessageTemplate()
  {
    return MessageTemplate;
  }

  public void setParameterDataItem01(String parameterDataItem01)
  {
    this.parameterDataItem01 = parameterDataItem01;
  }

  public String getParameterDataItem01()
  {
    return parameterDataItem01;
  }

  public void setParameterDataItem02(String parameterDataItem02)
  {
    this.parameterDataItem02 = parameterDataItem02;
  }

  public String getParameterDataItem02()
  {
    return parameterDataItem02;
  }

  public void setParameterDataItem03(String parameterDataItem03)
  {
    this.parameterDataItem03 = parameterDataItem03;
  }

  public String getParameterDataItem03()
  {
    return parameterDataItem03;
  }

  public void setParameterDataItem04(String parameterDataItem04)
  {
    this.parameterDataItem04 = parameterDataItem04;
  }

  public String getParameterDataItem04()
  {
    return parameterDataItem04;
  }

  public void setParameterDataItem05(String parameterDataItem05)
  {
    this.parameterDataItem05 = parameterDataItem05;
  }

  public String getParameterDataItem05()
  {
    return parameterDataItem05;
  }

  public void setParameterDataItem06(String parameterDataItem06)
  {
    this.parameterDataItem06 = parameterDataItem06;
  }

  public String getParameterDataItem06()
  {
    return parameterDataItem06;
  }

  public void setParameterDataItem07(String parameterDataItem07)
  {
    this.parameterDataItem07 = parameterDataItem07;
  }

  public String getParameterDataItem07()
  {
    return parameterDataItem07;
  }

  public void setParameterDataItem08(String parameterDataItem08)
  {
    this.parameterDataItem08 = parameterDataItem08;
  }

  public String getParameterDataItem08()
  {
    return parameterDataItem08;
  }

  public void setParameterDataItem09(String parameterDataItem09)
  {
    this.parameterDataItem09 = parameterDataItem09;
  }

  public String getParameterDataItem09()
  {
    return parameterDataItem09;
  }

  public void setParameterDataItem10(String parameterDataItem10)
  {
    this.parameterDataItem10 = parameterDataItem10;
  }

  public String getParameterDataItem10()
  {
    return parameterDataItem10;
  }

  public void setEMailMessage(String eMailMessage)
  {
    this.eMailMessage = eMailMessage;
  }

  public String getEMailMessage()
  {
    return eMailMessage;
  }

  public void setMessageID(Integer MessageID)
  {
    this.MessageID = MessageID;
  }

  public Integer getMessageID()
  {
    return MessageID;
  }


  public void setErrorCode(String errorCode)
  {
    this.errorCode = errorCode;
  }

  public String getErrorCode()
  {
    return errorCode;
  }

  public void setElement01(String element01)
  {
    this.element01 = element01;
  }

  public String getElement01()
  {
    return element01;
  }
  public void setWorkflowLineType(String WorkflowLineType)
  {
    this.WorkflowLineType = WorkflowLineType;
  }

  public String getWorkFlowLineType()
  {
    return WorkflowLineType;
  }
}
