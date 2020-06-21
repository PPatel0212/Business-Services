package be.e1.bssv.util.J560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BE_BuildParameterizedUrl_D5602000H
  extends ValueObject
  implements Serializable
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
  private String szProgramName = null;

  /**
   * Form Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FMNM <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szFormName = null;

  /**
   * Version
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: BHVER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szVersion = null;

  /**
   * URL
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URL <br>
   * EnterpriseOne field length:  2038 <br>
   */
  private String szEncodedRedirectUrl = null;

  /**
   * Parameter - Program Call
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PRM <br>
   * EnterpriseOne field length:  320 <br>
   */
  private String szParameterIdList = null;

  /**
   * Parameter String
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PRSTR <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szParameterValueList = null;

  /**
   * Supplier Item URL
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITEMURL <br>
   * EnterpriseOne field length:  3000 <br>
   */
  private String szParameterizedURL = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorFlag = null;

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

  public void setSzProgramName(String szProgramName)
  {
    this.szProgramName = szProgramName;
  }

  public String getSzProgramName()
  {
    return szProgramName;
  }

  public void setSzFormName(String szFormName)
  {
    this.szFormName = szFormName;
  }

  public String getSzFormName()
  {
    return szFormName;
  }

  public void setSzVersion(String szVersion)
  {
    this.szVersion = szVersion;
  }

  public String getSzVersion()
  {
    return szVersion;
  }

  public void setSzEncodedRedirectUrl(String szEncodedRedirectUrl)
  {
    this.szEncodedRedirectUrl = szEncodedRedirectUrl;
  }

  public String getSzEncodedRedirectUrl()
  {
    return szEncodedRedirectUrl;
  }

  public void setSzParameterIdList(String szParameterIdList)
  {
    this.szParameterIdList = szParameterIdList;
  }

  public String getSzParameterIdList()
  {
    return szParameterIdList;
  }

  public void setSzParameterValueList(String szParameterValueList)
  {
    this.szParameterValueList = szParameterValueList;
  }

  public String getSzParameterValueList()
  {
    return szParameterValueList;
  }

  public void setSzParameterizedURL(String szParameterizedURL)
  {
    this.szParameterizedURL = szParameterizedURL;
  }

  public String getSzParameterizedURL()
  {
    return szParameterizedURL;
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
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
