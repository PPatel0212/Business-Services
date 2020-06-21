package be.e1.bssv.J564205.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalVOTSOSalesLines extends ValueObject implements Serializable {
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
    
    private int NoOfWhereFields;    
    
    private InternalVOSalesLineDetail[] TSOSalesLinesVO = null;                         

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

    public void setNoOfWhereFields(int NoOfWhereFields) {
        this.NoOfWhereFields = NoOfWhereFields;
    }

    public int getNoOfWhereFields() {
        return NoOfWhereFields;
    }

    public void setTSOSalesLinesVO(InternalVOSalesLineDetail[] TSOSalesLinesVO) {
        this.TSOSalesLinesVO = TSOSalesLinesVO;
    }

    public InternalVOSalesLineDetail[] getTSOSalesLinesVO() {
        return TSOSalesLinesVO;
    }
}
