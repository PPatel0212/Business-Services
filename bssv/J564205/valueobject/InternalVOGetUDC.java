package be.e1.bssv.J564205.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalVOGetUDC extends ValueObject implements Serializable {
    /**
     * Product Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SY <br>
     * EnterpriseOne field length:  4 <br>
     * EnterpriseOne User Defined Code: 98/SY <br>
     */
    private String szSystemCode = null;                                 

    /**
     * User Defined Codes
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RT <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String szRecordTypeCode = null;

    /**
     * User Defined Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KY <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szUserDefinedCode = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szDescription001 = null;

    public void setSzSystemCode(String szSystemCode) {
        this.szSystemCode = szSystemCode;
    }

    public String getSzSystemCode() {
        return szSystemCode;
    }

    public void setSzRecordTypeCode(String szRecordTypeCode) {
        this.szRecordTypeCode = szRecordTypeCode;
    }

    public String getSzRecordTypeCode() {
        return szRecordTypeCode;
    }

    public void setSzUserDefinedCode(String szUserDefinedCode) {
        this.szUserDefinedCode = szUserDefinedCode;
    }

    public String getSzUserDefinedCode() {
        return szUserDefinedCode;
    }

    public void setSzDescription001(String szDescription001) {
        this.szDescription001 = szDescription001;
    }

    public String getSzDescription001() {
        return szDescription001;
    }
}
