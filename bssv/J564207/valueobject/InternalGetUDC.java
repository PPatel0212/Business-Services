package be.e1.bssv.J564207.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetUDC extends ValueObject implements Serializable {
    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szDataDictionaryItem = null;

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

    public void setSzDataDictionaryItem(String szDataDictionaryItem) {
        this.szDataDictionaryItem = szDataDictionaryItem;
    }

    public String getSzDataDictionaryItem() {
        return szDataDictionaryItem;
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
