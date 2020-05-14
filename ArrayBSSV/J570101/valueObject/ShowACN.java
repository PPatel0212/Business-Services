package oracle.e1.bssv.J570101.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssv.J570101.valueobject.InternalGetACN;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowACN extends ValueObject implements Serializable {
    private ArrayList showACN = null;
    
    //private ShowACN showACN = new ShowACN();

    public void setShowInternalACN(ArrayList showACN) {
        this.showACN =showACN;
    }

    public ArrayList getShowInternalACN() {
        return showACN;
    }

    public InternalGetACN getShowInternalACN(int i) {
        return (InternalGetACN)showACN.get(i);
    }
    }
