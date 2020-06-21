package be.e1.bssv.util.JP560118.valueobject;

import be.e1.bssv.util.J5601019.valueobject.BEUpdateABSRequestNumber_D5601019A;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class UpdateABSRequest extends ValueObject implements Serializable {
    /**
     * Request Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: Z56REQN <br>
     * EnterpriseOne field length:  24 <br>
     */
    private String requestNumber = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private BigDecimal lineNumber = null;

    /**
     * TODO: Default public constructor for instantiating: UpdateABSRequest
     */
    public UpdateABSRequest() {
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }

    public BigDecimal getLineNumber() {
        return lineNumber;
    }
    
    public E1MessageList mapPublishedToInternal(IContext context, BEUpdateABSRequestNumber_D5601019A internalVO){
        E1MessageList message = new E1MessageList();
        
        try{
            internalVO.setMnRequestLineNumber_LNID(new MathNumeric(this.getLineNumber().intValue()));
            internalVO.setSzRequestNumber_Z56REQN(this.getRequestNumber());
            
        }catch(Exception exp){
            System.out.println(exp.getMessage());
            message.addMessage(new E1Message(context,"018FIS",exp.getMessage()));
        }
        return message;
        
    }
}
