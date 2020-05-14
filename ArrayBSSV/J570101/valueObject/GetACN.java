package oracle.e1.bssv.J570101.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssv.J570101.valueobject.InternalGetACN;
import oracle.e1.bssv.J570101.valueobject.ShowACN;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetACN extends ValueObject implements Serializable {
    private ArrayList internalACN = null;
    
    private ShowACN showACN = new ShowACN();

    public void setInternalACN(ArrayList internalACN) {
        this.internalACN = internalACN;
    }

    public ArrayList getInternalACN() {
        return internalACN;
    }

    public InternalGetACN getInternalACN(int i) {
        return (InternalGetACN)internalACN.get(i);
    }

    public void setShowACN(ShowACN showACN) {
        this.showACN = showACN;
    }

    public ShowACN getShowACN() {
        return showACN;
    }
}
