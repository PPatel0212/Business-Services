package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtCommodityTax;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDimensionalDivisorType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscount;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Rebate;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentLegRateDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentRateDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SpecialRatingAppliedType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Surcharge;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Tax;

import java.io.Serializable;

import java.math.BigDecimal;
import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntShipmentRateDetail extends ValueObject implements Serializable
{
  private IntReturnedRateType rateType = null;
  private String rateScale = null;
  private String rateZone = null;
  private IntPricingCodeType pricingCode = null;
  private IntRatedWeightMethod ratedWeightMethod = null;
  private IntMinimumChargeType minimumChargeType = null;
  private IntCurrencyExchangeRate currencyExchangeRate = null;
  private IntSpecialRatingAppliedType[] specialRatingApplied = null;
  private Integer dimDivisor = null;
  private IntRateDimensionalDivisorType dimDivisorType = null;
  private MathNumeric fuelSurchargePercent = null;
  private IntWeight totalBillingWeight = null;
  private IntWeight totalDimWeight = null;
  private IntMoney totalBaseCharge = null;
  private IntMoney totalFreightDiscounts = null;
  private IntMoney totalNetFreight = null;
  private IntMoney totalSurcharges = null;
  private IntMoney totalNetFedExCharge = null;
  private IntMoney totalTaxes = null;
  private IntMoney totalNetCharge = null;
  private IntMoney totalRebates = null;
  private IntMoney totalDutiesAndTaxes = null;
  private IntMoney totalNetChargeWithDutiesAndTaxes = null;
  private IntShipmentLegRateDetail[] shipmentLegRateDetails = null;
  private IntFreightRateDetail freightRateDetail = null;
  private IntRateDiscount[] freightDiscounts = null;
  private IntRebate[] rebates = null;
  private IntSurcharge[] surcharges = null;
  private IntTax[] taxes = null;
  private IntEdtCommodityTax[] dutiesAndTaxes = null;
  private IntVariableHandlingCharges variableHandlingCharges = null;
  private IntVariableHandlingCharges totalVariableHandlingCharges = null;

  public void setRateType(IntReturnedRateType rateType)
  {
    this.rateType = rateType;
  }

  public IntReturnedRateType getRateType()
  {
    return rateType;
  }

  public void setRateScale(String rateScale)
  {
    this.rateScale = rateScale;
  }

  public String getRateScale()
  {
    return rateScale;
  }

  public void setRateZone(String rateZone)
  {
    this.rateZone = rateZone;
  }

  public String getRateZone()
  {
    return rateZone;
  }

  public void setPricingCode(IntPricingCodeType pricingCode)
  {
    this.pricingCode = pricingCode;
  }

  public IntPricingCodeType getPricingCode()
  {
    return pricingCode;
  }

  public void setRatedWeightMethod(IntRatedWeightMethod ratedWeightMethod)
  {
    this.ratedWeightMethod = ratedWeightMethod;
  }

  public IntRatedWeightMethod getRatedWeightMethod()
  {
    return ratedWeightMethod;
  }

  public void setMinimumChargeType(IntMinimumChargeType minimumChargeType)
  {
    this.minimumChargeType = minimumChargeType;
  }

  public IntMinimumChargeType getMinimumChargeType()
  {
    return minimumChargeType;
  }

  public void setCurrencyExchangeRate(IntCurrencyExchangeRate currencyExchangeRate)
  {
    this.currencyExchangeRate = currencyExchangeRate;
  }

  public IntCurrencyExchangeRate getCurrencyExchangeRate()
  {
    return currencyExchangeRate;
  }

  public void setDimDivisor(Integer dimDivisor)
  {
    this.dimDivisor = dimDivisor;
  }

  public Integer getDimDivisor()
  {
    return dimDivisor;
  }

  public void setFuelSurchargePercent(MathNumeric fuelSurchargePercent)
  {
    this.fuelSurchargePercent = fuelSurchargePercent;
  }

  public MathNumeric getFuelSurchargePercent()
  {
    return fuelSurchargePercent;
  }

  public void setTotalBillingWeight(IntWeight totalBillingWeight)
  {
    this.totalBillingWeight = totalBillingWeight;
  }

  public IntWeight getTotalBillingWeight()
  {
    return totalBillingWeight;
  }

  public void setTotalDimWeight(IntWeight totalDimWeight)
  {
    this.totalDimWeight = totalDimWeight;
  }

  public IntWeight getTotalDimWeight()
  {
    return totalDimWeight;
  }

  public void setTotalBaseCharge(IntMoney totalBaseCharge)
  {
    this.totalBaseCharge = totalBaseCharge;
  }

  public IntMoney getTotalBaseCharge()
  {
    return totalBaseCharge;
  }

  public void setTotalFreightDiscounts(IntMoney totalFreightDiscounts)
  {
    this.totalFreightDiscounts = totalFreightDiscounts;
  }

  public IntMoney getTotalFreightDiscounts()
  {
    return totalFreightDiscounts;
  }

  public void setTotalNetFreight(IntMoney totalNetFreight)
  {
    this.totalNetFreight = totalNetFreight;
  }

  public IntMoney getTotalNetFreight()
  {
    return totalNetFreight;
  }

  public void setTotalSurcharges(IntMoney totalSurcharges)
  {
    this.totalSurcharges = totalSurcharges;
  }

  public IntMoney getTotalSurcharges()
  {
    return totalSurcharges;
  }

  public void setTotalNetFedExCharge(IntMoney totalNetFedExCharge)
  {
    this.totalNetFedExCharge = totalNetFedExCharge;
  }

  public IntMoney getTotalNetFedExCharge()
  {
    return totalNetFedExCharge;
  }

  public void setTotalTaxes(IntMoney totalTaxes)
  {
    this.totalTaxes = totalTaxes;
  }

  public IntMoney getTotalTaxes()
  {
    return totalTaxes;
  }

  public void setTotalNetCharge(IntMoney totalNetCharge)
  {
    this.totalNetCharge = totalNetCharge;
  }

  public IntMoney getTotalNetCharge()
  {
    return totalNetCharge;
  }

  public void setTotalRebates(IntMoney totalRebates)
  {
    this.totalRebates = totalRebates;
  }

  public IntMoney getTotalRebates()
  {
    return totalRebates;
  }

  public void setTotalDutiesAndTaxes(IntMoney totalDutiesAndTaxes)
  {
    this.totalDutiesAndTaxes = totalDutiesAndTaxes;
  }

  public IntMoney getTotalDutiesAndTaxes()
  {
    return totalDutiesAndTaxes;
  }

  public void setTotalNetChargeWithDutiesAndTaxes(IntMoney totalNetChargeWithDutiesAndTaxes)
  {
    this.totalNetChargeWithDutiesAndTaxes = totalNetChargeWithDutiesAndTaxes;
  }

  public IntMoney getTotalNetChargeWithDutiesAndTaxes()
  {
    return totalNetChargeWithDutiesAndTaxes;
  }

  public void setShipmentLegRateDetails(IntShipmentLegRateDetail[] shipmentLegRateDetails)
  {
    this.shipmentLegRateDetails = shipmentLegRateDetails;
  }

  public IntShipmentLegRateDetail[] getShipmentLegRateDetails()
  {
    return shipmentLegRateDetails;
  }

  public void setFreightRateDetail(IntFreightRateDetail freightRateDetail)
  {
    this.freightRateDetail = freightRateDetail;
  }

  public IntFreightRateDetail getFreightRateDetail()
  {
    return freightRateDetail;
  }

  public void setFreightDiscounts(IntRateDiscount[] freightDiscounts)
  {
    this.freightDiscounts = freightDiscounts;
  }

  public IntRateDiscount[] getFreightDiscounts()
  {
    return freightDiscounts;
  }

  public void setRebates(IntRebate[] rebates)
  {
    this.rebates = rebates;
  }

  public IntRebate[] getRebates()
  {
    return rebates;
  }

  public void setSurcharges(IntSurcharge[] surcharges)
  {
    this.surcharges = surcharges;
  }

  public IntSurcharge[] getSurcharges()
  {
    return surcharges;
  }

  public void setTaxes(IntTax[] taxes)
  {
    this.taxes = taxes;
  }

  public IntTax[] getTaxes()
  {
    return taxes;
  }

  public void setDutiesAndTaxes(IntEdtCommodityTax[] dutiesAndTaxes)
  {
    this.dutiesAndTaxes = dutiesAndTaxes;
  }

  public IntEdtCommodityTax[] getDutiesAndTaxes()
  {
    return dutiesAndTaxes;
  }

  public void setVariableHandlingCharges(IntVariableHandlingCharges variableHandlingCharges)
  {
    this.variableHandlingCharges = variableHandlingCharges;
  }

  public IntVariableHandlingCharges getVariableHandlingCharges()
  {
    return variableHandlingCharges;
  }

  public void setTotalVariableHandlingCharges(IntVariableHandlingCharges totalVariableHandlingCharges)
  {
    this.totalVariableHandlingCharges = totalVariableHandlingCharges;
  }

  public IntVariableHandlingCharges getTotalVariableHandlingCharges()
  {
    return totalVariableHandlingCharges;
  }

  public void setDimDivisorType(IntRateDimensionalDivisorType dimDivisorType)
  {
    this.dimDivisorType = dimDivisorType;
  }

  public IntRateDimensionalDivisorType getDimDivisorType()
  {
    return dimDivisorType;
  }

  public void setSpecialRatingApplied(IntSpecialRatingAppliedType[] specialRatingApplied)
  {
    this.specialRatingApplied = specialRatingApplied;
  }

  public IntSpecialRatingAppliedType[] getSpecialRatingApplied()
  {
    return specialRatingApplied;
  }
  
  public static IntShipmentRateDetail createFromShipmentRateDetail(ShipmentRateDetail inData)
  {
    IntShipmentRateDetail srd = null;
    if(inData != null)
    {
      srd = new IntShipmentRateDetail();
      
      srd.currencyExchangeRate = IntCurrencyExchangeRate.createFromCurrencyExchangeRate(inData.getCurrencyExchangeRate());
      srd.dimDivisorType = IntRateDimensionalDivisorType.createFromRateDimensionalDivisorType(inData.getDimDivisorType());
      srd.freightRateDetail = IntFreightRateDetail.createFromFreightRateDetail(inData.getFreightRateDetail());
      srd.minimumChargeType = IntMinimumChargeType.createFromMinimumChargeType(inData.getMinimumChargeType());
      srd.pricingCode = IntPricingCodeType.createFromPricingCodeType(inData.getPricingCode());
      srd.ratedWeightMethod = IntRatedWeightMethod.createFromRatedWeightMethod(inData.getRatedWeightMethod());
      srd.setRateScale(inData.getRateScale());
      srd.rateType = IntReturnedRateType.createFromReturnedRateType(inData.getRateType());
      srd.setRateZone(inData.getRateZone());
      srd.totalBaseCharge = IntMoney.createFromMoney(inData.getTotalBaseCharge());
      srd.totalBillingWeight = IntWeight.createFromWeight(inData.getTotalBillingWeight());
      srd.totalDimWeight = IntWeight.createFromWeight(inData.getTotalDimWeight());
      srd.totalDutiesAndTaxes = IntMoney.createFromMoney(inData.getTotalDutiesAndTaxes());
      srd.totalFreightDiscounts = IntMoney.createFromMoney(inData.getTotalFreightDiscounts());
      srd.totalNetCharge = IntMoney.createFromMoney(inData.getTotalNetCharge());
      srd.totalNetChargeWithDutiesAndTaxes = IntMoney.createFromMoney(inData.getTotalNetChargeWithDutiesAndTaxes());
      srd.totalNetFedExCharge = IntMoney.createFromMoney(inData.getTotalNetFedExCharge());
      srd.totalNetFreight = IntMoney.createFromMoney(inData.getTotalNetFreight());
      srd.totalRebates = IntMoney.createFromMoney(inData.getTotalRebates());
      srd.totalSurcharges = IntMoney.createFromMoney(inData.getTotalSurcharges());
      srd.totalTaxes = IntMoney.createFromMoney(inData.getTotalTaxes());
      srd.totalVariableHandlingCharges = IntVariableHandlingCharges.createFromVariableHandlingCharges(inData.getTotalVariableHandlingCharges());
      srd.variableHandlingCharges = IntVariableHandlingCharges.createFromVariableHandlingCharges(inData.getVariableHandlingCharges());

      Tax[] txArr = inData.getTaxes();
      if(txArr != null)
      {
        IntTax[] iTxArr = new IntTax[txArr.length];
        for(int x=0; x<iTxArr.length; x++)
        {
          iTxArr[x] = IntTax.createFromTax(txArr[x]);
        }
        srd.setTaxes(iTxArr);
      }
      
      Surcharge[] schArr = inData.getSurcharges();
      if(schArr != null)
      {
        IntSurcharge[] iSchArr = new IntSurcharge[schArr.length];
        for(int x=0; x<schArr.length; x++)
        {
          iSchArr[x] = IntSurcharge.createFromSurcharge(schArr[x]);
        }
        srd.setSurcharges(iSchArr);
      }
      
      SpecialRatingAppliedType[] sratArr = inData.getSpecialRatingApplied();
      if(sratArr != null)
      {
        IntSpecialRatingAppliedType[] iSratArr = new IntSpecialRatingAppliedType[sratArr.length];
        for(int x=0; x<iSratArr.length; x++)
        {
          iSratArr[x] = IntSpecialRatingAppliedType.createFromSpecialRatingAppliedType(sratArr[x]);
        }
        srd.setSpecialRatingApplied(iSratArr);
      }
      
      ShipmentLegRateDetail[] slrdArr = inData.getShipmentLegRateDetails();
      if(slrdArr != null)
      {
        IntShipmentLegRateDetail[] iSlrdArr = new IntShipmentLegRateDetail[slrdArr.length];
        for(int x=0; x<slrdArr.length; x++)
        {
          iSlrdArr[x] = IntShipmentLegRateDetail.createFromShipmentLegRateDetail(slrdArr[x]);
        }
        srd.setShipmentLegRateDetails(iSlrdArr);
      }
      
      Rebate[] rbtArr = inData.getRebates();
      if(rbtArr != null)
      {
        IntRebate[] iRbtArr = new IntRebate[rbtArr.length];
        for(int x=0; x<iRbtArr.length; x++)
        {
          iRbtArr[x] = IntRebate.createFromRebate(rbtArr[x]);
        }
        srd.setRebates(iRbtArr);
      }
      
      EdtCommodityTax[] ectArr = inData.getDutiesAndTaxes();
      if(ectArr != null)
      {
        IntEdtCommodityTax[] iEctArr = new IntEdtCommodityTax[ectArr.length];
        for(int x=0; x<ectArr.length; x++)
        {
          iEctArr[x] = IntEdtCommodityTax.createFromEdtCommodityTax(ectArr[x]);
        }
        srd.setDutiesAndTaxes(iEctArr);
      }
      
      RateDiscount[] rdArr = inData.getFreightDiscounts();
      if(rdArr != null)
      {
        IntRateDiscount[] iRdArr = new IntRateDiscount[rdArr.length];
        for(int x=0; x<rdArr.length; x++)
        {
          iRdArr[x] = IntRateDiscount.createFromRateDiscount(rdArr[x]);
        }
        srd.setFreightDiscounts(iRdArr);
      }
      
      BigInteger val = inData.getDimDivisor();
      if(val != null)
      {
        srd.setDimDivisor(new Integer(val.intValue()));
      }
      
      BigDecimal val2 = inData.getFuelSurchargePercent();
      if(val2 != null)
      {
        srd.setFuelSurchargePercent(new MathNumeric(val2));
      }
    }
    return srd;
  }
}
