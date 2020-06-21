package be.e1.bssv.util.J5601018.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BE_GetABSAddlData_D5601018A extends ValueObject implements Serializable {
    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric mnAddressNumber = null;

    /**
     * Request Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56REQN <br>
     * EnterpriseOne field length:  24 <br>
     */
    private String sz56RequestNumber = null;

    /**
     * Comments 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56COMM1 <br>
     * EnterpriseOne field length:  200 <br>
     */
    private String sz56Comments1 = null;

    /**
     * Comments 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56COMM2 <br>
     * EnterpriseOne field length:  200 <br>
     */
    private String sz56Comments2 = null;

    /**
     * Comments 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56COMM3 <br>
     * EnterpriseOne field length:  200 <br>
     */
    private String sz56Comments3 = null;

    /**
     * Billing Address Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BADT <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: X <br>
     * EnterpriseOne User Defined Code: H42/BA <br>
     */
    private String cBillingAddressType = null;

    /**
     * Price Pick List (Y/N)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PLST <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: Y <br>
     * EnterpriseOne Edit Rule:VALUE <br>
     */
    private String cPricePickListYN = null;

    /**
     * Print Adjustments on Invoice (Y/N)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSPA <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: Y <br>
     * EnterpriseOne Edit Rule:VALUE <br>
     */
    private String cPrintAdjustmentsonInvoic = null;

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
    private MathNumeric mnInvoiceCopies = null;

    /**
     * Freight Handling Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FRTH <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 42/FR <br>
     */
    private String szFreightHandlingCode = null;

    /**
     * Hold Orders Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: HOLD <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 42/HC <br>
     */
    private String szHoldOrdersCode = null;

    /**
     * Item Restrictions
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EDF2 <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne User Defined Code: H40/ED <br>
     */
    private String cItemRestrictions = null;

    /**
     * Record Type - Bank Transit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BKTP <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne User Defined Code: 00/BT <br>
     */
    private String cF0030BankTransitRecordType = null;

    /**
     * Transit Number - Bank
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TNST <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String szF0030BankTransitNumber = null;

    /**
     * Bank Account Number - Customer
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CBNK <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String szF0030CustBankAcctNumber = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szF0030Description = null;

    /**
     * Bank Account - Control Digit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CHKD <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String szF0030ControlDigit = null;

    /**
     * Currency Code - From
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CRCD <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String szF0030CurrencyCodeFrom = null;

    /**
     * BACS System-Reference/Roll Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RLN <br>
     * EnterpriseOne field length:  18 <br>
     */
    private String szF0030ReferenceRollNumber = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String szCostCenter = null;

    /**
     * SWIFT Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SWFT <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String szF0030SwiftCode = null;

    /**
     * Checking or Savings Account
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CKSV <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne User Defined Code: H00/CK <br>
     */
    private String cF0030CheckingorSavingsAccount = null;

    /**
     * Transaction Originator
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TORG <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szRequestTransactionOriginator = null;

    /**
     * Electronic Address
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EMAL <br>
     * EnterpriseOne field length:  256 <br>
     */
    private String szRequesterEmailAddress = null;

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
    private MathNumeric mnF0030AddressNumberBank = null;

    /**
     * International Bank Account Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: IBAN <br>
     * EnterpriseOne field length:  34 <br>
     */
    private String szF0030InternationalBankAcct = null;

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
    private MathNumeric mnRelatedAddressNo = null;

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
    private MathNumeric mnRequestLineNumber = null;

    /**
     * Error Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cErrorCode = null;

    /**
     * Error Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ERRDSCA <br>
     * EnterpriseOne field length:  60 <br>
     */
    private String szErrorDescription = null;
    
    /* Patrick Reilly add 15 new fields per Neil S */
    private String errorDescription = null;
    private MathNumeric amountDecimals = null;
    private MathNumeric quantityDecimals = null;
    private String batchProcessingMode = null;
    private String printMessage = null;
    private MathNumeric minimumOrderValue = null;
    private String applyFreight = null;
    private String partialShipmentsAllowed = null;
    private String customerPORequired = null;
    private String partialOrderShipmentsAllowed = null;
    private String substitutesAllowed = null;
    private String priceAdjustmentSchedule = null;
    private String groupCustomerPriceGp = null;
    private MathNumeric carrierNumber = null;
    private String priorityCode = null;
    private String checkCreditLevel = null;
    private String backordersAllowed = null;

    public void setMnAddressNumber(MathNumeric mnAddressNumber) {
        this.mnAddressNumber = mnAddressNumber;
    }

    public MathNumeric getMnAddressNumber() {
        return mnAddressNumber;
    }

    public void setSz56RequestNumber(String sz56RequestNumber) {
        this.sz56RequestNumber = sz56RequestNumber;
    }

    public String getSz56RequestNumber() {
        return sz56RequestNumber;
    }

    public void setSz56Comments1(String sz56Comments1) {
        this.sz56Comments1 = sz56Comments1;
    }

    public String getSz56Comments1() {
        return sz56Comments1;
    }

    public void setSz56Comments2(String sz56Comments2) {
        this.sz56Comments2 = sz56Comments2;
    }

    public String getSz56Comments2() {
        return sz56Comments2;
    }

    public void setSz56Comments3(String sz56Comments3) {
        this.sz56Comments3 = sz56Comments3;
    }

    public String getSz56Comments3() {
        return sz56Comments3;
    }

    public void setCBillingAddressType(String cBillingAddressType) {
        this.cBillingAddressType = cBillingAddressType;
    }

    public String getCBillingAddressType() {
        return cBillingAddressType;
    }

    public void setCPricePickListYN(String cPricePickListYN) {
        this.cPricePickListYN = cPricePickListYN;
    }

    public String getCPricePickListYN() {
        return cPricePickListYN;
    }

    public void setCPrintAdjustmentsonInvoic(String cPrintAdjustmentsonInvoic) {
        this.cPrintAdjustmentsonInvoic = cPrintAdjustmentsonInvoic;
    }

    public String getCPrintAdjustmentsonInvoic() {
        return cPrintAdjustmentsonInvoic;
    }

    public void setMnInvoiceCopies(MathNumeric mnInvoiceCopies) {
        this.mnInvoiceCopies = mnInvoiceCopies;
    }

    public MathNumeric getMnInvoiceCopies() {
        return mnInvoiceCopies;
    }

    public void setSzFreightHandlingCode(String szFreightHandlingCode) {
        this.szFreightHandlingCode = szFreightHandlingCode;
    }

    public String getSzFreightHandlingCode() {
        return szFreightHandlingCode;
    }

    public void setSzHoldOrdersCode(String szHoldOrdersCode) {
        this.szHoldOrdersCode = szHoldOrdersCode;
    }

    public String getSzHoldOrdersCode() {
        return szHoldOrdersCode;
    }

    public void setCItemRestrictions(String cItemRestrictions) {
        this.cItemRestrictions = cItemRestrictions;
    }

    public String getCItemRestrictions() {
        return cItemRestrictions;
    }

    public void setCF0030BankTransitRecordType(String cF0030BankTransitRecordType) {
        this.cF0030BankTransitRecordType = cF0030BankTransitRecordType;
    }

    public String getCF0030BankTransitRecordType() {
        return cF0030BankTransitRecordType;
    }

    public void setSzF0030BankTransitNumber(String szF0030BankTransitNumber) {
        this.szF0030BankTransitNumber = szF0030BankTransitNumber;
    }

    public String getSzF0030BankTransitNumber() {
        return szF0030BankTransitNumber;
    }

    public void setSzF0030CustBankAcctNumber(String szF0030CustBankAcctNumber) {
        this.szF0030CustBankAcctNumber = szF0030CustBankAcctNumber;
    }

    public String getSzF0030CustBankAcctNumber() {
        return szF0030CustBankAcctNumber;
    }

    public void setSzF0030Description(String szF0030Description) {
        this.szF0030Description = szF0030Description;
    }

    public String getSzF0030Description() {
        return szF0030Description;
    }

    public void setSzF0030ControlDigit(String szF0030ControlDigit) {
        this.szF0030ControlDigit = szF0030ControlDigit;
    }

    public String getSzF0030ControlDigit() {
        return szF0030ControlDigit;
    }

    public void setSzF0030CurrencyCodeFrom(String szF0030CurrencyCodeFrom) {
        this.szF0030CurrencyCodeFrom = szF0030CurrencyCodeFrom;
    }

    public String getSzF0030CurrencyCodeFrom() {
        return szF0030CurrencyCodeFrom;
    }

    public void setSzF0030ReferenceRollNumber(String szF0030ReferenceRollNumber) {
        this.szF0030ReferenceRollNumber = szF0030ReferenceRollNumber;
    }

    public String getSzF0030ReferenceRollNumber() {
        return szF0030ReferenceRollNumber;
    }

    public void setSzCostCenter(String szCostCenter) {
        this.szCostCenter = szCostCenter;
    }

    public String getSzCostCenter() {
        return szCostCenter;
    }

    public void setSzF0030SwiftCode(String szF0030SwiftCode) {
        this.szF0030SwiftCode = szF0030SwiftCode;
    }

    public String getSzF0030SwiftCode() {
        return szF0030SwiftCode;
    }

    public void setCF0030CheckingorSavingsAccount(String cF0030CheckingorSavingsAccount) {
        this.cF0030CheckingorSavingsAccount = cF0030CheckingorSavingsAccount;
    }

    public String getCF0030CheckingorSavingsAccount() {
        return cF0030CheckingorSavingsAccount;
    }

    public void setSzRequestTransactionOriginator(String szRequestTransactionOriginator) {
        this.szRequestTransactionOriginator = szRequestTransactionOriginator;
    }

    public String getSzRequestTransactionOriginator() {
        return szRequestTransactionOriginator;
    }

    public void setSzRequesterEmailAddress(String szRequesterEmailAddress) {
        this.szRequesterEmailAddress = szRequesterEmailAddress;
    }

    public String getSzRequesterEmailAddress() {
        return szRequesterEmailAddress;
    }

    public void setMnF0030AddressNumberBank(MathNumeric mnF0030AddressNumberBank) {
        this.mnF0030AddressNumberBank = mnF0030AddressNumberBank;
    }

    public MathNumeric getMnF0030AddressNumberBank() {
        return mnF0030AddressNumberBank;
    }

    public void setSzF0030InternationalBankAcct(String szF0030InternationalBankAcct) {
        this.szF0030InternationalBankAcct = szF0030InternationalBankAcct;
    }

    public String getSzF0030InternationalBankAcct() {
        return szF0030InternationalBankAcct;
    }

    public void setMnRelatedAddressNo(MathNumeric mnRelatedAddressNo) {
        this.mnRelatedAddressNo = mnRelatedAddressNo;
    }

    public MathNumeric getMnRelatedAddressNo() {
        return mnRelatedAddressNo;
    }

    public void setMnRequestLineNumber(MathNumeric mnRequestLineNumber) {
        this.mnRequestLineNumber = mnRequestLineNumber;
    }

    public MathNumeric getMnRequestLineNumber() {
        return mnRequestLineNumber;
    }

    public void setCErrorCode(String cErrorCode) {
        this.cErrorCode = cErrorCode;
    }

    public String getCErrorCode() {
        return cErrorCode;
    }

    public void setSzErrorDescription(String szErrorDescription) {
        this.szErrorDescription = szErrorDescription;
    }

    public String getSzErrorDescription() {
        return szErrorDescription;
    }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setAmountDecimals(MathNumeric amountDecimals) {
    this.amountDecimals = amountDecimals;
  }

  public MathNumeric getAmountDecimals() {
    return amountDecimals;
  }

  public void setQuantityDecimals(MathNumeric quantityDecimals) {
    this.quantityDecimals = quantityDecimals;
  }

  public MathNumeric getQuantityDecimals() {
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

  public void setMinimumOrderValue(MathNumeric minimumOrderValue) {
    this.minimumOrderValue = minimumOrderValue;
  }

  public MathNumeric getMinimumOrderValue() {
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

  public void setCarrierNumber(MathNumeric carrierNumber) {
    this.carrierNumber = carrierNumber;
  }

  public MathNumeric getCarrierNumber() {
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
