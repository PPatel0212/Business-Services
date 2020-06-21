package be.e1.bssv.util.JP560118.valueobject;

import be.e1.bssv.util.J5601018.valueobject.BE_GetABSAddlData_D5601018A;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.impl.base.Context;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetABSDataRequest extends ValueObject implements Serializable {
    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer addressNumber = null;

    /**
     * TODO: Default public constructor for instantiating: GetABSDataRequest
     */
    public GetABSDataRequest() 
    {
 
    }

    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }
    
    
    public E1MessageList mapPublishedToInternal(IContext context, BE_GetABSAddlData_D5601018A internalVO){
        E1MessageList message = new E1MessageList();
        try{
            internalVO.setMnAddressNumber(new MathNumeric(this.getAddressNumber()));
        }catch(Exception exp){
            System.out.println(exp.getMessage());
            message.addMessage(new E1Message(context,"018FIS",exp.getMessage()));
        }
        return message;
        
    }
}
