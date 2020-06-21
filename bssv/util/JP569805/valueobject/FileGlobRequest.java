package be.e1.bssv.util.JP569805.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FileGlobRequest extends ValueObject implements Serializable
{
  private String szSearchPath = null;
  private String szSearchPattern = null;

  public void setSzSearchPath(String szSearchPath)
  {
    this.szSearchPath = szSearchPath;
  }

  public String getSzSearchPath()
  {
    return szSearchPath;
  }

  public void setSzSearchPattern(String szSearchPattern)
  {
    this.szSearchPattern = szSearchPattern;
  }

  public String getSzSearchPattern()
  {
    return szSearchPattern;
  }
}
