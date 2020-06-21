package be.e1.bssv.J564207.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSalesOrderHeaderWhereFields extends ValueObject implements Serializable {
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
    private MathNumeric F4211_DOCO = null;
    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_AN8 = null;
    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_LNID = null;
    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String F4211_DCTO = null;

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
    private MathNumeric F4801_DOCO = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String F4211_MCU = null;

    /**
     * Production Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PMPN <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F4211_PMPN = null;

    /**
     * Aircraft Type Series
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56ACTS <br>
     * EnterpriseOne field length:  25 <br>
     * EnterpriseOne User Defined Code: 55/AT <br>
     */
    private String F564211_Z56ACTS = null;

    /**
     * Tail Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56TAIL <br>
     * EnterpriseOne field length:  8 <br>
     */
    private String F564211_Z56TAIL = null;

    /**
     * Date - MPS Due
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56MDRQJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F564201_Z56MDRQJ = null;

    /**
     * Sales Category Code 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP3 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/S3 <br>
     */
    private String F4211_SRP3 = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F4211_LITM = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String F4801_DCTO = null;


    public void setF4211_DOCO(MathNumeric F4211_DOCO) {
        this.F4211_DOCO = F4211_DOCO;
    }

    public MathNumeric getF4211_DOCO() {
        return F4211_DOCO;
    }

    public void setF4211_DCTO(String F4211_DCTO) {
        this.F4211_DCTO = F4211_DCTO;
    }

    public String getF4211_DCTO() {
        return F4211_DCTO;
    }

    public void setF4801_DOCO(MathNumeric F4801_DOCO) {
        this.F4801_DOCO = F4801_DOCO;
    }

    public MathNumeric getF4801_DOCO() {
        return F4801_DOCO;
    }

    public void setF4211_MCU(String F4211_MCU) {
        this.F4211_MCU = F4211_MCU;
    }

    public String getF4211_MCU() {
        return F4211_MCU;
    }

    public void setF4211_PMPN(String F4211_PMPN) {
        this.F4211_PMPN = F4211_PMPN;
    }

    public String getF4211_PMPN() {
        return F4211_PMPN;
    }

    public void setF564211_Z56ACTS(String F564211_Z56ACTS) {
        this.F564211_Z56ACTS = F564211_Z56ACTS;
    }

    public String getF564211_Z56ACTS() {
        return F564211_Z56ACTS;
    }

    public void setF564211_Z56TAIL(String F564211_Z56TAIL) {
        this.F564211_Z56TAIL = F564211_Z56TAIL;
    }

    public String getF564211_Z56TAIL() {
        return F564211_Z56TAIL;
    }

    public void setF564201_Z56MDRQJ(Date F564201_Z56MDRQJ) {
        this.F564201_Z56MDRQJ = F564201_Z56MDRQJ;
    }

    public Date getF564201_Z56MDRQJ() {
        return F564201_Z56MDRQJ;
    }

    public void setF4211_SRP3(String F4211_SRP3) {
        this.F4211_SRP3 = F4211_SRP3;
    }

    public String getF4211_SRP3() {
        return F4211_SRP3;
    }

    public void setF4211_LITM(String F4211_LITM) {
        this.F4211_LITM = F4211_LITM;
    }

    public String getF4211_LITM() {
        return F4211_LITM;
    }

    public void setF4801_DCTO(String F4801_DCTO) {
        this.F4801_DCTO = F4801_DCTO;
    }

    public String getF4801_DCTO() {
        return F4801_DCTO;
    }

    public void setF4211_AN8(MathNumeric F4211_AN8) {
        this.F4211_AN8 = F4211_AN8;
    }

    public MathNumeric getF4211_AN8() {
        return F4211_AN8;
    }

    public void setF4211_LNID(MathNumeric F4211_LNID) {
        this.F4211_LNID = F4211_LNID;
    }

    public MathNumeric getF4211_LNID() {
        return F4211_LNID;
    }


}
