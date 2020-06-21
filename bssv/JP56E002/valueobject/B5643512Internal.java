package be.e1.bssv.JP56E002.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class B5643512Internal extends ValueObject implements Serializable {
    /**
     * Printer Name
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PNTR <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szPrinterName = null;

    /**
     * Version History
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VERS <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szVersion = null;

    /**
     * Document (Voucher, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DOC <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnDocVoucherInvoiceE = null;

    /**
     * Document Company
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompanyKey = null;

    /**
     * Document Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCT <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String szDocumentType = null;

    public void setSzPrinterName(String szPrinterName) {
        this.szPrinterName = szPrinterName;
    }

    public String getSzPrinterName() {
        return szPrinterName;
    }

    public void setSzVersion(String szVersion) {
        this.szVersion = szVersion;
    }

    public String getSzVersion() {
        return szVersion;
    }

    public void setMnDocVoucherInvoiceE(MathNumeric mnDocVoucherInvoiceE) {
        this.mnDocVoucherInvoiceE = mnDocVoucherInvoiceE;
    }

    public MathNumeric getMnDocVoucherInvoiceE() {
        return mnDocVoucherInvoiceE;
    }

    public void setSzCompanyKey(String szCompanyKey) {
        this.szCompanyKey = szCompanyKey;
    }

    public String getSzCompanyKey() {
        return szCompanyKey;
    }

    public void setSzDocumentType(String szDocumentType) {
        this.szDocumentType = szDocumentType;
    }

    public String getSzDocumentType() {
        return szDocumentType;
    }
}
