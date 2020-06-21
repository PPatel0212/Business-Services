package be.e1.bssv.JP563401.valueobject;

import be.e1.bssv.J563401.valueobject.InternalMessageCancellationRequest;
import java.io.Serializable;
import java.math.BigDecimal;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetMessageCancellationRequest extends ValueObject implements Serializable {
    /**
     * Unique Key ID (Internal)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private BigDecimal uniqueKeyIDInternal = null;

    /**
     * Unique Key ID (Internal)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
   
    private String modeProcessing = null;

    /**
     * Program ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PID <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String programID = null;

    /**
     * TODO: Default public constructor for instantiating: GetMessageCancellationRequest
     */
    public GetMessageCancellationRequest() {
    }

    /**
     * Map the published value object to internal value object
     */
    public E1MessageList mapFromPublished(InternalMessageCancellationRequest internalVO) {

        internalVO.setCModeProcessing(this.getModeProcessing());
        internalVO.setSzProgramId(this.getProgramID());
        internalVO.setMnUniqueKeyIDInternal(new MathNumeric(this.getUniqueKeyIDInternal()));
        return null;
    }

    public void setModeProcessing(String modeProcessing) {
        this.modeProcessing = modeProcessing;
    }

    public String getModeProcessing() {
        return modeProcessing;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getProgramID() {
        return programID;
    }

    public void setUniqueKeyIDInternal(BigDecimal uniqueKeyIDInternal) {
        this.uniqueKeyIDInternal = uniqueKeyIDInternal;
    }

    public BigDecimal getUniqueKeyIDInternal() {
        return uniqueKeyIDInternal;
    }
}
