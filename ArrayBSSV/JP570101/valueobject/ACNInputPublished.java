package oracle.e1.bssv.JP570101.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssv.J570101.valueobject.InternalGetACN;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ACNInput_Published extends ValueObject implements Serializable {
    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String RECTYPE = null;

    /**
     * Tax ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TAX <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String KUNNR = null;

    /**
     * Name
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NAME <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String NAME1 = null;

    /**
     * User Reserved Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URRF <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String EXT_STNBR = null;

    /**
     * Address Line 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD1 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String STRAS = null;

    /**
     * City
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTY1 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String ORT01 = null;

    /**
     * State
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDS <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String REGIO = null;

    /**
     * Postal Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDZ <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String PSLTZ = null;

    /**
     * County
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: COUN <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String ORT02 = null;

    /**
     * Country
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTR <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String LAND1 = null;

    /**
     * Tax ID - Additional - Individual
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TX2 <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String TXJCD = null;

    /**
     * Search Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AT1 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String CUST_REC_T= null;

    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer CUST_ACN = null;

    /**
     * Address Line 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD2 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String LGY_NAME2 = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DL01 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String TYPE_CUST = null;

    /**
     * Address Number - 5th
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN86 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer TRUE_ACN = null;

    /**
     * User Reserved Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URDT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar TERM_DATE = null;

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
    private BigDecimal ST_TWN_NBR = null;

    /**
     * Partner Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRAN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private BigDecimal WHL_SVN_ID = null;

    /**
     * OC Kanban Card No
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OCCARDNO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private BigDecimal WHL_MKT_ID = null;

    /**
     * Category Code - Address Book 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AC01 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String TYP_WHL = null;

    /**
     * Partner Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRAN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private BigDecimal FTN_SVN_ID = null;

    /**
     * OC Kanban Card No
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OCCARDNO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private BigDecimal FTN_MKT_ID = null;

    /**
     * Address Number - 1st
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN81 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private BigDecimal HDQTRS = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String EXP_DEPT = null;

    /**
     * Category Code - Address Book 13
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AC13 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String CONCESS_NO = null;

    /**
     * Address Number - 2nd
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN82 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private BigDecimal CHAIN = null;

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
    private BigDecimal FTN_GEO_ID = null;

    /**
     * Sales Region
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AC11 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String TYP_ACC = null;

    /**
     * Category Code - Address Book 12
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AC12 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String FTN_FRAN = null;

    /**
     * Phone Prefix
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AR1 <br>
     * EnterpriseOne field length:  6 <br>
     */
    private String PH_AREA_CD = null;

    /**
     * Phone Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PH1 <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String PH_LIN_NBR = null;

    /**
     * Phone Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PH1 <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String PH_XTN_NBR = null;

    /**
     * User Reserved Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URCD <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String URCD = null;

    /**
     * User Reserved Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URRF <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String URRF = null;

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
    private BigDecimal URAT = null;

    /**
     * User Reserved Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: URDT <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar URDT = null;

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
    private BigDecimal URAB = null;

    /**
     * TODO: Default public constructor for instantiating: ACNInput_Published
     */
    public ACNInput_Published() {
    }

    public void setRECTYPE(String RECTYPE) {
        this.RECTYPE = RECTYPE;
    }

    public String getRECTYPE() {
        return RECTYPE;
    }

    public void setKUNNR(String KUNNR) {
        this.KUNNR = KUNNR;
    }

    public String getKUNNR() {
        return KUNNR;
    }

    public void setNAME1(String NAME1) {
        this.NAME1 = NAME1;
    }

    public String getNAME1() {
        return NAME1;
    }

    public void setEXT_STNBR(String EXT_STNBR) {
        this.EXT_STNBR = EXT_STNBR;
    }

    public String getEXT_STNBR() {
        return EXT_STNBR;
    }

    public void setSTRAS(String STRAS) {
        this.STRAS = STRAS;
    }

    public String getSTRAS() {
        return STRAS;
    }

    public void setORT01(String ORT01) {
        this.ORT01 = ORT01;
    }

    public String getORT01() {
        return ORT01;
    }

    public void setREGIO(String REGIO) {
        this.REGIO = REGIO;
    }

    public String getREGIO() {
        return REGIO;
    }

    public void setPSLTZ(String PSLTZ) {
        this.PSLTZ = PSLTZ;
    }

    public String getPSLTZ() {
        return PSLTZ;
    }

    public void setORT02(String ORT02) {
        this.ORT02 = ORT02;
    }

    public String getORT02() {
        return ORT02;
    }

    public void setLAND1(String LAND1) {
        this.LAND1 = LAND1;
    }

    public String getLAND1() {
        return LAND1;
    }

    public void setTXJCD(String TXJCD) {
        this.TXJCD = TXJCD;
    }

    public String getTXJCD() {
        return TXJCD;
    }

    public void setCUST_REC_T(String CUST_REC_T) {
        this.CUST_REC_T = CUST_REC_T;
    }

    public String getCUST_REC_T() {
        return CUST_REC_T;
    }

    public void setCUST_ACN(Integer CUST_ACN) {
        
        this.CUST_ACN = CUST_ACN;
    }

   public void setCUST_ACN(MathNumeric CUST_ACN) {
        
        if (this.CUST_ACN != null)
        {this.CUST_ACN=new Integer(CUST_ACN.intValue());}
    }

    public Integer getCUST_ACN() {
        return CUST_ACN;
    }

    public void setLGY_NAME2(String LGY_NAME2) {
        this.LGY_NAME2 = LGY_NAME2;
    }

    public String getLGY_NAME2() {
        return LGY_NAME2;
    }

    public void setTYPE_CUST(String TYPE_CUST) {
        this.TYPE_CUST = TYPE_CUST;
    }

    public String getTYPE_CUST() {
        return TYPE_CUST;
    }
    
    public void setTRUE_ACN(Integer TRUE_ACN) {
        
        this.TRUE_ACN = TRUE_ACN;
    }

    public void setTRUE_ACN(MathNumeric TRUE_ACN) {
       if (this.TRUE_ACN!=null)
       {this.TRUE_ACN = new Integer(TRUE_ACN.intValue());}
    }

    public Integer getTRUE_ACN() {
        return TRUE_ACN;
    }

    public void setTERM_DATE(Calendar TERM_DATE) {
        this.TERM_DATE = TERM_DATE;
    }

    public Calendar getTERM_DATE() {
        return TERM_DATE;
    }

    public void setST_TWN_NBR(BigDecimal ST_TWN_NBR) {
        this.ST_TWN_NBR = ST_TWN_NBR;
    }

   /* public void setST_TWN_NBR(MathNumeric ST_TWN_NBR) {
        if (this.ST_TWN_NBR != null)
            setST_TWN_NBR(ST_TWN_NBR.asBigDecimal());
        else
            setST_TWN_NBR((BigDecimal) null);

    }*/
    public BigDecimal getST_TWN_NBR() {
        return ST_TWN_NBR;
    }

    public void setWHL_SVN_ID(BigDecimal WHL_SVN_ID) {
        this.WHL_SVN_ID = WHL_SVN_ID;
    }

    public BigDecimal getWHL_SVN_ID() {
        return WHL_SVN_ID;
    }

    public void setWHL_MKT_ID(BigDecimal WHL_MKT_ID) {
        //if(this.WHL_MKT_ID!=null)
        this.WHL_MKT_ID = WHL_MKT_ID;
    }

    public BigDecimal getWHL_MKT_ID() {
        return WHL_MKT_ID;
    }

    public void setTYP_WHL(String TYP_WHL) {
        this.TYP_WHL = TYP_WHL;
    }

    public String getTYP_WHL() {
        return TYP_WHL;
    }

    public void setFTN_SVN_ID(BigDecimal FTN_SVN_ID) {
        this.FTN_SVN_ID = FTN_SVN_ID;
    }

    public BigDecimal getFTN_SVN_ID() {
        return FTN_SVN_ID;
    }

    public void setFTN_MKT_ID(BigDecimal FTN_MKT_ID) {
        this.FTN_MKT_ID = FTN_MKT_ID;
    }

    public BigDecimal getFTN_MKT_ID() {
        return FTN_MKT_ID;
    }

    public void setHDQTRS(BigDecimal HDQTRS) {
        this.HDQTRS = HDQTRS;
    }

    public BigDecimal getHDQTRS() {
        return HDQTRS;
    }

    public void setEXP_DEPT(String EXP_DEPT) {
        this.EXP_DEPT = EXP_DEPT;
    }

    public String getEXP_DEPT() {
        return EXP_DEPT;
    }

    public void setCONCESS_NO(String CONCESS_NO) {
        this.CONCESS_NO = CONCESS_NO;
    }

    public String getCONCESS_NO() {
        return CONCESS_NO;
    }

    public void setCHAIN(BigDecimal CHAIN) {
        this.CHAIN = CHAIN;
    }

    public BigDecimal getCHAIN() {
        return CHAIN;
    }

    public void setFTN_GEO_ID(BigDecimal FTN_GEO_ID) {
        this.FTN_GEO_ID = FTN_GEO_ID;
    }

    public BigDecimal getFTN_GEO_ID() {
        return FTN_GEO_ID;
    }

    public void setTYP_ACC(String TYP_ACC) {
        this.TYP_ACC = TYP_ACC;
    }

    public String getTYP_ACC() {
        return TYP_ACC;
    }

    public void setFTN_FRAN(String FTN_FRAN) {
        this.FTN_FRAN = FTN_FRAN;
    }

    public String getFTN_FRAN() {
        return FTN_FRAN;
    }

    public void setPH_AREA_CD(String PH_AREA_CD) {
        this.PH_AREA_CD = PH_AREA_CD;
    }

    public String getPH_AREA_CD() {
        return PH_AREA_CD;
    }

    public void setPH_LIN_NBR(String PH_LIN_NBR) {
        this.PH_LIN_NBR = PH_LIN_NBR;
    }

    public String getPH_LIN_NBR() {
        return PH_LIN_NBR;
    }

    public void setPH_XTN_NBR(String PH_XTN_NBR) {
        this.PH_XTN_NBR = PH_XTN_NBR;
    }

    public String getPH_XTN_NBR() {
        return PH_XTN_NBR;
    }

    public void setURCD(String URCD) {
        this.URCD = URCD;
    }

    public String getURCD() {
        return URCD;
    }

    public void setURRF(String URRF) {
        this.URRF = URRF;
    }

    public String getURRF() {
        return URRF;
    }

    public void setURAT(BigDecimal URAT) {
        this.URAT = URAT;
    }

    public BigDecimal getURAT() {
        return URAT;
    }

    public void setURDT(Calendar URDT) {
        this.URDT = URDT;
    }

    public Calendar getURDT() {
        return URDT;
    }

    public void setURAB(BigDecimal URAB) {
        this.URAB = URAB;
    }

    public BigDecimal getURAB() {
        return URAB;
    }


    public void setCUST_ACN(int i) {
    }
}
