package be.e1.bssv.JP563107.valueobject;

import be.e1.bssv.J563107.valueobject.InternalShowSumBOMDetails;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SumBOMDetails extends ValueObject implements Serializable {
  /**
   * TODO: Default public constructor for instantiating: SumBOMDetails
   */
  public SumBOMDetails() {
  }

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String childItemNo = null;

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
  private Integer salesOrderNo = null;

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
   * Kit - 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KITL <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String parentItemNo = null;

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
  private String salesOrderItemNo = null;

  /**
   * Stocking Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STKT <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String stockingType = null;

  /**
   * Parent (short) Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KIT <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer childShortItemNo = null;

  /**
   * Units - Order/Transaction Quantity
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UORG <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal bomQty = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String meRevisionLevel = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DSC1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String descriptionLine1 = null;
  
  /**
   * Serial Number Required
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRNR <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne Default value: N <br>
   */
  private String serialNumberRequired = null;

  private WorkOrderDetails[] workOrderDetails;

  public SumBOMDetails(InternalShowSumBOMDetails internalShowVO) {
    this.setChildItemNo(internalShowVO.getF5631006_LITM());
    this.setCostCenter(internalShowVO.getF4211_MCU());
    this.setOrderType(internalShowVO.getF4211_DCTO());
    this.setParentItemNo(internalShowVO.getF5631006_KITL());
    this.setProductionNumber(internalShowVO.getF4211_PMPN());
    this.setSalesOrderItemNo(internalShowVO.getF4211_LITM());
    this.setSalesOrderNo(internalShowVO.getF4211_DOCO());

    this.setChildShortItemNo(internalShowVO.getF5631006_ITM());
    this.setBomQty(internalShowVO.getF5631006_UORG());
    this.setDescriptionLine1(internalShowVO.getF5631006_DSC1());
    this.setMeRevisionLevel(internalShowVO.getF5631006_MERL());
    this.setStockingType(internalShowVO.getF5631006_STKT()); 
    this.setSerialNumberRequired(internalShowVO.getF4102_SRNR());
    if (internalShowVO.getInternalGetSerial() != null) {

      this.workOrderDetails =
          new WorkOrderDetails[internalShowVO.getInternalGetSerial().size()];
      for (int i = 0; i < internalShowVO.getInternalGetSerial().size(); i++) {

        WorkOrderDetails workOrderDetails =
          new WorkOrderDetails(internalShowVO.getInternalGetSerial(i));

        this.setWorkOrderDetails(i, workOrderDetails);
      }
    } 
  }

   public void setWorkOrderDetails(WorkOrderDetails[] workOrderDetails) {
    this.workOrderDetails = workOrderDetails;
  }

  public WorkOrderDetails[] getWorkOrderDetails() {
    return workOrderDetails;
  }
  
  public void setWorkOrderDetails(int i, WorkOrderDetails workOrderDetails) {
    this.workOrderDetails[i] = workOrderDetails;
  }

  public WorkOrderDetails getWorkOrderDetails(int i) {
    return workOrderDetails[i];
  } 


  public void setChildItemNo(String childItemNo) {
    this.childItemNo = childItemNo;
  }

  public String getChildItemNo() {
    return childItemNo;
  }

  public void setSalesOrderNo(Integer salesOrderNo) {
    this.salesOrderNo = salesOrderNo;
  }

  public void setSalesOrderNo(MathNumeric salesOrderNo) {
    if (salesOrderNo != null) {
      this.salesOrderNo = new Integer(salesOrderNo.intValue());
    } else {
      this.salesOrderNo = new Integer(0);
    }
  }

  public Integer getSalesOrderNo() {
    return salesOrderNo;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public String getOrderType() {
    return orderType;
  }

  public void setParentItemNo(String parentItemNo) {
    this.parentItemNo = parentItemNo;
  }

  public String getParentItemNo() {
    return parentItemNo;
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

  public void setSalesOrderItemNo(String salesOrderItemNo) {
    this.salesOrderItemNo = salesOrderItemNo;
  }

  public String getSalesOrderItemNo() {
    return salesOrderItemNo;
  }

  public void setStockingType(String stockingType) {
    this.stockingType = stockingType;
  }

  public String getStockingType() {
    return stockingType;
  }

  public void setChildShortItemNo(Integer childShortItemNo) {
    this.childShortItemNo = childShortItemNo;
  }

  public void setChildShortItemNo(MathNumeric childShortItemNo) {
    if (childShortItemNo != null) {
      this.childShortItemNo = new Integer(childShortItemNo.intValue());
    } else {
      this.childShortItemNo = new Integer(0);
    }
  }

  public Integer getChildShortItemNo() {
    return childShortItemNo;
  }

  public void setBomQty(BigDecimal bomQty) {
    this.bomQty = bomQty;
  }

  public void setBomQty(MathNumeric bomQty) {
    if (bomQty != null) {
      this.bomQty = bomQty.asBigDecimal();
    }
  }

  public BigDecimal getBomQty() {
    return bomQty;
  }

  public void setMeRevisionLevel(String meRevisionLevel) {
    this.meRevisionLevel = meRevisionLevel;
  }

  public String getMeRevisionLevel() {
    return meRevisionLevel;
  }

  public void setDescriptionLine1(String descriptionLine1) {
    this.descriptionLine1 = descriptionLine1;
  }

  public String getDescriptionLine1() {
    return descriptionLine1;
  }

  public void setSerialNumberRequired(String serialNumberRequired) {
    this.serialNumberRequired = serialNumberRequired;
  }

  public String getSerialNumberRequired() {
    return serialNumberRequired;
  }
}
