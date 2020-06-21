package be.e1.bssv.util.J560000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ItemRevisions_D59RC001A extends ValueObject implements Serializable {
    /**
     * Action Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ACTI <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: I <br>
     * EnterpriseOne User Defined Code: H00/AC <br>
     */
    private String cActionCode = null;

    /**
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cErrorCode = null;

    /**
     * Suppress Error Message
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SUPPS <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cSuppressErrorMessage = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szDataItem = null;

    /**
     * Item Number - Unknown Format Entered
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: UITM <br>
     * EnterpriseOne field length:  26 <br>
     */
    private String szItemNoUnknownFormat = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cItemRevControl = null;

    /**
     * Rev Control Item Base Id.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RCITMB <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szRCBaseItemId = null;

    /**
     * Rev Control Item Revision Id.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RCITMR <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szRCRevItemId = null;

    /**
     * Rev Control Revision Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RCRMCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szRCRevisionBusinessUnit = null;

    /**
     * Rev Control Latest Revision
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RCLREV <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String szRCLatestRev = null;

    /**
     * Rev Control Revision Id.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RCREVID <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String szRCRevisionId = null;

    /**
     * Item Number - Unknown Format Entered
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UITM <br>
     * EnterpriseOne field length:  26 <br>
     */
    private String szEnteredItem_UITM = null;

    public void setCActionCode(String cActionCode) {
        this.cActionCode = cActionCode;
    }

    public String getCActionCode() {
        return cActionCode;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }

    public void setCSuppressErrorMessage(String cSuppressErrorMessage) {
        this.cSuppressErrorMessage = cSuppressErrorMessage;
    }

    public String getCSuppressErrorMessage() {
        return cSuppressErrorMessage;
    }

    public void setSzDataItem(String szDataItem) {
        this.szDataItem = szDataItem;
    }

    public String getSzDataItem() {
        return szDataItem;
    }

    public void setSzItemNoUnknownFormat(String szItemNoUnknownFormat) {
        this.szItemNoUnknownFormat = szItemNoUnknownFormat;
    }

    public String getSzItemNoUnknownFormat() {
        return szItemNoUnknownFormat;
    }

    public void setCItemRevControl(String cItemRevControl) {
        this.cItemRevControl = cItemRevControl;
    }

    public String getCItemRevControl() {
        return cItemRevControl;
    }

    public void setSzRCBaseItemId(String szRCBaseItemId) {
        this.szRCBaseItemId = szRCBaseItemId;
    }

    public String getSzRCBaseItemId() {
        return szRCBaseItemId;
    }

    public void setSzRCRevItemId(String szRCRevItemId) {
        this.szRCRevItemId = szRCRevItemId;
    }

    public String getSzRCRevItemId() {
        return szRCRevItemId;
    }

    public void setSzRCRevisionBusinessUnit(String szRCRevisionBusinessUnit) {
        this.szRCRevisionBusinessUnit = szRCRevisionBusinessUnit;
    }

    public String getSzRCRevisionBusinessUnit() {
        return szRCRevisionBusinessUnit;
    }

    public void setSzRCLatestRev(String szRCLatestRev) {
        this.szRCLatestRev = szRCLatestRev;
    }

    public String getSzRCLatestRev() {
        return szRCLatestRev;
    }

    public void setSzRCRevisionId(String szRCRevisionId) {
        this.szRCRevisionId = szRCRevisionId;
    }

    public String getSzRCRevisionId() {
        return szRCRevisionId;
    }

    public void setSzEnteredItem_UITM(String szEnteredItem_UITM) {
        this.szEnteredItem_UITM = szEnteredItem_UITM;
    }

    public String getSzEnteredItem_UITM() {
        return szEnteredItem_UITM;
    }
}
