package be.e1.bssv.J564204.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalValidateSOandUpdateTagFiles extends ValueObject implements Serializable {
    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String szCompanyKeyOrderNo_KCOO = null;

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
    private MathNumeric mnDocumentOrderInvoiceE_DOCO = null;

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
    private String szOrderType_DCTO = null;

    /**
     * Version History
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VERS <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szP4210Version_VERS = null;

    /**
     * Program ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PID <br>
     * EnterpriseOne field length:  10 <br>
     * EnterpriseOne Edit Rule:CHKOBJ <br>
     */
    private String szProgramId_PID = null;

    /**
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cErrorCode_ERRC = null;

    /**
     * Production Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56PNS <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnProdNoShort_Z56PNS = null;

    /**
     * Production Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56PN <br>
     * EnterpriseOne field length:  100 <br>
     */
    private String szProductionNumber_Z56PN = null;

    /**
     * Ship Consolidation Flag
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56SCF <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne User Defined Code: 56/YN <br>
     */
    private String c56ShipConsolidateFlag_Z56SCF = null;
    
    /**  Production number short interger variable */
    private Integer nProdNoShort_Z56PNS = null;
    
    /**  document Number  interger variable */
    private Integer nDocumentOrderInvoiceE_DOCO = null;
    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szErrorCodeId_DTAI = null;

    /**
     * Cache Action Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CACTN <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String szTypeCode_CACTN = null;
    
    

    public void setSzCompanyKeyOrderNo_KCOO(String szCompanyKeyOrderNo_KCOO) {
        this.szCompanyKeyOrderNo_KCOO = szCompanyKeyOrderNo_KCOO;
    }

    public String getSzCompanyKeyOrderNo_KCOO() {
        return szCompanyKeyOrderNo_KCOO;
    }

    
    public void setMnDocumentOrderInvoiceE_DOCO(Integer nDocumentOrderInvoiceE_DOCO) {
            this.mnDocumentOrderInvoiceE_DOCO = new MathNumeric(nDocumentOrderInvoiceE_DOCO);
        }

    public MathNumeric getMnDocumentOrderInvoiceE_DOCO() {
        return mnDocumentOrderInvoiceE_DOCO;
    }

    public void setSzOrderType_DCTO(String szOrderType_DCTO) {
        this.szOrderType_DCTO = szOrderType_DCTO;
    }

    public String getSzOrderType_DCTO() {
        return szOrderType_DCTO;
    }

    public void setSzP4210Version_VERS(String szP4210Version_VERS) {
        this.szP4210Version_VERS = szP4210Version_VERS;
    }

    public String getSzP4210Version_VERS() {
        return szP4210Version_VERS;
    }

    public void setSzProgramId_PID(String szProgramId_PID) {
        this.szProgramId_PID = szProgramId_PID;
    }

    public String getSzProgramId_PID() {
        return szProgramId_PID;
    }

    public void setCErrorCode_ERRC(String cErrorCode_ERRC) {
        this.cErrorCode_ERRC = cErrorCode_ERRC;
    }

    public String getCErrorCode_ERRC() {
        return cErrorCode_ERRC;
    }

    public void setMnProdNoShort_Z56PNS(MathNumeric mnProdNoShort_Z56PNS) {
        this.mnProdNoShort_Z56PNS = mnProdNoShort_Z56PNS;
    }

    public MathNumeric getMnProdNoShort_Z56PNS() {
        return mnProdNoShort_Z56PNS;
    }
    public void setMnProdNoShort_Z56PNS(Integer nProdNoShort_Z56PNS) {
            this.mnProdNoShort_Z56PNS = new MathNumeric(nProdNoShort_Z56PNS);
        }

    public void setSzProductionNumber_Z56PN(String szProductionNumber_Z56PN) {
        this.szProductionNumber_Z56PN = szProductionNumber_Z56PN;
    }

    public String getSzProductionNumber_Z56PN() {
        return szProductionNumber_Z56PN;
    }

    public void setC56ShipConsolidateFlag_Z56SCF(String c56ShipConsolidateFlag_Z56SCF) {
        this.c56ShipConsolidateFlag_Z56SCF = c56ShipConsolidateFlag_Z56SCF;
    }

    public String getC56ShipConsolidateFlag_Z56SCF() {
        return c56ShipConsolidateFlag_Z56SCF;
    }

    public void setSzErrorCodeId_DTAI(String szErrorCodeId_DTAI) {
        this.szErrorCodeId_DTAI = szErrorCodeId_DTAI;
    }

    public String getSzErrorCodeId_DTAI() {
        return szErrorCodeId_DTAI;
    }

    public void setSzTypeCode_CACTN(String szTypeCode_CACTN) {
        this.szTypeCode_CACTN = szTypeCode_CACTN;
    }

    public String getSzTypeCode_CACTN() {
        return szTypeCode_CACTN;
    }
}
