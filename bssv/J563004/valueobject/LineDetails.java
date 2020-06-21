package be.e1.bssv.J563004.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LineDetails extends ValueObject implements Serializable
{
  private String szMsgKey = null;
  private String szMsgData = null;

  public void setSzMsgKey(String szMsgKey)
  {
    this.szMsgKey = szMsgKey;
  }

  public String getSzMsgKey()
  {
    return szMsgKey;
  }

  public void setSzMsgData(String szMsgData)
  {
    this.szMsgData = szMsgData;
  }

  public String getSzMsgData()
  {
    return szMsgData;
  }
}
