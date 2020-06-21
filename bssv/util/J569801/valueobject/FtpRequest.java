package be.e1.bssv.util.J569801.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

public class FtpRequest extends ValueObject implements Serializable
{
  private String szSourceHost = null;
  private String szSourceFile = null;
  private String szSourcePath = null;
  private String szDestinationHost = null;
  private String szDestinationFile = null;
  private String szDestinationPath = null;
  private String cDeleteSourceYN = null;
  private String cErrorFlag = null;
  private String szErrorMessage = null;

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
}
