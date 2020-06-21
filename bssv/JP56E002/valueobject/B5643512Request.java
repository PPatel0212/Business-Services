package be.e1.bssv.JP56E002.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class B5643512Request extends ValueObject implements Serializable {
    /**
     * Printer Name
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PNTR <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String printerName = null;

    /**
     * Version History
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VERS <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String versionHistory = null;

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
    private Integer documentVoucherInvoiceetc = null;

    /**
     * Document Company
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String documentCompany = null;

    /**
     * Document Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCT <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String documentType = null;

    /**
     * TODO: Default public constructor for instantiating: B5643512Request
     */
    public B5643512Request() {
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setVersionHistory(String versionHistory) {
        this.versionHistory = versionHistory;
    }

    public String getVersionHistory() {
        return versionHistory;
    }

    public void setDocumentVoucherInvoiceetc(Integer documentVoucherInvoiceetc) {
        this.documentVoucherInvoiceetc = documentVoucherInvoiceetc;
    }

    public Integer getDocumentVoucherInvoiceetc() {
        return documentVoucherInvoiceetc;
    }

    public void setDocumentCompany(String documentCompany) {
        this.documentCompany = documentCompany;
    }

    public String getDocumentCompany() {
        return documentCompany;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentType() {
        return documentType;
    }
    
    public E1MessageList mapToIntenalVO(B5643512Internal intVO){
        E1MessageList msg = new E1MessageList();
        intVO.setMnDocVoucherInvoiceE(new MathNumeric(this.getDocumentVoucherInvoiceetc()));
        intVO.setSzCompanyKey(this.getDocumentCompany());
        intVO.setSzDocumentType(this.getDocumentType());
        intVO.setSzPrinterName(this.getPrinterName());
        intVO.setSzVersion(this.getVersionHistory());
        return msg;
    }
}
