package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtCommodityTax;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscount;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Rebate;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentLegRateDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SpecialRatingAppliedType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Surcharge;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Tax;

import java.io.Serializable;

import java.math.BigDecimal;
import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntShipmentLegRateDetail extends ValueObject implements Serializable
{
  private String legDescription = null;
  private IntAddress legOrigin = null;
  private String legOriginLocationId = null;
  private IntAddress legDestination = null;
  private String legDestinationLocationId = null;
  private IntReturnedRateType rateType = null;
  private String rateScale = null;
  private String rateZone = null;
  private IntPricingCodeType pricingCode = null;
  private IntRatedWeightMethod ratedWeightMethod = null;
  private IntMinimumChargeType minimumChargeType = null;
  private IntCurrencyExchangeRate	currencyExchangeRate = null;
  private IntSpecialRatingAppliedType[] specialRatingApplied = null;
  private Integer dimDivisor = null;
  private IntRateDimensionalDivisorType dimDivisorType = null;
  private MathNumeric fuelSurchargePercent = null;
  private IntWeight totalBillingWeight = null;
  private IntWeight totalDimWeight = null;
  private IntMoney totalBaseCharge = null;
  private IntMoney totalFreightDiscounts = null;
  private IntMoney totalNetFreight = null;
  private IntMoney totalNetFedExCharge = null;
  private IntMoney totalTaxes = null;
  private IntMoney totalNetCharge = null;
  private IntMoney totalRebates = null;
  private IntMoney totalDutiesAndTaxes = null;
  private IntMoney totalNetChargeWithDutiesAndTaxes = null;
  private IntFreightRateDetail freightRateDetail = null;
  private IntRateDiscount[] rateDiscount = null;
  private IntRebate[] rebates = null;
  private IntSurcharge[] surcharges = null;
  private IntTax[] taxes = null;
  private IntEdtCommodityTax[] dutiesAndTaxes = null;
  private IntVariableHandlingCharges variableHandlingCharges = null;
  private IntVariableHandlingCharges totalVariableHandlingCharges = null;

  public void setLegDescription(String legDescription)
  {
    this.legDescription = legDescription;
  }

  public String getLegDescription()
  {
    return legDescription;
  }

  public void setLegOrigin(IntAddress legOrigin)
  {
    this.legOrigin = legOrigin;
  }

  public IntAddress getLegOrigin()
  {
    return legOrigin;
  }

  public void setLegOriginLocationId(String legOriginLocationId)
  {
    this.legOriginLocationId = legOriginLocationId;
  }

  public String getLegOriginLocationId()
  {
    return legOriginLocationId;
  }

  public void setLegDestination(IntAddress legDestination)
  {
    this.legDestination = legDestination;
  }

  public IntAddress getLegDestination()
  {
    return legDestination;
  }

  public void setLegDestinationLocationId(String legDestinationLocationId)
  {
    this.legDestinationLocationId = legDestinationLocationId;
  }

  public String getLegDestinationLocationId()
  {
    return legDestinationLocationId;
  }

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

  public void setSpecialRatingApplied(IntSpecialRatingAppliedType[] specialRatingApplied)
  {
    this.specialRatingApplied = specialRatingApplied;
  }

  public IntSpecialRatingAppliedType[] getSpecialRatingApplied()
  {
    return specialRatingApplied;
  }

  public void setDimDivisor(Integer dimDivisor)
  {
    this.dimDivisor = dimDivisor;
  }

  public Integer getDimDivisor()
  {
    return dimDivisor;
  }

  public void setDimDivisorType(IntRateDimensionalDivisorType dimDivisorType)
  {
    this.dimDivisorType = dimDivisorType;
  }

  public IntRateDimensionalDivisorType getDimDivisorType()
  {
    return dimDivisorType;
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

  public void setFreightRateDetail(IntFreightRateDetail freightRateDetail)
  {
    this.freightRateDetail = freightRateDetail;
  }

  public IntFreightRateDetail getFreightRateDetail()
  {
    return freightRateDetail;
  }

  public void setRateDiscount(IntRateDiscount[] rateDiscount)
  {
    this.rateDiscount = rateDiscount;
  }

  public IntRateDiscount[] getRateDiscount()
  {
    return rateDiscount;
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
  
  public static IntShipmentLegRateDetail createFromShipmentLegRateDetail(ShipmentLegRateDetail inData)
  {
    IntShipmentLegRateDetail slrd = null;
    if(inData != null)
    {
      slrd = new IntShipmentLegRateDetail();
      
      slrd.setLegDescription(inData.getLegDescription());
      slrd.setLegOriginLocationId(inData.getLegOriginLocationId());
      slrd.setLegDestinationLocationId(inData.getLegDestinationLocationId());
      slrd.setRateScale(inData.getRateScale());
      slrd.setRateZone(inData.getRateZone());
      
      slrd.currencyExchangeRate = IntCurrencyExchangeRate.createFromCurrencyExchangeRate(inData.getCurrencyExchangeRate());
      slrd.dimDivisorType = IntRateDimensionalDivisorType.createFromRateDimensionalDivisorType(inData.getDimDivisorType());
      slrd.freightRateDetail = IntFreightRateDetail.createFromFreightRateDetail(inData.getFreightRateDetail());
      slrd.minimumChargeType = IntMinimumChargeType.createFromMinimumChargeType(inData.getMinimumChargeType());
      slrd.pricingCode = IntPricingCodeType.createFromPricingCodeType(inData.getPricingCode());
      slrd.ratedWeightMethod = IntRatedWeightMethod.createFromRatedWeightMethod(inData.getRatedWeightMethod());
      slrd.rateType = IntReturnedRateType.createFromReturnedRateType(inData.getRateType());
      slrd.totalBaseCharge = IntMoney.createFromMoney(inData.getTotalBaseCharge());
      slrd.totalBillingWeight = IntWeight.createFromWeight(inData.getTotalBillingWeight());
      slrd.totalDimWeight = IntWeight.createFromWeight(inData.getTotalDimWeight());
      slrd.totalDutiesAndTaxes = IntMoney.createFromMoney(inData.getTotalDutiesAndTaxes());
      slrd.totalFreightDiscounts = IntMoney.createFromMoney(inData.getTotalFreightDiscounts());
      slrd.totalNetCharge = IntMoney.createFromMoney(inData.getTotalNetCharge());
      slrd.totalNetChargeWithDutiesAndTaxes = IntMoney.createFromMoney(inData.getTotalNetChargeWithDutiesAndTaxes());
      slrd.totalNetFedExCharge = IntMoney.createFromMoney(inData.getTotalNetFedExCharge());
      slrd.totalNetFreight = IntMoney.createFromMoney(inData.getTotalNetFreight());
      slrd.totalRebates = IntMoney.createFromMoney(inData.getTotalRebates());
      slrd.totalTaxes = IntMoney.createFromMoney(inData.getTotalTaxes());
      slrd.totalVariableHandlingCharges = IntVariableHandlingCharges.createFromVariableHandlingCharges(inData.getTotalVariableHandlingCharges());
      slrd.variableHandlingCharges = IntVariableHandlingCharges.createFromVariableHandlingCharges(inData.getVariableHandlingCharges());

      Tax[] txArr = inData.getTaxes();
      if(txArr != null)
      {
        IntTax[] iTxArr = new IntTax[txArr.length];
        for(int x=0; x<iTxArr.length; x++)
        {
          iTxArr[x] = IntTax.createFromTax(txArr[x]);
        }
        slrd.setTaxes(iTxArr);
      }
      
      Surcharge[] schArr = inData.getSurcharges();
      if(schArr != null)
      {
        IntSurcharge[] iSchArr = new IntSurcharge[schArr.length];
        for(int x=0; x<schArr.length; x++)
        {
          iSchArr[x] = IntSurcharge.createFromSurcharge(schArr[x]);
        }
        slrd.setSurcharges(iSchArr);
      }
      
      SpecialRatingAppliedType[] sratArr = inData.getSpecialRatingApplied();
      if(sratArr != null)
      {
        IntSpecialRatingAppliedType[] iSratArr = new IntSpecialRatingAppliedType[sratArr.length];
        for(int x=0; x<iSratArr.length; x++)
        {
          iSratArr[x] = IntSpecialRatingAppliedType.createFromSpecialRatingAppliedType(sratArr[x]);
        }
        slrd.setSpecialRatingApplied(iSratArr);
      }
      
      Rebate[] rbtArr = inData.getRebates();
      if(rbtArr != null)
      {
        IntRebate[] iRbtArr = new IntRebate[rbtArr.length];
        for(int x=0; x<iRbtArr.length; x++)
        {
          iRbtArr[x] = IntRebate.createFromRebate(rbtArr[x]);
        }
        slrd.setRebates(iRbtArr);
      }
      
      EdtCommodityTax[] ectArr = inData.getDutiesAndTaxes();
      if(ectArr != null)
      {
        IntEdtCommodityTax[] iEctArr = new IntEdtCommodityTax[ectArr.length];
        for(int x=0; x<ectArr.length; x++)
        {
          iEctArr[x] = IntEdtCommodityTax.createFromEdtCommodityTax(ectArr[x]);
        }
        slrd.setDutiesAndTaxes(iEctArr);
      }
      
      BigInteger val = inData.getDimDivisor();
      if(val != null)
      {
        slrd.setDimDivisor(new Integer(val.intValue()));
      }
      
      BigDecimal val2 = inData.getFuelSurchargePercent();
      if(val2 != null)
      {
        slrd.setFuelSurchargePercent(new MathNumeric(val2));
      }
    }
    return slrd;
  }
}
