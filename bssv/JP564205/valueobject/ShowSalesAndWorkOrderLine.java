package be.e1.bssv.JP564205.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowSalesAndWorkOrderLine extends ValueObject implements Serializable {
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
    private Integer So_No = null;                               

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
    private BigDecimal So_Line_No = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String BranchPlant = null;

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
    private Integer Short_Part_No = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String Part_No = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String Part_Dsc = null;

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
    private String So_Line_Typ = null;

    /**
     * Sales Catalog Section
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP1 <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String Model_Code = null;

    private String Model = null;
    /**
     * Ship Set Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56SSN <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String ShipSetNumber = null;

    /**
     * Item Revision Level
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MERL <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String Part_Revision = null;

    /**
     * Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VR01 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String Customer_PO_No = null;
    
    private BigDecimal Pax_Count = null;
    
    private String IsFirstManufacture =null;
    
    private BigDecimal Line_Qty = null;
    
    private ShowWorkOrderLine[] WorkOrderVO = null;                 

    /**
     * TODO: Default public constructor for instantiating: ShowSalesAndWorkOrderLine
     */
    public ShowSalesAndWorkOrderLine() {
    }

    public void setSo_No(Integer So_No) {
        this.So_No = So_No;
    }

    public Integer getSo_No() {
        return So_No;
    }

    public void setSo_Line_No(BigDecimal So_Line_No) {
        this.So_Line_No = So_Line_No;
    }

    public BigDecimal getSo_Line_No() {
        return So_Line_No;
    }

    public void setBranchPlant(String BranchPlant) {
        this.BranchPlant = BranchPlant;
    }

    public String getBranchPlant() {
        return BranchPlant;
    }

    public void setShort_Part_No(Integer Short_Part_No) {
        this.Short_Part_No = Short_Part_No;
    }

    public Integer getShort_Part_No() {
        return Short_Part_No;
    }

    public void setPart_No(String Part_No) {
        this.Part_No = Part_No;
    }

    public String getPart_No() {
        return Part_No;
    }

    public void setPart_Dsc(String Part_Dsc) {
        this.Part_Dsc = Part_Dsc;
    }

    public String getPart_Dsc() {
        return Part_Dsc;
    }

    public void setSo_Line_Typ(String So_Line_Typ) {
        this.So_Line_Typ = So_Line_Typ;
    }

    public String getSo_Line_Typ() {
        return So_Line_Typ;
    }

    public void setModel_Code(String Model_Code) {
        this.Model_Code = Model_Code;
    }

    public String getModel_Code() {
        return Model_Code;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void setShipSetNumber(String ShipSetNumber) {
        this.ShipSetNumber = ShipSetNumber;
    }

    public String getShipSetNumber() {
        return ShipSetNumber;
    }

    public void setPart_Revision(String Part_Revision) {
        this.Part_Revision = Part_Revision;
    }

    public String getPart_Revision() {
        return Part_Revision;
    }

    public void setCustomer_PO_No(String Customer_PO_No) {
        this.Customer_PO_No = Customer_PO_No;
    }

    public String getCustomer_PO_No() {
        return Customer_PO_No;
    }

    public void setPax_Count(BigDecimal Pax_Count) {
        this.Pax_Count = Pax_Count;
    }

    public BigDecimal getPax_Count() {
        return Pax_Count;
    }

    public void setIsFirstManufacture(String IsFirstManufacture) {
        this.IsFirstManufacture = IsFirstManufacture;
    }

    public String getIsFirstManufacture() {
        return IsFirstManufacture;
    }

    public void setLine_Qty(BigDecimal Line_Qty) {
        this.Line_Qty = Line_Qty;
    }

    public BigDecimal getLine_Qty() {
        return Line_Qty;
    }

    public void setWorkOrderVO(ShowWorkOrderLine[] WorkOrderVO) {
        this.WorkOrderVO = WorkOrderVO;
    }

    public ShowWorkOrderLine[] getWorkOrderVO() {
        return WorkOrderVO;
    }
}
