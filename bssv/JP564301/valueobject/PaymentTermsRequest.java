package be.e1.bssv.JP564301.valueobject;

import be.e1.bssv.J5643001.valueobject.InternalPaymentTerms_D48S0350;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PaymentTermsRequest extends ValueObject implements Serializable {
    /**
     * Payment Terms Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: PTC <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String paymentTermsCode = null;

    /**
     * TODO: Default public constructor for instantiating: PaymentTermsRequest
     */
    public PaymentTermsRequest() {
    }

    public void setPaymentTermsCode(String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }

    public String getPaymentTermsCode() {
        return paymentTermsCode;
    }
    
    public E1MessageList mapPublishedToInternal(IContext context, IConnection connection, InternalPaymentTerms_D48S0350 internalVO){
        E1MessageList msg = null;
        
            internalVO.setSzPaymentTermsCode01(this.getPaymentTermsCode());
        
        return msg;
        
    }
}
