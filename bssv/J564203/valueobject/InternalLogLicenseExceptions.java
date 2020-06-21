package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalLogLicenseExceptions
  extends ValueObject
  implements Serializable
{
    private MathNumeric mnTransactionID = null;
    private String szUserDefinedKey = null;
    private String szExceptionType = null;
    private String szLicenseType = null;
    private String szLicenseValue = null;
    private String szLicenseControlReason = null;
    private String szLicenseExceptionType = null;
    private String szLicenseExceptionValue = null;

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

    public void setSzExceptionType(String szExceptionType) {
        this.szExceptionType = szExceptionType;
    }

    public String getSzExceptionType() {
        return szExceptionType;
    }

    public void setSzLicenseType(String szLicenseType) {
        this.szLicenseType = szLicenseType;
    }

    public String getSzLicenseType() {
        return szLicenseType;
    }

    public void setSzLicenseValue(String szLicenseValue) {
        this.szLicenseValue = szLicenseValue;
    }

    public String getSzLicenseValue() {
        return szLicenseValue;
    }

    public void setSzLicenseControlReason(String szLicenseControlReason) {
        this.szLicenseControlReason = szLicenseControlReason;
    }

    public String getSzLicenseControlReason() {
        return szLicenseControlReason;
    }

    public void setSzLicenseExceptionType(String szLicenseExceptionType) {
        this.szLicenseExceptionType = szLicenseExceptionType;
    }

    public String getSzLicenseExceptionType() {
        return szLicenseExceptionType;
    }

    public void setSzLicenseExceptionValue(String szLicenseExceptionValue) {
        this.szLicenseExceptionValue = szLicenseExceptionValue;
    }

    public String getSzLicenseExceptionValue() {
        return szLicenseExceptionValue;
    }
}
