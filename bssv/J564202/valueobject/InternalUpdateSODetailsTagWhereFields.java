package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalUpdateSODetailsTagWhereFields extends ValueObject implements Serializable {
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
    private MathNumeric F564211_DOCO = null;

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
    private String F564211_DCTO = null;

    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String F564211_KCOO = null;

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
    private MathNumeric F564211_LNID = null;

    public void setF564211_DOCO(MathNumeric F564211_DOCO) {
        this.F564211_DOCO = F564211_DOCO;
    }

    public MathNumeric getF564211_DOCO() {
        return F564211_DOCO;
    }

    public void setF564211_DCTO(String F564211_DCTO) {
        this.F564211_DCTO = F564211_DCTO;
    }

    public String getF564211_DCTO() {
        return F564211_DCTO;
    }

    public void setF564211_KCOO(String F564211_KCOO) {
        this.F564211_KCOO = F564211_KCOO;
    }

    public String getF564211_KCOO() {
        return F564211_KCOO;
    }

    public void setF564211_LNID(MathNumeric F564211_LNID) {
        this.F564211_LNID = F564211_LNID;
    }

    public MathNumeric getF564211_LNID() {
        return F564211_LNID;
    }
}
