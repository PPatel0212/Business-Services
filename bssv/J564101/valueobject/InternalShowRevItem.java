package be.e1.bssv.J564101.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowRevItem extends ValueObject implements Serializable {
    /**
     * Rev Control Item Revision Id.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCITMR <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F59RC002_RCITMR = null;

    public void setF59RC002_RCITMR(String F59RC002_RCITMR) {
        this.F59RC002_RCITMR = F59RC002_RCITMR;
    }

    public String getF59RC002_RCITMR() {
        return F59RC002_RCITMR;
    }
}
