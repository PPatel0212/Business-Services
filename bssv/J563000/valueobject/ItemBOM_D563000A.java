package be.e1.bssv.J563000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ItemBOM_D563000A extends ValueObject implements Serializable
{
  private MathNumeric mnTxnId = null;
  private String szTxnType = null;
  private String szPlmSystem = null;
  private String szSiteId = null;
  private String szChangeNumber = null;
  private MathNumeric mnErrorCount = null;
  private ErrorMsgs errorMessages[] = null;
  private String cBssvError = null;
  private String szBssvErrorMsg = null;

  public void setMnTxnId(MathNumeric mnTxnId)
  {
    this.mnTxnId = mnTxnId;
  }

  public MathNumeric getMnTxnId()
  {
    return mnTxnId;
  }

  public void setSzTxnType(String szTxnType)
  {
    this.szTxnType = szTxnType;
  }

  public String getSzTxnType()
  {
    return szTxnType;
  }

  public void setSzPlmSystem(String szPlmSystem)
  {
    this.szPlmSystem = szPlmSystem;
  }

  public String getSzPlmSystem()
  {
    return szPlmSystem;
  }

  public void setMnErrorCount(MathNumeric mnErrorCount)
  {
    this.mnErrorCount = mnErrorCount;
  }

  public MathNumeric getMnErrorCount()
  {
    return mnErrorCount;
  }

  public void setErrorMessages(ErrorMsgs[] errorMessages)
  {
    this.errorMessages = errorMessages;
  }

  public ErrorMsgs[] getErrorMessages()
  {
    return errorMessages;
  }

  public void setCBssvError(String cBssvError)
  {
    this.cBssvError = cBssvError;
  }

  public String getCBssvError()
  {
    return cBssvError;
  }

  public void setSzBssvErrorMsg(String szBssvErrorMsg)
  {
    this.szBssvErrorMsg = szBssvErrorMsg;
  }

  public String getSzBssvErrorMsg()
  {
    return szBssvErrorMsg;
  }

  public void setSzSiteId(String szSiteId)
  {
    this.szSiteId = szSiteId;
  }

  public String getSzSiteId()
  {
    return szSiteId;
  }


  public void setSzChangeNumber(String szChangeNumber)
  {
    this.szChangeNumber = szChangeNumber;
  }

  public String getSzChangeNumber()
  {
    return szChangeNumber;
  }
}
