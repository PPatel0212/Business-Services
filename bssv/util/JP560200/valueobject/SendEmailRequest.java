package be.e1.bssv.util.JP560200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SendEmailRequest extends ValueObject implements Serializable 
{
    /**
     * Contact E-Mail Address
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CNEM <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String emailAddressTo = null;

    /**
     * Contact E-Mail Address
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CNEM <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String emailAddressCc = null;

    /**
     * Contact E-Mail Address
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CNEM <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String emailAddressBcc = null;

    /**
     * Appointment Subject
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: APPTSUB <br>
     * EnterpriseOne field length:  256 <br>
     */
    private String subject = null;

    /**
     * E-Mail Message
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EMAILMSG <br>
     * EnterpriseOne field length:  32000 <br>
     */
    private String emailMessage = null;

    /**
     * TODO: Default public constructor for instantiating: SendEmailRequest
     */
    public SendEmailRequest() 
    {
    }

    public void setEmailAddressTo(String emailAddressTo) 
    {
        this.emailAddressTo = emailAddressTo;
    }

    public String getEmailAddressTo() 
    {
        return emailAddressTo;
    }

    public void setEmailAddressCc(String emailAddressCc) 
    {
        this.emailAddressCc = emailAddressCc;
    }

    public String getEmailAddressCc() 
    {
        return emailAddressCc;
    }

    public void setEmailAddressBcc(String emailAddressBcc) 
    {
        this.emailAddressBcc = emailAddressBcc;
    }

    public String getEmailAddressBcc() 
    {
        return emailAddressBcc;
    }

    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }

    public void setEmailMessage(String emailMessage) 
    {
        this.emailMessage = emailMessage;
    }

    public String getEmailMessage() 
    {
        return emailMessage;
    }
}
