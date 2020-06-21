package be.e1.bssv.util.J560000.valueobject;

import be.e1.bssv.util.JP560000.valueobject.F4211DataReplyA;
import be.e1.bssv.util.JP560000.valueobject.F4211DataRequestA;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SupDataF4211A_D564211B extends ValueObject implements Serializable
{
    private String szOrderCompany_KCOO = null;
    private MathNumeric mnOrderNumber_DOCO = null;
    private String szOrderType_DCTO = null;
    private MathNumeric mnLineNumber_LNID = null;
    private String szProductionNumber_PMPN = null;
    private String szOperatorCode_Z56OPC = null;
    private String szAircraftType_Z56ACTS = null;
    private String szItemRevisionLevel_MERL = null;
    private String szModel_RP27 = null;
    private String szModelName_DL01 = null;
    private MathNumeric mnPassengerCount_SQOR = null;
    private Date jdBuildDate_STRT = null;
    private String szProductionLine_URRF = null;
    private String szProgramName_Z56MPGM = null;
    private String szShipSetNumber_Z56SSN = null;
    private String szTestSeatFLag_Z56SSN = null;
    private MathNumeric mnFinalDestinationAB_FTAN = null;
    private String szFinalDestName_ALPH = null;
    private String szFinalDestAddressLine1_ADD1 = null;
    private String szFinalDestAddressLine2_ADD2 = null;
    private String szFinalDestAddressLine3_ADD3 = null;
    private String szFinalDestAddressLine4_ADD4 = null;
    private String szFinalDestCity_CTY1 = null;
    private String szFinalDestState_ADDS = null;
    private String szFinalDestCountry_CTR = null;
    private String szFinalDestZipCode_ADDZ = null;
    private String szRecurringJobNumber_EMCU = null;
    private String szNonRecurringJobNumber_EMCU = null;
    private String szParentJobNumber_Z56PGM = null;
    private String szRFQNumber_VR02 = null;
    private String szIncoterms_Z56INC = null;
    private String szFreightDescription_DL01 = null;
    private Date jdInvoiceDate_IVD = null;
    private String szTranckingNum_CNID = null;
    private String cStockingType_STKT = null;
    private MathNumeric mnPlannerNumber_ANPL = null;
    private String szPlannerName_ALPH = null;
    private MathNumeric mnBuyer_BUYR = null;
    private String szBuyerName_ALPH = null;
    private String szSalesReportingCode5_SRP5 = null;
    private String szOperatorCodeDescription_DL01 = null;
    private String szProgramNumberDesc_DL01 = null;
    private String cFAIShipsetFlag_EV01 = null;
    private String szProgramManagerName_ALPH = null;
    private String szOEMName_DL02 = null;
    private String szRevControlBaseItem_RCITMB = null;  
    private String szAircraftTypeName_DL01 = null;
    private String szDetailCustomerPO_VR01 = null;
    private String szCarrierName_ALPH = null;
    private String szSpecialInstructions_COMMENT = null;
    private String szSecondaryPONumber_Z56SPO = null;
    private String szTailNumber_Z56TAIL = null;
    private MathNumeric mnInvoiceNumber_DOC = null;
    private String szSoldToName_ALPH = null;
    private String szSoldToAddress1_ADD1 = null;
    private String szSoldToAddress2_ADD2 = null;
    private String szSoldToAddress3_ADD3 = null;
    private String szSoldToAddress4_ADD4 = null;
    private String szSoldToCity_CTY1 = null;
    private String szSoldToState_ADDS = null;
    private String szSoldToZip_ADDZ = null;
    private String szSoldToCountry_CTR = null;
    private String cPriorityCode_PRIO = null;
    private String szManufacturerSerialNum = null;
    
    /* Define accessor functions */
    public SupDataF4211A_D564211B(F4211DataRequestA inData)
    {
        if(inData != null)
        {
            this.mnOrderNumber_DOCO = new MathNumeric(inData.getOrderNumber());
            this.szOrderCompany_KCOO = inData.getOrderCompany();
            this.szOrderType_DCTO = inData.getOrderType();
            this.mnLineNumber_LNID = new MathNumeric(inData.getOrderLine());
        }
    }

    public void copyToF4211DataReplyA(F4211DataReplyA outData)
    {
        if(outData != null)
        {
            outData.setAircraftTypeSeries(this.szAircraftType_Z56ACTS);
            outData.setBuyerName(this.szBuyerName_ALPH);
            outData.setFaiShipsetFlag(this.cFAIShipsetFlag_EV01);
            outData.setFinalDestinationAddressLine1(this.szFinalDestAddressLine1_ADD1);
            outData.setFinalDestinationAddressLine2(this.szFinalDestAddressLine2_ADD2);
            outData.setFinalDestinationAddressLine3(this.szFinalDestAddressLine3_ADD3);
            outData.setFinalDestinationAddressLine4(this.szFinalDestAddressLine4_ADD4);
            outData.setFinalDestinationCity(this.szFinalDestCity_CTY1);
            outData.setFinalDestinationCountry(this.szFinalDestCountry_CTR);
            outData.setFinalDestinationName(this.szFinalDestName_ALPH);
            outData.setFinalDestinationState(this.szFinalDestState_ADDS);
            outData.setFinalDestinationZip(this.szFinalDestZipCode_ADDZ);
            outData.setFreightDescription(this.szFreightDescription_DL01);
            outData.setIncoTerms(this.szIncoterms_Z56INC);
            outData.setItemRevisionLevel(this.szItemRevisionLevel_MERL);
            outData.setModel(this.szModel_RP27);
            outData.setModelName(this.szModelName_DL01);
            outData.setNonRecurringJobNumber(this.szNonRecurringJobNumber_EMCU);
            outData.setOemName(this.szOEMName_DL02);
            outData.setOperatorCode(this.szOperatorCode_Z56OPC);
            outData.setOperatorCodeDescription(this.szOperatorCodeDescription_DL01);
            outData.setOrderCompany(this.szOrderCompany_KCOO);
            outData.setOrderType(this.szOrderType_DCTO);
            outData.setParentJobNumber(this.szParentJobNumber_Z56PGM);
            outData.setPlannerName(this.szPlannerName_ALPH);
            outData.setProductionLine(this.szProductionLine_URRF);
            outData.setProductionNumber(this.szProductionNumber_PMPN);
            outData.setProgramManagerName(this.szProgramManagerName_ALPH);
            outData.setProgramName(this.szProgramName_Z56MPGM);
            outData.setProgramNumberDescription(this.szProgramNumberDesc_DL01);
            outData.setRecurringJobNumber(this.szRecurringJobNumber_EMCU);
            outData.setRevControlBaseItem(this.szRevControlBaseItem_RCITMB);
            outData.setRfqNumber(this.szRFQNumber_VR02);
            outData.setSalesReportingCode(this.szSalesReportingCode5_SRP5);
            outData.setShipSetNumber(this.szShipSetNumber_Z56SSN);
            outData.setStockingType(this.cStockingType_STKT);
            outData.setTestSeatFlag(this.szTestSeatFLag_Z56SSN);
            outData.setTrackingNumber(this.szTranckingNum_CNID);
            outData.setAircraftTypeName(this.szAircraftTypeName_DL01);
            outData.setDetailCustomerPO(this.szDetailCustomerPO_VR01);
            outData.setCarrierName(this.szCarrierName_ALPH);
            outData.setSpecialInstructions(this.szSpecialInstructions_COMMENT);
            outData.setSecondaryPONumber(this.szSecondaryPONumber_Z56SPO);
            outData.setTailNumber(this.szTailNumber_Z56TAIL);
            outData.setSoldToName(this.szSoldToName_ALPH);
            outData.setSoldToAddress1(this.szSoldToAddress1_ADD1);
            outData.setSoldToAddress2(this.szSoldToAddress2_ADD2);
            outData.setSoldToAddress3(this.szSoldToAddress3_ADD3);
            outData.setSoldToAddress4(this.szSoldToAddress4_ADD4);
            outData.setSoldToCity(this.szSoldToCity_CTY1);
            outData.setSoldToState(this.szSoldToState_ADDS);
            outData.setSoldToZip(this.szSoldToZip_ADDZ);
            outData.setSoldToCountry(this.szSoldToCountry_CTR);
            outData.setPriorityCode(this.cPriorityCode_PRIO);
            outData.setManufacturerSerialNumber(this.szManufacturerSerialNum);
            
            //invoice number
            if(this.mnInvoiceNumber_DOC != null) 
            {
                outData.setInvoiceNumber(this.mnInvoiceNumber_DOC.intValue());    
            }
            
            //planner number
            if(this.mnPlannerNumber_ANPL != null)
            {
                outData.setPlannerNumber(this.mnPlannerNumber_ANPL.intValue());
            }
                       
            //passenger count
            if(this.mnPassengerCount_SQOR != null)
            {
                outData.setPassengerCount(this.mnPassengerCount_SQOR.asBigDecimal());
            }
            
            //order number 
            if(this.mnOrderNumber_DOCO != null)
            {
                outData.setOrderNumber(this.mnOrderNumber_DOCO.intValue());
            }
            
            //order line
            if(this.mnLineNumber_LNID != null)
            {
                outData.setOrderLine(this.mnLineNumber_LNID.asBigDecimal());
            }
            
            //final destination number
            if(this.mnFinalDestinationAB_FTAN != null)
            {
                outData.setFinalDestination(this.mnFinalDestinationAB_FTAN.intValue());    
            }
            
            //buyer number
            if(this.mnBuyer_BUYR != null)
            {
                outData.setBuyerNumber(this.mnBuyer_BUYR.intValue());
            }
            
            //set the build date
            if(this.jdBuildDate_STRT != null)
            {
                Calendar tmpDate = Calendar.getInstance();
                tmpDate.setTime(this.jdBuildDate_STRT);
                outData.setBuildDate(tmpDate);
            }
            
            //set the invoice date
            if(this.jdInvoiceDate_IVD != null)
            {
                Calendar tmpDate = Calendar.getInstance();
                tmpDate.setTime(this.jdInvoiceDate_IVD);
                outData.setInvoiceDate(tmpDate);
            }
        }
    }

    public void setSzOrderType_DCTO(String szOrderType_DCTO)
    {
        this.szOrderType_DCTO = szOrderType_DCTO;
    }

    public String getSzOrderType_DCTO()
    {
        return szOrderType_DCTO;
    }

    public void setMnLineNumber_LNID(MathNumeric mnLineNumber_LNID)
    {
        this.mnLineNumber_LNID = mnLineNumber_LNID;
    }

    public MathNumeric getMnLineNumber_LNID()
    {
        return mnLineNumber_LNID;
    }

    public void setSzProductionNumber_PMPN(String szProductionNumber_PMPN)
    {
        this.szProductionNumber_PMPN = szProductionNumber_PMPN;
    }

    public String getSzProductionNumber_PMPN()
    {
        return szProductionNumber_PMPN;
    }

    public void setSzOperatorCode_Z56OPC(String szOperatorCode_Z56OPC)
    {
        this.szOperatorCode_Z56OPC = szOperatorCode_Z56OPC;
    }

    public String getSzOperatorCode_Z56OPC()
    {
        return szOperatorCode_Z56OPC;
    }

    public void setSzAircraftType_Z56ACTS(String szAircraftType_Z56ACTS)
    {
        this.szAircraftType_Z56ACTS = szAircraftType_Z56ACTS;
    }

    public String getSzAircraftType_Z56ACTS()
    {
        return szAircraftType_Z56ACTS;
    }

    public void setSzModel_RP27(String szModel_RP27)
    {
        this.szModel_RP27 = szModel_RP27;
    }

    public String getSzModel_RP27()
    {
        return szModel_RP27;
    }

    public void setSzModelName_DL01(String szModelName_DL01)
    {
        this.szModelName_DL01 = szModelName_DL01;
    }

    public String getSzModelName_DL01()
    {
        return szModelName_DL01;
    }

    public void setMnPassengerCount_SQOR(MathNumeric mnPassengerCount_SQOR)
    {
        this.mnPassengerCount_SQOR = mnPassengerCount_SQOR;
    }

    public MathNumeric getMnPassengerCount_SQOR()
    {
        return mnPassengerCount_SQOR;
    }

    public void setJdBuildDate_STRT(Date jdBuildDate_STRT)
    {
        this.jdBuildDate_STRT = jdBuildDate_STRT;
    }

    public Date getJdBuildDate_STRT()
    {
        return jdBuildDate_STRT;
    }

    public void setSzProductionLine_URRF(String szProductionLine_URRF)
    {
        this.szProductionLine_URRF = szProductionLine_URRF;
    }

    public String getSzProductionLine_URRF()
    {
        return szProductionLine_URRF;
    }

    public void setSzProgramName_Z56MPGM(String szProgramName_Z56MPGM)
    {
        this.szProgramName_Z56MPGM = szProgramName_Z56MPGM;
    }

    public String getSzProgramName_Z56MPGM()
    {
        return szProgramName_Z56MPGM;
    }

    public void setSzShipSetNumber_Z56SSN(String szShipSetNumber_Z56SSN)
    {
        this.szShipSetNumber_Z56SSN = szShipSetNumber_Z56SSN;
    }

    public String getSzShipSetNumber_Z56SSN()
    {
        return szShipSetNumber_Z56SSN;
    }

    public void setSzTestSeatFLag_Z56SSN(String szTestSeatFLag_Z56SSN)
    {
        this.szTestSeatFLag_Z56SSN = szTestSeatFLag_Z56SSN;
    }

    public String getSzTestSeatFLag_Z56SSN()
    {
        return szTestSeatFLag_Z56SSN;
    }

    public void setMnFinalDestinationAB_FTAN(MathNumeric mnFinalDestinationAB_FTAN)
    {
        this.mnFinalDestinationAB_FTAN = mnFinalDestinationAB_FTAN;
    }

    public MathNumeric getMnFinalDestinationAB_FTAN()
    {
        return mnFinalDestinationAB_FTAN;
    }

    public void setSzFinalDestName_ALPH(String szFinalDestName_ALPH)
    {
        this.szFinalDestName_ALPH = szFinalDestName_ALPH;
    }

    public String getSzFinalDestName_ALPH()
    {
        return szFinalDestName_ALPH;
    }

    public void setSzFinalDestAddressLine1_ADD1(String szFinalDestAddressLine1_ADD1)
    {
        this.szFinalDestAddressLine1_ADD1 = szFinalDestAddressLine1_ADD1;
    }

    public String getSzFinalDestAddressLine1_ADD1()
    {
        return szFinalDestAddressLine1_ADD1;
    }

    public void setSzFinalDestAddressLine2_ADD2(String szFinalDestAddressLine2_ADD2)
    {
        this.szFinalDestAddressLine2_ADD2 = szFinalDestAddressLine2_ADD2;
    }

    public String getSzFinalDestAddressLine2_ADD2()
    {
        return szFinalDestAddressLine2_ADD2;
    }

    public void setSzFinalDestAddressLine3_ADD3(String szFinalDestAddressLine3_ADD3)
    {
        this.szFinalDestAddressLine3_ADD3 = szFinalDestAddressLine3_ADD3;
    }

    public String getSzFinalDestAddressLine3_ADD3()
    {
        return szFinalDestAddressLine3_ADD3;
    }

    public void setSzFinalDestAddressLine4_ADD4(String szFinalDestAddressLine4_ADD4)
    {
        this.szFinalDestAddressLine4_ADD4 = szFinalDestAddressLine4_ADD4;
    }

    public String getSzFinalDestAddressLine4_ADD4()
    {
        return szFinalDestAddressLine4_ADD4;
    }

    public void setSzFinalDestCity_CTY1(String szFinalDestCity_CTY1)
    {
        this.szFinalDestCity_CTY1 = szFinalDestCity_CTY1;
    }

    public String getSzFinalDestCity_CTY1()
    {
        return szFinalDestCity_CTY1;
    }

    public void setSzFinalDestState_ADDS(String szFinalDestState_ADDS)
    {
        this.szFinalDestState_ADDS = szFinalDestState_ADDS;
    }

    public String getSzFinalDestState_ADDS()
    {
        return szFinalDestState_ADDS;
    }

    public void setSzFinalDestCountry_CTR(String szFinalDestCountry_CTR)
    {
        this.szFinalDestCountry_CTR = szFinalDestCountry_CTR;
    }

    public String getSzFinalDestCountry_CTR()
    {
        return szFinalDestCountry_CTR;
    }

    public void setSzFinalDestZipCode_ADDZ(String szFinalDestZipCode_ADDZ)
    {
        this.szFinalDestZipCode_ADDZ = szFinalDestZipCode_ADDZ;
    }

    public String getSzFinalDestZipCode_ADDZ()
    {
        return szFinalDestZipCode_ADDZ;
    }

    public void setSzRecurringJobNumber_EMCU(String szRecurringJobNumber_EMCU)
    {
        this.szRecurringJobNumber_EMCU = szRecurringJobNumber_EMCU;
    }

    public String getSzRecurringJobNumber_EMCU()
    {
        return szRecurringJobNumber_EMCU;
    }

    public void setSzNonRecurringJobNumber_EMCU(String szNonRecurringJobNumber_EMCU)
    {
        this.szNonRecurringJobNumber_EMCU = szNonRecurringJobNumber_EMCU;
    }

    public String getSzNonRecurringJobNumber_EMCU()
    {
        return szNonRecurringJobNumber_EMCU;
    }

    public void setSzParentJobNumber_Z56PGM(String szParentJobNumber_Z56PGM)
    {
        this.szParentJobNumber_Z56PGM = szParentJobNumber_Z56PGM;
    }

    public String getSzParentJobNumber_Z56PGM()
    {
        return szParentJobNumber_Z56PGM;
    }

    public void setSzRFQNumber_VR02(String szRFQNumber_VR02)
    {
        this.szRFQNumber_VR02 = szRFQNumber_VR02;
    }

    public String getSzRFQNumber_VR02()
    {
        return szRFQNumber_VR02;
    }

    public void setSzIncoterms_Z56INC(String szIncoterms_Z56INC)
    {
        this.szIncoterms_Z56INC = szIncoterms_Z56INC;
    }

    public String getSzIncoterms_Z56INC()
    {
        return szIncoterms_Z56INC;
    }

    public void setSzFreightDescription_DL01(String szFreightDescription_DL01)
    {
        this.szFreightDescription_DL01 = szFreightDescription_DL01;
    }

    public String getSzFreightDescription_DL01()
    {
        return szFreightDescription_DL01;
    }

    public void setJdInvoiceDate_IVD(Date jdInvoiceDate_IVD)
    {
        this.jdInvoiceDate_IVD = jdInvoiceDate_IVD;
    }

    public Date getJdInvoiceDate_IVD()
    {
        return jdInvoiceDate_IVD;
    }

    public void setSzTranckingNum_CNID(String szTranckingNum_CNID)
    {
        this.szTranckingNum_CNID = szTranckingNum_CNID;
    }

    public String getSzTranckingNum_CNID()
    {
        return szTranckingNum_CNID;
    }

    public void setCStockingType_STKT(String cStockingType_STKT)
    {
        this.cStockingType_STKT = cStockingType_STKT;
    }

    public String getCStockingType_STKT()
    {
        return cStockingType_STKT;
    }

    public void setSzPlannerName_ALPH(String szPlannerName_ALPH)
    {
        this.szPlannerName_ALPH = szPlannerName_ALPH;
    }

    public String getSzPlannerName_ALPH()
    {
        return szPlannerName_ALPH;
    }

    public void setMnBuyer_BUYR(MathNumeric mnBuyer_BUYR)
    {
        this.mnBuyer_BUYR = mnBuyer_BUYR;
    }

    public MathNumeric getMnBuyer_BUYR()
    {
        return mnBuyer_BUYR;
    }

    public void setSzBuyerName_ALPH(String szBuyerName_ALPH)
    {
        this.szBuyerName_ALPH = szBuyerName_ALPH;
    }

    public String getSzBuyerName_ALPH()
    {
        return szBuyerName_ALPH;
    }

    public void setSzSalesReportingCode5_SRP5(String szSalesReportingCode5_SRP5)
    {
        this.szSalesReportingCode5_SRP5 = szSalesReportingCode5_SRP5;
    }

    public String getSzSalesReportingCode5_SRP5()
    {
        return szSalesReportingCode5_SRP5;
    }

    public void setSzOperatorCodeDescription_DL01(String szOperatorCodeDescription_DL01)
    {
        this.szOperatorCodeDescription_DL01 = szOperatorCodeDescription_DL01;
    }

    public String getSzOperatorCodeDescription_DL01()
    {
        return szOperatorCodeDescription_DL01;
    }

    public void setSzProgramNumberDesc_DL01(String szProgramNumberDesc_DL01)
    {
        this.szProgramNumberDesc_DL01 = szProgramNumberDesc_DL01;
    }

    public String getSzProgramNumberDesc_DL01()
    {
        return szProgramNumberDesc_DL01;
    }

    public void setCFAIShipsetFlag_EV01(String cFAIShipsetFlag_EV01)
    {
        this.cFAIShipsetFlag_EV01 = cFAIShipsetFlag_EV01;
    }

    public String getCFAIShipsetFlag_EV01()
    {
        return cFAIShipsetFlag_EV01;
    }

    public void setSzProgramManagerName_ALPH(String szProgramManagerName_ALPH)
    {
        this.szProgramManagerName_ALPH = szProgramManagerName_ALPH;
    }

    public String getSzProgramManagerName_ALPH()
    {
        return szProgramManagerName_ALPH;
    }

    public void setSzOEMName_DL02(String szOEMName_DL02)
    {
        this.szOEMName_DL02 = szOEMName_DL02;
    }

    public String getSzOEMName_DL02()
    {
        return szOEMName_DL02;
    }

    public void setSzItemRevisionLevel_MERL(String szItemRevisionLevel_MERL)
    {
        this.szItemRevisionLevel_MERL = szItemRevisionLevel_MERL;
    }

    public String getSzItemRevisionLevel_MERL()
    {
        return szItemRevisionLevel_MERL;
    }

    public void setSzOrderCompany_KCOO(String szOrderCompany_KCOO)
    {
        this.szOrderCompany_KCOO = szOrderCompany_KCOO;
    }

    public String getSzOrderCompany_KCOO()
    {
        return szOrderCompany_KCOO;
    }

    public void setMnOrderNumber_DOCO(MathNumeric mnOrderNumber_DOCO)
    {
        this.mnOrderNumber_DOCO = mnOrderNumber_DOCO;
    }

    public MathNumeric getMnOrderNumber_DOCO()
    {
        return mnOrderNumber_DOCO;
    }

    public void setMnPlannerNumber_ANPL(MathNumeric mnPlannerNumber_ANPL)
    {
        this.mnPlannerNumber_ANPL = mnPlannerNumber_ANPL;
    }

    public MathNumeric getMnPlannerNumber_ANPL()
    {
        return mnPlannerNumber_ANPL;
    }

    public void setSzRevControlBaseItem_RCITMB(String szRevControlBaseItem_RCITMB)
    {
        this.szRevControlBaseItem_RCITMB = szRevControlBaseItem_RCITMB;
    }

    public String getSzRevControlBaseItem_RCITMB()
    {
        return szRevControlBaseItem_RCITMB;
    }

    public void setSzAircraftTypeName_DL01(String szAircraftTypeName_DL01)
    {
        this.szAircraftTypeName_DL01 = szAircraftTypeName_DL01;
    }

    public String getSzAircraftTypeName_DL01()
    {
        return szAircraftTypeName_DL01;
    }

    public void setSzDetailCustomerPO_VR01(String szDetailCustomerPO_VR01) {
        this.szDetailCustomerPO_VR01 = szDetailCustomerPO_VR01;
    }

    public String getSzDetailCustomerPO_VR01() {
        return szDetailCustomerPO_VR01;
    }

    public void setSzCarrierName_ALPH(String szCarrierName_ALPH) {
        this.szCarrierName_ALPH = szCarrierName_ALPH;
    }

    public String getSzCarrierName_ALPH() {
        return szCarrierName_ALPH;
    }

    public void setSzSpecialInstructions_COMMENT(String szSpecialInstructions_COMMENT) {
        this.szSpecialInstructions_COMMENT = szSpecialInstructions_COMMENT;
    }

    public String getSzSpecialInstructions_COMMENT() {
        return szSpecialInstructions_COMMENT;
    }

    public void setSzSecondaryPONumber_Z56SPO(String szSecondaryPONumber_Z56SPO) {
        this.szSecondaryPONumber_Z56SPO = szSecondaryPONumber_Z56SPO;
    }

    public String getSzSecondaryPONumber_Z56SPO() {
        return szSecondaryPONumber_Z56SPO;
    }

    public void setSzTailNumber_Z56TAIL(String szTailNumber_Z56TAIL) {
        this.szTailNumber_Z56TAIL = szTailNumber_Z56TAIL;
    }

    public String getSzTailNumber_Z56TAIL() {
        return szTailNumber_Z56TAIL;
    }

    public void setMnInvoiceNumber_DOC(MathNumeric mnInvoiceNumber_DOC) {
        this.mnInvoiceNumber_DOC = mnInvoiceNumber_DOC;
    }

    public MathNumeric getMnInvoiceNumber_DOC() {
        return mnInvoiceNumber_DOC;
    }

    public void setSzSoldToName_ALPH(String szSoldToName_ALPH) {
        this.szSoldToName_ALPH = szSoldToName_ALPH;
    }

    public String getSzSoldToName_ALPH() {
        return szSoldToName_ALPH;
    }

    public void setSzSoldToAddress1_ADD1(String szSoldToAddress1_ADD1) {
        this.szSoldToAddress1_ADD1 = szSoldToAddress1_ADD1;
    }

    public String getSzSoldToAddress1_ADD1() {
        return szSoldToAddress1_ADD1;
    }

    public void setSzSoldToAddress2_ADD2(String szSoldToAddress2_ADD2) {
        this.szSoldToAddress2_ADD2 = szSoldToAddress2_ADD2;
    }

    public String getSzSoldToAddress2_ADD2() {
        return szSoldToAddress2_ADD2;
    }

    public void setSzSoldToAddress3_ADD3(String szSoldToAddress3_ADD3) {
        this.szSoldToAddress3_ADD3 = szSoldToAddress3_ADD3;
    }

    public String getSzSoldToAddress3_ADD3() {
        return szSoldToAddress3_ADD3;
    }

    public void setSzSoldToAddress4_ADD4(String szSoldToAddress4_ADD4) {
        this.szSoldToAddress4_ADD4 = szSoldToAddress4_ADD4;
    }

    public String getSzSoldToAddress4_ADD4() {
        return szSoldToAddress4_ADD4;
    }

    public void setSzSoldToCity_CTY1(String szSoldToCity_CTY1) {
        this.szSoldToCity_CTY1 = szSoldToCity_CTY1;
    }

    public String getSzSoldToCity_CTY1() {
        return szSoldToCity_CTY1;
    }

    public void setSzSoldToState_ADDS(String szSoldToState_ADDS) {
        this.szSoldToState_ADDS = szSoldToState_ADDS;
    }

    public String getSzSoldToState_ADDS() {
        return szSoldToState_ADDS;
    }

    public void setSzSoldToZip_ADDZ(String szSoldToZip_ADDZ) {
        this.szSoldToZip_ADDZ = szSoldToZip_ADDZ;
    }

    public String getSzSoldToZip_ADDZ() {
        return szSoldToZip_ADDZ;
    }

    public void setSzSoldToCountry_CTR(String szSoldToCountry_CTR) {
        this.szSoldToCountry_CTR = szSoldToCountry_CTR;
    }

    public String getSzSoldToCountry_CTR() {
        return szSoldToCountry_CTR;
    }

    public void setCPriorityCode_PRIO(String cPriorityCode_PRIO) {
        this.cPriorityCode_PRIO = cPriorityCode_PRIO;
    }

    public String getCPriorityCode_PRIO() {
        return cPriorityCode_PRIO;
    }
  
    public void setSzManufacturerSerialNum(String szManufacturerSerialNum)
    {
      this.szManufacturerSerialNum = szManufacturerSerialNum;
    }
  
    public String getSzManufacturerSerialNum()
    {
      return szManufacturerSerialNum;
    }
}
