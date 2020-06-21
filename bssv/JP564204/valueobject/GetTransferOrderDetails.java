package be.e1.bssv.JP564204.valueobject;



import be.e1.bssv.J564204.valueobject.InternalValidateSOandUpdateTagFiles;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetTransferOrderDetails extends ValueObject implements Serializable {
    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer documentOrderInvoiceE = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderType = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String companyKeyOrderNo = null;

    /**
     * Ship Consolidation Flag
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56SCF <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String shipConsolidationFlag = null;

    /**
     * Production Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56PN <br>
     * EnterpriseOne field length:  100 <br>
     */
    private String productionNumber = null;

    /**
     * Production Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56PNS <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer productionNumberShort = null;
    
    private String szP4210Version_VERS = null;
    /**
     * Cache Action Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CACTN <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String cacheActionCode = null;
    
    

    /**
     * TODO: Default public constructor for instantiating: GetTransferOrderDetails
     */
    public GetTransferOrderDetails() {
    }

    public void setDocumentOrderInvoiceE(Integer documentOrderInvoiceE) {
        this.documentOrderInvoiceE = documentOrderInvoiceE;
    }

    public Integer getDocumentOrderInvoiceE() {
        return documentOrderInvoiceE;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setCompanyKeyOrderNo(String companyKeyOrderNo) {
        this.companyKeyOrderNo = companyKeyOrderNo;
    }

    public String getCompanyKeyOrderNo() {
        return companyKeyOrderNo;
    }

    public void setShipConsolidationFlag(String shipConsolidationFlag) {
        this.shipConsolidationFlag = shipConsolidationFlag;
    }

    public String getShipConsolidationFlag() {
        return shipConsolidationFlag;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumberShort(Integer productionNumberShort) {
        this.productionNumberShort = productionNumberShort;
    }

    public Integer getProductionNumberShort() {
        return productionNumberShort;
    }
    
    public void setSzP4210Version_VERS(String szP4210Version_VERS) {
        this.szP4210Version_VERS = szP4210Version_VERS;
    }

    public String getSzP4210Version_VERS() {
        return szP4210Version_VERS;
    }
    
    public E1MessageList mapFromPublished(IContext context,InternalValidateSOandUpdateTagFiles internalVO) {
        E1MessageList messages = new E1MessageList();
        if (this.getCompanyKeyOrderNo() != null )
               //internalVO.setSzCompanyKeyOrderNo_KCOO(this.getCompanyKeyOrderNo()); 
        internalVO.setSzCompanyKeyOrderNo_KCOO(FormatterUtility(context, this.getCompanyKeyOrderNo(), "KCOO", 
                                           messages, "DocumentCompany"));   
        if (this.getShipConsolidationFlag() != null )
               internalVO.setC56ShipConsolidateFlag_Z56SCF(this.getShipConsolidationFlag()); 
        if (this.getProductionNumber() != null )
               internalVO.setSzProductionNumber_Z56PN(this.getProductionNumber()); 
        if (this.getProductionNumberShort() != null && this.getProductionNumberShort() != 0)
               internalVO.setMnProdNoShort_Z56PNS(this.getProductionNumberShort()); 
        if (this.getDocumentOrderInvoiceE() != null && this.getDocumentOrderInvoiceE() != 0)
               internalVO.setMnDocumentOrderInvoiceE_DOCO(this.getDocumentOrderInvoiceE());
        if (this.getOrderType() != null)
                       internalVO.setSzOrderType_DCTO(this.getOrderType());
        if (this.getSzP4210Version_VERS() != null)
                       internalVO.setSzP4210Version_VERS(this.getSzP4210Version_VERS());
        if(this.getCacheActionCode()!= null)
            internalVO.setSzTypeCode_CACTN(this.getCacheActionCode());
      
      return null;
      
    }
    public String FormatterUtility(IContext context, String fieldToFormat,
                                   String aliasName, E1MessageList messages,
                                   String fieldName) {
        String formattedMCU = null;

        if (fieldToFormat != null && (fieldToFormat.length() > 0)) {
            try {
                formattedMCU =
                        context.getBSSVDataFormatter().format(fieldToFormat,
                                                              aliasName);
            } catch (BSSVDataFormatterException e) {
                context.getBSSVLogger().app(context,
                                            "Error when formatting " + fieldName,
                                            null, null, e);
                //Create new E1 Message with error from exception
                messages.addMessage(new E1Message(context, "002FIS",
                                                  fieldToFormat));
            }
        }

        return (formattedMCU);
    }

    public void setCacheActionCode(String cacheActionCode) {
        this.cacheActionCode = cacheActionCode;
    }

    public String getCacheActionCode() {
        return cacheActionCode;
    }
}
