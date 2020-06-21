package be.e1.bssv.J564101.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetRevisionItem extends ValueObject implements Serializable {
    /**
     * Rev Control Item Base Id.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCITMB <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F59RC002_RCITMB = null;

    /**
     * Rev Control Revision Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCRMCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String F59RC002_RCRMCU = null;

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

    /**
     * Rev Control Revision Id.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RCREVID <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String F59RC002_RCREVID = null;
    
    /**
     * Active/Inactive
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RCAI <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: A <br>
     * EnterpriseOne User Defined Code: 00/AI <br>
     */
    private String F59RC002_RCAI = null;

    public void setF59RC002_RCITMB(String F59RC002_RCITMB) {
        this.F59RC002_RCITMB = F59RC002_RCITMB;
    }

    public String getF59RC002_RCITMB() {
        return F59RC002_RCITMB;
    }

    public void setF59RC002_RCRMCU(String F59RC002_RCRMCU) {
        this.F59RC002_RCRMCU = F59RC002_RCRMCU;
    }

    public String getF59RC002_RCRMCU() {
        return F59RC002_RCRMCU;
    }

    public void setF59RC002_RCITMR(String F59RC002_RCITMR) {
        this.F59RC002_RCITMR = F59RC002_RCITMR;
    }

    public String getF59RC002_RCITMR() {
        return F59RC002_RCITMR;
    }

    public void setF59RC002_RCREVID(String F59RC002_RCREVID) {
        this.F59RC002_RCREVID = F59RC002_RCREVID;
    }

    public String getF59RC002_RCREVID() {
        return F59RC002_RCREVID;
    }

    public void setF59RC002_RCAI(String F59RC002_RCAI) {
        this.F59RC002_RCAI = F59RC002_RCAI;
    }

    public String getF59RC002_RCAI() {
        return F59RC002_RCAI;
    }
}
