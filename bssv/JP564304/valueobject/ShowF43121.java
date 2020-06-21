package be.e1.bssv.JP564304.valueobject;

import be.e1.bssv.J564304.valueobject.InternalGetF43121;
import be.e1.bssv.J564304.valueobject.InternalGetF43121WhereFields;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowF43121 extends ValueObject implements Serializable {
private String found;

    /**
     * TODO: Default public constructor for instantiating: ShowF43121
     */
    public ShowF43121() {
    }


    public void setFound(String found) {
        this.found = found;
    }

    public String getFound() {
        return found;
    }
}
