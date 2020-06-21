package be.e1.bssv.JP563002.valueobject;

import be.e1.bssv.J563002.valueobject.InternalBOMParent;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ConfirmLoadItemBOM extends MessageValueObject implements Serializable {
    /**
     * Transfer Status
     */
    private String status = null;
    
    /**
     * Transfer Status Message
     */
    private String statusMessage = null;
    
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
     * Alpha Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSCA <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String alphaDescription = null;

    /**
     * TODO: Default public constructor for instantiating: ConfirmLoadItemBOM
     */
    public ConfirmLoadItemBOM() {
    }
    
    /**
     * TODO: Public constructor for instantiating: ConfirmLoadItemBOM
     */
    public ConfirmLoadItemBOM(InternalBOMParent internalVO) {
        this.setStatus(internalVO.getStatus());
        this.setStatusMessage(internalVO.getStatusMessage());
        this.setDataItem(internalVO.getDTAI());
        this.setAlphaDescription(internalVO.getDSCA());
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setAlphaDescription(String alphaDescription) {
        this.alphaDescription = alphaDescription;
    }

    public String getAlphaDescription() {
        return alphaDescription;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
}
