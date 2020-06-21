package be.e1.bssv.J564101.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalItemUseUpF59RC003 extends ValueObject implements Serializable {
    /**
     * Rev Control Revision Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCRMCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String F59RC003_RCRMCU = null;

    /**
     * Rev Control Item Revision Id.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCITMR <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F59RC003_RCITMR = null;

    /**
     * Rev Control Substitute Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCSMCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String F59RC003_RCSMCU = null;

    /**
     * Rev Control Substitute Revision Id
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCITMS <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F59RC003_RCITMS = null;

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
    private String F59RC003_RCAI = null;

    public void setF59RC003_RCRMCU(String F59RC003_RCRMCU) {
        this.F59RC003_RCRMCU = F59RC003_RCRMCU;
    }

    public String getF59RC003_RCRMCU() {
        return F59RC003_RCRMCU;
    }

    public void setF59RC003_RCITMR(String F59RC003_RCITMR) {
        this.F59RC003_RCITMR = F59RC003_RCITMR;
    }

    public String getF59RC003_RCITMR() {
        return F59RC003_RCITMR;
    }

    public void setF59RC003_RCSMCU(String F59RC003_RCSMCU) {
        this.F59RC003_RCSMCU = F59RC003_RCSMCU;
    }

    public String getF59RC003_RCSMCU() {
        return F59RC003_RCSMCU;
    }

    public void setF59RC003_RCITMS(String F59RC003_RCITMS) {
        this.F59RC003_RCITMS = F59RC003_RCITMS;
    }

    public String getF59RC003_RCITMS() {
        return F59RC003_RCITMS;
    }

    public void setF59RC003_RCAI(String F59RC003_RCAI) {
        this.F59RC003_RCAI = F59RC003_RCAI;
    }

    public String getF59RC003_RCAI() {
        return F59RC003_RCAI;
    }
}
