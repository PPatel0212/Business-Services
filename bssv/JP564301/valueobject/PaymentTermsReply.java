package be.e1.bssv.JP564301.valueobject;

import be.e1.bssv.J5643001.valueobject.InternalPaymentTerms_D48S0350;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class PaymentTermsReply extends MessageValueObject implements Serializable {
    /**
     * Payment Terms Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: PTC <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String paymentTermsCode = null;

    /**
     * Description - Payment Terms
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PTD <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String descriptionPaymentTerms = null;

    /**
     * Discount % - Payment Terms
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCP <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 5 <br>
     */
    private BigDecimal discountPaymentTerms = null;

    /**
     * Discount Days
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCD <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer discountDays = null;

    /**
     * Net Days to Pay
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NDTP <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer netDaystoPay = null;

    /**
     * Date - Net Due
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateDue = null;

    /**
     * Number of Split Payments
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NSP <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer numberOfSplitPayments = null;

    /**
     * Days to Pay Aging
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTPA <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer daysToPayAging = null;

    /**
     * Percentage - Effective Interest Rate
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EIR <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private BigDecimal percentageEffectiveInterestRate = null;

    /**
     * Date - Due Date - MO
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PXDM <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer dateDueMonth = null;

    /**
     * Date - Due Date - DA
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PXDD <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer dateDueDay = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String errorMessage = null;

    /**
     * TODO: Default public constructor for instantiating: PaymentTermsReply
     */
    public PaymentTermsReply() {
    }
    
    public PaymentTermsReply(InternalPaymentTerms_D48S0350 internalVO){
        
        try{
            Calendar dateDue = Calendar.getInstance();
            if (internalVO.getJdDateDueJulian() != null){
                dateDue.setTime(internalVO.getJdDateDueJulian());
                this.setDateDue(dateDue);
            }
            
            this.setDateDueDay(new Integer(internalVO.getMnProxDateDay().intValue()));
            this.setDateDueMonth(new Integer(internalVO.getMnProxDateMonth().intValue()));
            this.setDaysToPayAging(new Integer(internalVO.getMnDaysToPayAging().intValue()));
            this.setDescriptionPaymentTerms(internalVO.getSzDescriptPaymentTerms());
            this.setDiscountDays(new Integer(internalVO.getMnDiscountDays().intValue()));
            this.setDiscountPaymentTerms(internalVO.getMnDiscountPaymentTerms().bigDecimalValue());
            this.setErrorMessage(internalVO.getSzErrorMessageID());
            this.setNetDaystoPay(new Integer(internalVO.getMnNetDaysToPay().intValue()));
            this.setNumberOfSplitPayments(new Integer(internalVO.getMnNumberOfSplitPayments().intValue()));
            this.setPaymentTermsCode(internalVO.getSzPaymentTermsCode01());
            this.setPercentageEffectiveInterestRate(internalVO.getMnPerEffectiveInteretRt().bigDecimalValue());
        }catch(Exception exp){
            this.setErrorMessage(exp.getMessage());
        }
    }


    public void setPaymentTermsCode(String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }

    public String getPaymentTermsCode() {
        return paymentTermsCode;
    }

    public void setDescriptionPaymentTerms(String descriptionPaymentTerms) {
        this.descriptionPaymentTerms = descriptionPaymentTerms;
    }

    public String getDescriptionPaymentTerms() {
        return descriptionPaymentTerms;
    }

    public void setDiscountPaymentTerms(BigDecimal discountPaymentTerms) {
        this.discountPaymentTerms = discountPaymentTerms;
    }

    public BigDecimal getDiscountPaymentTerms() {
        return discountPaymentTerms;
    }

    public void setDiscountDays(Integer discountDays) {
        this.discountDays = discountDays;
    }

    public Integer getDiscountDays() {
        return discountDays;
    }

    public void setNetDaystoPay(Integer netDaystoPay) {
        this.netDaystoPay = netDaystoPay;
    }

    public Integer getNetDaystoPay() {
        return netDaystoPay;
    }

    public void setDateDue(Calendar dateDue) {
        this.dateDue = dateDue;
    }

    public Calendar getDateDue() {
        return dateDue;
    }

    public void setNumberOfSplitPayments(Integer numberOfSplitPayments) {
        this.numberOfSplitPayments = numberOfSplitPayments;
    }

    public Integer getNumberOfSplitPayments() {
        return numberOfSplitPayments;
    }

    public void setDaysToPayAging(Integer daysToPayAging) {
        this.daysToPayAging = daysToPayAging;
    }

    public Integer getDaysToPayAging() {
        return daysToPayAging;
    }

    public void setPercentageEffectiveInterestRate(BigDecimal percentageEffectiveInterestRate) {
        this.percentageEffectiveInterestRate = percentageEffectiveInterestRate;
    }

    public BigDecimal getPercentageEffectiveInterestRate() {
        return percentageEffectiveInterestRate;
    }

    public void setDateDueMonth(Integer dateDueMonth) {
        this.dateDueMonth = dateDueMonth;
    }

    public Integer getDateDueMonth() {
        return dateDueMonth;
    }

    public void setDateDueDay(Integer dateDueDay) {
        this.dateDueDay = dateDueDay;
    }

    public Integer getDateDueDay() {
        return dateDueDay;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
