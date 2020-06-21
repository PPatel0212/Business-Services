package be.e1.bssv.JP563401.valueobject;

import be.e1.bssv.J563401.valueobject.InternalMessageCancellationRequest;
import java.io.Serializable;
import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowMessageCancellationReply extends MessageValueObject implements Serializable {
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
    private String erroMessage = null;

    /**
     * TODO: Default public constructor for instantiating: ShowMessageCancellationReply
     */
    public ShowMessageCancellationReply() {
    }
public ShowMessageCancellationReply(InternalMessageCancellationRequest internalVO) {
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErroMessage(String erroMessage) {
        this.erroMessage = erroMessage;
    }

    public String getErroMessage() {
        return erroMessage;
    }
}
