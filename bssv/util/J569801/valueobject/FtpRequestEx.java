package be.e1.bssv.util.J569801.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class FtpRequestEx extends ValueObject implements Serializable
{
  private MathNumeric mnJobid = null;
  private String szSourceHost = null;
  private String szSourceFile = null;
  private String szSourcePath = null;
  private String szDestinationHost = null;
  private String szDestinationFile = null;
  private String szDestinationPath = null;
  private String cDeleteSourceYN = null;
  private String cErrorFlag = null;
  private String szErrorMessage = null;
  private String szCompositeId = null;
  private String szStatus = null;
  private Integer nCipherMode = null;
  private String szCipherKey = null;
  private String szAsynchFlag = null;
  private String szSignKey = null;

  public void setSzSourceHost(String szSourceHost)
  {
    this.szSourceHost = szSourceHost;
  }

  public String getSzSourceHost()
  {
    return szSourceHost;
  }

  public void setSzSourceFile(String szSourceFile)
  {
    this.szSourceFile = szSourceFile;
  }

  public String getSzSourceFile()
  {
    return szSourceFile;
  }

  public void setSzSourcePath(String szSourcePath)
  {
    this.szSourcePath = szSourcePath;
  }

  public String getSzSourcePath()
  {
    return szSourcePath;
  }

  public void setSzDestinationHost(String szDestinationHost)
  {
    this.szDestinationHost = szDestinationHost;
  }

  public String getSzDestinationHost()
  {
    return szDestinationHost;
  }

  public void setSzDestinationFile(String szDestinationFile)
  {
    this.szDestinationFile = szDestinationFile;
  }

  public String getSzDestinationFile()
  {
    return szDestinationFile;
  }

  public void setSzDestinationPath(String szDestinationPath)
  {
    this.szDestinationPath = szDestinationPath;
  }

  public String getSzDestinationPath()
  {
    return szDestinationPath;
  }

  public void setCDeleteSourceYN(String cDeleteSourceYN)
  {
    this.cDeleteSourceYN = cDeleteSourceYN;
  }

  public String getCDeleteSourceYN()
  {
    return cDeleteSourceYN;
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

  public void setSzCompositeId(String szCompositeId)
  {
    this.szCompositeId = szCompositeId;
  }

  public String getSzCompositeId()
  {
    return szCompositeId;
  }

  public void setSzStatus(String szStatus)
  {
    this.szStatus = szStatus;
  }

  public String getSzStatus()
  {
    return szStatus;
  }

  public void setNCipherMode(Integer nCipherMode)
  {
    this.nCipherMode = nCipherMode;
  }

  public Integer getNCipherMode()
  {
    return nCipherMode;
  }

  public void setSzCipherKey(String szCipherKey)
  {
    this.szCipherKey = szCipherKey;
  }

  public String getSzCipherKey()
  {
    return szCipherKey;
  }

  public void setSzAsynchFlag(String szAsynchFlag)
  {
    this.szAsynchFlag = szAsynchFlag;
  }

  public String getSzAsynchFlag()
  {
    return szAsynchFlag;
  }

  public void setMnJobid(MathNumeric mnJobid)
  {
    this.mnJobid = mnJobid;
  }

  public MathNumeric getMnJobid()
  {
    return mnJobid;
  }

  public void setSzSignKey(String szSignKey)
  {
    this.szSignKey = szSignKey;
  }

  public String getSzSignKey()
  {
    return szSignKey;
  }
}
