package be.e1.bssv.J564200.valueobject;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntBarcodeSymbologyType extends ValueObject implements Serializable
{
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
