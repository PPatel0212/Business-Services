package be.e1.bssv.J564304.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetF43121WhereFields extends ValueObject implements Serializable {
    /**
     * Type - Match Record Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MATC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String F43121_MATC = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String F43121_KCOO = null;

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
    private MathNumeric F43121_DOCO = null;

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
    private String F43121_DCTO = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private MathNumeric F43121_LNID = null;

    public void setF43121_MATC(String F43121_MATC) {
        this.F43121_MATC = F43121_MATC;
    }

    public String getF43121_MATC() {
        return F43121_MATC;
    }

    public void setF43121_KCOO(String F43121_KCOO) {
        this.F43121_KCOO = F43121_KCOO;
    }

    public String getF43121_KCOO() {
        return F43121_KCOO;
    }

    public void setF43121_DOCO(MathNumeric F43121_DOCO) {
        this.F43121_DOCO = F43121_DOCO;
    }

    public MathNumeric getF43121_DOCO() {
        return F43121_DOCO;
    }

    public void setF43121_DCTO(String F43121_DCTO) {
        this.F43121_DCTO = F43121_DCTO;
    }

    public String getF43121_DCTO() {
        return F43121_DCTO;
    }

    public void setF43121_LNID(MathNumeric F43121_LNID) {
        this.F43121_LNID = F43121_LNID;
    }

    public MathNumeric getF43121_LNID() {
        return F43121_LNID;
    }
}
