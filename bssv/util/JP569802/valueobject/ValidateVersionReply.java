package be.e1.bssv.util.JP569802.valueobject;

import be.e1.bssv.util.J569802.valueobject.ValidateVersion_D4002400;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ValidateVersionReply extends MessageValueObject implements Serializable {
    /**
     * Version Title
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JD <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String versionTitle = null;

    /**
     * TODO: Default public constructor for instantiating: ValidateVersionReply
     */
    public ValidateVersionReply() {
    }

    public ValidateVersionReply (ValidateVersion_D4002400 vo) 
    {
     setVersionTitle(vo.getSzVersionTitle());
    }
    public void setVersionTitle(String versionTitle) {
        this.versionTitle = versionTitle;
    }

    public String getVersionTitle() {
        return versionTitle;
    }
}
