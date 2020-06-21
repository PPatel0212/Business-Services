package be.e1.bssv.JP56RC01.valueobject;


import be.e1.bssv.J56RC01.valueobject.InternalGetCheckandRetrieveItemRevInformation;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowCheckandRetrieveItemRevInformation extends MessageValueObject implements Serializable {
  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorCode = null;

  /**
   * Data Item
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTAI <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String dataItem = null;

  /**
   * Item Number - Unknown Format Entered
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: UITM <br>
   * EnterpriseOne field length:  26 <br>
   */
  private String itemNumberUnknownFormatEntered = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cItemRevisionControl = null;

  /**
   * Rev Control Item Base Id.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCITMB <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String revControlItemBaseId = null;

  /**
   * Rev Control Item Revision Id.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCITMR <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String revControlItemRevisionId = null;

  /**
   * Rev Control Latest Revision
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCLREV <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String revControlLatestRevision = null;

  /**
   * Rev Control Revision Id.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCREVID <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String revControlRevisionId = null;

  /**
   * Item Number - Unknown Format Entered
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UITM <br>
   * EnterpriseOne field length:  26 <br>
   */
  private String szEnteredItem = null;

  public ShowCheckandRetrieveItemRevInformation() {

  }

  /**
   * TODO: Default public constructor for instantiating: ShowCheckandRetrieveItemRevInformation
   */
  public ShowCheckandRetrieveItemRevInformation(InternalGetCheckandRetrieveItemRevInformation internalVO) {

    this.setCItemRevisionControl(internalVO.getCItemRevControl());
    this.setDataItem(internalVO.getSzDataItem());
    this.setErrorCode(internalVO.getCErrorCode());
    this.setItemNumberUnknownFormatEntered(internalVO.getSzItemNoUnknownFormat());
    this.setRevControlItemBaseId(internalVO.getSzRCBaseItemId());
    this.setRevControlItemRevisionId(internalVO.getSzRCRevItemId());
    this.setRevControlLatestRevision(internalVO.getSzRCLatestRev());
    this.setRevControlRevisionId(internalVO.getSzRCRevisionId());
    this.setSzEnteredItem(internalVO.getSzEnteredItem_UITM());
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setDataItem(String dataItem) {
    this.dataItem = dataItem;
  }

  public String getDataItem() {
    return dataItem;
  }

  public void setItemNumberUnknownFormatEntered(String itemNumberUnknownFormatEntered) {
    this.itemNumberUnknownFormatEntered = itemNumberUnknownFormatEntered;
  }

  public String getItemNumberUnknownFormatEntered() {
    return itemNumberUnknownFormatEntered;
  }

  public void setCItemRevisionControl(String cItemRevisionControl) {
    this.cItemRevisionControl = cItemRevisionControl;
  }

  public String getCItemRevisionControl() {
    return cItemRevisionControl;
  }

  public void setRevControlItemBaseId(String revControlItemBaseId) {
    this.revControlItemBaseId = revControlItemBaseId;
  }

  public String getRevControlItemBaseId() {
    return revControlItemBaseId;
  }

  public void setRevControlItemRevisionId(String revControlItemRevisionId) {
    this.revControlItemRevisionId = revControlItemRevisionId;
  }

  public String getRevControlItemRevisionId() {
    return revControlItemRevisionId;
  }

  public void setRevControlLatestRevision(String revControlLatestRevision) {
    this.revControlLatestRevision = revControlLatestRevision;
  }

  public String getRevControlLatestRevision() {
    return revControlLatestRevision;
  }

  public void setRevControlRevisionId(String revControlRevisionId) {
    this.revControlRevisionId = revControlRevisionId;
  }

  public String getRevControlRevisionId() {
    return revControlRevisionId;
  }

  public void setSzEnteredItem(String szEnteredItem) {
    this.szEnteredItem = szEnteredItem;
  }

  public String getSzEnteredItem() {
    return szEnteredItem;
  }
}
