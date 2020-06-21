package be.e1.bssv.util.JP560203.valueobject;

import be.e1.bssv.util.J560203.valueobject.BE_FormatWorkFlowMessage_D5602000E;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FormatWorkFlowMessageReply
  extends MessageValueObject
  implements Serializable
{


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
  private String errorCode = null;
  private String description = null;
  private String eMailMessage = null;

  /**
   * TODO: Default public constructor for instantiating: FormatWorkFlowMessageReply
   */
  public FormatWorkFlowMessageReply()
  {
  }

  public FormatWorkFlowMessageReply(BE_FormatWorkFlowMessage_D5602000E vo)
  {
    setErrorCode(vo.getCErrorCode());
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
  public void setEmailMsg(String eMailMessage)
  {
    this.eMailMessage = eMailMessage;
  }

  public String geteEmailMessage()
  {
    return eMailMessage;
  }
}
