package be.e1.bssv.util.JP560200.valueobject;

import be.e1.bssv.util.J560200.valueobject.SendEmail_D5602000A;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SendEmailReply extends MessageValueObject implements Serializable {
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
     * Error Message
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UKEMES <br>
     * EnterpriseOne field length:  100 <br>
     */
    private String errorMessage = null;

    /**
     * TODO: Default public constructor for instantiating: SendEmailReply
     */
    public SendEmailReply() {
    }
    
    public SendEmailReply(SendEmail_D5602000A internalVO) 
    {
        this.setErrorCode(internalVO.getCErrorFlag());
        this.setErrorMessage(internalVO.getSzErrorMessage());
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
