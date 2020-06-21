package be.e1.bssv.J564207.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSOHeaderField extends ValueObject implements Serializable {
    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szOrderNumberDocumentCompany = null;

    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnOrderNumber = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String szOrderType = null;

    /**
     * Reference 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VR02 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szReference2Vendor = null;

    public void setSzOrderNumberDocumentCompany(String szOrderNumberDocumentCompany) {
        this.szOrderNumberDocumentCompany = szOrderNumberDocumentCompany;
    }

    public String getSzOrderNumberDocumentCompany() {
        return szOrderNumberDocumentCompany;
    }

    public void setMnOrderNumber(MathNumeric mnOrderNumber) {
        this.mnOrderNumber = mnOrderNumber;
    }

    public MathNumeric getMnOrderNumber() {
        return mnOrderNumber;
    }

    public void setSzOrderType(String szOrderType) {
        this.szOrderType = szOrderType;
    }

    public String getSzOrderType() {
        return szOrderType;
    }

    public void setSzReference2Vendor(String szReference2Vendor) {
        this.szReference2Vendor = szReference2Vendor;
    }

    public String getSzReference2Vendor() {
        return szReference2Vendor;
    }
}
