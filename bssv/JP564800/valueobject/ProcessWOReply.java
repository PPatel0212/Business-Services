package be.e1.bssv.JP564800.valueobject;

import be.e1.bssv.J564800.valueobject.WOManager_D5648005;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ProcessWOReply extends MessageValueObject implements Serializable
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
  private String transactionType = null;

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
  private Integer workOrderNumber = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String workOrderType = null;

  /**
   * Branch
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MMCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String workOrderBranch = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String workCenter = null;

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
  private Integer itemNumberShort = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String itemNumber = null;

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
  private BigDecimal transactionQuantity = null;

  /**
   * Status Code W.O.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRST <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String workOrderStatus = null;

  /**
   * Date - Start (Julian)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STRT <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar startDate = null;

  /**
   * Date - Requested
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DRQJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar requestDate = null;

  /**
   * Type Bill of Material
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TBM <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne Default value: M <br>
   */
  private String typeOfBOM = null;

  /**
   * Type of Routing
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRT <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne Default value: M <br>
   */
  private String typeOfRouting = null;

  /**
   * Work Order Freeze Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UNCD <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne Default value: N <br>
   */
  private String workOrderFreezeCode = null;

  /**
   * Production Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PMPN <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String productionNumber = null;

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
  private Integer productionNumberShort = null;

  /**
   * Object Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OBNM <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String mediaObjectName = null;

  /**
   * Generic Text Key
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TXKY <br>
   * EnterpriseOne field length:  254 <br>
   */
  private String mediaObjectKey = null;

  /**
   * Media Object Text
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MOTEXT <br>
   * EnterpriseOne field length:  30000 <br>
   */
  private String mediaObjectText = null;

  /**
   * Line/Cell Identifier
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LINE <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String productionLine = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DSC1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String operationDescription = null;

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
  private BigDecimal operationSequence = null;

  /**
   * Operation Status Code W.O.
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: OPST <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String operationStatus = null;

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
  private BigDecimal moveHoursStandard = null;

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
  private BigDecimal queueHoursStandard = null;

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
  private BigDecimal machineRunHours = null;

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
  private BigDecimal laborRunHours = null;

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
  private BigDecimal setupLaborStandard = null;

  /**
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String woProgramVersion = null;

  /**
   * Version History
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VERS <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String routeProgramVersion = null;

  /**
   * Unit of Measure as Input
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UOM <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String workOrderItemUOM = null;

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
  private Integer userReservedNumber = null;

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
  private BigDecimal userReservedAmount = null;

  /**
   * User Reserved Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URRF <br>
   * EnterpriseOne field length:  15 <br>
   */
  private String userReservedReference = null;

  /**
   * User Reserved Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URCD <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String userReservedCode = null;

  /**
   * User Reserved Date
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URDT <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar userReservedDate = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String futureUseFlag = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorFlag = null;
  private String errorMessage = null;
  private String updateWorkCenter = null;
  private String opCodeType = null;

  /**
   * Related PO/SO/WO Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RORN <br>
   * EnterpriseOne field length:  8 <br>
   */
  private String relatedOrderNumber = null;

  /**
   * Related PO/SO/WO Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String relatedOrderType = null;

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
  private BigDecimal lineNumber = null;

  /**
   * Number - Parent WO Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PARS <br>
   * EnterpriseOne field length:  8 <br>
   */
  private String parentWorkOrderNumber = null;

  /**
   * Status - Comment
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STCM <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String statusCommentWorkOrder = null;

  /**
   * Categories - Work Order 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: WR01 <br>
   * EnterpriseOne field length:  4 <br>
   */
  private String workOrderCatCode01 = null;

  /**
   * Categories - Work Order 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: WR02 <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String workOrderCatCode02 = null;

  /**
   * Categories - Work Order 03
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: WR03 <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String workOrderCatCode03 = null;

  /**
   * Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VR01 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String reference1 = null;

  /**
   * Reference 2
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VR02 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String reference2 = null;
  
  private String userId = null;

  /**
   * TODO: Default public constructor for instantiating: ProcessWOReply
   */
  public ProcessWOReply()
  {
  }

  public ProcessWOReply(WOManager_D5648005 inData)
  {
    //check for bssv or Master Business Function errors
    if(inData.getCBSSVErrorFlag_FLAG() == "1")
    {
      this.errorFlag = inData.getCBSSVErrorFlag_FLAG();
      this.errorMessage = inData.getSzBSSVErrorMsgDesc_TRANDATA();
    }
    else
    {
      if(inData.getCMBFErrorCode_ERRC() == "1")
      {
        this.errorFlag = inData.getCMBFErrorCode_ERRC();
        this.errorMessage = inData.getSzMBFErrorMessage();
      }
    }
    
    //Copy string data.
    this.futureUseFlag = inData.getCFUFlag_EV01();
    this.itemNumber = inData.getSzItemNumber_LITM();
    this.mediaObjectKey = inData.getSzMediaObjectKey_TXKY();
    this.mediaObjectName = inData.getSzMediaObjectName_OBNM();
    this.mediaObjectText = inData.getSzMediaObjectText_MOTEXT();
    this.operationDescription = inData.getSzF3112RoutingDesc_DSC1();
    this.operationStatus = inData.getSzF3112OperationStatus_OPST();
    this.productionLine = inData.getSzF3112LineIdentifier_LINE();
    this.productionNumber = inData.getSzProductionNum_PMPN();
    this.routeProgramVersion = inData.getSzP3112_RoutVersion_VERS();
    this.transactionType = inData.getSzTransactionTypeCode_TD1();
    this.typeOfBOM = inData.getSzWOTypeBill_TBM();
    this.typeOfRouting = inData.getSzWOTypeRouting_TRT();
    this.userReservedCode = inData.getSzUserResCode_URCD();
    this.userReservedReference = inData.getSzUserResRef_URRF();
    this.woProgramVersion = inData.getSzP48013_WOVersion_VERS();
    this.workCenter = inData.getSzBusinessUnit_MCU();
    this.workOrderBranch = inData.getSzBranchPlant_MMCU();
    this.workOrderFreezeCode = inData.getCWOFreezeCode_UNCD();
    this.workOrderItemUOM = inData.getSzWOItemUOM_UOM();
    this.workOrderStatus = inData.getSzWOStatusCode_SRST();
    this.workOrderType = inData.getSzWOType_DCTO();
    this.updateWorkCenter = inData.getSzF3112ToWorkCenter_MCU();
    this.opCodeType = inData.getSzF3112TypeOpCode_OPSC();
    this.relatedOrderNumber = inData.getSzRelatedOrdNum_RORN();
    this.relatedOrderType = inData.getSzRelatedOrderType_RCTO();
    this.parentWorkOrderNumber = inData.getSzParentWoNum_PARS();
    this.statusCommentWorkOrder = inData.getSzStatusCommentWO_STCM();
    this.workOrderCatCode01 = inData.getSzWOCat001_WR01();
    this.workOrderCatCode02 = inData.getSzWOCat002_WR02();
    this.workOrderCatCode03 = inData.getSzWOCat003_WR03();
    this.reference1 = inData.getSzReference1_VR01();
    this.reference2 = inData.getSzReference2_VR02();
    this.userId = inData.getSzUserId_USER();
    
    //Copy numeric data
    if(inData.getMnShortItemNumber_ITM() != null)
      this.itemNumberShort = new Integer(inData.getMnShortItemNumber_ITM().intValue());
    if(inData.getMnF3112RunLaborStd_RUNL() != null)
      this.laborRunHours = inData.getMnF3112RunLaborStd_RUNL().asBigDecimal();
    if(inData.getMnF3112RunMacStd_RUNM() != null)
      this.machineRunHours = inData.getMnF3112RunMacStd_RUNM().asBigDecimal();
    if(inData.getMnF3112MoveHours_MOVD() != null)
      this.moveHoursStandard = inData.getMnF3112MoveHours_MOVD().asBigDecimal();   
    if(inData.getMnF3112OperationSeq_OPSQ() != null)
      this.operationSequence = inData.getMnF3112OperationSeq_OPSQ().asBigDecimal();
    if(inData.getMnProductionNumShort_PNS() != null)
      this.productionNumberShort = new Integer(inData.getMnProductionNumShort_PNS().intValue());
    if(inData.getMnF3112QueueHours_QUED() != null)
      this.queueHoursStandard = inData.getMnF3112QueueHours_QUED().asBigDecimal();
    if(inData.getMnF3112SetupLaborHrs_SETL() != null)
      this.setupLaborStandard = inData.getMnF3112SetupLaborHrs_SETL().asBigDecimal();
    if(inData.getMnOrderQuantity_UORG() != null)
      this.transactionQuantity = inData.getMnOrderQuantity_UORG().asBigDecimal();
    if(inData.getMnUserResAmt_URAT() != null)
      this.userReservedAmount = inData.getMnUserResAmt_URAT().asBigDecimal();
    if(inData.getMnUserResNum_URAB() != null)
      this.userReservedNumber = new Integer(inData.getMnUserResNum_URAB().intValue());
    if(inData.getMnWONumber_DOCO() != null)
      this.workOrderNumber = new Integer(inData.getMnWONumber_DOCO().intValue());
    if(inData.getMnLineNumber_LNID() != null)
      this.lineNumber = inData.getMnLineNumber_LNID().asBigDecimal();
    
    //Copy dates
    Calendar cal = Calendar.getInstance();
    if(inData.getJdDateRequested_DRQJ() != null)
    {
      cal.setTime(inData.getJdDateRequested_DRQJ());
      this.requestDate = cal;
    }    
    cal = Calendar.getInstance();
    if(inData.getJdDateStart_STRT() != null)
    {
      cal.setTime(inData.getJdDateStart_STRT());
      this.startDate = cal;
    }
    cal = Calendar.getInstance();
    if(inData.getJdUserResDate_URDT() != null)
    {
      cal.setTime(inData.getJdUserResDate_URDT());
      this.userReservedDate = cal;
    }
  }
  
  public void setTransactionType(String transactionType)
  {
    this.transactionType = transactionType;
  }

  public String getTransactionType()
  {
    return transactionType;
  }

  public void setWorkOrderNumber(Integer workOrderNumber)
  {
    this.workOrderNumber = workOrderNumber;
  }

  public Integer getWorkOrderNumber()
  {
    return workOrderNumber;
  }

  public void setWorkOrderType(String workOrderType)
  {
    this.workOrderType = workOrderType;
  }

  public String getWorkOrderType()
  {
    return workOrderType;
  }

  public void setWorkOrderBranch(String workOrderBranch)
  {
    this.workOrderBranch = workOrderBranch;
  }

  public String getWorkOrderBranch()
  {
    return workOrderBranch;
  }

  public void setWorkCenter(String workCenter)
  {
    this.workCenter = workCenter;
  }

  public String getWorkCenter()
  {
    return workCenter;
  }

  public void setItemNumberShort(Integer itemNumberShort)
  {
    this.itemNumberShort = itemNumberShort;
  }

  public Integer getItemNumberShort()
  {
    return itemNumberShort;
  }

  public void setItemNumber(String itemNumber)
  {
    this.itemNumber = itemNumber;
  }

  public String getItemNumber()
  {
    return itemNumber;
  }

  public void setTransactionQuantity(BigDecimal transactionQuantity)
  {
    this.transactionQuantity = transactionQuantity;
  }

  public BigDecimal getTransactionQuantity()
  {
    return transactionQuantity;
  }

  public void setWorkOrderStatus(String workOrderStatus)
  {
    this.workOrderStatus = workOrderStatus;
  }

  public String getWorkOrderStatus()
  {
    return workOrderStatus;
  }

  public void setStartDate(Calendar startDate)
  {
    this.startDate = startDate;
  }

  public Calendar getStartDate()
  {
    return startDate;
  }

  public void setRequestDate(Calendar requestDate)
  {
    this.requestDate = requestDate;
  }

  public Calendar getRequestDate()
  {
    return requestDate;
  }

  public void setTypeOfBOM(String typeOfBOM)
  {
    this.typeOfBOM = typeOfBOM;
  }

  public String getTypeOfBOM()
  {
    return typeOfBOM;
  }

  public void setTypeOfRouting(String typeOfRouting)
  {
    this.typeOfRouting = typeOfRouting;
  }

  public String getTypeOfRouting()
  {
    return typeOfRouting;
  }

  public void setWorkOrderFreezeCode(String workOrderFreezeCode)
  {
    this.workOrderFreezeCode = workOrderFreezeCode;
  }

  public String getWorkOrderFreezeCode()
  {
    return workOrderFreezeCode;
  }

  public void setProductionNumber(String productionNumber)
  {
    this.productionNumber = productionNumber;
  }

  public String getProductionNumber()
  {
    return productionNumber;
  }

  public void setProductionNumberShort(Integer productionNumberShort)
  {
    this.productionNumberShort = productionNumberShort;
  }

  public Integer getProductionNumberShort()
  {
    return productionNumberShort;
  }

  public void setMediaObjectName(String mediaObjectName)
  {
    this.mediaObjectName = mediaObjectName;
  }

  public String getMediaObjectName()
  {
    return mediaObjectName;
  }

  public void setMediaObjectKey(String mediaObjectKey)
  {
    this.mediaObjectKey = mediaObjectKey;
  }

  public String getMediaObjectKey()
  {
    return mediaObjectKey;
  }

  public void setMediaObjectText(String mediaObjectText)
  {
    this.mediaObjectText = mediaObjectText;
  }

  public String getMediaObjectText()
  {
    return mediaObjectText;
  }

  public void setProductionLine(String productionLine)
  {
    this.productionLine = productionLine;
  }

  public String getProductionLine()
  {
    return productionLine;
  }

  public void setOperationDescription(String operationDescription)
  {
    this.operationDescription = operationDescription;
  }

  public String getOperationDescription()
  {
    return operationDescription;
  }

  public void setOperationSequence(BigDecimal operationSequence)
  {
    this.operationSequence = operationSequence;
  }

  public BigDecimal getOperationSequence()
  {
    return operationSequence;
  }

  public void setOperationStatus(String operationStatus)
  {
    this.operationStatus = operationStatus;
  }

  public String getOperationStatus()
  {
    return operationStatus;
  }

  public void setMoveHoursStandard(BigDecimal moveHoursStandard)
  {
    this.moveHoursStandard = moveHoursStandard;
  }

  public BigDecimal getMoveHoursStandard()
  {
    return moveHoursStandard;
  }

  public void setQueueHoursStandard(BigDecimal queueHoursStandard)
  {
    this.queueHoursStandard = queueHoursStandard;
  }

  public BigDecimal getQueueHoursStandard()
  {
    return queueHoursStandard;
  }

  public void setMachineRunHours(BigDecimal machineRunHours)
  {
    this.machineRunHours = machineRunHours;
  }

  public BigDecimal getMachineRunHours()
  {
    return machineRunHours;
  }

  public void setLaborRunHours(BigDecimal laborRunHours)
  {
    this.laborRunHours = laborRunHours;
  }

  public BigDecimal getLaborRunHours()
  {
    return laborRunHours;
  }

  public void setSetupLaborStandard(BigDecimal setupLaborStandard)
  {
    this.setupLaborStandard = setupLaborStandard;
  }

  public BigDecimal getSetupLaborStandard()
  {
    return setupLaborStandard;
  }

  public void setWoProgramVersion(String woProgramVersion)
  {
    this.woProgramVersion = woProgramVersion;
  }

  public String getWoProgramVersion()
  {
    return woProgramVersion;
  }

  public void setRouteProgramVersion(String routeProgramVersion)
  {
    this.routeProgramVersion = routeProgramVersion;
  }

  public String getRouteProgramVersion()
  {
    return routeProgramVersion;
  }

  public void setWorkOrderItemUOM(String workOrderItemUOM)
  {
    this.workOrderItemUOM = workOrderItemUOM;
  }

  public String getWorkOrderItemUOM()
  {
    return workOrderItemUOM;
  }

  public void setUserReservedNumber(Integer userReservedNumber)
  {
    this.userReservedNumber = userReservedNumber;
  }

  public Integer getUserReservedNumber()
  {
    return userReservedNumber;
  }

  public void setUserReservedAmount(BigDecimal userReservedAmount)
  {
    this.userReservedAmount = userReservedAmount;
  }

  public BigDecimal getUserReservedAmount()
  {
    return userReservedAmount;
  }

  public void setUserReservedReference(String userReservedReference)
  {
    this.userReservedReference = userReservedReference;
  }

  public String getUserReservedReference()
  {
    return userReservedReference;
  }

  public void setUserReservedCode(String userReservedCode)
  {
    this.userReservedCode = userReservedCode;
  }

  public String getUserReservedCode()
  {
    return userReservedCode;
  }

  public void setUserReservedDate(Calendar userReservedDate)
  {
    this.userReservedDate = userReservedDate;
  }

  public Calendar getUserReservedDate()
  {
    return userReservedDate;
  }

  public void setFutureUseFlag(String futureUseFlag)
  {
    this.futureUseFlag = futureUseFlag;
  }

  public String getFutureUseFlag()
  {
    return futureUseFlag;
  }

  public void setErrorFlag(String errorFlag)
  {
    this.errorFlag = errorFlag;
  }

  public String getErrorFlag()
  {
    return errorFlag;
  }

  public void setErrorMessage(String errorMessage)
  {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage()
  {
    return errorMessage;
  }

  public void setUpdateWorkCenter(String updateWorkCenter)
  {
    this.updateWorkCenter = updateWorkCenter;
  }

  public String getUpdateWorkCenter()
  {
    return updateWorkCenter;
  }

  public void setOpCodeType(String opCodeType)
  {
    this.opCodeType = opCodeType;
  }

  public String getOpCodeType()
  {
    return opCodeType;
  }

  public void setRelatedOrderNumber(String relatedOrderNumber)
  {
    this.relatedOrderNumber = relatedOrderNumber;
  }

  public String getRelatedOrderNumber()
  {
    return relatedOrderNumber;
  }

  public void setRelatedOrderType(String relatedOrderType)
  {
    this.relatedOrderType = relatedOrderType;
  }

  public String getRelatedOrderType()
  {
    return relatedOrderType;
  }

  public void setLineNumber(BigDecimal lineNumber)
  {
    this.lineNumber = lineNumber;
  }

  public BigDecimal getLineNumber()
  {
    return lineNumber;
  }

  public void setParentWorkOrderNumber(String parentWorkOrderNumber)
  {
    this.parentWorkOrderNumber = parentWorkOrderNumber;
  }

  public String getParentWorkOrderNumber()
  {
    return parentWorkOrderNumber;
  }

  public void setStatusCommentWorkOrder(String statusCommentWorkOrder)
  {
    this.statusCommentWorkOrder = statusCommentWorkOrder;
  }

  public String getStatusCommentWorkOrder()
  {
    return statusCommentWorkOrder;
  }

  public void setWorkOrderCatCode01(String workOrderCatCode01)
  {
    this.workOrderCatCode01 = workOrderCatCode01;
  }

  public String getWorkOrderCatCode01()
  {
    return workOrderCatCode01;
  }

  public void setWorkOrderCatCode02(String workOrderCatCode02)
  {
    this.workOrderCatCode02 = workOrderCatCode02;
  }

  public String getWorkOrderCatCode02()
  {
    return workOrderCatCode02;
  }

  public void setWorkOrderCatCode03(String workOrderCatCode03)
  {
    this.workOrderCatCode03 = workOrderCatCode03;
  }

  public String getWorkOrderCatCode03()
  {
    return workOrderCatCode03;
  }

  public void setReference1(String reference1)
  {
    this.reference1 = reference1;
  }

  public String getReference1()
  {
    return reference1;
  }

  public void setReference2(String reference2)
  {
    this.reference2 = reference2;
  }

  public String getReference2()
  {
    return reference2;
  }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
