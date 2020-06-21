package be.e1.bssv.J564205.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalVOWorkOrderDetail extends ValueObject implements Serializable {
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
    private MathNumeric F4801T_DOCO = null;                             

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
     * Document Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCT <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String F4801T_DCT = null;

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
    private String F4801_DCTO = null;

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
    private MathNumeric F4801_ITM = null;

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
    private MathNumeric F4220_ITM = null;

    /**
     * Serial Number 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRL1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F4220_SRL1 = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F4220_LITM = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F4801_LITM = null;

    /**
     * Serial Number 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRL2 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F4220_SRL2 = null;

    /**
     * Production Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PMPN <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F4801T_PMPN = null;

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
    private MathNumeric F4220_DOCO = null;

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
    private String F4220_DCTO = null;
    
    private String F4211_LITM_WhereField = null;                                    
    
    private String F4211_PMPN_WhereField = null;
    
    private ArrayList<InternalVOWorkOrderDetail> QueryResults = null;                               

    public void setF4801T_DOCO(MathNumeric F4801T_DOCO) {
        this.F4801T_DOCO = F4801T_DOCO;
    }

    public MathNumeric getF4801T_DOCO() {
        return F4801T_DOCO;
    }

    public void setF4801_DOCO(MathNumeric F4801_DOCO) {
        this.F4801_DOCO = F4801_DOCO;
    }

    public MathNumeric getF4801_DOCO() {
        return F4801_DOCO;
    }

    public void setF4801T_DCT(String F4801T_DCT) {
        this.F4801T_DCT = F4801T_DCT;
    }

    public String getF4801T_DCT() {
        return F4801T_DCT;
    }

    public void setF4801_DCTO(String F4801_DCTO) {
        this.F4801_DCTO = F4801_DCTO;
    }

    public String getF4801_DCTO() {
        return F4801_DCTO;
    }

    public void setF4801_ITM(MathNumeric F4801_ITM) {
        this.F4801_ITM = F4801_ITM;
    }

    public MathNumeric getF4801_ITM() {
        return F4801_ITM;
    }

    public void setF4220_ITM(MathNumeric F4220_ITM) {
        this.F4220_ITM = F4220_ITM;
    }

    public MathNumeric getF4220_ITM() {
        return F4220_ITM;
    }

    public void setF4220_SRL1(String F4220_SRL1) {
        this.F4220_SRL1 = F4220_SRL1;
    }

    public String getF4220_SRL1() {
        return F4220_SRL1;
    }

    public void setF4220_LITM(String F4220_LITM) {
        this.F4220_LITM = F4220_LITM;
    }

    public String getF4220_LITM() {
        return F4220_LITM;
    }

    public void setF4801_LITM(String F4801_LITM) {
        this.F4801_LITM = F4801_LITM;
    }

    public String getF4801_LITM() {
        return F4801_LITM;
    }

    public void setF4220_SRL2(String F4220_SRL2) {
        this.F4220_SRL2 = F4220_SRL2;
    }

    public String getF4220_SRL2() {
        return F4220_SRL2;
    }

    public void setF4801T_PMPN(String F4801T_PMPN) {
        this.F4801T_PMPN = F4801T_PMPN;
    }

    public String getF4801T_PMPN() {
        return F4801T_PMPN;
    }

    public void setF4220_DOCO(MathNumeric F4220_DOCO) {
        this.F4220_DOCO = F4220_DOCO;
    }

    public MathNumeric getF4220_DOCO() {
        return F4220_DOCO;
    }

    public void setF4220_DCTO(String F4220_DCTO) {
        this.F4220_DCTO = F4220_DCTO;
    }

    public String getF4220_DCTO() {
        return F4220_DCTO;
    }

    public void setF4211_LITM_WhereField(String F4211_LITM_WhereField) {
        this.F4211_LITM_WhereField = F4211_LITM_WhereField;
    }

    public String getF4211_LITM_WhereField() {
        return F4211_LITM_WhereField;
    }

    public void setF4211_PMPN_WhereField(String F4211_PMPN_WhereField) {
        this.F4211_PMPN_WhereField = F4211_PMPN_WhereField;
    }

    public String getF4211_PMPN_WhereField() {
        return F4211_PMPN_WhereField;
    }

    public void setQueryResults(ArrayList<InternalVOWorkOrderDetail> QueryResults) {
        this.QueryResults = QueryResults;
    }

    public ArrayList<InternalVOWorkOrderDetail> getQueryResults() {
        return QueryResults;
    }
}
