package be.e1.bssv.JP56RC01.valueobject;


import be.e1.bssv.J56RC01.valueobject.InternalGetCheckandRetrieveItemRevInformation;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetCheckandRetrieveItemRevInformation extends ValueObject implements Serializable {
  /**
   * Action Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ACTI <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne Default value: I <br>
   */
  private String actionCode = null;

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
   * Rev Control Revision Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCRMCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String revControlRevisionBusinessUnit = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String suppressErrorMessage = null;

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


  /**
   * TODO: Default public constructor for instantiating: GetCheckandRetrieveItemRevInformation
   */
  public GetCheckandRetrieveItemRevInformation() {
  }

  public E1MessageList mapFromPublished(IContext context,
                                        InternalGetCheckandRetrieveItemRevInformation vo) {
    vo.setCActionCode(this.getActionCode());
    vo.setCSuppressErrorMessage(this.getSuppressErrorMessage());
    vo.setSzItemNoUnknownFormat(this.getItemNumberUnknownFormatEntered());
    vo.setSzEnteredItem_UITM(this.getSzEnteredItem());
    E1MessageList messages = new E1MessageList();
    if (this.getRevControlRevisionBusinessUnit() != null) {
      vo.setSzRCRevisionBusinessUnit(FormatterUtility(context,
                                                      this.getRevControlRevisionBusinessUnit(),
                                                      "MCU", messages,
                                                      "BusinessUnit"));
    }
    return messages;
  }

  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }

  public String getActionCode() {
    return actionCode;
  }

  public void setItemNumberUnknownFormatEntered(String itemNumberUnknownFormatEntered) {
    this.itemNumberUnknownFormatEntered = itemNumberUnknownFormatEntered;
  }

  public String getItemNumberUnknownFormatEntered() {
    return itemNumberUnknownFormatEntered;
  }

  public void setRevControlRevisionBusinessUnit(String revControlRevisionBusinessUnit) {
    this.revControlRevisionBusinessUnit = revControlRevisionBusinessUnit;
  }

  public String getRevControlRevisionBusinessUnit() {
    return revControlRevisionBusinessUnit;
  }

  public void setSuppressErrorMessage(String suppressErrorMessage) {
    this.suppressErrorMessage = suppressErrorMessage;
  }

  public String getSuppressErrorMessage() {
    return suppressErrorMessage;
  }

  public void setSzEnteredItem(String szEnteredItem) {
    this.szEnteredItem = szEnteredItem;
  }

  public String getSzEnteredItem() {
    return szEnteredItem;
  }

  public String FormatterUtility(IContext context, String fieldToFormat,
                                 String aliasName, E1MessageList messages,
                                 String fieldName) {
    String formattedMCU = null;

    if (fieldToFormat != null && (fieldToFormat.length() > 0)) {
      try {
        formattedMCU =
            context.getBSSVDataFormatter().format(fieldToFormat, aliasName);
      } catch (BSSVDataFormatterException e) {
        context.getBSSVLogger().app(context,
                                    "Error when formatting " + fieldName, null,
                                    null, e);
        //Create new E1 Message with error from exception
        messages.addMessage(new E1Message(context, "002FIS", fieldToFormat));
      }
    }

    return (formattedMCU);
  }
}
