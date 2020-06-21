package be.e1.bssv.util.JP560118.valueobject;

import be.e1.bssv.util.J5601018.valueobject.BE_GetABSAddlData_D5601018A;

import com.jdedwards.runtime.base.MathNumeric;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetABSDataReply extends MessageValueObject implements Serializable {
    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer addressNumber = null;

    /**
     * Request Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56REQN <br>
     * EnterpriseOne field length:  24 <br>
     */
    private String requestNumber = null;

    /**
     * Comments 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56COMM1 <br>
     * EnterpriseOne field length:  200 <br>
     */
    private String comments1 = null;

    /**
     * Comments 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56COMM2 <br>
     * EnterpriseOne field length:  200 <br>
     */
    private String comments2 = null;

    /**
     * Comments 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56COMM3 <br>
     * EnterpriseOne field length:  200 <br>
     */
    private String comments3 = null;

    /**
     * Billing Address Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BADT <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: X <br>
     */
    private String billingAddressType = null;

    /**
     * Price Pick List (Y/N)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PLST <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: Y <br>
     */
    private String pricePickListYN = null;

    /**
     * Print Adjustments on Invoice (Y/N)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSPA <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: Y <br>
     */
    private String printAdjustmentsonInvoiceYN = null;

    /**
     * Invoice Copies
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: INVC <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer invoiceCopies = null;

    /**
     * Freight Handling Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FRTH <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String freightHandlingCode = null;

    /**
     * Hold Orders Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: HOLD <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String holdOrdersCode = null;

    /**
     * Item Restrictions
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EDF2 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String itemRestrictions = null;

    /**
     * Record Type - Bank Transit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BKTP <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String recordTypeBankTransit = null;

    /**
     * Transit Number - Bank
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TNST <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String transitNumberBank = null;

    /**
     * Bank Account Number - Customer
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CBNK <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String bankAccountNumberCustomer = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String description = null;

    /**
     * Bank Account - Control Digit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CHKD <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String bankAccountControlDigit = null;

    /**
     * Currency Code - From
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CRCD <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String currencyCodeFrom = null;

    /**
     * BACS System-Reference/Roll Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RLN <br>
     * EnterpriseOne field length:  18 <br>
     */
    private String bACSSystemReferenceRollNumber = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String businessUnit = null;

    /**
     * SWIFT Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SWFT <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String sWIFTCode = null;

    /**
     * Checking or Savings Account
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CKSV <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String checkingorSavingsAccount = null;

    /**
     * Transaction Originator
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TORG <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String transactionOriginator = null;

    /**
     * Electronic Address
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EMAL <br>
     * EnterpriseOne field length:  256 <br>
     */
    private String electronicAddress = null;

    /**
     * Address Number - Bank
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8BK <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer addressNumberBank = null;

    /**
     * International Bank Account Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: IBAN <br>
     * EnterpriseOne field length:  34 <br>
     */
    private String internationalBankAccountNumber = null;

    /**
     * Related - Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8R <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer relatedAddressNumber = null;

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
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String errorCode = null;

    /**
     * Error Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRDSCA <br>
     * EnterpriseOne field length:  60 <br>
     */
    private String errorDescription = null;
    private Integer amountDecimals = null;
    private Integer quantityDecimals = null;
    private String batchProcessingMode = null;
    private String printMessage = null;
    private Integer minimumOrderValue = null;
    private String applyFreight = null;
    private String partialShipmentsAllowed = null;
    private String customerPORequired = null;
    private String partialOrderShipmentsAllowed = null;
    private String substitutesAllowed = null;
    private String priceAdjustmentSchedule = null;
    private String groupCustomerPriceGp = null;
    private Integer carrierNumber = null;
    private String priorityCode = null;
    private String checkCreditLevel = null;
    private String backordersAllowed = null;
    
    

    /**
     * TODO: Default public constructor for instantiating: GetABSDataReply
     */
    public GetABSDataReply() 
    {
    }    
    public GetABSDataReply (BE_GetABSAddlData_D5601018A vo) 
    {

        this.setAddressNumber(new Integer(vo.getMnAddressNumber().intValue()));
        this.setAddressNumberBank(new Integer(vo.getMnF0030AddressNumberBank().intValue()));
        this.setBACSSystemReferenceRollNumber(vo.getSzF0030ReferenceRollNumber());
        this.setBankAccountControlDigit(vo.getSzF0030ControlDigit());
        this.setBankAccountNumberCustomer(vo.getSzF0030CustBankAcctNumber());
        this.setBillingAddressType(vo.getCBillingAddressType());
        this.setBusinessUnit(vo.getSzCostCenter());
        this.setCheckingorSavingsAccount(vo.getCF0030CheckingorSavingsAccount());
        this.setComments1(vo.getSz56Comments1());
        this.setComments2(vo.getSz56Comments2());
        this.setComments3(vo.getSz56Comments3());
        this.setCurrencyCodeFrom(vo.getSzF0030CurrencyCodeFrom());
        this.setDescription(vo.getSzF0030Description());
        this.setElectronicAddress(vo.getSzRequesterEmailAddress());
        this.setErrorCode(vo.getCErrorCode());
        this.setErrorDescription(vo.getSzErrorDescription());
        this.setFreightHandlingCode(vo.getSzFreightHandlingCode());
        this.setHoldOrdersCode(vo.getSzHoldOrdersCode());
        this.setInternationalBankAccountNumber(vo.getSzF0030InternationalBankAcct());
        this.setInvoiceCopies(new Integer(vo.getMnInvoiceCopies().intValue()));
        this.setLineNumber(vo.getMnRequestLineNumber().asBigDecimal());
        this.setPricePickListYN(vo.getCPricePickListYN());
        this.setPrintAdjustmentsonInvoiceYN(vo.getCPrintAdjustmentsonInvoic());
        this.setRecordTypeBankTransit(vo.getCF0030BankTransitRecordType());
        this.setRelatedAddressNumber(new Integer(vo.getMnRelatedAddressNo().intValue()));
        this.setRequestNumber(vo.getSz56RequestNumber());
        this.setSWIFTCode(vo.getSzF0030SwiftCode());
        this.setTransactionOriginator(vo.getSzRequestTransactionOriginator());
        this.setTransitNumberBank(vo.getSzF0030BankTransitNumber());
        this.setAmountDecimals(new Integer(vo.getAmountDecimals().intValue()));
        this.setQuantityDecimals(new Integer(vo.getQuantityDecimals().intValue()));
        this.setBatchProcessingMode(vo.getBatchProcessingMode());
        this.setPrintMessage(vo.getPrintMessage());
        this.setMinimumOrderValue(new Integer(vo.getMinimumOrderValue().intValue()));
        this.setApplyFreight(vo.getApplyFreight());
        this.setPartialShipmentsAllowed(vo.getPartialShipmentsAllowed());
        this.setCustomerPORequired(vo.getCustomerPORequired());
        this.setPartialOrderShipmentsAllowed(vo.getPartialOrderShipmentsAllowed());
        this.setSubstitutesAllowed(vo.getSubstitutesAllowed());
        this.setPriceAdjustmentSchedule(vo.getPriceAdjustmentSchedule());
        this.setGroupCustomerPriceGp(vo.getGroupCustomerPriceGp());
        this.setCarrierNumber(new Integer(vo.getCarrierNumber().intValue()));
        this.setPriorityCode(vo.getPriorityCode());
        this.setCheckCreditLevel(vo.getCheckCreditLevel());
        this.setBackordersAllowed(vo.getBackordersAllowed());
        this.setItemRestrictions(vo.getCItemRestrictions());
       
    }
    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setComments1(String comments1) {
        this.comments1 = comments1;
    }

    public String getComments1() {
        return comments1;
    }

    public void setComments2(String comments2) {
        this.comments2 = comments2;
    }

    public String getComments2() {
        return comments2;
    }

    public void setComments3(String comments3) {
        this.comments3 = comments3;
    }

    public String getComments3() {
        return comments3;
    }

    public void setBillingAddressType(String billingAddressType) {
        this.billingAddressType = billingAddressType;
    }

    public String getBillingAddressType() {
        return billingAddressType;
    }

    public void setPricePickListYN(String pricePickListYN) {
        this.pricePickListYN = pricePickListYN;
    }

    public String getPricePickListYN() {
        return pricePickListYN;
    }

    public void setPrintAdjustmentsonInvoiceYN(String printAdjustmentsonInvoiceYN) {
        this.printAdjustmentsonInvoiceYN = printAdjustmentsonInvoiceYN;
    }

    public String getPrintAdjustmentsonInvoiceYN() {
        return printAdjustmentsonInvoiceYN;
    }

    public void setInvoiceCopies(Integer invoiceCopies) {
        this.invoiceCopies = invoiceCopies;
    }

    public Integer getInvoiceCopies() {
        return invoiceCopies;
    }

    public void setFreightHandlingCode(String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }

    public String getFreightHandlingCode() {
        return freightHandlingCode;
    }

    public void setHoldOrdersCode(String holdOrdersCode) {
        this.holdOrdersCode = holdOrdersCode;
    }

    public String getHoldOrdersCode() {
        return holdOrdersCode;
    }

    public void setItemRestrictions(String itemRestrictions) {
        this.itemRestrictions = itemRestrictions;
    }

    public String getItemRestrictions() {
        return itemRestrictions;
    }

    public void setRecordTypeBankTransit(String recordTypeBankTransit) {
        this.recordTypeBankTransit = recordTypeBankTransit;
    }

    public String getRecordTypeBankTransit() {
        return recordTypeBankTransit;
    }

    public void setTransitNumberBank(String transitNumberBank) {
        this.transitNumberBank = transitNumberBank;
    }

    public String getTransitNumberBank() {
        return transitNumberBank;
    }

    public void setBankAccountNumberCustomer(String bankAccountNumberCustomer) {
        this.bankAccountNumberCustomer = bankAccountNumberCustomer;
    }

    public String getBankAccountNumberCustomer() {
        return bankAccountNumberCustomer;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setBankAccountControlDigit(String bankAccountControlDigit) {
        this.bankAccountControlDigit = bankAccountControlDigit;
    }

    public String getBankAccountControlDigit() {
        return bankAccountControlDigit;
    }

    public void setCurrencyCodeFrom(String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }

    public String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }

    public void setBACSSystemReferenceRollNumber(String bACSSystemReferenceRollNumber) {
        this.bACSSystemReferenceRollNumber = bACSSystemReferenceRollNumber;
    }

    public String getBACSSystemReferenceRollNumber() {
        return bACSSystemReferenceRollNumber;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setSWIFTCode(String sWIFTCode) {
        this.sWIFTCode = sWIFTCode;
    }

    public String getSWIFTCode() {
        return sWIFTCode;
    }

    public void setCheckingorSavingsAccount(String checkingorSavingsAccount) {
        this.checkingorSavingsAccount = checkingorSavingsAccount;
    }

    public String getCheckingorSavingsAccount() {
        return checkingorSavingsAccount;
    }

    public void setTransactionOriginator(String transactionOriginator) {
        this.transactionOriginator = transactionOriginator;
    }

    public String getTransactionOriginator() {
        return transactionOriginator;
    }

    public void setElectronicAddress(String electronicAddress) {
        this.electronicAddress = electronicAddress;
    }

    public String getElectronicAddress() {
        return electronicAddress;
    }

    public void setAddressNumberBank(Integer addressNumberBank) {
        this.addressNumberBank = addressNumberBank;
    }

    public Integer getAddressNumberBank() {
        return addressNumberBank;
    }

    public void setInternationalBankAccountNumber(String internationalBankAccountNumber) {
        this.internationalBankAccountNumber = internationalBankAccountNumber;
    }

    public String getInternationalBankAccountNumber() {
        return internationalBankAccountNumber;
    }

    public void setRelatedAddressNumber(Integer relatedAddressNumber) {
        this.relatedAddressNumber = relatedAddressNumber;
    }

    public Integer getRelatedAddressNumber() {
        return relatedAddressNumber;
    }

    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }

    public BigDecimal getLineNumber() {
        return lineNumber;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

  public void setAmountDecimals(Integer amountDecimals) {
    this.amountDecimals = amountDecimals;
  }

  public Integer getAmountDecimals() {
    return amountDecimals;
  }

  public void setQuantityDecimals(Integer quantityDecimals) {
    this.quantityDecimals = quantityDecimals;
  }

  public Integer getQuantityDecimals() {
    return quantityDecimals;
  }

  public void setBatchProcessingMode(String batchProcessingMode) {
    this.batchProcessingMode = batchProcessingMode;
  }

  public String getBatchProcessingMode() {
    return batchProcessingMode;
  }

  public void setPrintMessage(String printMessage) {
    this.printMessage = printMessage;
  }

  public String getPrintMessage() {
    return printMessage;
  }

  public void setMinimumOrderValue(Integer minimumOrderValue) {
    this.minimumOrderValue = minimumOrderValue;
  }

  public Integer getMinimumOrderValue() {
    return minimumOrderValue;
  }

  public void setApplyFreight(String applyFreight) {
    this.applyFreight = applyFreight;
  }

  public String getApplyFreight() {
    return applyFreight;
  }

  public void setPartialShipmentsAllowed(String partialShipmentsAllowed) {
    this.partialShipmentsAllowed = partialShipmentsAllowed;
  }

  public String getPartialShipmentsAllowed() {
    return partialShipmentsAllowed;
  }

  public void setCustomerPORequired(String customerPORequired) {
    this.customerPORequired = customerPORequired;
  }

  public String getCustomerPORequired() {
    return customerPORequired;
  }

  public void setPartialOrderShipmentsAllowed(String partialOrderShipmentsAllowed) {
    this.partialOrderShipmentsAllowed = partialOrderShipmentsAllowed;
  }

  public String getPartialOrderShipmentsAllowed() {
    return partialOrderShipmentsAllowed;
  }

  public void setSubstitutesAllowed(String substitutesAllowed) {
    this.substitutesAllowed = substitutesAllowed;
  }

  public String getSubstitutesAllowed() {
    return substitutesAllowed;
  }

  public void setPriceAdjustmentSchedule(String priceAdjustmentSchedule) {
    this.priceAdjustmentSchedule = priceAdjustmentSchedule;
  }

  public String getPriceAdjustmentSchedule() {
    return priceAdjustmentSchedule;
  }

  public void setGroupCustomerPriceGp(String groupCustomerPriceGp) {
    this.groupCustomerPriceGp = groupCustomerPriceGp;
  }

  public String getGroupCustomerPriceGp() {
    return groupCustomerPriceGp;
  }

  public void setCarrierNumber(Integer carrierNumber) {
    this.carrierNumber = carrierNumber;
  }

  public Integer getCarrierNumber() {
    return carrierNumber;
  }

  public void setPriorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
  }

  public String getPriorityCode() {
    return priorityCode;
  }

  public void setCheckCreditLevel(String checkCreditLevel) {
    this.checkCreditLevel = checkCreditLevel;
  }

  public String getCheckCreditLevel() {
    return checkCreditLevel;
  }

  public void setBackordersAllowed(String backordersAllowed) {
    this.backordersAllowed = backordersAllowed;
  }

  public String getBackordersAllowed() {
    return backordersAllowed;
  }
}
