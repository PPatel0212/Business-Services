package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightCollectTermsType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentLineItem;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentRoleType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightSpecialServicePayment;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PrintedReference;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntFreightShipmentDetail extends ValueObject implements Serializable
{
  private String fedExFreightAccountNumber = null;
  private IntContactAndAddress fedexFreightBillingContactAndAddress = null;
  private IntParty alternateBilling = null;
  private IntPrintedReference[] printedReferences = null;
  private IntFreightShipmentRoleType role = null;
  private IntFreightCollectTermsType collectTermsType = null;
  private IntMoney declaredValuePerUnit = null;
  private String declaredValueUnits = null;
  private IntLiabilityCoverageDetail liabilityCoverageDetail = null;
  private String[] coupons = null;
  private Integer totalHandlingUnits = null;
  private MathNumeric clientDiscountPercent = null;
  private IntWeight palletWeight = null;
  private IntDimensions shipmentDimensions = null;
  private String comment = null;
  private IntFreightSpecialServicePayment[] specialServicePayments = null;
  private String hazardousMaterialsEmergencyContactNumber = null;
  private String hazardousMaterialsOfferor = null;
  private IntFreightShipmentLineItem[] lineItems = null;

  public void setFedExFreightAccountNumber(String fedExFreightAccountNumber)
  {
    this.fedExFreightAccountNumber = fedExFreightAccountNumber;
  }

  public String getFedExFreightAccountNumber()
  {
    return fedExFreightAccountNumber;
  }

  public void setFedexFreightBillingContactAndAddress(IntContactAndAddress fedexFreightBillingContactAndAddress)
  {
    this.fedexFreightBillingContactAndAddress = fedexFreightBillingContactAndAddress;
  }

  public IntContactAndAddress getFedexFreightBillingContactAndAddress()
  {
    return fedexFreightBillingContactAndAddress;
  }

  public void setAlternateBilling(IntParty alternateBilling)
  {
    this.alternateBilling = alternateBilling;
  }

  public IntParty getAlternateBilling()
  {
    return alternateBilling;
  }

  public void setPrintedReferences(IntPrintedReference[] printedReferences)
  {
    this.printedReferences = printedReferences;
  }

  public IntPrintedReference[] getPrintedReferences()
  {
    return printedReferences;
  }

  public void setRole(IntFreightShipmentRoleType role)
  {
    this.role = role;
  }

  public IntFreightShipmentRoleType getRole()
  {
    return role;
  }

  public void setCollectTermsType(IntFreightCollectTermsType collectTermsType)
  {
    this.collectTermsType = collectTermsType;
  }

  public IntFreightCollectTermsType getCollectTermsType()
  {
    return collectTermsType;
  }

  public void setDeclaredValuePerUnit(IntMoney declaredValuePerUnit)
  {
    this.declaredValuePerUnit = declaredValuePerUnit;
  }

  public IntMoney getDeclaredValuePerUnit()
  {
    return declaredValuePerUnit;
  }

  public void setDeclaredValueUnits(String declaredValueUnits)
  {
    this.declaredValueUnits = declaredValueUnits;
  }

  public String getDeclaredValueUnits()
  {
    return declaredValueUnits;
  }

  public void setLiabilityCoverageDetail(IntLiabilityCoverageDetail liabilityCoverageDetail)
  {
    this.liabilityCoverageDetail = liabilityCoverageDetail;
  }

  public IntLiabilityCoverageDetail getLiabilityCoverageDetail()
  {
    return liabilityCoverageDetail;
  }

  public void setCoupons(String[] coupons)
  {
    this.coupons = coupons;
  }

  public String[] getCoupons()
  {
    return coupons;
  }

  public void setTotalHandlingUnits(Integer totalHandlingUnits)
  {
    this.totalHandlingUnits = totalHandlingUnits;
  }

  public Integer getTotalHandlingUnits()
  {
    return totalHandlingUnits;
  }

  public void setClientDiscountPercent(MathNumeric clientDiscountPercent)
  {
    this.clientDiscountPercent = clientDiscountPercent;
  }

  public MathNumeric getClientDiscountPercent()
  {
    return clientDiscountPercent;
  }

  public void setPalletWeight(IntWeight palletWeight)
  {
    this.palletWeight = palletWeight;
  }

  public IntWeight getPalletWeight()
  {
    return palletWeight;
  }

  public void setShipmentDimensions(IntDimensions shipmentDimensions)
  {
    this.shipmentDimensions = shipmentDimensions;
  }

  public IntDimensions getShipmentDimensions()
  {
    return shipmentDimensions;
  }

  public void setComment(String comment)
  {
    this.comment = comment;
  }

  public String getComment()
  {
    return comment;
  }

  public void setSpecialServicePayments(IntFreightSpecialServicePayment[] specialServicePayments)
  {
    this.specialServicePayments = specialServicePayments;
  }

  public IntFreightSpecialServicePayment[] getSpecialServicePayments()
  {
    return specialServicePayments;
  }

  public void setHazardousMaterialsEmergencyContactNumber(String hazardousMaterialsEmergencyContactNumber)
  {
    this.hazardousMaterialsEmergencyContactNumber = hazardousMaterialsEmergencyContactNumber;
  }

  public String getHazardousMaterialsEmergencyContactNumber()
  {
    return hazardousMaterialsEmergencyContactNumber;
  }

  public void setHazardousMaterialsOfferor(String hazardousMaterialsOfferor)
  {
    this.hazardousMaterialsOfferor = hazardousMaterialsOfferor;
  }

  public String getHazardousMaterialsOfferor()
  {
    return hazardousMaterialsOfferor;
  }

  public void setLineItems(IntFreightShipmentLineItem[] lineItems)
  {
    this.lineItems = lineItems;
  }

  public IntFreightShipmentLineItem[] getLineItems()
  {
    return lineItems;
  }
  
  public void copyToFreightShipmentDetail(FreightShipmentDetail outData)
  {
    if(outData != null)
    {
      if(this.alternateBilling != null)
      {
        Party pty = new Party();
        this.alternateBilling.copyToParty(pty);
        outData.setAlternateBilling(pty);
      }
      
      if(this.clientDiscountPercent != null)
      {
        outData.setClientDiscountPercent(this.clientDiscountPercent.asBigDecimal());
      }
      
      if(this.collectTermsType != null)
      {
        FreightCollectTermsType collectTerms = FreightCollectTermsType.fromString(this.collectTermsType.getValue());
        outData.setCollectTermsType(collectTerms);
      }
      
      outData.setComment(this.comment);
      outData.setCoupons(this.coupons);
      outData.setDeclaredValueUnits(this.declaredValueUnits);
      outData.setFedExFreightAccountNumber(this.fedExFreightAccountNumber);
      outData.setHazardousMaterialsEmergencyContactNumber(this.hazardousMaterialsEmergencyContactNumber);
      outData.setHazardousMaterialsOfferor(this.hazardousMaterialsOfferor);
      
      if(this.declaredValuePerUnit != null)
      {
        Money mny = new Money();
        this.declaredValuePerUnit.copyToMoney(mny);
        outData.setDeclaredValuePerUnit(mny);
      }
      
      if(this.fedexFreightBillingContactAndAddress != null)
      {
        ContactAndAddress cta = new ContactAndAddress();
        this.fedexFreightBillingContactAndAddress.copyToContactAndAddress(cta);
        outData.setFedExFreightBillingContactAndAddress(cta);
      }
      
      if(this.liabilityCoverageDetail != null)
      {
        LiabilityCoverageDetail lcd = new LiabilityCoverageDetail();
        this.liabilityCoverageDetail.copyToLiabilityCoverageDetail(lcd);
        outData.setLiabilityCoverageDetail(lcd);
      }
      
      if(this.lineItems != null)
      {
        FreightShipmentLineItem[] shipLines = new FreightShipmentLineItem[this.lineItems.length];
        for(int x=0; x<this.lineItems.length; x++)
        {
          shipLines[x] = new FreightShipmentLineItem();
          this.lineItems[x].copyToFreightShipmentLineItem(shipLines[x]);
        }
        outData.setLineItems(shipLines);
      }
      
      if(this.palletWeight != null)
      {
        Weight wgt = new Weight();
        this.palletWeight.copyToWeight(wgt);
        outData.setPalletWeight(wgt);
      }
      
      if(this.printedReferences != null)
      {
        PrintedReference[] printRefArr = new PrintedReference[this.printedReferences.length];
        for(int x=0; x<this.printedReferences.length; x++)
        {
          printRefArr[x] = new PrintedReference();
          this.printedReferences[x].copyToPrintedReference(printRefArr[x]);
        }
        outData.setPrintedReferences(printRefArr);
      }
      
      if(this.role != null)
      {
        FreightShipmentRoleType fsrt = FreightShipmentRoleType.fromString(this.role.getValue());
        outData.setRole(fsrt);
      }
      
      if(this.shipmentDimensions != null)
      {
        Dimensions dim = new Dimensions();
        this.shipmentDimensions.copyToDimensions(dim);
        outData.setShipmentDimensions(dim);
      }
      
      if(this.specialServicePayments != null)
      {
        FreightSpecialServicePayment[] fsspArr = new FreightSpecialServicePayment[this.specialServicePayments.length];
        for(int x=0; x<this.specialServicePayments.length; x++)
        {
          fsspArr[x] = new FreightSpecialServicePayment();
          this.specialServicePayments[x].copyToFreightSpecialServicePayment(fsspArr[x]);
        }
        outData.setSpecialServicePayments(fsspArr);
      }
      
      if(this.totalHandlingUnits != null)
      {
        outData.setTotalHandlingUnits(BigInteger.valueOf(this.totalHandlingUnits.intValue()));
      }
    }
  }
}
