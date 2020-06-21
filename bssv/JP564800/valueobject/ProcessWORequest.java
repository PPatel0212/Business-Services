package be.e1.bssv.JP564800.valueobject;

import be.e1.bssv.J564800.valueobject.WOManager_D5648005;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ProcessWORequest extends ValueObject implements Serializable
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
  
  private String updateWorkCenter = null;
  private String opCodeType = null;

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
  private String itemUnitOfMeasure = null;

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
  
  private BigDecimal mrpMessageID = null;
  

  /**
   * TODO: Default public constructor for instantiating: ProcessWORequest
   */
  public ProcessWORequest()
  {
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
    this.workOrderBranch = String.format("%1$12s", workOrderBranch);
  }

  public String getWorkOrderBranch()
  {
    return workOrderBranch;
  }

  public void setWorkCenter(String workCenter)
  {
    this.workCenter = String.format("%1$12s", workCenter);
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

  public void setItemUnitOfMeasure(String itemUnitOfMeasure)
  {
    this.itemUnitOfMeasure = itemUnitOfMeasure;
  }

  public String getItemUnitOfMeasure()
  {
    return itemUnitOfMeasure;
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
    this.productionLine = String.format("%1$12s", productionLine);
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

  public void setUpdateWorkCenter(String updateWorkCenter)
  {
    this.updateWorkCenter = String.format("%1$12s", updateWorkCenter);
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
  
  public void copyToInternalValueObject(WOManager_D5648005 inData)
  {
    inData.setSzBranchPlant_MMCU(this.workOrderBranch);
    inData.setSzBusinessUnit_MCU(this.workCenter);
    inData.setSzF3112LineIdentifier_LINE(this.productionLine);
    inData.setSzF3112ToWorkCenter_MCU(this.updateWorkCenter);
    inData.setCWOFreezeCode_UNCD(this.workOrderFreezeCode);
    inData.setSzF3112OperationStatus_OPST(this.operationStatus);
    inData.setSzF3112RoutingDesc_DSC1(this.operationDescription);
    inData.setSzItemNumber_LITM(this.itemNumber);
    inData.setSzMediaObjectKey_TXKY(this.mediaObjectKey);
    inData.setSzMediaObjectName_OBNM(this.mediaObjectName);
    inData.setSzMediaObjectText_MOTEXT(this.mediaObjectText);
    inData.setSzP3112_RoutVersion_VERS(this.routeProgramVersion);
    inData.setSzP48013_WOVersion_VERS(this.woProgramVersion);
    inData.setSzProductionNum_PMPN(this.productionNumber);
    inData.setSzTransactionTypeCode_TD1(this.transactionType);
    inData.setSzUserResCode_URCD(this.userReservedCode);
    inData.setSzUserResRef_URRF(this.userReservedReference);
    inData.setSzWOItemUOM_UOM(this.itemUnitOfMeasure);
    inData.setSzWOStatusCode_SRST(this.workOrderStatus);
    inData.setSzWOTypeBill_TBM(this.typeOfBOM);
    inData.setSzWOTypeRouting_TRT(this.typeOfRouting);
    inData.setSzWOType_DCTO(this.workOrderType);
    inData.setSzF3112TypeOpCode_OPSC(this.opCodeType);
    inData.setSzRelatedOrdNum_RORN(this.relatedOrderNumber);
    inData.setSzRelatedOrderType_RCTO(this.relatedOrderType);
    inData.setSzParentWoNum_PARS(this.parentWorkOrderNumber);
    inData.setSzStatusCommentWO_STCM(this.statusCommentWorkOrder);
    inData.setSzWOCat001_WR01(this.workOrderCatCode01);
    inData.setSzWOCat002_WR02(this.workOrderCatCode02);
    inData.setSzWOCat003_WR03(this.workOrderCatCode03);
    inData.setSzReference1_VR01(this.reference1);
    inData.setSzReference2_VR02(this.reference2);
    inData.setSzUserId_USER(this.userId);

    if(this.moveHoursStandard != null)
      inData.setMnF3112MoveHours_MOVD(new MathNumeric(this.moveHoursStandard));
    if(this.operationSequence != null)
      inData.setMnF3112OperationSeq_OPSQ(new MathNumeric(this.operationSequence));
    if(this.queueHoursStandard != null) 
      inData.setMnF3112QueueHours_QUED(new MathNumeric(this.queueHoursStandard));
    if(this.laborRunHours != null)
      inData.setMnF3112RunLaborStd_RUNL(new MathNumeric(this.laborRunHours));
    if(this.machineRunHours != null)
      inData.setMnF3112RunMacStd_RUNM(new MathNumeric(this.machineRunHours));
    if(this.setupLaborStandard != null)
      inData.setMnF3112SetupLaborHrs_SETL(new MathNumeric(this.setupLaborStandard));
    if(this.transactionQuantity != null)
      inData.setMnOrderQuantity_UORG(new MathNumeric(this.transactionQuantity));
    if(this.productionNumberShort != null)
      inData.setMnProductionNumShort_PNS(new MathNumeric(this.productionNumberShort));
    if(this.itemNumberShort != null)
      inData.setMnShortItemNumber_ITM(new MathNumeric(this.itemNumberShort));
    if(this.userReservedAmount != null)
      inData.setMnUserResAmt_URAT(new MathNumeric(this.userReservedAmount));
    if(this.userReservedNumber != null)
      inData.setMnUserResNum_URAB(new MathNumeric(this.userReservedNumber));
    if(this.workOrderNumber != null)
      inData.setMnWONumber_DOCO(new MathNumeric(this.workOrderNumber));
    if(this.lineNumber != null)
      inData.setMnLineNumber_LNID(new MathNumeric(this.lineNumber));
    if(this.mrpMessageID != null)
      inData.setMnMRPMessageID_UKID(new MathNumeric(this.mrpMessageID));
    
    if(this.requestDate != null)
      inData.setJdDateRequested_DRQJ(this.requestDate.getTime());
    if(this.startDate != null)
      inData.setJdDateStart_STRT(this.startDate.getTime());
    if(this.userReservedDate != null)
      inData.setJdUserResDate_URDT(this.userReservedDate.getTime());
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


  public void setMrpMessageID(BigDecimal mrpMessageID) {
    this.mrpMessageID = mrpMessageID;
  }
}
