package be.e1.bssv.util.JP560000.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class F4211DataReplyA extends MessageValueObject implements Serializable
{
    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String orderCompany = null;

    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer orderNumber = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderType = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private BigDecimal orderLine = null;

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
     * Operator Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56OPC <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String operatorCode = null;

    /**
     * Aircraft Type Series
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56ACTS <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String aircraftTypeSeries = null;

    /**
     * Item Revision Level
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MERL <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String itemRevisionLevel = null;

    /**
     * Model
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RP27 <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String model = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String modelName = null;

    /**
     * Units - Secondary Quantity Ordered
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SQOR <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private BigDecimal passengerCount = null;

    /**
     * Date - Start (Julian)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: STRT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar buildDate = null;

    /**
     * User Reserved Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URRF <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String productionLine = null;

    /**
     * Program
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56MPGM <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String programName = null;

    /**
     * Ship Set Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56SSN <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String shipSetNumber = null;

    /**
     * Ship Set Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56SSN <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String testSeatFlag = null;

    /**
     * Address Number - Forwarded To
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FTAN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer finalDestination = null;

    /**
     * Name - Alpha
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ALPH <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String finalDestinationName = null;

    /**
     * Address Line 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD1 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String finalDestinationAddressLine1 = null;

    /**
     * Address Line 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD2 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String finalDestinationAddressLine2 = null;

    /**
     * Address Line 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD3 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String finalDestinationAddressLine3 = null;

    /**
     * Address Line 4
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD4 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String finalDestinationAddressLine4 = null;

    /**
     * City
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTY1 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String finalDestinationCity = null;

    /**
     * State
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDS <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String finalDestinationState = null;

    /**
     * Country
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTR <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String finalDestinationCountry = null;

    /**
     * Postal Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDZ <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String finalDestinationZip = null;

    /**
     * Business Unit - Header
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EMCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String recurringJobNumber = null;

    /**
     * Business Unit - Header
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EMCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String nonRecurringJobNumber = null;

    /**
     * Program
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56MPGM <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String parentJobNumber = null;

    /**
     * Reference 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VR02 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String rfqNumber = null;

    /**
     * Inco Terms
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56INC <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String incoTerms = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String freightDescription = null;

    /**
     * Date - Invoice
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: IVD <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar invoiceDate = null;

    /**
     * Container I.D.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CNID <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String trackingNumber = null;

    /**
     * Stocking Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: STKT <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String stockingType = null;

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
    private Integer plannerNumber = null;

    /**
     * Name - Alpha
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ALPH <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String plannerName = null;

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
    private Integer buyerNumber = null;

    /**
     * Name - Alpha
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ALPH <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String buyerName = null;

    /**
     * Sales Category Code 5
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP5 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String salesReportingCode = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String operatorCodeDescription = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String programNumberDescription = null;

    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String faiShipsetFlag = null;

    /**
     * Name - Alpha
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ALPH <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String programManagerName = null;

    /**
     * Description 02
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL02 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String oemName = null;

    /**
     * Rev Control Item Base Id.
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RCITMB <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String revControlBaseItem = null;
    
    private String aircraftTypeName = null;
    private String detailCustomerPO = null;
    private String carrierName = null;
    private String specialInstructions = null;
    private String secondaryPONumber = null;
    private String tailNumber = null;
    private Integer invoiceNumber = null;
    private String soldToName = null;
    private String soldToAddress1 = null;
    private String soldToAddress2 = null;
    private String soldToAddress3 = null;
    private String soldToAddress4 = null;
    private String soldToCity = null;
    private String soldToState = null;
    private String soldToZip = null;
    private String soldToCountry = null;
    private String priorityCode = null;
    private String manufacturerSerialNumber = null;
    
    /* Define accessor functions */
    public void setOrderCompany(String orderCompany)
    {
        this.orderCompany = orderCompany;
    }

    public String getOrderCompany()
    {
        return orderCompany;
    }

    public void setOrderNumber(Integer orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public Integer getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderType(String orderType)
    {
        this.orderType = orderType;
    }

    public String getOrderType()
    {
        return orderType;
    }

    public void setOrderLine(BigDecimal orderLine)
    {
        this.orderLine = orderLine;
    }

    public BigDecimal getOrderLine()
    {
        return orderLine;
    }

    public void setProductionNumber(String productionNumber)
    {
        this.productionNumber = productionNumber;
    }

    public String getProductionNumber()
    {
        return productionNumber;
    }

    public void setOperatorCode(String operatorCode)
    {
        this.operatorCode = operatorCode;
    }

    public String getOperatorCode()
    {
        return operatorCode;
    }

    public void setAircraftTypeSeries(String aircraftTypeSeries)
    {
        this.aircraftTypeSeries = aircraftTypeSeries;
    }

    public String getAircraftTypeSeries()
    {
        return aircraftTypeSeries;
    }

    public void setItemRevisionLevel(String itemRevisionLevel)
    {
        this.itemRevisionLevel = itemRevisionLevel;
    }

    public String getItemRevisionLevel()
    {
        return itemRevisionLevel;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public String getModelName()
    {
        return modelName;
    }

    public void setPassengerCount(BigDecimal passengerCount)
    {
        this.passengerCount = passengerCount;
    }

    public BigDecimal getPassengerCount()
    {
        return passengerCount;
    }

    public void setBuildDate(Calendar buildDate)
    {
        this.buildDate = buildDate;
    }

    public Calendar getBuildDate()
    {
        return buildDate;
    }

    public void setProductionLine(String productionLine)
    {
        this.productionLine = productionLine;
    }

    public String getProductionLine()
    {
        return productionLine;
    }

    public void setProgramName(String programName)
    {
        this.programName = programName;
    }

    public String getProgramName()
    {
        return programName;
    }

    public void setShipSetNumber(String shipSetNumber)
    {
        this.shipSetNumber = shipSetNumber;
    }

    public String getShipSetNumber()
    {
        return shipSetNumber;
    }

    public void setTestSeatFlag(String testSeatFlag)
    {
        this.testSeatFlag = testSeatFlag;
    }

    public String getTestSeatFlag()
    {
        return testSeatFlag;
    }

    public void setFinalDestination(Integer finalDestination)
    {
        this.finalDestination = finalDestination;
    }

    public Integer getFinalDestination()
    {
        return finalDestination;
    }

    public void setFinalDestinationName(String finalDestinationName)
    {
        this.finalDestinationName = finalDestinationName;
    }

    public String getFinalDestinationName()
    {
        return finalDestinationName;
    }

    public void setFinalDestinationAddressLine1(String finalDestinationAddressLine1)
    {
        this.finalDestinationAddressLine1 = finalDestinationAddressLine1;
    }

    public String getFinalDestinationAddressLine1()
    {
        return finalDestinationAddressLine1;
    }

    public void setFinalDestinationAddressLine2(String finalDestinationAddressLine2)
    {
        this.finalDestinationAddressLine2 = finalDestinationAddressLine2;
    }

    public String getFinalDestinationAddressLine2()
    {
        return finalDestinationAddressLine2;
    }

    public void setFinalDestinationAddressLine3(String finalDestinationAddressLine3)
    {
        this.finalDestinationAddressLine3 = finalDestinationAddressLine3;
    }

    public String getFinalDestinationAddressLine3()
    {
        return finalDestinationAddressLine3;
    }

    public void setFinalDestinationAddressLine4(String finalDestinationAddressLine4)
    {
        this.finalDestinationAddressLine4 = finalDestinationAddressLine4;
    }

    public String getFinalDestinationAddressLine4()
    {
        return finalDestinationAddressLine4;
    }

    public void setFinalDestinationCity(String finalDestinationCity)
    {
        this.finalDestinationCity = finalDestinationCity;
    }

    public String getFinalDestinationCity()
    {
        return finalDestinationCity;
    }

    public void setFinalDestinationState(String finalDestinationState)
    {
        this.finalDestinationState = finalDestinationState;
    }

    public String getFinalDestinationState()
    {
        return finalDestinationState;
    }

    public void setFinalDestinationCountry(String finalDestinationCountry)
    {
        this.finalDestinationCountry = finalDestinationCountry;
    }

    public String getFinalDestinationCountry()
    {
        return finalDestinationCountry;
    }

    public void setFinalDestinationZip(String finalDestinationZip)
    {
        this.finalDestinationZip = finalDestinationZip;
    }

    public String getFinalDestinationZip()
    {
        return finalDestinationZip;
    }

    public void setRecurringJobNumber(String recurringJobNumber)
    {
        this.recurringJobNumber = recurringJobNumber;
    }

    public String getRecurringJobNumber()
    {
        return recurringJobNumber;
    }

    public void setNonRecurringJobNumber(String nonRecurringJobNumber)
    {
        this.nonRecurringJobNumber = nonRecurringJobNumber;
    }

    public String getNonRecurringJobNumber()
    {
        return nonRecurringJobNumber;
    }

    public void setParentJobNumber(String parentJobNumber)
    {
        this.parentJobNumber = parentJobNumber;
    }

    public String getParentJobNumber()
    {
        return parentJobNumber;
    }

    public void setRfqNumber(String rfqNumber)
    {
        this.rfqNumber = rfqNumber;
    }

    public String getRfqNumber()
    {
        return rfqNumber;
    }

    public void setIncoTerms(String incoTerms)
    {
        this.incoTerms = incoTerms;
    }

    public String getIncoTerms()
    {
        return incoTerms;
    }

    public void setFreightDescription(String freightDescription)
    {
        this.freightDescription = freightDescription;
    }

    public String getFreightDescription()
    {
        return freightDescription;
    }

    public void setInvoiceDate(Calendar invoiceDate)
    {
        this.invoiceDate = invoiceDate;
    }

    public Calendar getInvoiceDate()
    {
        return invoiceDate;
    }

    public void setTrackingNumber(String trackingNumber)
    {
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber()
    {
        return trackingNumber;
    }

    public void setStockingType(String stockingType)
    {
        this.stockingType = stockingType;
    }

    public String getStockingType()
    {
        return stockingType;
    }

    public void setPlannerNumber(Integer plannerNumber)
    {
        this.plannerNumber = plannerNumber;
    }

    public Integer getPlannerNumber()
    {
        return plannerNumber;
    }

    public void setPlannerName(String plannerName)
    {
        this.plannerName = plannerName;
    }

    public String getPlannerName()
    {
        return plannerName;
    }

    public void setBuyerNumber(Integer buyerNumber)
    {
        this.buyerNumber = buyerNumber;
    }

    public Integer getBuyerNumber()
    {
        return buyerNumber;
    }

    public void setBuyerName(String buyerName)
    {
        this.buyerName = buyerName;
    }

    public String getBuyerName()
    {
        return buyerName;
    }

    public void setSalesReportingCode(String salesReportingCode)
    {
        this.salesReportingCode = salesReportingCode;
    }

    public String getSalesReportingCode()
    {
        return salesReportingCode;
    }

    public void setOperatorCodeDescription(String operatorCodeDescription)
    {
        this.operatorCodeDescription = operatorCodeDescription;
    }

    public String getOperatorCodeDescription()
    {
        return operatorCodeDescription;
    }

    public void setProgramNumberDescription(String programNumberDescription)
    {
        this.programNumberDescription = programNumberDescription;
    }

    public String getProgramNumberDescription()
    {
        return programNumberDescription;
    }

    public void setFaiShipsetFlag(String faiShipsetFlag)
    {
        this.faiShipsetFlag = faiShipsetFlag;
    }

    public String getFaiShipsetFlag()
    {
        return faiShipsetFlag;
    }

    public void setProgramManagerName(String programManagerName)
    {
        this.programManagerName = programManagerName;
    }

    public String getProgramManagerName()
    {
        return programManagerName;
    }

    public void setOemName(String oemName)
    {
        this.oemName = oemName;
    }

    public String getOemName()
    {
        return oemName;
    }

    public void setRevControlBaseItem(String revControlBaseItem)
    {
        this.revControlBaseItem = revControlBaseItem;
    }

    public String getRevControlBaseItem()
    {
        return revControlBaseItem;
    }

    public void setAircraftTypeName(String aircraftTypeName)
    {
        this.aircraftTypeName = aircraftTypeName;
    }

    public String getAircraftTypeName()
    {
        return aircraftTypeName;
    }

    public void setDetailCustomerPO(String detailCustomerPO) {
        this.detailCustomerPO = detailCustomerPO;
    }

    public String getDetailCustomerPO() {
        return detailCustomerPO;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSecondaryPONumber(String secondaryPONumber) {
        this.secondaryPONumber = secondaryPONumber;
    }

    public String getSecondaryPONumber() {
        return secondaryPONumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setSoldToName(String soldToName) {
        this.soldToName = soldToName;
    }

    public String getSoldToName() {
        return soldToName;
    }

    public void setSoldToAddress1(String soldToAddress1) {
        this.soldToAddress1 = soldToAddress1;
    }

    public String getSoldToAddress1() {
        return soldToAddress1;
    }

    public void setSoldToAddress2(String soldToAddress2) {
        this.soldToAddress2 = soldToAddress2;
    }

    public String getSoldToAddress2() {
        return soldToAddress2;
    }

    public void setSoldToAddress3(String soldToAddress3) {
        this.soldToAddress3 = soldToAddress3;
    }

    public String getSoldToAddress3() {
        return soldToAddress3;
    }

    public void setSoldToAddress4(String soldToAddress4) {
        this.soldToAddress4 = soldToAddress4;
    }

    public String getSoldToAddress4() {
        return soldToAddress4;
    }

    public void setSoldToCity(String soldToCity) {
        this.soldToCity = soldToCity;
    }

    public String getSoldToCity() {
        return soldToCity;
    }

    public void setSoldToState(String soldToState) {
        this.soldToState = soldToState;
    }

    public String getSoldToState() {
        return soldToState;
    }

    public void setSoldToZip(String soldToZip) {
        this.soldToZip = soldToZip;
    }

    public String getSoldToZip() {
        return soldToZip;
    }

    public void setSoldToCountry(String soldToCountry) {
        this.soldToCountry = soldToCountry;
    }

    public String getSoldToCountry() {
        return soldToCountry;
    }

    public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    public String getPriorityCode() {
        return priorityCode;
    }

    public void setManufacturerSerialNumber(String manufacturerSerialNumber)
    {
      this.manufacturerSerialNumber = manufacturerSerialNumber;
    }
  
    public String getManufacturerSerialNumber()
    {
      return manufacturerSerialNumber;
    }
}
