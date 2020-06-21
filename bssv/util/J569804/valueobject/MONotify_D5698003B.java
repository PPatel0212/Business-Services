package be.e1.bssv.util.J569804.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class MONotify_D5698003B extends ValueObject implements Serializable
{
  /**
   * Object Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OBNM <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szMOName = null;

  /**
   * Generic Text Key
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TXKY <br>
   * EnterpriseOne field length:  254 <br>
   */
  private String szMOKey = null;

  /**
   * Media Object Sequence Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MOSEQN <br>
   * EnterpriseOne field length:  11 <br>
   */
  private Integer nMOSeqNumber = null;

  /**
   * Generic Text Item Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GTITNM <br>
   * EnterpriseOne field length:  50 <br>
   */
  private String szItemName = null;

  /**
   * Generic Text Media Object Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GTMOTYPE <br>
   * EnterpriseOne field length:  11 <br>
   */
  private Integer nMOTypeNumber = null;

  /**
   * File Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FTYPE <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szMOTypeString = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cActionCode = null;

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

  public void setSzMOName(String szMOName)
  {
    this.szMOName = szMOName;
  }

  public String getSzMOName()
  {
    return szMOName;
  }

  public void setSzMOKey(String szMOKey)
  {
    this.szMOKey = szMOKey;
  }

  public String getSzMOKey()
  {
    return szMOKey;
  }

  public void setNMOSeqNumber(Integer nMOSeqNumber)
  {
    this.nMOSeqNumber = nMOSeqNumber;
  }

  public Integer getNMOSeqNumber()
  {
    return nMOSeqNumber;
  }

  public void setSzItemName(String szItemName)
  {
    this.szItemName = szItemName;
  }

  public String getSzItemName()
  {
    return szItemName;
  }

  public void setNMOTypeNumber(Integer nMOTypeNumber)
  {
    this.nMOTypeNumber = nMOTypeNumber;
  }

  public Integer getNMOTypeNumber()
  {
    return nMOTypeNumber;
  }

  public void setSzMOTypeString(String szMOTypeString)
  {
    this.szMOTypeString = szMOTypeString;
  }

  public String getSzMOTypeString()
  {
    return szMOTypeString;
  }

  public void setCActionCode(String cActionCode)
  {
    this.cActionCode = cActionCode;
  }

  public String getCActionCode()
  {
    return cActionCode;
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
