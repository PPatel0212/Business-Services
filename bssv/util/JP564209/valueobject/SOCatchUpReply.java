package be.e1.bssv.util.JP564209.valueobject;

import be.e1.bssv.util.J564209.valueobject.InternalSOCatchupDS;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SOCatchUpReply extends MessageValueObject implements Serializable {
    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String orderCompany = null;

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
    private Integer orderNumber = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderType = null;

    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer soldToAddressNumber = null;

    /**
     * TODO: Default public constructor for instantiating: SOCatchUpReply
     */
    public SOCatchUpReply() {
    }
    
    public SOCatchUpReply(InternalSOCatchupDS inData) {
        if(inData != null) {
            this.orderCompany = inData.getSzOrderCompany();
            this.orderType = inData.getSzOrderType();
            
            if(inData.getMnOrderNumber() != null) {
                this.orderNumber = inData.getMnOrderNumber().intValue();
            }
            
            if(inData.getMnSoldToNumber() != null) {
                this.soldToAddressNumber = inData.getMnSoldToNumber().intValue();
            }
        }
    }

    public void setOrderCompany(String orderCompany) {
        this.orderCompany = orderCompany;
    }

    public String getOrderCompany() {
        return orderCompany;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setSoldToAddressNumber(Integer soldToAddressNumber) {
        this.soldToAddressNumber = soldToAddressNumber;
    }

    public Integer getSoldToAddressNumber() {
        return soldToAddressNumber;
    }
}
