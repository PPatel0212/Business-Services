package be.e1.bssv.J564207.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowSalesOrderHeader extends InternalGetSalesOrderHeaderWhereFields  {
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
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: UORG <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_UORG = null;
    /**
     * Item Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITM <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_ITM = null;
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
         * AircraftType_Desc
         * <p>
         * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
         * </p>
         * EnterpriseOne Key Field: false <br>
         * EnterpriseOne Alias: DL01 <br>
         * EnterpriseOne field length:  12 <br>
         */
        private String AircraftType_Desc = null;
    /**
          * Customer_desc
          * <p>
          * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
          * </p>
          * EnterpriseOne Key Field: false <br>
          * EnterpriseOne Alias: DL01 <br>
          * EnterpriseOne field length:  12 <br>
          */
         private String Customer_desc = null;
    /**
          * Model_Desc
          * <p>
          * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
          * </p>
          * EnterpriseOne Key Field: false <br>
          * EnterpriseOne Alias: DL01 <br>
          * EnterpriseOne field length:  12 <br>
          */
         private String Model_Desc = null;
    /**
          * Program_Name
          * <p>
          * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
          * </p>
          * EnterpriseOne Key Field: false <br>
          * EnterpriseOne Alias: DL01 <br>
          * EnterpriseOne field length:  12 <br>
          */
         private String Program_Name = null;



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
    private MathNumeric F4211_AN8 = null;

    /**
     * Aircraft Type Series
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56ACTS <br>
     * EnterpriseOne field length:  25 <br>
     * EnterpriseOne User Defined Code: 55/AT <br>
     */
    private String F564211_Z56ACTS = null;

    /**
     * Tail Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56TAIL <br>
     * EnterpriseOne field length:  8 <br>
     */
    private String F564201_Z56TAIL = null;

    /**
     * Date - MPS Due
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56MDRQJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F564201_Z56MDRQJ = null;

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
     * Ship Set Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56SSN <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne User Defined Code: 55/JS <br>
     */
    private String F564201_Z56SSN = null;

    /**
     * Aircraft Type Series
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: Z56ACTS <br>
     * EnterpriseOne field length:  25 <br>
     * EnterpriseOne User Defined Code: 55/AT <br>
     */
    private String F564201_Z56ACTS = null;
    
    /**
     * Unit of Measure as Input
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UOM <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String F4211_UOM = null;
    
    /**
     * Company
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String F4211_KCOO = null;
    /**
     * So Refrence
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String soReference = null;
    private String F564201_Z56OPC = null;
    private MathNumeric F4211_SHAN = null;
    private String operatorDesc = null;
    
  private MathNumeric F4211_LNID = null;

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

    public void setF4211_MCU(String F4211_MCU) {
        this.F4211_MCU = F4211_MCU;
    }

    public String getF4211_MCU() {
        return F4211_MCU;
    }

    public void setF4211_PMPN(String F4211_PMPN) {
        this.F4211_PMPN = F4211_PMPN;
    }

    public String getF4211_PMPN() {
        return F4211_PMPN;
    }

    public void setF4211_AN8(MathNumeric F4211_AN8) {
        this.F4211_AN8 = F4211_AN8;
    }

    public MathNumeric getF4211_AN8() {
        return F4211_AN8;
    }

    public void setF564211_Z56ACTS(String F564211_Z56ACTS) {
        this.F564211_Z56ACTS = F564211_Z56ACTS;
    }

    public String getF564211_Z56ACTS() {
        return F564211_Z56ACTS;
    }

    

    public void setF564201_Z56MDRQJ(Date F564201_Z56MDRQJ) {
        this.F564201_Z56MDRQJ = F564201_Z56MDRQJ;
    }

    public Date getF564201_Z56MDRQJ() {
        return F564201_Z56MDRQJ;
    }

    public void setF4211_SRP3(String F4211_SRP3) {
        this.F4211_SRP3 = F4211_SRP3;
    }

    public String getF4211_SRP3() {
        return F4211_SRP3;
    }

    public void setF564201_Z56SSN(String F564201_Z56SSN) {
        this.F564201_Z56SSN = F564201_Z56SSN;
    }

    public String getF564201_Z56SSN() {
        return F564201_Z56SSN;
    }

    public void setF564201_Z56ACTS(String F564201_Z56ACTS) {
        this.F564201_Z56ACTS = F564201_Z56ACTS;
    }

    public String getF564201_Z56ACTS() {
        return F564201_Z56ACTS;
    }

    public void setF4211_UORG(MathNumeric F4211_UORG) {
        this.F4211_UORG = F4211_UORG;
    }

    public MathNumeric getF4211_UORG() {
        return F4211_UORG;
    }

    public void setAircraftType_Desc(String AircraftType_Desc) {
        this.AircraftType_Desc = AircraftType_Desc;
    }

    public String getAircraftType_Desc() {
        return AircraftType_Desc;
    }

    public void setCustomer_desc(String Customer_desc) {
        this.Customer_desc = Customer_desc;
    }

    public String getCustomer_desc() {
        return Customer_desc;
    }

    public void setModel_Desc(String Model_Desc) {
        this.Model_Desc = Model_Desc;
    }

    public String getModel_Desc() {
        return Model_Desc;
    }

    public void setProgram_Name(String Program_Name) {
        this.Program_Name = Program_Name;
    }

    public String getProgram_Name() {
        return Program_Name;
    }

    public void setF4211_ITM(MathNumeric F4211_ITM) {
        this.F4211_ITM = F4211_ITM;
    }

    public MathNumeric getF4211_ITM() {
        return F4211_ITM;
    }

    public void setF4211_UOM(String F4211_UOM) {
        this.F4211_UOM = F4211_UOM;
    }

    public String getF4211_UOM() {
        return F4211_UOM;
    }

    public void setF4211_KCOO(String F4211_KCOO) {
        this.F4211_KCOO = F4211_KCOO;
    }

    public String getF4211_KCOO() {
        return F4211_KCOO;
    }

    public void setSoReference(String soReference) {
        this.soReference = soReference;
    }

    public String getSoReference() {
        return soReference;
    }

  public void setF564201_Z56TAIL(String F564201_Z56TAIL) {
    this.F564201_Z56TAIL = F564201_Z56TAIL;
  }

  public String getF564201_Z56TAIL() {
    return F564201_Z56TAIL;
  }

  public void setF4211_LNID(MathNumeric F4211_LNID) {
    this.F4211_LNID = F4211_LNID;
  }

  public MathNumeric getF4211_LNID() {
    return F4211_LNID;
  }

  public void setF564201_Z56OPC(String F564201_Z56OPC) {
    this.F564201_Z56OPC = F564201_Z56OPC;
  }

  public String getF564201_Z56OPC() {
    return F564201_Z56OPC;
  }

  public void setF4211_SHAN(MathNumeric F4211_SHAN) {
    this.F4211_SHAN = F4211_SHAN;
  }

  public MathNumeric getF4211_SHAN() {
    return F4211_SHAN;
  }

  public void setOperatorDesc(String operatorDesc) {
    this.operatorDesc = operatorDesc;
  }

  public String getOperatorDesc() {
    return operatorDesc;
  }
}
