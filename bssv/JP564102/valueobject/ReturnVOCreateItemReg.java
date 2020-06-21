package be.e1.bssv.JP564102.valueobject;

import be.e1.bssv.J564102.valueobject.InternalCreateItemRegistry;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ReturnVOCreateItemReg extends MessageValueObject implements Serializable {
    private static final long serialVersionUID = 0L;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String dataItem = null;

    /**
     * Large String
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LGSTRNG <br>
     * EnterpriseOne field length:  1500 <br>
     */
    private String largeString = null;

    /**
     * Numeric
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITM <br>
     * EnterpriseOne field length:  8 <br>
     */
    private Integer itemNumber = null;
    

    /**
     * TODO: Default public constructor for instantiating: ReturnVOCreateItemReg
     */
   // public ReturnVOCreateItemReg(InternalCreateItemRegistry internalVO) {
   // }

    public ReturnVOCreateItemReg() {
        
    }
    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setLargeString(String largeString) {
        this.largeString = largeString;
    }

    public String getLargeString() {
        return largeString;
    }
    
    public ReturnVOCreateItemReg(InternalCreateItemRegistry internalVO) {
        this.setDataItem(internalVO.getSzErrorID());
        this.setLargeString(internalVO.getSzErrorDescription());
        this.setItemNumber(internalVO.getMnItemNumberShort());
        
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }
    public void setItemNumber(MathNumeric itemNumber) {
        this.itemNumber = itemNumber.intValue();
    }


    public Integer getItemNumber() {
        return itemNumber;
    }
}
