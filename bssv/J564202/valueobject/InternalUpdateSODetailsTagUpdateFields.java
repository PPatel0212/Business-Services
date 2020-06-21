package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalUpdateSODetailsTagUpdateFields extends ValueObject implements Serializable {
    /**
     * Airworthiness Certification Required Y/N
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56ACERT <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 0 <br>
     * EnterpriseOne Edit Rule:VALUE <br>
     */
    private String F564211_Z56ACERT = null;

    public void setF564211_Z56ACERT(String F564211_Z56ACERT) {
        this.F564211_Z56ACERT = F564211_Z56ACERT;
    }

    public String getF564211_Z56ACERT() {
        return F564211_Z56ACERT;
    }
}
