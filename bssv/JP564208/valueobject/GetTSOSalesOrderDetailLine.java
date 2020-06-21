package be.e1.bssv.JP564208.valueobject;


import be.e1.bssv.J564208.valueobject.InternalGetSalesDetailLine;
import be.e1.bssv.J564208.valueobject.InternalGetSalesDetailLineWhereFields;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetTSOSalesOrderDetailLine extends ValueObject implements Serializable {
  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer documentOrderInvoiceE = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String orderType = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String costCenter = null;

  /**
   * Production Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PMPN <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String productionNumber = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String identifier2ndItem = null;

  
  /**
   * TODO: Default public constructor for instantiating: GetTSOSalesOrderDetailLine
   */
  public GetTSOSalesOrderDetailLine() {
  }
  
  public E1MessageList mapFromPublished(IContext context,
                                        InternalGetSalesDetailLine vo) {
    E1MessageList messages = new E1MessageList();
    InternalGetSalesDetailLineWhereFields queryWhereFields =
      vo.getQueryWhereFields();

    if (this.getDocumentOrderInvoiceE() != null &&
        this.getDocumentOrderInvoiceE() > 0) {
      queryWhereFields.setF4211_DOCO(new MathNumeric(this.getDocumentOrderInvoiceE()));
    }
    if (this.getOrderType() != null && !this.getOrderType().isEmpty()) {
      queryWhereFields.setF4211_DCTO(this.getOrderType());
    }

    if (this.getIdentifier2ndItem() != null &&
        !this.getIdentifier2ndItem().isEmpty()) {
      queryWhereFields.setF4211_LITM(this.getIdentifier2ndItem());
    }
    if (this.getProductionNumber() != null &&
        !this.getProductionNumber().isEmpty()) {
      queryWhereFields.setF4211_PMPN(this.getProductionNumber());
    }
    if (this.getCostCenter() != null && !this.getCostCenter().isEmpty()) {
      queryWhereFields.setF4211_MCU(FormatterUtility(context,
                                                     this.getCostCenter(),
                                                     "MCU", messages,
                                                     "BusinessUnit"));
    }

    vo.setQueryWhereFields(queryWhereFields);
    return messages;
  }

  public void setDocumentOrderInvoiceE(Integer documentOrderInvoiceE) {
    this.documentOrderInvoiceE = documentOrderInvoiceE;
  }

  public Integer getDocumentOrderInvoiceE() {
    return documentOrderInvoiceE;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public String getOrderType() {
    return orderType;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public String getCostCenter() {
    return costCenter;
  }

  public void setProductionNumber(String productionNumber) {
    this.productionNumber = productionNumber;
  }

  public String getProductionNumber() {
    return productionNumber;
  }

  public void setIdentifier2ndItem(String identifier2ndItem) {
    this.identifier2ndItem = identifier2ndItem;
  }

  public String getIdentifier2ndItem() {
    return identifier2ndItem;
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
