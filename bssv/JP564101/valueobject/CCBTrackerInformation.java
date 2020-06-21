package be.e1.bssv.JP564101.valueobject;


import be.e1.bssv.J564101.valueobject.InternalShowCCBTrackerInfo;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CCBTrackerInformation extends ValueObject implements Serializable {
  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String itemNumber_LITM = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String costCenter_MCU = null;

  /**
   * Change Request Reference Number 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CREF <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String cnNumber_CREF = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String revisionF4102_MERL = null;

  /**
   * Planner Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ANPL <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer plannerNumberF4102_ANPL = null;

  /**
   * Category - G/L
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GLPT <br>
   * EnterpriseOne field length:  4 <br>
   */
  private String glClassF4102_GLPT = null;

  /**
   * Stocking Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STKT <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String stockingTypeF4102_STKT = null;

  /**
   * Primary / Last Supplier Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VEND <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer supplierNumberF4102_VEND = null;

  /**
   * Last Revision No.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RVNO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String drawingRevisionF4101_RVNO = null;

  /**
   * Name - Alpha
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ALPH <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String supplierNameF0101_ALPH = null;

  /**
   * Buyer Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: BUYR <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer buyerNumberF4102_BUYR = null;

  /**
   * Amount - Unit Cost
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UNCS <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal unitCostF4105_UNCS = null;

  /**
   * Units - Open
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UOPN <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal unitsOpenQuantityF4311_UOPN = null;

  /**
   * Units - Order/Transaction Quantity
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UORG <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal unitsTransQtyF4801_UORG = null;

  /**
   * Quantity Shipped
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SOQS <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal unitsQtyShippedF4801_SOQS = null;

  /**
   * Quantity Soft Committed
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PCOM <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal qtySoftCommittedF41021_PCOM = null;

  /**
   * Quantity - Hard Committed
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: HCOM <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal qtyHardCommittedF41021_HCOM = null;

  /**
   * Quantity - Work Order Hard Commit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: QOWO <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal qtyWOHardCommitF41021_QOWO = null;

  /**
   * Quantity on Hand - Primary units
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PQOH <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal qtyOnHandPrimF41021_PQOH = null;

  /**
   * Units - At Operation
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: QTYO <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal qtyAtOperationF43092_QTYO = null;

  /**
   * Component 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CPIL <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String componentItemF3111_CPIL = null;

  /**
   * Units - Order/Transaction Quantity
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UORG <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal unitsTransnQty_F3111_UORG = null;

  /**
   * Quantity Available
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRQT <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal quantityTransn_F3111_TRQT = null;

  /**
   * Date - Effective
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EFT <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar dateEffectiF0015_EFT = null;

  /**
   * Currency Conversion Rate - Spot Rate
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CRR <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 7 <br>
   */
  private BigDecimal currencyConverRateF0015_CRR = null;

  /**
   * Data Item
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTAI <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String errorCode_DTAI = null;

  /**
   * Description 11
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DL011 <br>
   * EnterpriseOne field length:  100 <br>
   */
  private String errorDescription_DL011 = null;

  /**
   * Name - Alpha
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ALPH <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String buyerNameF0101_ALPH = null;

  /**
   * Name - Alpha
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ALPH <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String plannerNameF0101_ALPH = null;

  /**
   * Journaling Flag
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FLAG <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String sendDataYN_FLAG = null;
  
    /**
     * Journaling Flag
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FLAG <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String isRevControlled = null;
    
    /**
     * Journaling Flag
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FLAG <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String isItemUseUp = null; 

  /**
   * TODO: Default public constructor for instantiating: CCBTrackerInformationNew
   */
  public CCBTrackerInformation() {
  }


  public CCBTrackerInformation(InternalShowCCBTrackerInfo internalShowVO) {

    this.setItemNumber_LITM(internalShowVO.getSzItem_LITM());
    this.setCostCenter_MCU(internalShowVO.getSzCostCenter_MCU());
    this.setCnNumber_CREF(internalShowVO.getSzCNNumber_CREF());

    this.setPlannerNumberF4102_ANPL(internalShowVO.getMnPlannerNumberF4102_ANPL());
    this.setPlannerNameF0101_ALPH(internalShowVO.getSzPlannerNameF0101_ALPH());

    this.setGlClassF4102_GLPT(internalShowVO.getSzGLClassF4102_GLPT());
    this.setStockingTypeF4102_STKT(internalShowVO.getCStockingTypeF4102_STKT());
    this.setDrawingRevisionF4101_RVNO(internalShowVO.getSzDrawingRevisionF4101_RVNO());

    this.setSupplierNumberF4102_VEND(internalShowVO.getMnSupplierNumberF4102_VEND());
    this.setSupplierNameF0101_ALPH(internalShowVO.getSzSupplierNameF0101_ALPH());

    this.setBuyerNumberF4102_BUYR(internalShowVO.getMnBuyerNumberF4102_BUYR());
    this.setBuyerNameF0101_ALPH(internalShowVO.getSzBuyerNameF0101_ALPH());

    this.setUnitCostF4105_UNCS(internalShowVO.getMnUnitCostF4105_UNCS());

    this.setUnitsOpenQuantityF4311_UOPN(internalShowVO.getMnUnitsOpenQuantityF4311_UOPN());

    this.setUnitsTransQtyF4801_UORG(internalShowVO.getMnUnitsTransQtyF4801_UORG());
    this.setUnitsQtyShippedF4801_SOQS(internalShowVO.getMnUnitsQtyShippedF4801_SOQS());

    this.setQtySoftCommittedF41021_PCOM(internalShowVO.getMnQtySoftCommittedF41021_PCOM());
    this.setQtyHardCommittedF41021_HCOM(internalShowVO.getMnQtyHardCommittedF41021_HCOM());
    this.setQtyWOHardCommitF41021_QOWO(internalShowVO.getMnQtyWOHardCommitF41021_QOWO());
    this.setQtyOnHandPrimF41021_PQOH(internalShowVO.getMnQtyOnHandPrimF41021_PQOH());

    this.setQtyAtOperationF43092_QTYO(internalShowVO.getMnQtyAtOperationF43092_QTYO());

    this.setComponentItemF3111_CPIL(internalShowVO.getSzComponentItemF3111_CPIL());
    this.setUnitsTransnQty_F3111_UORG(internalShowVO.getMnUnitsTransnQty_F3111_UORG());
    this.setQuantityTransn_F3111_TRQT(internalShowVO.getMnQuantityTransn_F3111_TRQT());

    this.setDateEffectiF0015_EFT(internalShowVO.getJdDateEffectiF0015_EFT());
    this.setCurrencyConverRateF0015_CRR(internalShowVO.getMnCurrencyConverRateF0015_CRR());

    this.setErrorCode_DTAI(internalShowVO.getSzErrorCOde_DTAI());
    this.setErrorDescription_DL011(internalShowVO.getSzErrorDescription_DL011());
    this.setRevisionF4102_MERL(internalShowVO.getSzRevisionF4102_MERL());

  this.setIsRevControlled(internalShowVO.getCIsRevControlledYN());
  this.setIsItemUseUp(internalShowVO.getCIsItemUseUpYN());
  }

  public void setItemNumber_LITM(String itemNumber_LITM) {
    this.itemNumber_LITM = itemNumber_LITM;
  }

  public String getItemNumber_LITM() {
    return itemNumber_LITM;
  }

  public void setCostCenter_MCU(String costCenter_MCU) {
    this.costCenter_MCU = costCenter_MCU;
  }

  public String getCostCenter_MCU() {
    return costCenter_MCU;
  }

  public void setCnNumber_CREF(String cnNumber_CREF) {
    this.cnNumber_CREF = cnNumber_CREF;
  }

  public String getCnNumber_CREF() {
    return cnNumber_CREF;
  }

  public void setRevisionF4102_MERL(String revisionF4102_MERL) {
    this.revisionF4102_MERL = revisionF4102_MERL;
  }

  public String getRevisionF4102_MERL() {
    return revisionF4102_MERL;
  }

  public void setPlannerNumberF4102_ANPL(Integer plannerNumberF4102_ANPL) {
    this.plannerNumberF4102_ANPL = plannerNumberF4102_ANPL;
  }

  public void setPlannerNumberF4102_ANPL(MathNumeric plannerNumberF4102_ANPL) {
    if (plannerNumberF4102_ANPL != null)
      this.plannerNumberF4102_ANPL = plannerNumberF4102_ANPL.intValue();
  }

  public Integer getPlannerNumberF4102_ANPL() {
    return plannerNumberF4102_ANPL;
  }

  public void setGlClassF4102_GLPT(String glClassF4102_GLPT) {
    this.glClassF4102_GLPT = glClassF4102_GLPT;
  }

  public String getGlClassF4102_GLPT() {
    return glClassF4102_GLPT;
  }

  public void setStockingTypeF4102_STKT(String stockingTypeF4102_STKT) {
    this.stockingTypeF4102_STKT = stockingTypeF4102_STKT;
  }

  public String getStockingTypeF4102_STKT() {
    return stockingTypeF4102_STKT;
  }

  public void setSupplierNumberF4102_VEND(Integer supplierNumberF4102_VEND) {
    this.supplierNumberF4102_VEND = supplierNumberF4102_VEND;
  }

  public void setSupplierNumberF4102_VEND(MathNumeric supplierNumberF4102_VEND) {
    if (supplierNumberF4102_VEND != null)
      this.supplierNumberF4102_VEND = supplierNumberF4102_VEND.intValue();
  }

  public Integer getSupplierNumberF4102_VEND() {
    return supplierNumberF4102_VEND;
  }

  public void setDrawingRevisionF4101_RVNO(String drawingRevisionF4101_RVNO) {
    this.drawingRevisionF4101_RVNO = drawingRevisionF4101_RVNO;
  }

  public String getDrawingRevisionF4101_RVNO() {
    return drawingRevisionF4101_RVNO;
  }

  public void setSupplierNameF0101_ALPH(String supplierNameF0101_ALPH) {
    this.supplierNameF0101_ALPH = supplierNameF0101_ALPH;
  }

  public String getSupplierNameF0101_ALPH() {
    return supplierNameF0101_ALPH;
  }

  public void setBuyerNumberF4102_BUYR(Integer buyerNumberF4102_BUYR) {
    this.buyerNumberF4102_BUYR = buyerNumberF4102_BUYR;
  }

  public void setBuyerNumberF4102_BUYR(MathNumeric buyerNumberF4102_BUYR) {
    if (buyerNumberF4102_BUYR != null)
      this.buyerNumberF4102_BUYR = buyerNumberF4102_BUYR.intValue();
  }

  public Integer getBuyerNumberF4102_BUYR() {
    return buyerNumberF4102_BUYR;
  }

  public void setUnitCostF4105_UNCS(BigDecimal unitCostF4105_UNCS) {
    this.unitCostF4105_UNCS = unitCostF4105_UNCS;
  }

  public void setUnitCostF4105_UNCS(MathNumeric unitCostF4105_UNCS) {
    if (unitCostF4105_UNCS != null)
      this.unitCostF4105_UNCS = unitCostF4105_UNCS.asBigDecimal();

  }

  public BigDecimal getUnitCostF4105_UNCS() {
    return unitCostF4105_UNCS;
  }

  public void setUnitsOpenQuantityF4311_UOPN(BigDecimal unitsOpenQuantityF4311_UOPN) {
    this.unitsOpenQuantityF4311_UOPN = unitsOpenQuantityF4311_UOPN;
  }

  public void setUnitsOpenQuantityF4311_UOPN(MathNumeric unitsOpenQuantityF4311_UOPN) {
    if (unitsOpenQuantityF4311_UOPN != null)
      this.unitsOpenQuantityF4311_UOPN =
          unitsOpenQuantityF4311_UOPN.asBigDecimal();
  }

  public BigDecimal getUnitsOpenQuantityF4311_UOPN() {
    return unitsOpenQuantityF4311_UOPN;
  }

  public void setUnitsTransQtyF4801_UORG(BigDecimal unitsTransQtyF4801_UORG) {
    this.unitsTransQtyF4801_UORG = unitsTransQtyF4801_UORG;
  }

  public void setUnitsTransQtyF4801_UORG(MathNumeric unitsTransQtyF4801_UORG) {
    if (unitsTransQtyF4801_UORG != null)
      this.unitsTransQtyF4801_UORG = unitsTransQtyF4801_UORG.asBigDecimal();
  }

  public BigDecimal getUnitsTransQtyF4801_UORG() {
    return unitsTransQtyF4801_UORG;
  }

  public void setUnitsQtyShippedF4801_SOQS(BigDecimal unitsQtyShippedF4801_SOQS) {
    this.unitsQtyShippedF4801_SOQS = unitsQtyShippedF4801_SOQS;
  }

  public void setUnitsQtyShippedF4801_SOQS(MathNumeric unitsQtyShippedF4801_SOQS) {
    if (unitsQtyShippedF4801_SOQS != null)
      this.unitsQtyShippedF4801_SOQS =
          unitsQtyShippedF4801_SOQS.asBigDecimal();
  }

  public BigDecimal getUnitsQtyShippedF4801_SOQS() {
    return unitsQtyShippedF4801_SOQS;
  }

  public void setQtySoftCommittedF41021_PCOM(BigDecimal qtySoftCommittedF41021_PCOM) {
    this.qtySoftCommittedF41021_PCOM = qtySoftCommittedF41021_PCOM;
  }

  public void setQtySoftCommittedF41021_PCOM(MathNumeric qtySoftCommittedF41021_PCOM) {
    if (qtySoftCommittedF41021_PCOM != null)
      this.qtySoftCommittedF41021_PCOM =
          qtySoftCommittedF41021_PCOM.asBigDecimal();
  }

  public BigDecimal getQtySoftCommittedF41021_PCOM() {
    return qtySoftCommittedF41021_PCOM;
  }

  public void setQtyHardCommittedF41021_HCOM(BigDecimal qtyHardCommittedF41021_HCOM) {
    this.qtyHardCommittedF41021_HCOM = qtyHardCommittedF41021_HCOM;
  }

  public void setQtyHardCommittedF41021_HCOM(MathNumeric qtyHardCommittedF41021_HCOM) {
    if (qtyHardCommittedF41021_HCOM != null)
      this.qtyHardCommittedF41021_HCOM =
          qtyHardCommittedF41021_HCOM.asBigDecimal();
  }

  public BigDecimal getQtyHardCommittedF41021_HCOM() {
    return qtyHardCommittedF41021_HCOM;
  }

  public void setQtyWOHardCommitF41021_QOWO(BigDecimal qtyWOHardCommitF41021_QOWO) {
    this.qtyWOHardCommitF41021_QOWO = qtyWOHardCommitF41021_QOWO;
  }

  public void setQtyWOHardCommitF41021_QOWO(MathNumeric qtyWOHardCommitF41021_QOWO) {
    if (qtyWOHardCommitF41021_QOWO != null)
      this.qtyWOHardCommitF41021_QOWO =
          qtyWOHardCommitF41021_QOWO.asBigDecimal();
  }

  public BigDecimal getQtyWOHardCommitF41021_QOWO() {
    return qtyWOHardCommitF41021_QOWO;
  }

  public void setQtyOnHandPrimF41021_PQOH(BigDecimal qtyOnHandPrimF41021_PQOH) {
    this.qtyOnHandPrimF41021_PQOH = qtyOnHandPrimF41021_PQOH;
  }

  public void setQtyOnHandPrimF41021_PQOH(MathNumeric qtyOnHandPrimF41021_PQOH) {
    if (qtyOnHandPrimF41021_PQOH != null)
      this.qtyOnHandPrimF41021_PQOH = qtyOnHandPrimF41021_PQOH.asBigDecimal();
  }

  public BigDecimal getQtyOnHandPrimF41021_PQOH() {
    return qtyOnHandPrimF41021_PQOH;
  }

  public void setQtyAtOperationF43092_QTYO(BigDecimal qtyAtOperationF43092_QTYO) {
    this.qtyAtOperationF43092_QTYO = qtyAtOperationF43092_QTYO;
  }

  public void setQtyAtOperationF43092_QTYO(MathNumeric qtyAtOperationF43092_QTYO) {
    if (qtyAtOperationF43092_QTYO != null)
      this.qtyAtOperationF43092_QTYO =
          qtyAtOperationF43092_QTYO.asBigDecimal();
  }

  public BigDecimal getQtyAtOperationF43092_QTYO() {
    return qtyAtOperationF43092_QTYO;
  }

  public void setComponentItemF3111_CPIL(String componentItemF3111_CPIL) {
    this.componentItemF3111_CPIL = componentItemF3111_CPIL;
  }

  public String getComponentItemF3111_CPIL() {
    return componentItemF3111_CPIL;
  }

  public void setUnitsTransnQty_F3111_UORG(BigDecimal unitsTransnQty_F3111_UORG) {
    this.unitsTransnQty_F3111_UORG = unitsTransnQty_F3111_UORG;
  }

  public void setUnitsTransnQty_F3111_UORG(MathNumeric unitsTransnQty_F3111_UORG) {
    if (unitsTransnQty_F3111_UORG != null)
      this.unitsTransnQty_F3111_UORG =
          unitsTransnQty_F3111_UORG.asBigDecimal();
  }

  public BigDecimal getUnitsTransnQty_F3111_UORG() {
    return unitsTransnQty_F3111_UORG;
  }

  public void setQuantityTransn_F3111_TRQT(BigDecimal quantityTransn_F3111_TRQT) {
    this.quantityTransn_F3111_TRQT = quantityTransn_F3111_TRQT;
  }

  public void setQuantityTransn_F3111_TRQT(MathNumeric quantityTransn_F3111_TRQT) {
    if (quantityTransn_F3111_TRQT != null)
      this.quantityTransn_F3111_TRQT =
          quantityTransn_F3111_TRQT.asBigDecimal();
  }

  public BigDecimal getQuantityTransn_F3111_TRQT() {
    return quantityTransn_F3111_TRQT;
  }

  public void setDateEffectiF0015_EFT(Calendar dateEffectiF0015_EFT) {
    this.dateEffectiF0015_EFT = dateEffectiF0015_EFT;
  }

  public void setDateEffectiF0015_EFT(Date dateEffectiF0015_EFT) {
    if (dateEffectiF0015_EFT != null) {
      Calendar dateEffective = Calendar.getInstance();
      dateEffective.setTime(dateEffectiF0015_EFT);
      this.dateEffectiF0015_EFT = dateEffective;
    }
  }

  public Calendar getDateEffectiF0015_EFT() {
    return dateEffectiF0015_EFT;
  }

  public void setCurrencyConverRateF0015_CRR(BigDecimal currencyConverRateF0015_CRR) {
    this.currencyConverRateF0015_CRR = currencyConverRateF0015_CRR;
  }

  public void setCurrencyConverRateF0015_CRR(MathNumeric currencyConverRateF0015_CRR) {
    if (currencyConverRateF0015_CRR != null)
      this.currencyConverRateF0015_CRR =
          currencyConverRateF0015_CRR.asBigDecimal();
  }

  public BigDecimal getCurrencyConverRateF0015_CRR() {
    return currencyConverRateF0015_CRR;
  }

  public void setErrorCode_DTAI(String errorCode_DTAI) {
    this.errorCode_DTAI = errorCode_DTAI;
  }

  public String getErrorCode_DTAI() {
    return errorCode_DTAI;
  }

  public void setErrorDescription_DL011(String errorDescription_DL011) {
    this.errorDescription_DL011 = errorDescription_DL011;
  }

  public String getErrorDescription_DL011() {
    return errorDescription_DL011;
  }

  public void setBuyerNameF0101_ALPH(String buyerNameF0101_ALPH) {
    this.buyerNameF0101_ALPH = buyerNameF0101_ALPH;
  }

  public String getBuyerNameF0101_ALPH() {
    return buyerNameF0101_ALPH;
  }

  public void setPlannerNameF0101_ALPH(String plannerNameF0101_ALPH) {
    this.plannerNameF0101_ALPH = plannerNameF0101_ALPH;
  }

  public String getPlannerNameF0101_ALPH() {
    return plannerNameF0101_ALPH;
  }

  public void setSendDataYN_FLAG(String sendDataYN_FLAG) {
    this.sendDataYN_FLAG = sendDataYN_FLAG;
  }

  public String getSendDataYN_FLAG() {
    return sendDataYN_FLAG;
  }

    public void setIsRevControlled(String isRevControlled) {
        this.isRevControlled = isRevControlled;
    }

    public String getIsRevControlled() {
        return isRevControlled;
    }

    public void setIsItemUseUp(String isItemUseUp) {
        this.isItemUseUp = isItemUseUp;
    }

    public String getIsItemUseUp() {
        return isItemUseUp;
    }
}
