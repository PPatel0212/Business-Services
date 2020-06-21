package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalLogEmbargoes
  extends ValueObject
  implements Serializable
{
    private MathNumeric mnTransactionID = null;
    private String szUserDefinedKey = null;
    private String szCountry = null;
    private String szEmbargoMessage = null;

    public void setMnTransactionID(MathNumeric mnTransactionID) {
        this.mnTransactionID = mnTransactionID;
    }

    public MathNumeric getMnTransactionID() {
        return mnTransactionID;
    }

    public void setSzUserDefinedKey(String szUserDefinedKey) {
        this.szUserDefinedKey = szUserDefinedKey;
    }

    public String getSzUserDefinedKey() {
        return szUserDefinedKey;
    }

    public void setSzCountry(String szCountry) {
        this.szCountry = szCountry;
    }

    public String getSzCountry() {
        return szCountry;
    }

    public void setSzEmbargoMessage(String szEmbargoMessage) {
        this.szEmbargoMessage = szEmbargoMessage;
    }

    public String getSzEmbargoMessage() {
        return szEmbargoMessage;
    }
}
