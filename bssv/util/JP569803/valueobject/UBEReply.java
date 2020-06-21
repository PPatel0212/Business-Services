package be.e1.bssv.util.JP569803.valueobject;

import be.e1.bssv.util.J569802.valueobject.ValidateVersion_D4002400;

import be.e1.bssv.util.J569803.valueobject.LaunchUBE_D5698002A;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class UBEReply extends MessageValueObject implements Serializable {
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

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DS01 <br>
     * EnterpriseOne field length:  80 <br>
     */
    private String description = null;

    /**
     * Workflow Transport Data
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRANDATA <br>
     * EnterpriseOne field length:  1024 <br>
     */
    private String Link = null;

    /**
     * Print Queue
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRTQ <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String printQueue = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DS01 <br>
     * EnterpriseOne field length:  80 <br>
     */
    private String errorDescription = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String jDEnterpriseOneEventPoint01 = null;

    /**
     * TODO: Default public constructor for instantiating: UBEReply
     */
    public UBEReply() {
    }
    
    public UBEReply (LaunchUBE_D5698002A vo) 
    {
    setErrorCode(vo.getCErrorFlag());
    setErrorDescription(vo.getSzErrorMessage());
    setDescription(vo.getSzOutputFileName());
    setPrintQueue(vo.getSzPrintQueue());
    setJDEnterpriseOneEventPoint01(vo.getCRunAsynchronous());
    setLink(vo.getSzOutputFileLink());
          
    }
    
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getLink() {
        return Link;
    }

    public void setPrintQueue(String printQueue) {
        this.printQueue = printQueue;
    }

    public String getPrintQueue() {
        return printQueue;
    }

    public void setErrorDescription(String description) {
        this.errorDescription = description;
    }

    public String getErrorDescription() {
        return description;
    }

    public void setJDEnterpriseOneEventPoint01(String jDEnterpriseOneEventPoint01) {
        this.jDEnterpriseOneEventPoint01 = jDEnterpriseOneEventPoint01;
    }

    public String getJDEnterpriseOneEventPoint01() {
        return jDEnterpriseOneEventPoint01;
    }
}
