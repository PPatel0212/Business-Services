package be.e1.bssv.JP560001.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ECMDocumentIDInformation extends ValueObject implements Serializable {
    /**
     * Generic String x 20
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: GS2A <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String szDataValue = null;

    /**
     * Generic String x 50
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: GS5A <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String szFieldName = null;

    /**
     * TODO: Default public constructor for instantiating: ECMDocumentIDInformation
     */
    public ECMDocumentIDInformation() {
    }

    public void setSzDataValue(String szDataValue) {
        this.szDataValue = szDataValue;
    }

    public String getSzDataValue() {
        return szDataValue;
    }

    public void setSzFieldName(String szFieldName) {
        this.szFieldName = szFieldName;
    }

    public String getSzFieldName() {
        return szFieldName;
    }
}
