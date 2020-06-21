package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageRateDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscount;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Rebate;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Surcharge;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Tax;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPackageRateDetail extends ValueObject implements Serializable
{
  private IntReturnedRateType rateType = null;
  private IntRatedWeightMethod ratedWeightMethod = null;
  private IntMinimumChargeType minimumChargeType = null;
  private IntWeight billingWeight = null;
  private IntWeight dimWeight = null;
  private IntWeight oversizeWeight = null;
  private IntMoney baseCharge = null;
  private IntMoney totalFreightDiscounts = null;
  private IntMoney netFreight = null;
  private IntMoney totalSurcharges = null;
  private IntMoney netFedExCharge = null;
  private IntMoney totalTaxes = null;
  private IntMoney netCharge = null;
  private IntMoney totalRebates = null;
  private IntRateDiscount[]	freightDiscounts = null;
  private IntRebate[] rebates = null;
  private IntSurcharge[] surcharges = null;
  private IntTax[] taxes = null;
  private IntVariableHandlingCharges variableHandlingCharges = null;

  public void setRateType(IntReturnedRateType rateType)
  {
    this.rateType = rateType;
  }

  public IntReturnedRateType getRateType()
  {
    return rateType;
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

  public void setBillingWeight(IntWeight billingWeight)
  {
    this.billingWeight = billingWeight;
  }

  public IntWeight getBillingWeight()
  {
    return billingWeight;
  }

  public void setDimWeight(IntWeight dimWeight)
  {
    this.dimWeight = dimWeight;
  }

  public IntWeight getDimWeight()
  {
    return dimWeight;
  }

  public void setOversizeWeight(IntWeight oversizeWeight)
  {
    this.oversizeWeight = oversizeWeight;
  }

  public IntWeight getOversizeWeight()
  {
    return oversizeWeight;
  }

  public void setBaseCharge(IntMoney baseCharge)
  {
    this.baseCharge = baseCharge;
  }

  public IntMoney getBaseCharge()
  {
    return baseCharge;
  }

  public void setTotalFreightDiscounts(IntMoney totalFreightDiscounts)
  {
    this.totalFreightDiscounts = totalFreightDiscounts;
  }

  public IntMoney getTotalFreightDiscounts()
  {
    return totalFreightDiscounts;
  }

  public void setNetFreight(IntMoney netFreight)
  {
    this.netFreight = netFreight;
  }

  public IntMoney getNetFreight()
  {
    return netFreight;
  }

  public void setTotalSurcharges(IntMoney totalSurcharges)
  {
    this.totalSurcharges = totalSurcharges;
  }

  public IntMoney getTotalSurcharges()
  {
    return totalSurcharges;
  }

  public void setNetFedExCharge(IntMoney netFedExCharge)
  {
    this.netFedExCharge = netFedExCharge;
  }

  public IntMoney getNetFedExCharge()
  {
    return netFedExCharge;
  }

  public void setTotalTaxes(IntMoney totalTaxes)
  {
    this.totalTaxes = totalTaxes;
  }

  public IntMoney getTotalTaxes()
  {
    return totalTaxes;
  }

  public void setNetCharge(IntMoney netCharge)
  {
    this.netCharge = netCharge;
  }

  public IntMoney getNetCharge()
  {
    return netCharge;
  }

  public void setTotalRebates(IntMoney totalRebates)
  {
    this.totalRebates = totalRebates;
  }

  public IntMoney getTotalRebates()
  {
    return totalRebates;
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

  public void setVariableHandlingCharges(IntVariableHandlingCharges variableHandlingCharges)
  {
    this.variableHandlingCharges = variableHandlingCharges;
  }

  public IntVariableHandlingCharges getVariableHandlingCharges()
  {
    return variableHandlingCharges;
  }
  
  public static IntPackageRateDetail createFromPackageRateDetail(PackageRateDetail inData)
  {
    IntPackageRateDetail prd = null;
    if(inData != null)
    {
      prd = new IntPackageRateDetail();
      
      prd.baseCharge = IntMoney.createFromMoney(inData.getBaseCharge());
      prd.billingWeight = IntWeight.createFromWeight(inData.getBillingWeight());
      prd.dimWeight = IntWeight.createFromWeight(inData.getDimWeight());
      prd.minimumChargeType = IntMinimumChargeType.createFromMinimumChargeType(inData.getMinimumChargeType());
      prd.netCharge = IntMoney.createFromMoney(inData.getNetCharge());
      prd.netFedExCharge = IntMoney.createFromMoney(inData.getNetFedExCharge());
      prd.netFreight = IntMoney.createFromMoney(inData.getNetFreight());
      prd.oversizeWeight = IntWeight.createFromWeight(inData.getOversizeWeight());
      prd.ratedWeightMethod = IntRatedWeightMethod.createFromRatedWeightMethod(inData.getRatedWeightMethod());
      prd.rateType = IntReturnedRateType.createFromReturnedRateType(inData.getRateType());
      prd.totalFreightDiscounts = IntMoney.createFromMoney(inData.getTotalFreightDiscounts());
      prd.totalSurcharges = IntMoney.createFromMoney(inData.getTotalSurcharges());
      prd.totalTaxes = IntMoney.createFromMoney(inData.getTotalTaxes());
      prd.variableHandlingCharges = IntVariableHandlingCharges.createFromVariableHandlingCharges(inData.getVariableHandlingCharges());
      
      Surcharge[] chargeArr = inData.getSurcharges();
      if(chargeArr != null)
      {
        IntSurcharge[] iChargeArr = new IntSurcharge[chargeArr.length];
        for(int x=0; x<chargeArr.length; x++)
        {
          iChargeArr[x] = IntSurcharge.createFromSurcharge(chargeArr[x]);
        }
        prd.setSurcharges(iChargeArr);
      }
      
      Tax[] txArr = inData.getTaxes();
      if(txArr != null)
      {
        IntTax[] iTxArr = new IntTax[txArr.length];
        for(int x=0; x<txArr.length; x++)
        {
          iTxArr[x] = IntTax.createFromTax(txArr[x]);
        }
        prd.setTaxes(iTxArr);
      }
      
      Rebate[] rebateArr = inData.getRebates();
      if(rebateArr != null)
      {
        IntRebate[] iRebateArr = new IntRebate[rebateArr.length];
        for(int x=0; x<rebateArr.length; x++)
        {
          iRebateArr[x] = IntRebate.createFromRebate(rebateArr[x]);
        }
        prd.setRebates(iRebateArr);
      }
      
      RateDiscount[] rdArr = inData.getFreightDiscounts();
      if(rdArr != null)
      {
        IntRateDiscount[] iRdArr = new IntRateDiscount[rdArr.length];
        for(int x=0; x<rdArr.length; x++)
        {
          iRdArr[x] = IntRateDiscount.createFromRateDiscount(rdArr[x]);
        }
      }
    }
    return prd;
  }
}
