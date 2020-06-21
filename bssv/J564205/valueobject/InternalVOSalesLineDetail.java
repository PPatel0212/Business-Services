package be.e1.bssv.J564205.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalVOSalesLineDetail extends ValueObject implements Serializable {
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
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private MathNumeric F4211_LNID = null;

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
     * Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VR01 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F4201_VR01 = null;

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
    private MathNumeric F4211_ITM = null;

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
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F4211_DSC1 = null;

    /**
     * Line Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNTY <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne Default value: S <br>
     */
    private String F4211_LNTY = null;

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
     * Ship Set Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56SSN <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne User Defined Code: 55/JS <br>
     */
    private String F564211_Z56SSN = null;

    /**
     * Item Revision Level
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MERL <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String F4211_MERL = null;

    /**
     * New / Retro Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56RET <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String F564201_Z56RET = null;

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
     * Unit of Measure as Input
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UOM <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String F4211_UOM = null;

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
    private MathNumeric F4211_UORG = null;
    
    private InternalVOWorkOrderDetail[] RelatedWODetail = null;    
    
    private MathNumeric F4211_DOCO_WhereField = null;
    
    private String F4211_DCTO_WhereField = null;
    
    private String F4211_MCU_WhereField = null;
    
    private MathNumeric F4211_LNID_WhereField = null;   
    
    private String F4211_SRP3_Desc = null;   
    
    private MathNumeric PaxCount = null;        
    
    private MathNumeric F564803_Z56SCAP = null;                                     
    
    private int SizeOfWhereFieldsArray;
    
    private ArrayList<InternalVOSalesLineDetail> QueryResults = null;               

    public void setF4211_DOCO(MathNumeric F4211_DOCO) {
        this.F4211_DOCO = F4211_DOCO;
    }

    public MathNumeric getF4211_DOCO() {
        return F4211_DOCO;
    }

    public void setF4211_LNID(MathNumeric F4211_LNID) {
        this.F4211_LNID = F4211_LNID;
    }

    public MathNumeric getF4211_LNID() {
        return F4211_LNID;
    }

    public void setF4211_MCU(String F4211_MCU) {
        this.F4211_MCU = F4211_MCU;
    }

    public String getF4211_MCU() {
        return F4211_MCU;
    }

    public void setF4201_VR01(String F4201_VR01) {
        this.F4201_VR01 = F4201_VR01;
    }

    public String getF4201_VR01() {
        return F4201_VR01;
    }

    public void setF4211_ITM(MathNumeric F4211_ITM) {
        this.F4211_ITM = F4211_ITM;
    }

    public MathNumeric getF4211_ITM() {
        return F4211_ITM;
    }

    public void setF4211_LITM(String F4211_LITM) {
        this.F4211_LITM = F4211_LITM;
    }

    public String getF4211_LITM() {
        return F4211_LITM;
    }

    public void setF4211_DSC1(String F4211_DSC1) {
        this.F4211_DSC1 = F4211_DSC1;
    }

    public String getF4211_DSC1() {
        return F4211_DSC1;
    }

    public void setF4211_LNTY(String F4211_LNTY) {
        this.F4211_LNTY = F4211_LNTY;
    }

    public String getF4211_LNTY() {
        return F4211_LNTY;
    }

    public void setF4211_PMPN(String F4211_PMPN) {
        this.F4211_PMPN = F4211_PMPN;
    }

    public String getF4211_PMPN() {
        return F4211_PMPN;
    }

    public void setF564211_Z56SSN(String F564211_Z56SSN) {
        this.F564211_Z56SSN = F564211_Z56SSN;
    }

    public String getF564211_Z56SSN() {
        return F564211_Z56SSN;
    }

    public void setF4211_MERL(String F4211_MERL) {
        this.F4211_MERL = F4211_MERL;
    }

    public String getF4211_MERL() {
        return F4211_MERL;
    }

    public void setF564201_Z56RET(String F564201_Z56RET) {
        this.F564201_Z56RET = F564201_Z56RET;
    }

    public String getF564201_Z56RET() {
        return F564201_Z56RET;
    }

    public void setF4211_SRP3(String F4211_SRP3) {
        this.F4211_SRP3 = F4211_SRP3;
    }

    public String getF4211_SRP3() {
        return F4211_SRP3;
    }

    public void setF4211_UOM(String F4211_UOM) {
        this.F4211_UOM = F4211_UOM;
    }

    public String getF4211_UOM() {
        return F4211_UOM;
    }

    public void setF4211_UORG(MathNumeric F4211_UORG) {
        this.F4211_UORG = F4211_UORG;
    }

    public MathNumeric getF4211_UORG() {
        return F4211_UORG;
    }

    public void setRelatedWODetail(InternalVOWorkOrderDetail[] RelatedWODetail) {
        this.RelatedWODetail = RelatedWODetail;
    }

    public InternalVOWorkOrderDetail[] getRelatedWODetail() {
        return RelatedWODetail;
    }

    public void setF4211_DOCO_WhereField(MathNumeric F4211_DOCO_WhereField) {
        this.F4211_DOCO_WhereField = F4211_DOCO_WhereField;
    }

    public MathNumeric getF4211_DOCO_WhereField() {
        return F4211_DOCO_WhereField;
    }

    public void setF4211_DCTO_WhereField(String F4211_DCTO_WhereField) {
        this.F4211_DCTO_WhereField = F4211_DCTO_WhereField;
    }

    public String getF4211_DCTO_WhereField() {
        return F4211_DCTO_WhereField;
    }

    public void setF4211_MCU_WhereField(String F4211_MCU_WhereField) {
        this.F4211_MCU_WhereField = F4211_MCU_WhereField;
    }

    public String getF4211_MCU_WhereField() {
        return F4211_MCU_WhereField;
    }

    public void setF4211_LNID_WhereField(MathNumeric F4211_LNID_WhereField) {
        this.F4211_LNID_WhereField = F4211_LNID_WhereField;
    }

    public MathNumeric getF4211_LNID_WhereField() {
        return F4211_LNID_WhereField;
    }

    public void setSizeOfWhereFieldsArray(int SizeOfWhereFieldsArray) {
        this.SizeOfWhereFieldsArray = SizeOfWhereFieldsArray;
    }

    public int getSizeOfWhereFieldsArray() {
        return SizeOfWhereFieldsArray;
    }

    public void setQueryResults(ArrayList<InternalVOSalesLineDetail> QueryResults) {
        this.QueryResults = QueryResults;
    }

    public ArrayList<InternalVOSalesLineDetail> getQueryResults() {
        return QueryResults;
    }

    public void setF4211_SRP3_Desc(String F4211_SRP3_Desc) {
        this.F4211_SRP3_Desc = F4211_SRP3_Desc;
    }

    public String getF4211_SRP3_Desc() {
        return F4211_SRP3_Desc;
    }

    public void setPaxCount(MathNumeric PaxCount) {
        this.PaxCount = PaxCount;
    }

    public MathNumeric getPaxCount() {
        return PaxCount;
    }

    public void setF564803_Z56SCAP(MathNumeric F564803_Z56SCAP) {
        this.F564803_Z56SCAP = F564803_Z56SCAP;
    }

    public MathNumeric getF564803_Z56SCAP() {
        return F564803_Z56SCAP;
    }
}
