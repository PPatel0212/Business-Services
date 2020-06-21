package be.e1.bssv.J563002.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalBOMChild extends ValueObject implements Serializable {
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
    private MathNumeric F3002_ITM = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F3002_LITM = null;
    
    /**
     * Quantity - Standard Required Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: QNTY <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     * EnterpriseOne Default value: 10000 <br>
     */
    private MathNumeric F3002_QNTY = null;

    /**
     * Unit of Measure
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UM <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String F3002_UM = null;

    /**
     * Fixed or Variable Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FORQ <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: V <br>
     * EnterpriseOne User Defined Code: H40/FO <br>
     */
    private String F3002_FORQ = null;

    /**
     * Sequence - Bubble Sequence
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BSEQ <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Default value: 00001 <br>
     */
    private MathNumeric F3002_BSEQ = null;

    /**
     * Percent - Percent of Scrap
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SCRP <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F3002_SCRP = null;

    /**
     * Leadtime Offset Days
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LOVD <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F3002_LOVD = null;

    public void setF3002_ITM(MathNumeric F3002_ITM) {
        this.F3002_ITM = F3002_ITM;
    }

    public MathNumeric getF3002_ITM() {
        return F3002_ITM;
    }

    public void setF3002_LITM(String F3002_LITM) {
        this.F3002_LITM = F3002_LITM;
    }

    public String getF3002_LITM() {
        return F3002_LITM;
    }

    public void setF3002_QNTY(MathNumeric F3002_QNTY) {
        this.F3002_QNTY = F3002_QNTY;
    }

    public void setF3002_QNTY(BigDecimal F3002_QNTY) {
        if (F3002_QNTY != null) {
            this.F3002_QNTY = new MathNumeric(F3002_QNTY);
        } else {
            this.F3002_QNTY = new MathNumeric(0);
        }
    }
    
    public MathNumeric getF3002_QNTY() {
        return F3002_QNTY;
    }

    public void setF3002_UM(String F3002_UM) {
        this.F3002_UM = F3002_UM;
    }

    public String getF3002_UM() {
        return F3002_UM;
    }

    public void setF3002_FORQ(String F3002_FORQ) {
        this.F3002_FORQ = F3002_FORQ;
    }

    public String getF3002_FORQ() {
        return F3002_FORQ;
    }

    public void setF3002_BSEQ(MathNumeric F3002_BSEQ) {
        this.F3002_BSEQ = F3002_BSEQ;
    }

    public void setF3002_BSEQ(Integer F3002_BSEQ) {
        if (F3002_BSEQ != null) {
            this.F3002_BSEQ = new MathNumeric(F3002_BSEQ);
        } else {
            this.F3002_BSEQ = new MathNumeric(0);
        }
    }
  
    public MathNumeric getF3002_BSEQ() {
        return F3002_BSEQ;
    }

    public void setF3002_SCRP(MathNumeric F3002_SCRP) {
        this.F3002_SCRP = F3002_SCRP;
    }

    public void setF3002_SCRP(BigDecimal F3002_SCRP) {
        if (F3002_SCRP != null) {
            this.F3002_SCRP = new MathNumeric(F3002_SCRP);
        } else {
            this.F3002_SCRP = new MathNumeric(0);
        }
    }

    public MathNumeric getF3002_SCRP() {
        return F3002_SCRP;
    }

    public void setF3002_LOVD(MathNumeric F3002_LOVD) {
        this.F3002_LOVD = F3002_LOVD;
    }

    public void setF3002_LOVD(Integer F3002_LOVD) {
        if (F3002_LOVD != null) {
            this.F3002_LOVD = new MathNumeric(F3002_LOVD);
        } else {
            this.F3002_LOVD = new MathNumeric(0);
        }
    }
    
    public MathNumeric getF3002_LOVD() {
        return F3002_LOVD;
    }
}
