package be.e1.bssv.JP564208.valueobject;


import be.e1.bssv.J564208.valueobject.InternalShowSalesDetailLine;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class TSOSalesOrderDetailLines extends ValueObject implements Serializable {
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
  private Integer soNo = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String soType = null;

  /**
   * Line Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LNID <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 3 <br>
   */
  private BigDecimal soLineNo = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String costCenter = null;

  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer shortPartNo = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String partNo = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DSC1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String partDesc = null;

  /**
   * Line Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LNTY <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne Default value: S <br>
   */
  private String solineType = null;

  /**
   * Ship Set Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56SSN <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String shipSetNumber = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String partRevision = null;

  /**
   * New / Retro Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56RET <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String isFirstManufactured = null;

  /**
   * Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VR01 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String customerPONo = null;

  /**
   * Sales Category Code 3
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRP3 <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String modelCode = null;
  
  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DSC1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String modelDescription = null;

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
  private BigDecimal paxQty = null;
  
  private BigDecimal quantityOrdered = null;
  
  private String nextStatus = null;

  TSOWorkOrderDetails[] tsoWorkOrderDetails; 
  /**
   * TODO: Default public constructor for instantiating: TSOSalesOrderDetailLines
   */
  public TSOSalesOrderDetailLines() {
  }

  public TSOSalesOrderDetailLines(InternalShowSalesDetailLine internalVO) {
    
    this.setSoNo(internalVO.getF4211_DOCO());
    this.setSoType(internalVO.getF4211_DCTO());
    this.setSoLineNo(internalVO.getF4211_LNID());
    this.setCostCenter(internalVO.getF4211_MCU());
    this.setSolineType(internalVO.getF4211_LNTY());
    this.setShortPartNo(internalVO.getF4211_ITM());
    this.setCustomerPONo(internalVO.getF4201_VR01());
    this.setPartNo(internalVO.getF4211_LITM());
    this.setPartDesc(internalVO.getF4211_DSC1());
    this.setPartRevision(internalVO.getF4211_MERL());
    this.setShipSetNumber(internalVO.getF564211_Z56SSN());
    this.setModelDescription(internalVO.getF4211_SRP3_DSC1());
    this.setModelCode(internalVO.getF4211_SRP3());
    this.setPaxQty(internalVO.getPAX_UORG());
    this.setQuantityOrdered(internalVO.getF4211_UORG());
    this.setIsFirstManufactured(internalVO.getF564201_Z56RET());
    this.setNextStatus(internalVO.getF4211_NXTR());
    
    if (internalVO.getInternalGetWODetails() != null) {

      this.tsoWorkOrderDetails =
          new TSOWorkOrderDetails[internalVO.getInternalGetWODetails().size()];
      for (int i = 0; i < internalVO.getInternalGetWODetails().size(); i++) {

        TSOWorkOrderDetails workOrderDetails =
          new TSOWorkOrderDetails(internalVO.getInternalGetWODetails(i));

        this.setTsoWorkOrderDetails(i,workOrderDetails);
      }
    } 
  }
  public void setSoNo(Integer soNo) {
    this.soNo = soNo;
  }
  public void setSoNo(MathNumeric soNo) {
    if(soNo != null){
    this.soNo = soNo.intValue();
    }
    else {
      this.soNo = new Integer(0);
    }
  }
  public Integer getSoNo() {
    return soNo;
  }

  public void setSoType(String soType) {
    this.soType = soType;
  }

  public String getSoType() {
    return soType;
  }

  public void setSoLineNo(BigDecimal soLineNo) {
    this.soLineNo = soLineNo;
  }
  public void setSoLineNo(MathNumeric soLineNo) {
    if(soLineNo!=null){
    this.soLineNo = soLineNo.asBigDecimal();
    }
    else {
      this.soLineNo = BigDecimal.ZERO;
    }
  }

  public BigDecimal getSoLineNo() {
    return soLineNo;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public String getCostCenter() {
    return costCenter;
  }

  public void setShortPartNo(Integer shortPartNo) {
    this.shortPartNo = shortPartNo;
  }
  public void setShortPartNo(MathNumeric shortPartNo) {
    if(shortPartNo!=null){
    this.shortPartNo = shortPartNo.intValue();
    }
    else{
      this.shortPartNo = new Integer(0);
    }
  }
  public Integer getShortPartNo() {
    return shortPartNo;
  }

  public void setPartNo(String partNo) {
    this.partNo = partNo;
  }

  public String getPartNo() {
    return partNo;
  }

  public void setPartDesc(String partDesc) {
    this.partDesc = partDesc;
  }

  public String getPartDesc() {
    return partDesc;
  }

  public void setSolineType(String solineType) {
    this.solineType = solineType;
  }

  public String getSolineType() {
    return solineType;
  }

  public void setShipSetNumber(String shipSetNumber) {
    this.shipSetNumber = shipSetNumber;
  }

  public String getShipSetNumber() {
    return shipSetNumber;
  }

  public void setPartRevision(String partRevision) {
    this.partRevision = partRevision;
  }

  public String getPartRevision() {
    return partRevision;
  }

  public void setIsFirstManufactured(String isFirstManufactured) {
    this.isFirstManufactured = isFirstManufactured;
  }

  public String getIsFirstManufactured() {
    return isFirstManufactured;
  }

  public void setCustomerPONo(String customerPONo) {
    this.customerPONo = customerPONo;
  }

  public String getCustomerPONo() {
    return customerPONo;
  }

  public void setModelCode(String modelCode) {
    this.modelCode = modelCode;
  }

  public String getModelCode() {
    return modelCode;
  }

  public void setModelDescription(String modelDescription) {
    this.modelDescription = modelDescription;
  }

  public String getModelDescription() {
    return modelDescription;
  }

  public void setPaxQty(BigDecimal paxQty) {
    this.paxQty = paxQty;
  }

  public void setPaxQty(MathNumeric paxQty) {
    if(paxQty!=null){
    this.paxQty = paxQty.asBigDecimal();
    }
    else{
      this.paxQty = BigDecimal.ZERO;
    }
  }
  
  public BigDecimal getPaxQty() {
    return paxQty;
  }

  public void setTsoWorkOrderDetails(TSOWorkOrderDetails[] tsoWorkOrderDetails) {
    this.tsoWorkOrderDetails = tsoWorkOrderDetails;
  }

  public void setTsoWorkOrderDetails(int i,TSOWorkOrderDetails tsoWorkOrderDetails) {
    this.tsoWorkOrderDetails[i] = tsoWorkOrderDetails;
  }
  public TSOWorkOrderDetails[] getTsoWorkOrderDetails() {
    return tsoWorkOrderDetails;
  }

    public void setQuantityOrdered(MathNumeric quantityOrdered) {
        if(quantityOrdered != null) {
            this.quantityOrdered = quantityOrdered.asBigDecimal();
        }
        else {
            this.quantityOrdered = BigDecimal.ZERO;
        }
    }

    public BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setNextStatus(String nextStatus) {
        this.nextStatus = nextStatus;
    }

    public String getNextStatus() {
        return nextStatus;
    }

    public void setQuantityOrdered(BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }
}
