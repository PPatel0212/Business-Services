package be.e1.bssv.JP564304.valueobject;

import be.e1.bssv.J564304.valueobject.InternalGetF43121;

import be.e1.bssv.J564304.valueobject.InternalGetF43121WhereFields;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetF43121 extends ValueObject implements Serializable {
    /**
     * Type - Match Record Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MATC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String matchType = null;

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
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private BigDecimal lineNumber = null;

    /**
     * TODO: Default public constructor for instantiating: GetF43121
     */
    public GetF43121() {
    }
    
    public E1MessageList mapFromPublished (IContext context,InternalGetF43121 internalGetF43121) {
        E1MessageList messages = null;
        internalGetF43121.getInternalGetF43121WhereFields().setF43121_DOCO(new MathNumeric(this.getDocumentOrderInvoiceE()) );
        internalGetF43121.getInternalGetF43121WhereFields().setF43121_KCOO(this.getCompanyKeyOrderNo());
        internalGetF43121.getInternalGetF43121WhereFields().setF43121_DCTO(this.getOrderType());
        internalGetF43121.getInternalGetF43121WhereFields().setF43121_LNID(new MathNumeric(this.getLineNumber()) );
        internalGetF43121.getInternalGetF43121WhereFields().setF43121_MATC(this.getMatchType());
    return messages;
    }
    
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setCompanyKeyOrderNo(String companyKeyOrderNo) {
        this.companyKeyOrderNo = companyKeyOrderNo;
    }

    public String getCompanyKeyOrderNo() {
        return companyKeyOrderNo;
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

    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setLineNumber(MathNumeric lineNumber) {
        if (lineNumber != null){
        this.lineNumber = lineNumber.asBigDecimal();
        }
                             }

    public BigDecimal getLineNumber() {
        return lineNumber;
    }


    
}
