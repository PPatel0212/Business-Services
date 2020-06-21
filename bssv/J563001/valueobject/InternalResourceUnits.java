package be.e1.bssv.J563001.valueobject;

import java.io.Serializable;
import java.util.ArrayList;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalResourceUnits extends ValueObject implements Serializable {
    /**
     * Arraylist for Resource Units
     */  
    private ArrayList internalResourceUnitsData = null;

    public void setInternalResourceUnitsData(ArrayList internalResourceUnitsData) {
        this.internalResourceUnitsData = internalResourceUnitsData;
    }

    public ArrayList getInternalResourceUnitsData() {
        return internalResourceUnitsData;
    }
    public InternalResourceUnitsData getInternalResourceUnitsData(int i) {
        return (InternalResourceUnitsData)internalResourceUnitsData.get(i);
    }
}
