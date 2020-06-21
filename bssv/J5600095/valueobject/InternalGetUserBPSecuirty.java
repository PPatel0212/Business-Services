package be.e1.bssv.J5600095.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetUserBPSecuirty extends ValueObject implements Serializable {
    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szCostCenter_MCU = null;

    /**
     * User ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: USER <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szUserId_USER = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cAccessYN_EV01 = null;
    private String cReadWriteRW_EV01 = null;


    public void setSzCostCenter_MCU(String szCostCenter_MCU) {
        this.szCostCenter_MCU = szCostCenter_MCU;
    }

    public String getSzCostCenter_MCU() {
        return szCostCenter_MCU;
    }

    public void setSzUserId_USER(String szUserId_USER) {
        this.szUserId_USER = szUserId_USER;
    }

    public String getSzUserId_USER() {
        return szUserId_USER;
    }

    public void setCAccessYN_EV01(String cAccessYN_EV01) {
        this.cAccessYN_EV01 = cAccessYN_EV01;
    }

    public String getCAccessYN_EV01() {
        return cAccessYN_EV01;
    }

  public void setCReadWriteRW_EV01(String cReadWriteRW_EV01) {
    this.cReadWriteRW_EV01 = cReadWriteRW_EV01;
  }

  public String getCReadWriteRW_EV01() {
    return cReadWriteRW_EV01;
  }
}
