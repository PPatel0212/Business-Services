package be.e1.bssv.JP56E001.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class N5643035Reply extends MessageValueObject implements Serializable {
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
    private Integer AddressBookNumber = null;

    /**
     * TODO: Default public constructor for instantiating: N5643035Reply
     */
    public N5643035Reply() {
    }
    
    public N5643035Reply(N5643035Request vo){
        this.setAddressBookNumber(vo.getABNumber());
    }

    public void setAddressBookNumber(Integer AddressBookNumber) {
        this.AddressBookNumber = AddressBookNumber;
    }

    public Integer getAddressBookNumber() {
        return AddressBookNumber;
    }
}
