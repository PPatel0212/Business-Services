package be.e1.bssv.JP564204.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SetTransferOrderResponse extends ValueObject implements Serializable {
    /**
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String errorCode = null;
    /* <p>
    * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
    * </p>
    * TODO: EnterpriseOne Key Field: false <br>
    * EnterpriseOne Alias: DTAI <br>
    * EnterpriseOne field length:  10 <br>
    */
    private String dataItem = null;

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public String getDataItem() {
        return dataItem;
    }    

    /**
     * TODO: Default public constructor for instantiating: SetTransferOrderResponse
     */
    public SetTransferOrderResponse() {
    }
  
}
