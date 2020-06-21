package be.e1.bssv.JP564205.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowWorkOrderLine extends ValueObject implements Serializable {
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
    private Integer Work_Order_No = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String Work_Order_Type = null;

    /**
     * Serial Number 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRL1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String Serial_Number = null;

    /**
     * Production Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PMPN <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String Production_Number = null;                    

    /**
     * TODO: Default public constructor for instantiating: ShowWorkOrderLine
     */
    public ShowWorkOrderLine() {
    }

    public void setWork_Order_No(Integer Work_Order_No) {
        this.Work_Order_No = Work_Order_No;
    }

    public Integer getWork_Order_No() {
        return Work_Order_No;
    }

    public void setWork_Order_Type(String Work_Order_Type) {
        this.Work_Order_Type = Work_Order_Type;
    }

    public String getWork_Order_Type() {
        return Work_Order_Type;
    }

    public void setSerial_Number(String Serial_Number) {
        this.Serial_Number = Serial_Number;
    }

    public String getSerial_Number() {
        return Serial_Number;
    }

    public void setProduction_Number(String Production_Number) {
        this.Production_Number = Production_Number;
    }

    public String getProduction_Number() {
        return Production_Number;
    }
}
