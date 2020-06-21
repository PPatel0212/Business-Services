package be.e1.bssv.util.J560200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SendEmail_D5602000A extends ValueObject implements Serializable
{
  /**
   * Call Plan Ask
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CPASK <br>
   * EnterpriseOne field length:  1000 <br>
   */
  private String szEmailAddressTo = null;

  /**
   * Call Plan Ask
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CPASK <br>
   * EnterpriseOne field length:  1000 <br>
   */
  private String szEmailAddressCc = null;

  /**
   * Call Plan Ask
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CPASK <br>
   * EnterpriseOne field length:  1000 <br>
   */
  private String szEmailAddressBcc = null;

  /**
   * Appointment Subject
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: APPTSUB <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String szSubject = null;

  /**
   * E-Mail Message
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMAILMSG <br>
   * EnterpriseOne field length:  32000 <br>
   */
  private String szEmailMessage = null;

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
   * Error Message
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UKEMES <br>
   * EnterpriseOne field length:  100 <br>
   */
  private String szErrorMessage = null;

  public void setSzEmailAddressTo(String szEmailAddressTo)
  {
    this.szEmailAddressTo = szEmailAddressTo;
  }

  public String getSzEmailAddressTo()
  {
    return szEmailAddressTo;
  }

  public void setSzEmailAddressCc(String szEmailAddressCc)
  {
    this.szEmailAddressCc = szEmailAddressCc;
  }

  public String getSzEmailAddressCc()
  {
    return szEmailAddressCc;
  }

  public void setSzEmailAddressBcc(String szEmailAddressBcc)
  {
    this.szEmailAddressBcc = szEmailAddressBcc;
  }

  public String getSzEmailAddressBcc()
  {
    return szEmailAddressBcc;
  }

  public void setSzSubject(String szSubject)
  {
    this.szSubject = szSubject;
  }

  public String getSzSubject()
  {
    return szSubject;
  }

  public void setSzEmailMessage(String szEmailMessage)
  {
    this.szEmailMessage = szEmailMessage;
  }

  public String getSzEmailMessage()
  {
    return szEmailMessage;
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
