package be.e1.bssv.J563002.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalBOMParent extends ValueObject implements Serializable {
    /**
     * Job Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: JOBS <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 00/4 <br>
     */
    private MathNumeric mnJobNumber = null;

    /**
     * Computer ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTID <br>
     * EnterpriseOne field length:  15 <br>
     */
    private String szComputerID = null;
    /**
     * Type Bill of Material
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: TBM <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne Default value: M <br>
     * EnterpriseOne User Defined Code: 40/TB <br>
     */
    private String F3002_TBM = null;

    /**
     * Parent (short) Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KIT <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F3002_KIT = null;

    /**
     * Kit - 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KITL <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F3002_KITL = null;

    /**
     * Branch
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MMCU <br>
     * EnterpriseOne field length:  12 <br>
     * EnterpriseOne Edit Rule:SERVER <br>
     */
    private String F3002_MMCU = null;

    /**
     * Bill Revision Level
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BREV <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String F3002_BREV = null;
    
    /**
     * Stocking Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: STKT <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne User Defined Code: 41/I <br>
     */
    private String F4102_STKT = null;
    
    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cF3002BOMExists = null;
    
    /**
     * Units - Batch Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: BQTY <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric F3002_BQTY = null;
    
    /**
     * Type Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TP <br>
     * EnterpriseOne field length:  3 <br>
     */  
    private String F30UI004_TP = null;
    
    /**
     * J.D. EnterpriseOne Event Point 01
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EV01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String cEndOfFile = null;
    
    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String DTAI = null;
    
    /**
     * Alpha Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSCA <br>
     * EnterpriseOne field length:  40 <br>
     * EnterpriseOne Edit Rule:NE <br>
     */
    private String DSCA = null;
    
    /**
     * Transfer Status
     */
    private String status = null;
    
    /**
     * Transfer Status Message
     */
    private String statusMessage = null;
    
    /**
     * Arraylist for BOM Children
     */  
    private ArrayList internalBOMChild = null;

    public void setF3002_TBM(String F3002_TBM) {
        this.F3002_TBM = F3002_TBM;
    }

    public String getF3002_TBM() {
        return F3002_TBM;
    }

    public void setF3002_KIT(MathNumeric F3002_KIT) {
        this.F3002_KIT = F3002_KIT;
    }

    public MathNumeric getF3002_KIT() {
        return F3002_KIT;
    }

    public void setF3002_KITL(String F3002_KITL) {
        this.F3002_KITL = F3002_KITL;
    }

    public String getF3002_KITL() {
        return F3002_KITL;
    }

    public void setF3002_MMCU(String F3002_MMCU) {
        this.F3002_MMCU = F3002_MMCU;
    }

    public String getF3002_MMCU() {
        return F3002_MMCU;
    }

    public void setF3002_BREV(String F3002_BREV) {
        this.F3002_BREV = F3002_BREV;
    }

    public String getF3002_BREV() {
        return F3002_BREV;
    }

    public void setF30UI004_TP(String F30UI004_TP) {
        this.F30UI004_TP = F30UI004_TP;
    }

    public String getF30UI004_TP() {
        return F30UI004_TP;
    }

    public void setInternalBOMChild(ArrayList internalBOMChild) {
        this.internalBOMChild = internalBOMChild;
    }

    public ArrayList getInternalBOMChild() {
        return internalBOMChild;
    }
    
    public InternalBOMChild getInternalBOMChild(int i)
    {
      return (InternalBOMChild) internalBOMChild.get(i);    
    }

    public void setMnJobNumber(MathNumeric mnJobNumber) {
        this.mnJobNumber = mnJobNumber;
    }

    public MathNumeric getMnJobNumber() {
        return mnJobNumber;
    }

    public void setSzComputerID(String szComputerID) {
        this.szComputerID = szComputerID;
    }

    public String getSzComputerID() {
        return szComputerID;
    }

    public void setF4102_STKT(String F4102_STKT) {
        this.F4102_STKT = F4102_STKT;
    }

    public String getF4102_STKT() {
        return F4102_STKT;
    }

    public void setCF3002BOMExists(String cF3002BOMExists) {
        this.cF3002BOMExists = cF3002BOMExists;
    }

    public String getCF3002BOMExists() {
        return cF3002BOMExists;
    }

    public void setF3002_BQTY(MathNumeric F3002_BQTY) {
        this.F3002_BQTY = F3002_BQTY;
    }

    public MathNumeric getF3002_BQTY() {
        return F3002_BQTY;
    }

    public void setCEndOfFile(String cEndOfFile) {
        this.cEndOfFile = cEndOfFile;
    }

    public String getCEndOfFile() {
        return cEndOfFile;
    }

    public void setDTAI(String DTAI) {
        this.DTAI = DTAI;
    }

    public String getDTAI() {
        return DTAI;
    }

    public void setDSCA(String DSCA) {
        this.DSCA = DSCA;
    }

    public String getDSCA() {
        return DSCA;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
}
