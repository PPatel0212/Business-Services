package be.e1.bssv.util.JP560118.valueobject;

import be.e1.bssv.util.J5601019.valueobject.BEUpdateABSRequestNumber_D5601019A;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class UpdateABSReply extends MessageValueObject implements Serializable {
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
     * Error Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRDSCA <br>
     * EnterpriseOne field length:  60 <br>
     */
    private String errorDescription = null;

    /**
     * TODO: Default public constructor for instantiating: UpdateABSReply
     */
    public UpdateABSReply() {
    }
    
    public UpdateABSReply(BEUpdateABSRequestNumber_D5601019A vo){
        this.setErrorCode(vo.getCErrorCode());
        this.setErrorDescription(vo.getSzErrorDescription());
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
