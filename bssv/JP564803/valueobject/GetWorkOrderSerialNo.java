package be.e1.bssv.JP564803.valueobject;


import be.e1.bssv.J564803.valueobject.InternalGetWorkOrderSerialNo;
import be.e1.bssv.J564803.valueobject.InternalGetWorkOrderSerialNoWhereFields;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetWorkOrderSerialNo extends ValueObject implements Serializable {
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
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String identifier2ndItem = null;

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
   * TODO: Default public constructor for instantiating: GetWorkOrderSerialNo
   */
  public GetWorkOrderSerialNo() {
  }

  public void mapFromPublished(IContext context,
                                        InternalGetWorkOrderSerialNo vo) {
    
    InternalGetWorkOrderSerialNoWhereFields queryWhereFields = vo.getQueryWhereFields();
    if (this.getDocumentOrderInvoiceE()!= null && this.getDocumentOrderInvoiceE()>0){
    queryWhereFields.setF4801_DOCO(new MathNumeric(this.getDocumentOrderInvoiceE()));
    }
    if (this.getIdentifier2ndItem()!=null&& !this.getIdentifier2ndItem().isEmpty()){
    queryWhereFields.setF4801_LITM(this.getIdentifier2ndItem());
    }
    if (this.getProductionNumber()!=null && !this.getProductionNumber().isEmpty()){
    queryWhereFields.setF4801T_PMPN(this.getProductionNumber());
    }
    vo.setQueryWhereFields(queryWhereFields);
  }

  public void setDocumentOrderInvoiceE(Integer documentOrderInvoiceE) {
    this.documentOrderInvoiceE = documentOrderInvoiceE;
  }

  public Integer getDocumentOrderInvoiceE() {
    return documentOrderInvoiceE;
  }

  public void setIdentifier2ndItem(String identifier2ndItem) {
    this.identifier2ndItem = identifier2ndItem;
  }

  public String getIdentifier2ndItem() {
    return identifier2ndItem;
  }

  public void setProductionNumber(String productionNumber) {
    this.productionNumber = productionNumber;
  }

  public String getProductionNumber() {
    return productionNumber;
  }
}
