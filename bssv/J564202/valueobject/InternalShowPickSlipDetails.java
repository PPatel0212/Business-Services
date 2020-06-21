package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowPickSlipDetails extends ValueObject implements Serializable {
    /**
     * Unique Key ID (Internal)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: UKID <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_UKID = null;

    /**
     * Next Number Range 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: N001 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_N001 = null;

    /**
     * Pick Slip Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PSN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_PSN = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String F5642008_KCOO = null;

    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_DOCO = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String F5642008_DCTO = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private MathNumeric F5642008_LNID = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String F5642008_MCU = null;

    /**
     * Item Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITM <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_ITM = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F5642008_LITM = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F5642008_DSC1 = null;

    /**
     * Lot/Serial Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LOTN <br>
     * EnterpriseOne field length:  30 <br>
     * EnterpriseOne Next Number: 40/1 <br>
     */
    private String F5642008_LOTN = null;

    /**
     * Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VR01 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F5642008_VR01 = null;

    /**
     * Quantity Shipped
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SOQS <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric F5642008_SOQS = null;

    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric F5642008_AN8 = null;

    /**
     * Item Number - Customer/Supplier
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F5642008_CITM = null;

    /**
     * Customer Long Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56CLITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F5642008_Z56CLITM = null;

    /**
     * Partner
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56CAN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_Z56CAN8 = null;

    /**
     * Serial Number 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRL1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F5642008_SRL1 = null;

    /**
     * Airworthiness Certification Required Y/N
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56ACERT <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: 0 <br>
     * EnterpriseOne Edit Rule:VALUE <br>
     */
    private String F5642008_Z56ACERT = null;

    /**
     * Minimum Serial Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56MNSRL <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F5642008_Z56MNSRL = null;

    /**
     * Maximum Serial Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56MXSRL <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F5642008_Z56MXSRL = null;

    /**
     * Serial Number Count
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56SRLCN <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_Z56SRLCN = null;

    /**
     * Country
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTR <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 00/CN <br>
     */
    private String F5642008_CTR = null;

    /**
     * Program ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PID <br>
     * EnterpriseOne field length:  10 <br>
     * EnterpriseOne Edit Rule:CHKOBJ <br>
     */
    private String F5642008_PID = null;

    /**
     * User ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: USER <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String F5642008_USER = null;

    /**
     * Work Station ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JOBN <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String F5642008_JOBN = null;

    /**
     * Time - Last Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMT <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F5642008_UPMT = null;

    /**
     * Date - Updated
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPMJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F5642008_UPMJ = null;

    /**
     * IAT Future Math Numeric01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: IAT01 <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F5642008_IAT01 = null;

    /**
     * IAT Future Math Numeric02
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: IAT02 <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F5642008_IAT02 = null;

    /**
     * IAT Future Math Numeric03
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: IAT03 <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F5642008_IAT03 = null;

    /**
     * Date - Future Date 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DATF01 <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F5642008_DATF01 = null;

    /**
     * Date - Future Date 02
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DATF02 <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F5642008_DATF02 = null;

    /**
     * Date - Future Date 03
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DATF03 <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F5642008_DATF03 = null;

    /**
     * Use Description 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UD01 <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String F5642008_UD01 = null;

    /**
     * Use Description 02
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UD02 <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String F5642008_UD02 = null;

    /**
     * Use Description 03
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UD03 <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String F5642008_UD03 = null;

    /**
     * Future Character 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NZCF1 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String F5642008_NZCF1 = null;

    /**
     * Future Character 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NZCF2 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String F5642008_NZCF2 = null;

    /**
     * Future Character 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NZCF3 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String F5642008_NZCF3 = null;
    
  /**
   * Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String F5642008_MERL = null;
  
  /**
   * Date Engineering Change Date
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ECOD <br>
   * EnterpriseOne field length:  1 <br>
   */
  private Date F5642008_ECOD = null;
  

    public void setF5642008_UKID(MathNumeric F5642008_UKID) {
        this.F5642008_UKID = F5642008_UKID;
    }

    public MathNumeric getF5642008_UKID() {
        return F5642008_UKID;
    }

    public void setF5642008_N001(MathNumeric F5642008_N001) {
        this.F5642008_N001 = F5642008_N001;
    }

    public MathNumeric getF5642008_N001() {
        return F5642008_N001;
    }

    public void setF5642008_PSN(MathNumeric F5642008_PSN) {
        this.F5642008_PSN = F5642008_PSN;
    }

    public MathNumeric getF5642008_PSN() {
        return F5642008_PSN;
    }

    public void setF5642008_KCOO(String F5642008_KCOO) {
        this.F5642008_KCOO = F5642008_KCOO;
    }

    public String getF5642008_KCOO() {
        return F5642008_KCOO;
    }

    public void setF5642008_DOCO(MathNumeric F5642008_DOCO) {
        this.F5642008_DOCO = F5642008_DOCO;
    }

    public MathNumeric getF5642008_DOCO() {
        return F5642008_DOCO;
    }

    public void setF5642008_DCTO(String F5642008_DCTO) {
        this.F5642008_DCTO = F5642008_DCTO;
    }

    public String getF5642008_DCTO() {
        return F5642008_DCTO;
    }

    public void setF5642008_LNID(MathNumeric F5642008_LNID) {
        this.F5642008_LNID = F5642008_LNID;
    }

    public MathNumeric getF5642008_LNID() {
        return F5642008_LNID;
    }

    public void setF5642008_MCU(String F5642008_MCU) {
        this.F5642008_MCU = F5642008_MCU;
    }

    public String getF5642008_MCU() {
        return F5642008_MCU;
    }

    public void setF5642008_ITM(MathNumeric F5642008_ITM) {
        this.F5642008_ITM = F5642008_ITM;
    }

    public MathNumeric getF5642008_ITM() {
        return F5642008_ITM;
    }

    public void setF5642008_LITM(String F5642008_LITM) {
        this.F5642008_LITM = F5642008_LITM;
    }

    public String getF5642008_LITM() {
        return F5642008_LITM;
    }

    public void setF5642008_DSC1(String F5642008_DSC1) {
        this.F5642008_DSC1 = F5642008_DSC1;
    }

    public String getF5642008_DSC1() {
        return F5642008_DSC1;
    }

    public void setF5642008_LOTN(String F5642008_LOTN) {
        this.F5642008_LOTN = F5642008_LOTN;
    }

    public String getF5642008_LOTN() {
        return F5642008_LOTN;
    }

    public void setF5642008_VR01(String F5642008_VR01) {
        this.F5642008_VR01 = F5642008_VR01;
    }

    public String getF5642008_VR01() {
        return F5642008_VR01;
    }

    public void setF5642008_SOQS(MathNumeric F5642008_SOQS) {
        this.F5642008_SOQS = F5642008_SOQS;
    }

    public MathNumeric getF5642008_SOQS() {
        return F5642008_SOQS;
    }

    public void setF5642008_AN8(MathNumeric F5642008_AN8) {
        this.F5642008_AN8 = F5642008_AN8;
    }

    public MathNumeric getF5642008_AN8() {
        return F5642008_AN8;
    }

    public void setF5642008_CITM(String F5642008_CITM) {
        this.F5642008_CITM = F5642008_CITM;
    }

    public String getF5642008_CITM() {
        return F5642008_CITM;
    }

    public void setF5642008_Z56CLITM(String F5642008_Z56CLITM) {
        this.F5642008_Z56CLITM = F5642008_Z56CLITM;
    }

    public String getF5642008_Z56CLITM() {
        return F5642008_Z56CLITM;
    }

    public void setF5642008_Z56CAN8(MathNumeric F5642008_Z56CAN8) {
        this.F5642008_Z56CAN8 = F5642008_Z56CAN8;
    }

    public MathNumeric getF5642008_Z56CAN8() {
        return F5642008_Z56CAN8;
    }

    public void setF5642008_SRL1(String F5642008_SRL1) {
        this.F5642008_SRL1 = F5642008_SRL1;
    }

    public String getF5642008_SRL1() {
        return F5642008_SRL1;
    }

    public void setF5642008_Z56ACERT(String F5642008_Z56ACERT) {
        this.F5642008_Z56ACERT = F5642008_Z56ACERT;
    }

    public String getF5642008_Z56ACERT() {
        return F5642008_Z56ACERT;
    }

    public void setF5642008_Z56MNSRL(String F5642008_Z56MNSRL) {
        this.F5642008_Z56MNSRL = F5642008_Z56MNSRL;
    }

    public String getF5642008_Z56MNSRL() {
        return F5642008_Z56MNSRL;
    }

    public void setF5642008_Z56MXSRL(String F5642008_Z56MXSRL) {
        this.F5642008_Z56MXSRL = F5642008_Z56MXSRL;
    }

    public String getF5642008_Z56MXSRL() {
        return F5642008_Z56MXSRL;
    }

    public void setF5642008_Z56SRLCN(MathNumeric F5642008_Z56SRLCN) {
        this.F5642008_Z56SRLCN = F5642008_Z56SRLCN;
    }

    public MathNumeric getF5642008_Z56SRLCN() {
        return F5642008_Z56SRLCN;
    }

    public void setF5642008_CTR(String F5642008_CTR) {
        this.F5642008_CTR = F5642008_CTR;
    }

    public String getF5642008_CTR() {
        return F5642008_CTR;
    }

    public void setF5642008_PID(String F5642008_PID) {
        this.F5642008_PID = F5642008_PID;
    }

    public String getF5642008_PID() {
        return F5642008_PID;
    }

    public void setF5642008_USER(String F5642008_USER) {
        this.F5642008_USER = F5642008_USER;
    }

    public String getF5642008_USER() {
        return F5642008_USER;
    }

    public void setF5642008_JOBN(String F5642008_JOBN) {
        this.F5642008_JOBN = F5642008_JOBN;
    }

    public String getF5642008_JOBN() {
        return F5642008_JOBN;
    }

    public void setF5642008_UPMT(MathNumeric F5642008_UPMT) {
        this.F5642008_UPMT = F5642008_UPMT;
    }

    public MathNumeric getF5642008_UPMT() {
        return F5642008_UPMT;
    }

    public void setF5642008_UPMJ(Date F5642008_UPMJ) {
        this.F5642008_UPMJ = F5642008_UPMJ;
    }

    public Date getF5642008_UPMJ() {
        return F5642008_UPMJ;
    }

    public void setF5642008_IAT01(MathNumeric F5642008_IAT01) {
        this.F5642008_IAT01 = F5642008_IAT01;
    }

    public MathNumeric getF5642008_IAT01() {
        return F5642008_IAT01;
    }

    public void setF5642008_IAT02(MathNumeric F5642008_IAT02) {
        this.F5642008_IAT02 = F5642008_IAT02;
    }

    public MathNumeric getF5642008_IAT02() {
        return F5642008_IAT02;
    }

    public void setF5642008_IAT03(MathNumeric F5642008_IAT03) {
        this.F5642008_IAT03 = F5642008_IAT03;
    }

    public MathNumeric getF5642008_IAT03() {
        return F5642008_IAT03;
    }

    public void setF5642008_DATF01(Date F5642008_DATF01) {
        this.F5642008_DATF01 = F5642008_DATF01;
    }

    public Date getF5642008_DATF01() {
        return F5642008_DATF01;
    }

    public void setF5642008_DATF02(Date F5642008_DATF02) {
        this.F5642008_DATF02 = F5642008_DATF02;
    }

    public Date getF5642008_DATF02() {
        return F5642008_DATF02;
    }

    public void setF5642008_DATF03(Date F5642008_DATF03) {
        this.F5642008_DATF03 = F5642008_DATF03;
    }

    public Date getF5642008_DATF03() {
        return F5642008_DATF03;
    }

    public void setF5642008_UD01(String F5642008_UD01) {
        this.F5642008_UD01 = F5642008_UD01;
    }

    public String getF5642008_UD01() {
        return F5642008_UD01;
    }

    public void setF5642008_UD02(String F5642008_UD02) {
        this.F5642008_UD02 = F5642008_UD02;
    }

    public String getF5642008_UD02() {
        return F5642008_UD02;
    }

    public void setF5642008_UD03(String F5642008_UD03) {
        this.F5642008_UD03 = F5642008_UD03;
    }

    public String getF5642008_UD03() {
        return F5642008_UD03;
    }

    public void setF5642008_NZCF1(String F5642008_NZCF1) {
        this.F5642008_NZCF1 = F5642008_NZCF1;
    }

    public String getF5642008_NZCF1() {
        return F5642008_NZCF1;
    }

    public void setF5642008_NZCF2(String F5642008_NZCF2) {
        this.F5642008_NZCF2 = F5642008_NZCF2;
    }

    public String getF5642008_NZCF2() {
        return F5642008_NZCF2;
    }

    public void setF5642008_NZCF3(String F5642008_NZCF3) {
        this.F5642008_NZCF3 = F5642008_NZCF3;
    }

    public String getF5642008_NZCF3() {
        return F5642008_NZCF3;
    }

  public void setF5642008_MERL(String F5642008_MERL) {
    this.F5642008_MERL = F5642008_MERL;
  }

  public String getF5642008_MERL() {
    return F5642008_MERL;
  }


  public void setF5642008_ECOD(Date F5642008_ECOD) {
    this.F5642008_ECOD = F5642008_ECOD;
  }

  public Date getF5642008_ECOD() {
    return F5642008_ECOD;
  }
}
