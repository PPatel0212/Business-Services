package be.e1.bssv.JP564803.valueobject;

import be.e1.bssv.J564803.valueobject.InternalShowWorkOrderSerialNo;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WorkOrderSerialNo extends ValueObject implements Serializable {
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
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String orderType = null;

  /**
   * Serial Number 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRL1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String serialNumber1 = null;

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
   * TODO: Default public constructor for instantiating: WorkOrderSerialNo
   */
  public WorkOrderSerialNo() {
  }
  public WorkOrderSerialNo(InternalShowWorkOrderSerialNo internalShowVO){
  this.setDocumentOrderInvoiceE(internalShowVO.getF4801_DOCO());
  this.setIdentifier2ndItem(internalShowVO.getF4801_LITM());
  this.setOrderType(internalShowVO.getF4801_DCTO());
  this.setSerialNumber1(internalShowVO.getF4220_SRL1());
  }

  public void setDocumentOrderInvoiceE(Integer documentOrderInvoiceE) {
    this.documentOrderInvoiceE = documentOrderInvoiceE;
  }
  public void setDocumentOrderInvoiceE(MathNumeric documentOrderInvoiceE) {
    if (documentOrderInvoiceE!=null)
    {
    this.documentOrderInvoiceE = new Integer(documentOrderInvoiceE.intValue());
    }
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

  public void setSerialNumber1(String serialNumber1) {
    this.serialNumber1 = serialNumber1;
  }

  public String getSerialNumber1() {
    return serialNumber1;
  }

  public void setIdentifier2ndItem(String identifier2ndItem) {
    this.identifier2ndItem = identifier2ndItem;
  }

  public String getIdentifier2ndItem() {
    return identifier2ndItem;
  }
}
