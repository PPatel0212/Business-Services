package be.e1.bssv.util.JP564103.valueobject;

import be.e1.bssv.util.J564103.valueobject.DSR5641042;
import java.io.Serializable;
import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LaunchR5641042Reply extends MessageValueObject implements Serializable
{
  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorCode = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String errorDescription = null;

  /**
   * TODO: Default public constructor for instantiating: LaunchR5641042Reply
   */
  public LaunchR5641042Reply()
  {
  }
  
  public LaunchR5641042Reply(DSR5641042 inData)
  {
    this.errorCode = inData.getCErrorFlag();
    this.errorDescription = inData.getSzErrorMessage();
  }

  public void setErrorCode(String errorCode)
  {
    this.errorCode = errorCode;
  }

  public String getErrorCode()
  {
    return errorCode;
  }

  public void setErrorDescription(String errorDescription)
  {
    this.errorDescription = errorDescription;
  }

  public String getErrorDescription()
  {
    return errorDescription;
  }
}
