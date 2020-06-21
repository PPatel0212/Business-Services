package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BrokerDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ClearanceBrokerageType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CommercialInvoice;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Commodity;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsClearanceDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsDeclarationStatementDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsOptionDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ExportDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightOnValueType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalDocumentContentType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Payment;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RecipientCustomsId;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RegulatoryControlType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomsClearanceDetail extends ValueObject implements Serializable
{
  private IntBrokerDetail[] brokers = null;
  private IntClearanceBrokerageType clearanceBrokerage = null;
  private IntCustomsOptionDetail customsOptions = null;
  private IntParty importerOfRecord = null;
  private IntRecipientCustomsId recipientCustomsId = null;
  private IntPayment dutiesPayment = null;
  private IntInternationalDocumentContentType documentContent = null;
  private IntMoney customsValue = null;
  private IntFreightOnValueType freightOnValue = null;
  private IntMoney insuranceCharges = null;
  private String partiesToTransactionAreRelated = null;
  private IntCommercialInvoice commercialInvoice = null;
  private IntCommodity[] commodities = null;
  private IntExportDetail exportDetail = null;
  private IntRegulatoryControlType[] regulatoryControls = null;
  private IntCustomsDeclarationStatementDetail declarationStatementDetail = null;

  public void setBrokers(IntBrokerDetail[] brokers)
  {
    this.brokers = brokers;
  }

  public IntBrokerDetail[] getBrokers()
  {
    return brokers;
  }

  public void setClearanceBrokerage(IntClearanceBrokerageType clearanceBrokerage)
  {
    this.clearanceBrokerage = clearanceBrokerage;
  }

  public IntClearanceBrokerageType getClearanceBrokerage()
  {
    return clearanceBrokerage;
  }

  public void setCustomsOptions(IntCustomsOptionDetail customsOptions)
  {
    this.customsOptions = customsOptions;
  }

  public IntCustomsOptionDetail getCustomsOptions()
  {
    return customsOptions;
  }

  public void setImporterOfRecord(IntParty importerOfRecord)
  {
    this.importerOfRecord = importerOfRecord;
  }

  public IntParty getImporterOfRecord()
  {
    return importerOfRecord;
  }

  public void setRecipientCustomsId(IntRecipientCustomsId recipientCustomsId)
  {
    this.recipientCustomsId = recipientCustomsId;
  }

  public IntRecipientCustomsId getRecipientCustomsId()
  {
    return recipientCustomsId;
  }

  public void setDutiesPayment(IntPayment dutiesPayment)
  {
    this.dutiesPayment = dutiesPayment;
  }

  public IntPayment getDutiesPayment()
  {
    return dutiesPayment;
  }

  public void setDocumentContent(IntInternationalDocumentContentType documentContent)
  {
    this.documentContent = documentContent;
  }

  public IntInternationalDocumentContentType getDocumentContent()
  {
    return documentContent;
  }

  public void setCustomsValue(IntMoney customsValue)
  {
    this.customsValue = customsValue;
  }

  public IntMoney getCustomsValue()
  {
    return customsValue;
  }

  public void setFreightOnValue(IntFreightOnValueType freightOnValue)
  {
    this.freightOnValue = freightOnValue;
  }

  public IntFreightOnValueType getFreightOnValue()
  {
    return freightOnValue;
  }

  public void setInsuranceCharges(IntMoney insuranceCharges)
  {
    this.insuranceCharges = insuranceCharges;
  }

  public IntMoney getInsuranceCharges()
  {
    return insuranceCharges;
  }

  public void setPartiesToTransactionAreRelated(String partiesToTransactionAreRelated)
  {
    this.partiesToTransactionAreRelated = partiesToTransactionAreRelated;
  }

  public String getPartiesToTransactionAreRelated()
  {
    return partiesToTransactionAreRelated;
  }

  public void setCommercialInvoice(IntCommercialInvoice commercialInvoice)
  {
    this.commercialInvoice = commercialInvoice;
  }

  public IntCommercialInvoice getCommercialInvoice()
  {
    return commercialInvoice;
  }

  public void setCommodities(IntCommodity[] commodities)
  {
    this.commodities = commodities;
  }

  public IntCommodity[] getCommodities()
  {
    return commodities;
  }

  public void setExportDetail(IntExportDetail exportDetail)
  {
    this.exportDetail = exportDetail;
  }

  public IntExportDetail getExportDetail()
  {
    return exportDetail;
  }

  public void setRegulatoryControls(IntRegulatoryControlType[] regulatoryControls)
  {
    this.regulatoryControls = regulatoryControls;
  }

  public IntRegulatoryControlType[] getRegulatoryControls()
  {
    return regulatoryControls;
  }

  public void setDeclarationStatementDetail(IntCustomsDeclarationStatementDetail declarationStatementDetail)
  {
    this.declarationStatementDetail = declarationStatementDetail;
  }

  public IntCustomsDeclarationStatementDetail getDeclarationStatementDetail()
  {
    return declarationStatementDetail;
  }
  
  public void copyToCustomsClearanceDetail(CustomsClearanceDetail outData)
  {
    if(outData != null)
    {
      if(this.brokers != null)
      {
        BrokerDetail[] bdArr = new BrokerDetail[this.brokers.length];
        for(int x=0; x<this.brokers.length; x++)
        {
          bdArr[x] = new BrokerDetail();
          this.brokers[x].copyToBrokerDetail(bdArr[x]);
        }
        outData.setBrokers(bdArr);
      }
      
      if(this.clearanceBrokerage != null)
      {
        ClearanceBrokerageType cbt = ClearanceBrokerageType.fromString(this.clearanceBrokerage.getValue());
        outData.setClearanceBrokerage(cbt);
      }
      
      if(this.commercialInvoice != null)
      {
        CommercialInvoice inv = new CommercialInvoice();
        this.commercialInvoice.copyToCommercialInvoice(inv);
        outData.setCommercialInvoice(inv);
      }
      
      if(this.commodities != null)
      {
        Commodity[] cmdy = new Commodity[this.commodities.length];
        for(int x=0; x<this.commodities.length; x++)
        {
          cmdy[x] = new Commodity();
          this.commodities[x].copyToCommodity(cmdy[x]);
        }
        outData.setCommodities(cmdy);
      }
      
      if(this.customsOptions != null)
      {
        CustomsOptionDetail cod = new CustomsOptionDetail();
        this.customsOptions.copyToCustomsOptionDetail(cod);
        outData.setCustomsOptions(cod);
      }
      
      if(this.customsValue != null)
      {
        Money mny = new Money();
        this.customsValue.copyToMoney(mny);
        outData.setCustomsValue(mny);
      }
      
      if(this.declarationStatementDetail != null)
      {
        CustomsDeclarationStatementDetail cdsd = new CustomsDeclarationStatementDetail();
        this.declarationStatementDetail.copyToCustomsDeclarationStatementDetail(cdsd);
        outData.setDeclarationStatementDetail(cdsd);
      }
      
      if(this.documentContent != null)
      {
        InternationalDocumentContentType cntType = InternationalDocumentContentType.fromString(this.documentContent.getValue());
        outData.setDocumentContent(cntType);
      }
      
      if(this.dutiesPayment != null)
      {
        Payment pyt = new Payment();
        this.dutiesPayment.copyToPayment(pyt);
        outData.setDutiesPayment(pyt);
      }
      
      if(this.exportDetail != null)
      {
        ExportDetail exDetail = new ExportDetail();
        this.exportDetail.copyToExportDetail(exDetail);
        outData.setExportDetail(exDetail);
      }
      
      if(this.freightOnValue != null)
      {
        FreightOnValueType fotValue = FreightOnValueType.fromString(this.freightOnValue.getValue());
        outData.setFreightOnValue(fotValue);
      }
      
      if(this.importerOfRecord != null)
      {
        Party pty = new Party();
        this.importerOfRecord.copyToParty(pty);
        outData.setImporterOfRecord(pty);
      }
      
      if(this.insuranceCharges != null)
      {
        Money mny = new Money();
        this.insuranceCharges.copyToMoney(mny);
        outData.setInsuranceCharges(mny);
      }
      
      outData.setPartiesToTransactionAreRelated(false);
      if(this.partiesToTransactionAreRelated != null)
      {
        if(this.partiesToTransactionAreRelated.compareToIgnoreCase("Y") == 0)
          outData.setPartiesToTransactionAreRelated(true);
      }
      
      if(this.recipientCustomsId != null)
      {
        RecipientCustomsId custId = new RecipientCustomsId();
        this.recipientCustomsId.copyToRecipientCustomsId(custId);
        outData.setRecipientCustomsId(custId);
      }
      
      if(this.regulatoryControls != null)
      {
        RegulatoryControlType[] rctArr = new RegulatoryControlType[this.regulatoryControls.length];
        for(int x=0; x<this.regulatoryControls.length; x++)
        {
          rctArr[x] = RegulatoryControlType.fromString(this.regulatoryControls[x].getValue());
        }
        outData.setRegulatoryControls(rctArr);
      }
    }
  }
}
