package be.e1.bssv.JP564305.valueobject;

import be.e1.bssv.J564305.valueobject.CreatePOLine_D5643006;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class POLineItemRevisionReply
  extends MessageValueObject
  implements Serializable
{
    private BigDecimal lineNumber = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorFlag = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: D200 <br>
   * EnterpriseOne field length:  200 <br>
   */
  private String errorDescription = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String itemRevisionLevel = null;

  /**
   * Data Item
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTAI <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String e1ErrorCode = null;

  /**
   * TODO: Default public constructor for instantiating: POLineItemRevisionReply
   */
  public POLineItemRevisionReply()
  {
  }
  
  public POLineItemRevisionReply(CreatePOLine_D5643006 inData)
  {
    this.errorFlag = inData.getCErrorCode_EV01();
    this.errorDescription = inData.getSzErrorDescription_D200();
    this.e1ErrorCode = inData.getSzDataItem_DATI();
    if(inData.getMnLineNumber_LNID() != null)
        this.lineNumber = inData.getMnLineNumber_LNID().asBigDecimal();
    else
        this.lineNumber = BigDecimal.ZERO;
  }

  public void setErrorDescription(String errorDescription)
  {
    this.errorDescription = errorDescription;
  }

  public String getErrorDescription()
  {
    return errorDescription;
  }

  public void setItemRevisionLevel(String itemRevisionLevel)
  {
    this.itemRevisionLevel = itemRevisionLevel;
  }

  public String getItemRevisionLevel()
  {
    return itemRevisionLevel;
  }

  public void setE1ErrorCode(String e1ErrorCode)
  {
    this.e1ErrorCode = e1ErrorCode;
  }

  public String getE1ErrorCode()
  {
    return e1ErrorCode;
  }

  public void setErrorFlag(String errorFlag)
  {
    this.errorFlag = errorFlag;
  }

  public String getErrorFlag()
  {
    return errorFlag;
  }

    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }

    public BigDecimal getLineNumber() {
        return lineNumber;
    }
}
