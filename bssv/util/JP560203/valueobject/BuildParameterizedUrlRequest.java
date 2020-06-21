package be.e1.bssv.util.JP560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BuildParameterizedUrlRequest
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
  private String objectName = null;

  /**
   * Form Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FMNM <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String formName = null;

  /**
   * Version
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: BHVER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String version = null;

  /**
   * URL
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URL <br>
   * EnterpriseOne field length:  2038 <br>
   */
  private String EncodedRedirectUrl = null;

  /**
   * Parameter - Program Call
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PRM <br>
   * EnterpriseOne field length:  320 <br>
   */
  private String parameterProgramCall = null;

  /**
   * Parameter String
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PRSTR <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String parameterString = null;

  /**
   * Supplier Item URL
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITEMURL <br>
   * EnterpriseOne field length:  3000 <br>
   */
  private String ParameterizedURL = null;

  /**
   * TODO: Default public constructor for instantiating: BuildParameterizedUrlRequest
   */
  public BuildParameterizedUrlRequest()
  {
  }

  public void setObjectName(String objectName)
  {
    this.objectName = objectName;
  }

  public String getObjectName()
  {
    return objectName;
  }

  public void setFormName(String formName)
  {
    this.formName = formName;
  }

  public String getFormName()
  {
    return formName;
  }

  public void setVersion(String version)
  {
    this.version = version;
  }

  public String getVersion()
  {
    return version;
  }

  public void setURL(String uRL)
  {
    this.EncodedRedirectUrl = EncodedRedirectUrl;
  }

  public String getEncodedRedirectUrl()
  {
    return EncodedRedirectUrl;
  }

  public void setParameterProgramCall(String parameterProgramCall)
  {
    this.parameterProgramCall = parameterProgramCall;
  }

  public String getParameterProgramCall()
  {
    return parameterProgramCall;
  }

  public void setParameterString(String parameterString)
  {
    this.parameterString = parameterString;
  }

  public String getParameterString()
  {
    return parameterString;
  }

  public void setParameterizedURL(String ParameterizedURL)
  {
    this.ParameterizedURL = ParameterizedURL;
  }

  public String getSupplierItemURL()
  {
    return ParameterizedURL;
  }
}
