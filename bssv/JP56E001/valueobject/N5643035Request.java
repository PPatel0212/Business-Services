package be.e1.bssv.JP56E001.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class N5643035Request extends ValueObject implements Serializable {
    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer ABNumber = null;

    /**
     * TODO: Default public constructor for instantiating: N5643035Request
     */
    public N5643035Request() {
    }

    public void setABNumber(Integer ABNumber) {
        this.ABNumber = ABNumber;
    }

    public Integer getABNumber() {
        return ABNumber;
    }
}
