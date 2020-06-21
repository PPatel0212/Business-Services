package be.e1.bssv.J564800.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WOManager_D5648005 extends ValueObject implements Serializable
{
  /**
   * Type Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: TD1 <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String szTransactionTypeCode_TD1 = null;

  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnWONumber_DOCO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String szWOType_DCTO = null;

  /**
   * Branch
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MMCU <br>
   * EnterpriseOne field length:  12 <br>
   * EnterpriseOne Edit Rule:SERVER <br>
   */
  private String szBranchPlant_MMCU = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String szBusinessUnit_MCU = null;

  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnShortItemNumber_ITM = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szItemNumber_LITM = null;

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
  private MathNumeric mnOrderQuantity_UORG = null;

  /**
   * Status Code W.O.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRST <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/SS <br>
   */
  private String szWOStatusCode_SRST = null;

  /**
   * Date - Start (Julian)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STRT <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date jdDateStart_STRT = null;

  /**
   * Date - Requested
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DRQJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date jdDateRequested_DRQJ = null;

  /**
   * Type Bill of Material
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TBM <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne Default value: M <br>
   * EnterpriseOne User Defined Code: 40/TB <br>
   */
  private String szWOTypeBill_TBM = null;

  /**
   * Type of Routing
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRT <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne Default value: M <br>
   * EnterpriseOne User Defined Code: 40/TR <br>
   */
  private String szWOTypeRouting_TRT = null;

  /**
   * Work Order Freeze Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UNCD <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne Default value: N <br>
   * EnterpriseOne User Defined Code: H00/UN <br>
   */
  private String cWOFreezeCode_UNCD = null;

  /**
   * Production Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PMPN <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String szProductionNum_PMPN = null;

  /**
   * Production Number Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PNS <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnProductionNumShort_PNS = null;

  /**
   * Object Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OBNM <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szMediaObjectName_OBNM = null;

  /**
   * Generic Text Key
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TXKY <br>
   * EnterpriseOne field length:  254 <br>
   */
  private String szMediaObjectKey_TXKY = null;

  /**
   * Media Object Text
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MOTEXT <br>
   * EnterpriseOne field length:  30000 <br>
   */
  private String szMediaObjectText_MOTEXT = null;

  /**
   * Line/Cell Identifier
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LINE <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String szF3112LineIdentifier_LINE = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DSC1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String szF3112RoutingDesc_DSC1 = null;

  /**
   * Sequence Number - Operations
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OPSQ <br>
   * EnterpriseOne field length:  5 <br>
   * EnterpriseOne decimal places: 2 <br>
   * EnterpriseOne Default value: 00100 <br>
   */
  private MathNumeric mnF3112OperationSeq_OPSQ = null;

  /**
   * Operation Status Code W.O.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OPST <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 31/OS <br>
   */
  private String szF3112OperationStatus_OPST = null;

  /**
   * Move Hours - Standard
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MOVD <br>
   * EnterpriseOne field length:  5 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric mnF3112MoveHours_MOVD = null;

  /**
   * Queue Hours - Standard
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: QUED <br>
   * EnterpriseOne field length:  5 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric mnF3112QueueHours_QUED = null;

  /**
   * Run Machine - Standard
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RUNM <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric mnF3112RunMacStd_RUNM = null;

  /**
   * Run Labor - Standard
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RUNL <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric mnF3112RunLaborStd_RUNL = null;

  /**
   * Setup Labor - Standard
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SETL <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric mnF3112SetupLaborHrs_SETL = null;

  /**
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szP48013_WOVersion_VERS = null;

  /**
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szP3112_RoutVersion_VERS = null;

  /**
   * Unit of Measure as Input
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UOM <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/UM <br>
   */
  private String szWOItemUOM_UOM = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cMBFErrorCode_ERRC = null;

  /**
   * Data Item
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTAI <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szMBFErrorMessage = null;

  /**
   * Journaling Flag
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FLAG <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cBSSVErrorFlag_FLAG = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szBSSVErrorMsgDesc_TRANDATA = null;

  /**
   * Description 10
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DL010 <br>
   * EnterpriseOne field length:  50 <br>
   */
  private String szBSSVRequestId_DL010 = null;

  /**
   * User Reserved Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URAB <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnUserResNum_URAB = null;

  /**
   * User Reserved Amount
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URAT <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric mnUserResAmt_URAT = null;

  /**
   * User Reserved Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URRF <br>
   * EnterpriseOne field length:  15 <br>
   */
  private String szUserResRef_URRF = null;

  /**
   * User Reserved Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URCD <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String szUserResCode_URCD = null;

  /**
   * User Reserved Date
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URDT <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date jdUserResDate_URDT = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cFUFlag_EV01 = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String szF3112ToWorkCenter_MCU = null;

  /**
   * Type Operation Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OPSC <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 30/OT <br>
   */
  private String szF3112TypeOpCode_OPSC = null;

  /**
   * Related PO/SO/WO Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RORN <br>
   * EnterpriseOne field length:  8 <br>
   */
  private String szRelatedOrdNum_RORN = null;

  /**
   * Related PO/SO/WO Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String szRelatedOrderType_RCTO = null;

  /**
   * Line Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LNID <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 3 <br>
   */
  private MathNumeric mnLineNumber_LNID = null;

  /**
   * Number - Parent WO Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PARS <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne Next Number: 00/1 <br>
   */
  private String szParentWoNum_PARS = null;

  /**
   * Status - Comment
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STCM <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String szStatusCommentWO_STCM = null;

  /**
   * Categories - Work Order 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: WR01 <br>
   * EnterpriseOne field length:  4 <br>
   * EnterpriseOne User Defined Code: 00/W1 <br>
   */
  private String szWOCat001_WR01 = null;

  /**
   * Categories - Work Order 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: WR02 <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne User Defined Code: 00/W2 <br>
   */
  private String szWOCat002_WR02 = null;

  /**
   * Categories - Work Order 03
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: WR03 <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne User Defined Code: 00/W3 <br>
   */
  private String szWOCat003_WR03 = null;

  /**
   * Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VR01 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szReference1_VR01 = null;

  /**
   * Reference 2
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VR02 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szReference2_VR02 = null;
  
  private String szUserId_USER = null;
  
  private MathNumeric mnMRPMessageID_UKID = null;

  public void setSzTransactionTypeCode_TD1(String szTransactionTypeCode_TD1)
  {
    this.szTransactionTypeCode_TD1 = szTransactionTypeCode_TD1;
  }

  public String getSzTransactionTypeCode_TD1()
  {
    return szTransactionTypeCode_TD1;
  }

  public void setMnWONumber_DOCO(MathNumeric mnWONumber_DOCO)
  {
    this.mnWONumber_DOCO = mnWONumber_DOCO;
  }

  public MathNumeric getMnWONumber_DOCO()
  {
    return mnWONumber_DOCO;
  }

  public void setSzWOType_DCTO(String szWOType_DCTO)
  {
    this.szWOType_DCTO = szWOType_DCTO;
  }

  public String getSzWOType_DCTO()
  {
    return szWOType_DCTO;
  }

  public void setSzBranchPlant_MMCU(String szBranchPlant_MMCU)
  {
    this.szBranchPlant_MMCU = szBranchPlant_MMCU;
  }

  public String getSzBranchPlant_MMCU()
  {
    return szBranchPlant_MMCU;
  }

  public void setSzBusinessUnit_MCU(String szBusinessUnit_MCU)
  {
    this.szBusinessUnit_MCU = szBusinessUnit_MCU;
  }

  public String getSzBusinessUnit_MCU()
  {
    return szBusinessUnit_MCU;
  }

  public void setMnShortItemNumber_ITM(MathNumeric mnShortItemNumber_ITM)
  {
    this.mnShortItemNumber_ITM = mnShortItemNumber_ITM;
  }

  public MathNumeric getMnShortItemNumber_ITM()
  {
    return mnShortItemNumber_ITM;
  }

  public void setSzItemNumber_LITM(String szItemNumber_LITM)
  {
    this.szItemNumber_LITM = szItemNumber_LITM;
  }

  public String getSzItemNumber_LITM()
  {
    return szItemNumber_LITM;
  }

  public void setMnOrderQuantity_UORG(MathNumeric mnOrderQuantity_UORG)
  {
    this.mnOrderQuantity_UORG = mnOrderQuantity_UORG;
  }

  public MathNumeric getMnOrderQuantity_UORG()
  {
    return mnOrderQuantity_UORG;
  }

  public void setSzWOStatusCode_SRST(String szWOStatusCode_SRST)
  {
    this.szWOStatusCode_SRST = szWOStatusCode_SRST;
  }

  public String getSzWOStatusCode_SRST()
  {
    return szWOStatusCode_SRST;
  }

  public void setJdDateStart_STRT(Date jdDateStart_STRT)
  {
    this.jdDateStart_STRT = jdDateStart_STRT;
  }

  public Date getJdDateStart_STRT()
  {
    return jdDateStart_STRT;
  }

  public void setJdDateRequested_DRQJ(Date jdDateRequested_DRQJ)
  {
    this.jdDateRequested_DRQJ = jdDateRequested_DRQJ;
  }

  public Date getJdDateRequested_DRQJ()
  {
    return jdDateRequested_DRQJ;
  }

  public void setSzWOTypeBill_TBM(String szWOTypeBill_TBM)
  {
    this.szWOTypeBill_TBM = szWOTypeBill_TBM;
  }

  public String getSzWOTypeBill_TBM()
  {
    return szWOTypeBill_TBM;
  }

  public void setSzWOTypeRouting_TRT(String szWOTypeRouting_TRT)
  {
    this.szWOTypeRouting_TRT = szWOTypeRouting_TRT;
  }

  public String getSzWOTypeRouting_TRT()
  {
    return szWOTypeRouting_TRT;
  }

  public void setCWOFreezeCode_UNCD(String cWOFreezeCode_UNCD)
  {
    this.cWOFreezeCode_UNCD = cWOFreezeCode_UNCD;
  }

  public String getCWOFreezeCode_UNCD()
  {
    return cWOFreezeCode_UNCD;
  }

  public void setSzProductionNum_PMPN(String szProductionNum_PMPN)
  {
    this.szProductionNum_PMPN = szProductionNum_PMPN;
  }

  public String getSzProductionNum_PMPN()
  {
    return szProductionNum_PMPN;
  }

  public void setMnProductionNumShort_PNS(MathNumeric mnProductionNumShort_PNS)
  {
    this.mnProductionNumShort_PNS = mnProductionNumShort_PNS;
  }

  public MathNumeric getMnProductionNumShort_PNS()
  {
    return mnProductionNumShort_PNS;
  }

  public void setSzMediaObjectName_OBNM(String szMediaObjectName_OBNM)
  {
    this.szMediaObjectName_OBNM = szMediaObjectName_OBNM;
  }

  public String getSzMediaObjectName_OBNM()
  {
    return szMediaObjectName_OBNM;
  }

  public void setSzMediaObjectKey_TXKY(String szMediaObjectKey_TXKY)
  {
    this.szMediaObjectKey_TXKY = szMediaObjectKey_TXKY;
  }

  public String getSzMediaObjectKey_TXKY()
  {
    return szMediaObjectKey_TXKY;
  }

  public void setSzMediaObjectText_MOTEXT(String szMediaObjectText_MOTEXT)
  {
    this.szMediaObjectText_MOTEXT = szMediaObjectText_MOTEXT;
  }

  public String getSzMediaObjectText_MOTEXT()
  {
    return szMediaObjectText_MOTEXT;
  }

  public void setSzF3112LineIdentifier_LINE(String szF3112LineIdentifier_LINE)
  {
    this.szF3112LineIdentifier_LINE = szF3112LineIdentifier_LINE;
  }

  public String getSzF3112LineIdentifier_LINE()
  {
    return szF3112LineIdentifier_LINE;
  }

  public void setSzF3112RoutingDesc_DSC1(String szF3112RoutingDesc_DSC1)
  {
    this.szF3112RoutingDesc_DSC1 = szF3112RoutingDesc_DSC1;
  }

  public String getSzF3112RoutingDesc_DSC1()
  {
    return szF3112RoutingDesc_DSC1;
  }

  public void setMnF3112OperationSeq_OPSQ(MathNumeric mnF3112OperationSeq_OPSQ)
  {
    this.mnF3112OperationSeq_OPSQ = mnF3112OperationSeq_OPSQ;
  }

  public MathNumeric getMnF3112OperationSeq_OPSQ()
  {
    return mnF3112OperationSeq_OPSQ;
  }

  public void setSzF3112OperationStatus_OPST(String szF3112OperationStatus_OPST)
  {
    this.szF3112OperationStatus_OPST = szF3112OperationStatus_OPST;
  }

  public String getSzF3112OperationStatus_OPST()
  {
    return szF3112OperationStatus_OPST;
  }

  public void setMnF3112MoveHours_MOVD(MathNumeric mnF3112MoveHours_MOVD)
  {
    this.mnF3112MoveHours_MOVD = mnF3112MoveHours_MOVD;
  }

  public MathNumeric getMnF3112MoveHours_MOVD()
  {
    return mnF3112MoveHours_MOVD;
  }

  public void setMnF3112QueueHours_QUED(MathNumeric mnF3112QueueHours_QUED)
  {
    this.mnF3112QueueHours_QUED = mnF3112QueueHours_QUED;
  }

  public MathNumeric getMnF3112QueueHours_QUED()
  {
    return mnF3112QueueHours_QUED;
  }

  public void setMnF3112RunMacStd_RUNM(MathNumeric mnF3112RunMacStd_RUNM)
  {
    this.mnF3112RunMacStd_RUNM = mnF3112RunMacStd_RUNM;
  }

  public MathNumeric getMnF3112RunMacStd_RUNM()
  {
    return mnF3112RunMacStd_RUNM;
  }

  public void setMnF3112RunLaborStd_RUNL(MathNumeric mnF3112RunLaborStd_RUNL)
  {
    this.mnF3112RunLaborStd_RUNL = mnF3112RunLaborStd_RUNL;
  }

  public MathNumeric getMnF3112RunLaborStd_RUNL()
  {
    return mnF3112RunLaborStd_RUNL;
  }

  public void setMnF3112SetupLaborHrs_SETL(MathNumeric mnF3112SetupLaborHrs_SETL)
  {
    this.mnF3112SetupLaborHrs_SETL = mnF3112SetupLaborHrs_SETL;
  }

  public MathNumeric getMnF3112SetupLaborHrs_SETL()
  {
    return mnF3112SetupLaborHrs_SETL;
  }

  public void setSzP48013_WOVersion_VERS(String szP48013_WOVersion_VERS)
  {
    this.szP48013_WOVersion_VERS = szP48013_WOVersion_VERS;
  }

  public String getSzP48013_WOVersion_VERS()
  {
    return szP48013_WOVersion_VERS;
  }

  public void setSzP3112_RoutVersion_VERS(String szP3112_RoutVersion_VERS)
  {
    this.szP3112_RoutVersion_VERS = szP3112_RoutVersion_VERS;
  }

  public String getSzP3112_RoutVersion_VERS()
  {
    return szP3112_RoutVersion_VERS;
  }

  public void setSzWOItemUOM_UOM(String szWOItemUOM_UOM)
  {
    this.szWOItemUOM_UOM = szWOItemUOM_UOM;
  }

  public String getSzWOItemUOM_UOM()
  {
    return szWOItemUOM_UOM;
  }

  public void setCMBFErrorCode_ERRC(String cMBFErrorCode_ERRC)
  {
    this.cMBFErrorCode_ERRC = cMBFErrorCode_ERRC;
  }

  public String getCMBFErrorCode_ERRC()
  {
    return cMBFErrorCode_ERRC;
  }

  public void setSzMBFErrorMessage(String szMBFErrorMessage)
  {
    this.szMBFErrorMessage = szMBFErrorMessage;
  }

  public String getSzMBFErrorMessage()
  {
    return szMBFErrorMessage;
  }

  public void setCBSSVErrorFlag_FLAG(String cBSSVErrorFlag_FLAG)
  {
    this.cBSSVErrorFlag_FLAG = cBSSVErrorFlag_FLAG;
  }

  public String getCBSSVErrorFlag_FLAG()
  {
    return cBSSVErrorFlag_FLAG;
  }

  public void setSzBSSVErrorMsgDesc_TRANDATA(String szBSSVErrorMsgDesc_TRANDATA)
  {
    this.szBSSVErrorMsgDesc_TRANDATA = szBSSVErrorMsgDesc_TRANDATA;
  }

  public String getSzBSSVErrorMsgDesc_TRANDATA()
  {
    return szBSSVErrorMsgDesc_TRANDATA;
  }

  public void setSzBSSVRequestId_DL010(String szBSSVRequestId_DL010)
  {
    this.szBSSVRequestId_DL010 = szBSSVRequestId_DL010;
  }

  public String getSzBSSVRequestId_DL010()
  {
    return szBSSVRequestId_DL010;
  }

  public void setMnUserResNum_URAB(MathNumeric mnUserResNum_URAB)
  {
    this.mnUserResNum_URAB = mnUserResNum_URAB;
  }

  public MathNumeric getMnUserResNum_URAB()
  {
    return mnUserResNum_URAB;
  }

  public void setMnUserResAmt_URAT(MathNumeric mnUserResAmt_URAT)
  {
    this.mnUserResAmt_URAT = mnUserResAmt_URAT;
  }

  public MathNumeric getMnUserResAmt_URAT()
  {
    return mnUserResAmt_URAT;
  }

  public void setSzUserResRef_URRF(String szUserResRef_URRF)
  {
    this.szUserResRef_URRF = szUserResRef_URRF;
  }

  public String getSzUserResRef_URRF()
  {
    return szUserResRef_URRF;
  }

  public void setSzUserResCode_URCD(String szUserResCode_URCD)
  {
    this.szUserResCode_URCD = szUserResCode_URCD;
  }

  public String getSzUserResCode_URCD()
  {
    return szUserResCode_URCD;
  }

  public void setJdUserResDate_URDT(Date jdUserResDate_URDT)
  {
    this.jdUserResDate_URDT = jdUserResDate_URDT;
  }

  public Date getJdUserResDate_URDT()
  {
    return jdUserResDate_URDT;
  }

  public void setCFUFlag_EV01(String cFUFlag_EV01)
  {
    this.cFUFlag_EV01 = cFUFlag_EV01;
  }

  public String getCFUFlag_EV01()
  {
    return cFUFlag_EV01;
  }
  
  public void setSzF3112ToWorkCenter_MCU(String szF3112ToWorkCenter_MCU)
  {
    this.szF3112ToWorkCenter_MCU = szF3112ToWorkCenter_MCU;
  }

  public String getSzF3112ToWorkCenter_MCU()
  {
    return szF3112ToWorkCenter_MCU;
  }

  public void setSzF3112TypeOpCode_OPSC(String szF3112TypeOpCode_OPSC)
  {
    this.szF3112TypeOpCode_OPSC = szF3112TypeOpCode_OPSC;
  }

  public String getSzF3112TypeOpCode_OPSC()
  {
    return szF3112TypeOpCode_OPSC;
  }

  public void setSzRelatedOrdNum_RORN(String szRelatedOrdNum_RORN)
  {
    this.szRelatedOrdNum_RORN = szRelatedOrdNum_RORN;
  }

  public String getSzRelatedOrdNum_RORN()
  {
    return szRelatedOrdNum_RORN;
  }

  public void setSzRelatedOrderType_RCTO(String szRelatedOrderType_RCTO)
  {
    this.szRelatedOrderType_RCTO = szRelatedOrderType_RCTO;
  }

  public String getSzRelatedOrderType_RCTO()
  {
    return szRelatedOrderType_RCTO;
  }

  public void setMnLineNumber_LNID(MathNumeric mnLineNumber_LNID)
  {
    this.mnLineNumber_LNID = mnLineNumber_LNID;
  }

  public MathNumeric getMnLineNumber_LNID()
  {
    return mnLineNumber_LNID;
  }

  public void setSzParentWoNum_PARS(String szParentWoNum_PARS)
  {
    this.szParentWoNum_PARS = szParentWoNum_PARS;
  }

  public String getSzParentWoNum_PARS()
  {
    return szParentWoNum_PARS;
  }

  public void setSzStatusCommentWO_STCM(String szStatusCommentWO_STCM)
  {
    this.szStatusCommentWO_STCM = szStatusCommentWO_STCM;
  }

  public String getSzStatusCommentWO_STCM()
  {
    return szStatusCommentWO_STCM;
  }

  public void setSzWOCat001_WR01(String szWOCat001_WR01)
  {
    this.szWOCat001_WR01 = szWOCat001_WR01;
  }

  public String getSzWOCat001_WR01()
  {
    return szWOCat001_WR01;
  }

  public void setSzWOCat002_WR02(String szWOCat002_WR02)
  {
    this.szWOCat002_WR02 = szWOCat002_WR02;
  }

  public String getSzWOCat002_WR02()
  {
    return szWOCat002_WR02;
  }

  public void setSzWOCat003_WR03(String szWOCat003_WR03)
  {
    this.szWOCat003_WR03 = szWOCat003_WR03;
  }

  public String getSzWOCat003_WR03()
  {
    return szWOCat003_WR03;
  }

  public void setSzReference1_VR01(String szReference1_VR01)
  {
    this.szReference1_VR01 = szReference1_VR01;
  }

  public String getSzReference1_VR01()
  {
    return szReference1_VR01;
  }

  public void setSzReference2_VR02(String szReference2_VR02)
  {
    this.szReference2_VR02 = szReference2_VR02;
  }

  public String getSzReference2_VR02()
  {
    return szReference2_VR02;
  }

    public void setSzUserId_USER(String szUserId_USER) {
        this.szUserId_USER = szUserId_USER;
    }

    public String getSzUserId_USER() {
        return szUserId_USER;
    }

  public void setMnMRPMessageID_UKID(MathNumeric mnMRPMessageID_UKID) {
    this.mnMRPMessageID_UKID = mnMRPMessageID_UKID;
  }

  public MathNumeric getMnMRPMessageID_UKID() {
    return mnMRPMessageID_UKID;
  }
}
