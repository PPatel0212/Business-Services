package be.e1.bssv.J564101.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowCCBTrackerInfo extends ValueObject implements Serializable {
  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szItem_LITM = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String szCostCenter_MCU = null;

  /**
   * Change Request Reference Number 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CREF <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szCNNumber_CREF = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szRevisionF4102_MERL = null;

  /**
   * Planner Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ANPL <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   * EnterpriseOne Next Number: 00/1 <br>
   */
  private MathNumeric mnPlannerNumberF4102_ANPL = null;

  /**
   * Category - G/L
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GLPT <br>
   * EnterpriseOne field length:  4 <br>
   * EnterpriseOne User Defined Code: 41/9 <br>
   */
  private String szGLClassF4102_GLPT = null;

  /**
   * Stocking Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STKT <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne User Defined Code: 41/I <br>
   */
  private String cStockingTypeF4102_STKT = null;

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
  private MathNumeric mnSupplierNumberF4102_VEND = null;

  /**
   * Last Revision No.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RVNO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String szDrawingRevisionF4101_RVNO = null;

  /**
   * Name - Alpha
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ALPH <br>
   * EnterpriseOne field length:  40 <br>
   * EnterpriseOne Edit Rule:NE <br>
   */
  private String szSupplierNameF0101_ALPH = null;

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
  private MathNumeric mnBuyerNumberF4102_BUYR = null;

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
  private MathNumeric mnUnitCostF4105_UNCS = null;

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
  private MathNumeric mnUnitsOpenQuantityF4311_UOPN = null;

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
  private MathNumeric mnUnitsTransQtyF4801_UORG = null;

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
  private MathNumeric mnUnitsQtyShippedF4801_SOQS = null;

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
  private MathNumeric mnQtySoftCommittedF41021_PCOM = null;

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
  private MathNumeric mnQtyHardCommittedF41021_HCOM = null;

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
  private MathNumeric mnQtyWOHardCommitF41021_QOWO = null;

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
  private MathNumeric mnQtyOnHandPrimF41021_PQOH = null;

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
  private MathNumeric mnQtyAtOperationF43092_QTYO = null;

  /**
   * Component 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CPIL <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szComponentItemF3111_CPIL = null;

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
  private MathNumeric mnUnitsTransnQty_F3111_UORG = null;

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
  private MathNumeric mnQuantityTransn_F3111_TRQT = null;

  /**
   * Date - Effective
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EFT <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date jdDateEffectiF0015_EFT = null;

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
  private MathNumeric mnCurrencyConverRateF0015_CRR = null;

  /**
   * Data Item
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTAI <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szErrorCOde_DTAI = null;

  /**
   * Description 11
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DL011 <br>
   * EnterpriseOne field length:  100 <br>
   */
  private String szErrorDescription_DL011 = null;

  /**
   * Name - Alpha
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ALPH <br>
   * EnterpriseOne field length:  40 <br>
   * EnterpriseOne Edit Rule:NE <br>
   */
  private String szBuyerNameF0101_ALPH = null;

  /**
   * Name - Alpha
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ALPH <br>
   * EnterpriseOne field length:  40 <br>
   * EnterpriseOne Edit Rule:NE <br>
   */
  private String szPlannerNameF0101_ALPH = null;

  /**
   * Journaling Flag
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FLAG <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cSendDataYN_FLAG = null;
  
  
    /**
     * Journaling Flag
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FLAG <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cIsRevControlledYN = null;
    /**
     * Journaling Flag
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cIsItemUseUpYN = null;

  public void setSzItem_LITM(String szItem_LITM) {
    this.szItem_LITM = szItem_LITM;
  }

  public String getSzItem_LITM() {
    return szItem_LITM;
  }

  public void setSzCostCenter_MCU(String szCostCenter_MCU) {
    this.szCostCenter_MCU = szCostCenter_MCU;
  }

  public String getSzCostCenter_MCU() {
    return szCostCenter_MCU;
  }

  public void setSzCNNumber_CREF(String szCNNumber_CREF) {
    this.szCNNumber_CREF = szCNNumber_CREF;
  }

  public String getSzCNNumber_CREF() {
    return szCNNumber_CREF;
  }

  public void setSzRevisionF4102_MERL(String szRevisionF4102_MERL) {
    this.szRevisionF4102_MERL = szRevisionF4102_MERL;
  }

  public String getSzRevisionF4102_MERL() {
    return szRevisionF4102_MERL;
  }

  public void setMnPlannerNumberF4102_ANPL(MathNumeric mnPlannerNumberF4102_ANPL) {
    this.mnPlannerNumberF4102_ANPL = mnPlannerNumberF4102_ANPL;
  }

  public MathNumeric getMnPlannerNumberF4102_ANPL() {
    return mnPlannerNumberF4102_ANPL;
  }

  public void setSzGLClassF4102_GLPT(String szGLClassF4102_GLPT) {
    this.szGLClassF4102_GLPT = szGLClassF4102_GLPT;
  }

  public String getSzGLClassF4102_GLPT() {
    return szGLClassF4102_GLPT;
  }

  public void setCStockingTypeF4102_STKT(String cStockingTypeF4102_STKT) {
    this.cStockingTypeF4102_STKT = cStockingTypeF4102_STKT;
  }

  public String getCStockingTypeF4102_STKT() {
    return cStockingTypeF4102_STKT;
  }

  public void setMnSupplierNumberF4102_VEND(MathNumeric mnSupplierNumberF4102_VEND) {
    this.mnSupplierNumberF4102_VEND = mnSupplierNumberF4102_VEND;
  }

  public MathNumeric getMnSupplierNumberF4102_VEND() {
    return mnSupplierNumberF4102_VEND;
  }

  public void setSzDrawingRevisionF4101_RVNO(String szDrawingRevisionF4101_RVNO) {
    this.szDrawingRevisionF4101_RVNO = szDrawingRevisionF4101_RVNO;
  }

  public String getSzDrawingRevisionF4101_RVNO() {
    return szDrawingRevisionF4101_RVNO;
  }

  public void setSzSupplierNameF0101_ALPH(String szSupplierNameF0101_ALPH) {
    this.szSupplierNameF0101_ALPH = szSupplierNameF0101_ALPH;
  }

  public String getSzSupplierNameF0101_ALPH() {
    return szSupplierNameF0101_ALPH;
  }

  public void setMnBuyerNumberF4102_BUYR(MathNumeric mnBuyerNumberF4102_BUYR) {
    this.mnBuyerNumberF4102_BUYR = mnBuyerNumberF4102_BUYR;
  }

  public MathNumeric getMnBuyerNumberF4102_BUYR() {
    return mnBuyerNumberF4102_BUYR;
  }

  public void setMnUnitCostF4105_UNCS(MathNumeric mnUnitCostF4105_UNCS) {
    this.mnUnitCostF4105_UNCS = mnUnitCostF4105_UNCS;
  }

  public MathNumeric getMnUnitCostF4105_UNCS() {
    return mnUnitCostF4105_UNCS;
  }

  public void setMnUnitsOpenQuantityF4311_UOPN(MathNumeric mnUnitsOpenQuantityF4311_UOPN) {
    this.mnUnitsOpenQuantityF4311_UOPN = mnUnitsOpenQuantityF4311_UOPN;
  }

  public MathNumeric getMnUnitsOpenQuantityF4311_UOPN() {
    return mnUnitsOpenQuantityF4311_UOPN;
  }

  public void setMnUnitsTransQtyF4801_UORG(MathNumeric mnUnitsTransQtyF4801_UORG) {
    this.mnUnitsTransQtyF4801_UORG = mnUnitsTransQtyF4801_UORG;
  }

  public MathNumeric getMnUnitsTransQtyF4801_UORG() {
    return mnUnitsTransQtyF4801_UORG;
  }

  public void setMnUnitsQtyShippedF4801_SOQS(MathNumeric mnUnitsQtyShippedF4801_SOQS) {
    this.mnUnitsQtyShippedF4801_SOQS = mnUnitsQtyShippedF4801_SOQS;
  }

  public MathNumeric getMnUnitsQtyShippedF4801_SOQS() {
    return mnUnitsQtyShippedF4801_SOQS;
  }

  public void setMnQtySoftCommittedF41021_PCOM(MathNumeric mnQtySoftCommittedF41021_PCOM) {
    this.mnQtySoftCommittedF41021_PCOM = mnQtySoftCommittedF41021_PCOM;
  }

  public MathNumeric getMnQtySoftCommittedF41021_PCOM() {
    return mnQtySoftCommittedF41021_PCOM;
  }

  public void setMnQtyHardCommittedF41021_HCOM(MathNumeric mnQtyHardCommittedF41021_HCOM) {
    this.mnQtyHardCommittedF41021_HCOM = mnQtyHardCommittedF41021_HCOM;
  }

  public MathNumeric getMnQtyHardCommittedF41021_HCOM() {
    return mnQtyHardCommittedF41021_HCOM;
  }

  public void setMnQtyWOHardCommitF41021_QOWO(MathNumeric mnQtyWOHardCommitF41021_QOWO) {
    this.mnQtyWOHardCommitF41021_QOWO = mnQtyWOHardCommitF41021_QOWO;
  }

  public MathNumeric getMnQtyWOHardCommitF41021_QOWO() {
    return mnQtyWOHardCommitF41021_QOWO;
  }

  public void setMnQtyOnHandPrimF41021_PQOH(MathNumeric mnQtyOnHandPrimF41021_PQOH) {
    this.mnQtyOnHandPrimF41021_PQOH = mnQtyOnHandPrimF41021_PQOH;
  }

  public MathNumeric getMnQtyOnHandPrimF41021_PQOH() {
    return mnQtyOnHandPrimF41021_PQOH;
  }

  public void setMnQtyAtOperationF43092_QTYO(MathNumeric mnQtyAtOperationF43092_QTYO) {
    this.mnQtyAtOperationF43092_QTYO = mnQtyAtOperationF43092_QTYO;
  }

  public MathNumeric getMnQtyAtOperationF43092_QTYO() {
    return mnQtyAtOperationF43092_QTYO;
  }

  public void setSzComponentItemF3111_CPIL(String szComponentItemF3111_CPIL) {
    this.szComponentItemF3111_CPIL = szComponentItemF3111_CPIL;
  }

  public String getSzComponentItemF3111_CPIL() {
    return szComponentItemF3111_CPIL;
  }

  public void setMnUnitsTransnQty_F3111_UORG(MathNumeric mnUnitsTransnQty_F3111_UORG) {
    this.mnUnitsTransnQty_F3111_UORG = mnUnitsTransnQty_F3111_UORG;
  }

  public MathNumeric getMnUnitsTransnQty_F3111_UORG() {
    return mnUnitsTransnQty_F3111_UORG;
  }

  public void setMnQuantityTransn_F3111_TRQT(MathNumeric mnQuantityTransn_F3111_TRQT) {
    this.mnQuantityTransn_F3111_TRQT = mnQuantityTransn_F3111_TRQT;
  }

  public MathNumeric getMnQuantityTransn_F3111_TRQT() {
    return mnQuantityTransn_F3111_TRQT;
  }

  public void setJdDateEffectiF0015_EFT(Date jdDateEffectiF0015_EFT) {
    this.jdDateEffectiF0015_EFT = jdDateEffectiF0015_EFT;
  }

  public Date getJdDateEffectiF0015_EFT() {
    return jdDateEffectiF0015_EFT;
  }

  public void setMnCurrencyConverRateF0015_CRR(MathNumeric mnCurrencyConverRateF0015_CRR) {
    this.mnCurrencyConverRateF0015_CRR = mnCurrencyConverRateF0015_CRR;
  }

  public MathNumeric getMnCurrencyConverRateF0015_CRR() {
    return mnCurrencyConverRateF0015_CRR;
  }

  public void setSzErrorCOde_DTAI(String szErrorCOde_DTAI) {
    this.szErrorCOde_DTAI = szErrorCOde_DTAI;
  }

  public String getSzErrorCOde_DTAI() {
    return szErrorCOde_DTAI;
  }

  public void setSzErrorDescription_DL011(String szErrorDescription_DL011) {
    this.szErrorDescription_DL011 = szErrorDescription_DL011;
  }

  public String getSzErrorDescription_DL011() {
    return szErrorDescription_DL011;
  }

  public void setSzBuyerNameF0101_ALPH(String szBuyerNameF0101_ALPH) {
    this.szBuyerNameF0101_ALPH = szBuyerNameF0101_ALPH;
  }

  public String getSzBuyerNameF0101_ALPH() {
    return szBuyerNameF0101_ALPH;
  }

  public void setSzPlannerNameF0101_ALPH(String szPlannerNameF0101_ALPH) {
    this.szPlannerNameF0101_ALPH = szPlannerNameF0101_ALPH;
  }

  public String getSzPlannerNameF0101_ALPH() {
    return szPlannerNameF0101_ALPH;
  }

  public void setCSendDataYN_FLAG(String cSendDataYN_FLAG) {
    this.cSendDataYN_FLAG = cSendDataYN_FLAG;
  }

  public String getCSendDataYN_FLAG() {
    return cSendDataYN_FLAG;
  }

    public void setCIsRevControlledYN(String cIsRevControlledYN) {
        this.cIsRevControlledYN = cIsRevControlledYN;
    }

    public String getCIsRevControlledYN() {
        return cIsRevControlledYN;
    }

    public void setCIsItemUseUpYN(String cIsItemUseUpYN) {
        this.cIsItemUseUpYN = cIsItemUseUpYN;
    }

    public String getCIsItemUseUpYN() {
        return cIsItemUseUpYN;
    }
}
