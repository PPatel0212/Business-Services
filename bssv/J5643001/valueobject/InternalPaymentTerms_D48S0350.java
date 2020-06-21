package be.e1.bssv.J5643001.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalPaymentTerms_D48S0350 extends ValueObject implements Serializable {
    /**
     * Payment Terms Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: PTC <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String szPaymentTermsCode01 = null;

    /**
     * Description - Payment Terms
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PTD <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String szDescriptPaymentTerms = null;

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
    private MathNumeric mnDiscountPaymentTerms = null;

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
    private MathNumeric mnDiscountDays = null;

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
    private MathNumeric mnNetDaysToPay = null;

    /**
     * Date - Net Due
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date jdDateDueJulian = null;

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
    private MathNumeric mnNumberOfSplitPayments = null;

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
    private MathNumeric mnDaysToPayAging = null;

    /**
     * Percentage - Effective Interest Rate
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EIR <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 3 <br>
     * EnterpriseOne Edit Rule:RANGE <br>
     */
    private MathNumeric mnPerEffectiveInteretRt = null;

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
    private MathNumeric mnProxDateMonth = null;

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
    private MathNumeric mnProxDateDay = null;

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szErrorMessageID = null;

    public void setSzPaymentTermsCode01(String szPaymentTermsCode01) {
        this.szPaymentTermsCode01 = szPaymentTermsCode01;
    }

    public String getSzPaymentTermsCode01() {
        return szPaymentTermsCode01;
    }

    public void setSzDescriptPaymentTerms(String szDescriptPaymentTerms) {
        this.szDescriptPaymentTerms = szDescriptPaymentTerms;
    }

    public String getSzDescriptPaymentTerms() {
        return szDescriptPaymentTerms;
    }

    public void setMnDiscountPaymentTerms(MathNumeric mnDiscountPaymentTerms) {
        this.mnDiscountPaymentTerms = mnDiscountPaymentTerms;
    }

    public MathNumeric getMnDiscountPaymentTerms() {
        return mnDiscountPaymentTerms;
    }

    public void setMnDiscountDays(MathNumeric mnDiscountDays) {
        this.mnDiscountDays = mnDiscountDays;
    }

    public MathNumeric getMnDiscountDays() {
        return mnDiscountDays;
    }

    public void setMnNetDaysToPay(MathNumeric mnNetDaysToPay) {
        this.mnNetDaysToPay = mnNetDaysToPay;
    }

    public MathNumeric getMnNetDaysToPay() {
        return mnNetDaysToPay;
    }

    public void setJdDateDueJulian(Date jdDateDueJulian) {
        this.jdDateDueJulian = jdDateDueJulian;
    }

    public Date getJdDateDueJulian() {
        return jdDateDueJulian;
    }

    public void setMnNumberOfSplitPayments(MathNumeric mnNumberOfSplitPayments) {
        this.mnNumberOfSplitPayments = mnNumberOfSplitPayments;
    }

    public MathNumeric getMnNumberOfSplitPayments() {
        return mnNumberOfSplitPayments;
    }

    public void setMnDaysToPayAging(MathNumeric mnDaysToPayAging) {
        this.mnDaysToPayAging = mnDaysToPayAging;
    }

    public MathNumeric getMnDaysToPayAging() {
        return mnDaysToPayAging;
    }

    public void setMnPerEffectiveInteretRt(MathNumeric mnPerEffectiveInteretRt) {
        this.mnPerEffectiveInteretRt = mnPerEffectiveInteretRt;
    }

    public MathNumeric getMnPerEffectiveInteretRt() {
        return mnPerEffectiveInteretRt;
    }

    public void setMnProxDateMonth(MathNumeric mnProxDateMonth) {
        this.mnProxDateMonth = mnProxDateMonth;
    }

    public MathNumeric getMnProxDateMonth() {
        return mnProxDateMonth;
    }

    public void setMnProxDateDay(MathNumeric mnProxDateDay) {
        this.mnProxDateDay = mnProxDateDay;
    }

    public MathNumeric getMnProxDateDay() {
        return mnProxDateDay;
    }

    public void setSzErrorMessageID(String szErrorMessageID) {
        this.szErrorMessageID = szErrorMessageID;
    }

    public String getSzErrorMessageID() {
        return szErrorMessageID;
    }
}
