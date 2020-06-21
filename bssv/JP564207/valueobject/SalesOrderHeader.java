package be.e1.bssv.JP564207.valueobject;

import be.e1.bssv.J564207.valueobject.InternalShowSalesOrderHeader;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SalesOrderHeader extends ValueObject implements Serializable {
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
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String orderType = null;

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
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer addressNumber = null;

    /**
     * Aircraft Type Series
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56ACTS <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String aircraftTypeSeries = null;

    /**
     * Tail Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56TAIL <br>
     * EnterpriseOne field length:  8 <br>
     */
    private String tailNumber = null;

    /**
     * Date - MPS Due
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56MDRQJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateDueMPS = null;

    /**
     * Sales Category Code 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP3 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String salesReportingCode3 = null;

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
     * Aircraft Type Series
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56ACTS <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String AircraftTypeSeries = null;

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
    private BigDecimal unitsTransactionQty = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String aircraftTypeDesc = null;
    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String soRefrence = null;
   
    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String customerName = null;
    
    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String modelDescription = null;
    private String operatorCode = null;
    private String operatorDesc = null;



    /**
     * TODO: Default public constructor for instantiating: SalesOrderHeader
     */
    public SalesOrderHeader() {
    }
    public SalesOrderHeader(InternalShowSalesOrderHeader internalShowVO) {
        this.setCostCenter(internalShowVO.getF4211_MCU());
        this.setProductionNumber(internalShowVO.getF4211_PMPN());
        this.setDocumentOrderInvoiceE(internalShowVO.getF4211_DOCO());
        this.setOrderType(internalShowVO.getF4211_DCTO());
        this.setUnitsTransactionQty(internalShowVO.getF4211_UORG());
        
        this.setAircraftTypeDesc(internalShowVO.getAircraftType_Desc());
        this.setCustomerName(internalShowVO.getCustomer_desc());
        this.setModelDescription(internalShowVO.getModel_Desc());
        this.setAircraftTypeSeries(internalShowVO.getF564201_Z56ACTS());  
        this.setAddressNumber(internalShowVO.getF4211_SHAN());
        
        this.setSalesReportingCode3(internalShowVO.getF4211_SRP3());
        this.setSoRefrence(internalShowVO.getSoReference());
        
        this.setTailNumber(internalShowVO.getF564201_Z56TAIL());
        this.setDateDueMPS(internalShowVO.getF564201_Z56MDRQJ());
        //Program Name
        this.setShipSetNumber(internalShowVO.getF564201_Z56SSN());
        /*Reilly Edit Cherwell 426120 Add operator details to reply */
        this.setOperatorCode(internalShowVO.getF564201_Z56OPC());
        this.setOperatorDesc(internalShowVO.getOperatorDesc());
        /*Reilly Edit Cherwell 426120 Add operator details to reply */
                                                                
    }

    public void setDocumentOrderInvoiceE(Integer documentOrderInvoiceE) {
        this.documentOrderInvoiceE = documentOrderInvoiceE;
    }

    public void setDocumentOrderInvoiceE(MathNumeric documentOrderInvoiceE) {
        if (documentOrderInvoiceE != null){
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

    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public void setAddressNumber(MathNumeric addressNumber) {
        if (addressNumber != null){
        this.addressNumber = new Integer(addressNumber.intValue());
        }
        else{
            this.addressNumber = new Integer(0);
        }
            
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public void setAircraftTypeSeries(String aircraftTypeSeries) {
        this.aircraftTypeSeries = aircraftTypeSeries;
    }

    public String getAircraftTypeSeries() {
        return aircraftTypeSeries;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setDateDueMPS(Calendar dateDueMPS) {
        this.dateDueMPS = dateDueMPS;
    }

  public void setDateDueMPS(Date dateDueMPS)
    {
      if(dateDueMPS !=null)
      {
        Calendar dueDate = Calendar.getInstance();
        dueDate.setTime(dateDueMPS); 
        this.dateDueMPS = dueDate;
      }
    }


    public Calendar getDateDueMPS() {
        return dateDueMPS;
    }

    public void setSalesReportingCode3(String salesReportingCode3) {
        this.salesReportingCode3 = salesReportingCode3;
    }

    public String getSalesReportingCode3() {
        return salesReportingCode3;
    }

    public void setShipSetNumber(String shipSetNumber) {
        this.shipSetNumber = shipSetNumber;
    }

    public String getShipSetNumber() {
        return shipSetNumber;
    }

    

    public void setUnitsTransactionQty(BigDecimal unitsTransactionQty) {
        this.unitsTransactionQty = unitsTransactionQty;
    }

    public void setUnitsTransactionQty(MathNumeric unitsTransactionQty) {
        if (unitsTransactionQty != null){
        this.unitsTransactionQty = unitsTransactionQty.asBigDecimal();
        }
        else {
            this.unitsTransactionQty = new BigDecimal(0);
        }
    }

    public BigDecimal getUnitsTransactionQty() {
        return unitsTransactionQty;
    }

    public void setAircraftTypeDesc(String aircraftTypeDesc) {
        this.aircraftTypeDesc = aircraftTypeDesc;
    }

    public String getAircraftTypeDesc() {
        return aircraftTypeDesc;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setAircraftTypeSeries1(String AircraftTypeSeries) {
        this.AircraftTypeSeries = AircraftTypeSeries;
    }

    public String getAircraftTypeSeries1() {
        return AircraftTypeSeries;
    }

    public void setSoRefrence(String soRefrence) {
        this.soRefrence = soRefrence;
    }

    public String getSoRefrence() {
        return soRefrence;
    }

  public void setOperatorCode(String operatorCode) {
    this.operatorCode = operatorCode;
  }

  public String getOperatorCode() {
    return operatorCode;
  }

  public void setOperatorDesc(String operatorDesc) {
    this.operatorDesc = operatorDesc;
  }

  public String getOperatorDesc() {
    return operatorDesc;
  }
}
