package be.e1.bssv.util.J5601019.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BEUpdateABSRequestNumber_D5601019A extends ValueObject implements Serializable {
    /**
     * Request Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: Z56REQN <br>
     * EnterpriseOne field length:  24 <br>
     */
    private String szRequestNumber_Z56REQN = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private MathNumeric mnRequestLineNumber_LNID = null;

    /**
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cErrorCode = null;

    /**
     * Error Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRDSCA <br>
     * EnterpriseOne field length:  60 <br>
     */
    private String szErrorDescription = null;

    public void setSzRequestNumber_Z56REQN(String szRequestNumber_Z56REQN) {
        this.szRequestNumber_Z56REQN = szRequestNumber_Z56REQN;
    }

    public String getSzRequestNumber_Z56REQN() {
        return szRequestNumber_Z56REQN;
    }

    public void setMnRequestLineNumber_LNID(MathNumeric mnRequestLineNumber_LNID) {
        this.mnRequestLineNumber_LNID = mnRequestLineNumber_LNID;
    }

    public MathNumeric getMnRequestLineNumber_LNID() {
        return mnRequestLineNumber_LNID;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }

    public void setSzErrorDescription(String szErrorDescription) {
        this.szErrorDescription = szErrorDescription;
    }

    public String getSzErrorDescription() {
        return szErrorDescription;
    }
}
