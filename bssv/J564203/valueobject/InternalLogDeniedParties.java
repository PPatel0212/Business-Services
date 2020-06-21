package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalLogDeniedParties extends ValueObject implements Serializable {
    /**
     * Unique Key ID (Internal)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric mnTransactionID = null;

    /**
     * User Reserved String 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: USRRSV1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szUserDefinedKey = null;

    /**
     * Compliance Red Flag Words
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56CRFW <br>
     * EnterpriseOne field length:  100 <br>
     * EnterpriseOne Edit Rule:NE <br>
     */
    private String szRedFlagWords = null;

    /**
     * Line/Cell Identifier
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DFLINE <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szDeniedPartyId = null;

    /**
     * Denied Party Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56DPTP <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String szDeniedPartyType = null;

    /**
     * Denied Party Name
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56DPNM <br>
     * EnterpriseOne field length:  250 <br>
     */
    private String szDeniedPartyName = null;

    /**
     * Denied Party Address
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56DPADR <br>
     * EnterpriseOne field length:  250 <br>
     */
    private String szDeniedPartyAddress = null;

    /**
     * City
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTY1 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szDeniedPartyCity = null;

    /**
     * Country
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTR <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 00/CN <br>
     */
    private String szDeniedPartyCountry = null;

    /**
     * Reason Denial
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56RSDN <br>
     * EnterpriseOne field length:  100 <br>
     */
    private String szDenialReason = null;

    /**
     * Denied Party Agency
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56DPAG <br>
     * EnterpriseOne field length:  100 <br>
     */
    private String szAgency = null;

    /**
     * Denied Party List
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56DPLST <br>
     * EnterpriseOne field length:  250 <br>
     */
    private String szDeniedPartyList = null;

    /**
     * Citation
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56CITE <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szCitation = null;

    /**
     * Date - Item Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: XTND <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdCitationDate = null;

    /**
     * Date - Effective From
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFTS <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDenialEffectiveStart = null;

    /**
     * Date - Ending Effective
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EFTE <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDenialEffectiveEnd = null;

    /**
     * Export Denial Program
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56EXDP <br>
     * EnterpriseOne field length:  256 <br>
     */
    private String szExportDenialProgram = null;

    /**
     * Denied Party List Program
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56DPLPG <br>
     * EnterpriseOne field length:  250 <br>
     */
    private String szDeniedPartyListProgram = null;

    /**
     * Country of Origin
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: YCOOR <br>
     * EnterpriseOne field length:  50 <br>
     * EnterpriseOne User Defined Code: 00/CN <br>
     */
    private String szDeniedListCountry = null;

    /**
     * Alternate Vessel Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: WAVNUM <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szVesselCallSign = null;

    /**
     * Vessel Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56VSTP <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szVesselType = null;

    /**
     * Vessel Tonnage
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56VSTG <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szVesselTonnage = null;

    /**
     * Vessel GRT
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56VGRT <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szVesselGRT = null;

    /**
     * Vessel Flag
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56VSFG <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szVesselFlag = null;

    /**
     * Vessel Owner
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56VSOW <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szVesselOwner = null;

    /**
     * Lot Comments
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CMMENT <br>
     * EnterpriseOne field length:  200 <br>
     */
    private String szComments = null;

    /**
     * Date - Order/Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDateAdded = null;

    /**
     * Controlling Agency
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56CTAY <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String szControllingAgency = null;

    /**
     * Denied Party Words
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56DPWDS <br>
     * EnterpriseOne field length:  250 <br>
     */
    private String szDeniedPartyWords = null;

    public void setMnTransactionID(MathNumeric mnTransactionID) {
        this.mnTransactionID = mnTransactionID;
    }

    public MathNumeric getMnTransactionID() {
        return mnTransactionID;
    }

    public void setSzRedFlagWords(String szRedFlagWords) {
        this.szRedFlagWords = szRedFlagWords;
    }

    public String getSzRedFlagWords() {
        return szRedFlagWords;
    }

    public void setSzDeniedPartyId(String szDeniedPartyId) {
        this.szDeniedPartyId = szDeniedPartyId;
    }

    public String getSzDeniedPartyId() {
        return szDeniedPartyId;
    }

    public void setSzDeniedPartyType(String szDeniedPartyType) {
        this.szDeniedPartyType = szDeniedPartyType;
    }

    public String getSzDeniedPartyType() {
        return szDeniedPartyType;
    }

    public void setSzDeniedPartyName(String szDeniedPartyName) {
        this.szDeniedPartyName = szDeniedPartyName;
    }

    public String getSzDeniedPartyName() {
        return szDeniedPartyName;
    }

    public void setSzDeniedPartyAddress(String szDeniedPartyAddress) {
        this.szDeniedPartyAddress = szDeniedPartyAddress;
    }

    public String getSzDeniedPartyAddress() {
        return szDeniedPartyAddress;
    }

    public void setSzDeniedPartyCity(String szDeniedPartyCity) {
        this.szDeniedPartyCity = szDeniedPartyCity;
    }

    public String getSzDeniedPartyCity() {
        return szDeniedPartyCity;
    }

    public void setSzDeniedPartyCountry(String szDeniedPartyCountry) {
        this.szDeniedPartyCountry = szDeniedPartyCountry;
    }

    public String getSzDeniedPartyCountry() {
        return szDeniedPartyCountry;
    }

    public void setSzDenialReason(String szDenialReason) {
        this.szDenialReason = szDenialReason;
    }

    public String getSzDenialReason() {
        return szDenialReason;
    }

    public void setSzAgency(String szAgency) {
        this.szAgency = szAgency;
    }

    public String getSzAgency() {
        return szAgency;
    }

    public void setSzDeniedPartyList(String szDeniedPartyList) {
        this.szDeniedPartyList = szDeniedPartyList;
    }

    public String getSzDeniedPartyList() {
        return szDeniedPartyList;
    }

    public void setSzCitation(String szCitation) {
        this.szCitation = szCitation;
    }

    public String getSzCitation() {
        return szCitation;
    }

    public void setJdCitationDate(Date jdCitationDate) {
        this.jdCitationDate = jdCitationDate;
    }

    public Date getJdCitationDate() {
        return jdCitationDate;
    }

    public void setJdDenialEffectiveStart(Date jdDenialEffectiveStart) {
        this.jdDenialEffectiveStart = jdDenialEffectiveStart;
    }

    public Date getJdDenialEffectiveStart() {
        return jdDenialEffectiveStart;
    }

    public void setJdDenialEffectiveEnd(Date jdDenialEffectiveEnd) {
        this.jdDenialEffectiveEnd = jdDenialEffectiveEnd;
    }

    public Date getJdDenialEffectiveEnd() {
        return jdDenialEffectiveEnd;
    }

    public void setSzExportDenialProgram(String szExportDenialProgram) {
        this.szExportDenialProgram = szExportDenialProgram;
    }

    public String getSzExportDenialProgram() {
        return szExportDenialProgram;
    }

    public void setSzDeniedPartyListProgram(String szDeniedPartyListProgram) {
        this.szDeniedPartyListProgram = szDeniedPartyListProgram;
    }

    public String getSzDeniedPartyListProgram() {
        return szDeniedPartyListProgram;
    }

    public void setSzDeniedListCountry(String szDeniedListCountry) {
        this.szDeniedListCountry = szDeniedListCountry;
    }

    public String getSzDeniedListCountry() {
        return szDeniedListCountry;
    }

    public void setSzVesselCallSign(String szVesselCallSign) {
        this.szVesselCallSign = szVesselCallSign;
    }

    public String getSzVesselCallSign() {
        return szVesselCallSign;
    }

    public void setSzVesselType(String szVesselType) {
        this.szVesselType = szVesselType;
    }

    public String getSzVesselType() {
        return szVesselType;
    }

    public void setSzVesselTonnage(String szVesselTonnage) {
        this.szVesselTonnage = szVesselTonnage;
    }

    public String getSzVesselTonnage() {
        return szVesselTonnage;
    }

    public void setSzVesselGRT(String szVesselGRT) {
        this.szVesselGRT = szVesselGRT;
    }

    public String getSzVesselGRT() {
        return szVesselGRT;
    }

    public void setSzVesselFlag(String szVesselFlag) {
        this.szVesselFlag = szVesselFlag;
    }

    public String getSzVesselFlag() {
        return szVesselFlag;
    }

    public void setSzVesselOwner(String szVesselOwner) {
        this.szVesselOwner = szVesselOwner;
    }

    public String getSzVesselOwner() {
        return szVesselOwner;
    }

    public void setSzComments(String szComments) {
        this.szComments = szComments;
    }

    public String getSzComments() {
        return szComments;
    }

    public void setJdDateAdded(Date jdDateAdded) {
        this.jdDateAdded = jdDateAdded;
    }

    public Date getJdDateAdded() {
        return jdDateAdded;
    }

    public void setSzControllingAgency(String szControllingAgency) {
        this.szControllingAgency = szControllingAgency;
    }

    public String getSzControllingAgency() {
        return szControllingAgency;
    }

    public void setSzDeniedPartyWords(String szDeniedPartyWords) {
        this.szDeniedPartyWords = szDeniedPartyWords;
    }

    public String getSzDeniedPartyWords() {
        return szDeniedPartyWords;
    }

    public void setSzUserDefinedKey(String szUserDefinedKey) {
        this.szUserDefinedKey = szUserDefinedKey;
    }

    public String getSzUserDefinedKey() {
        return szUserDefinedKey;
    }
}
