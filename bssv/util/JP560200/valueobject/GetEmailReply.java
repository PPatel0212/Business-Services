package be.e1.bssv.util.JP560200.valueobject;

import be.e1.bssv.util.J560200.valueobject.GetEmailAddress_D5601000A;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetEmailReply  extends ValueObject  implements Serializable
{
  private static final long serialVersionUID = 1L;

  /**
   * Call Plan Ask
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CPASK <br>
   * EnterpriseOne field length:  1000 <br>
   */
  private String EmailAddress = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String ErrorCode = null;

  /**
   * Data Field 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTA1 <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String ErrorDescription = null;

  /**
   * TODO: Default public constructor for instantiating: GetEmailReply
   */
  public GetEmailReply()
  {
  
  }
  public GetEmailReply(GetEmailAddress_D5601000A vo)
  {

  setEmailAddress(vo.getSzEmailAddressList());
  setErrorCode(vo.getCErrorFlag());
  setErrorDescription(vo.getSzErrorDescription());
  
  }

  public void setEmailAddress(String EmailAddress)
  {
    this.EmailAddress = EmailAddress;
  }

  public String getEmailAddress()
  {
    return EmailAddress;
  }

  public void setErrorCode(String ErrorCode)
  {
    this.ErrorCode = ErrorCode;
  }

  public String getErrorCode()
  {
    return ErrorCode;
  }

  public void setErrorDescription(String ErrorDescription)
  {
    this.ErrorDescription = ErrorDescription;
  }

  public String getErrorDescription()
  {
    return ErrorDescription;
  }

  public void setE1MessageList(E1MessageList messages)
  {
  }
}
