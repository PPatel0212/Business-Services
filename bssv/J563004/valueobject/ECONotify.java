package be.e1.bssv.J563004.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ECONotify extends ValueObject implements Serializable
{
  private MathNumeric mnTxnId = null;
  private String szTxnType = null;
  private String szPlmSystem = null;
  private String szChangeId = null;
  private String szSiteId = null;
  private MathNumeric mnErrorCount = null;
  private LineDetails detailLines[] = null;
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

  public void setSzChangeId(String szChangeId)
  {
    this.szChangeId = szChangeId;
  }

  public String getSzChangeId()
  {
    return szChangeId;
  }

  public void setMnErrorCount(MathNumeric mnErrorCount)
  {
    this.mnErrorCount = mnErrorCount;
  }

  public MathNumeric getMnErrorCount()
  {
    return mnErrorCount;
  }

  public void setDetailLines(LineDetails[] detailLines)
  {
    this.detailLines = detailLines;
  }

  public LineDetails[] getDetailLines()
  {
    return detailLines;
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

    public void setSzSiteId(String szSiteId) {
        this.szSiteId = szSiteId;
    }

    public String getSzSiteId() {
        return szSiteId;
    }
}
