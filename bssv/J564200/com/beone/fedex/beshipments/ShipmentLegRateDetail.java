/**
 * Generated from schema type t=ShipmentLegRateDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShipmentLegRateDetail implements java.io.Serializable {

  private java.lang.String legDescription;

  public java.lang.String getLegDescription() {
    return this.legDescription;
  }

  public void setLegDescription(java.lang.String legDescription) {
    this.legDescription = legDescription;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Address legOrigin;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Address getLegOrigin() {
    return this.legOrigin;
  }

  public void setLegOrigin(be.e1.bssv.J564200.com.beone.fedex.beshipments.Address legOrigin) {
    this.legOrigin = legOrigin;
  }

  private java.lang.String legOriginLocationId;

  public java.lang.String getLegOriginLocationId() {
    return this.legOriginLocationId;
  }

  public void setLegOriginLocationId(java.lang.String legOriginLocationId) {
    this.legOriginLocationId = legOriginLocationId;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Address legDestination;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Address getLegDestination() {
    return this.legDestination;
  }

  public void setLegDestination(be.e1.bssv.J564200.com.beone.fedex.beshipments.Address legDestination) {
    this.legDestination = legDestination;
  }

  private java.lang.String legDestinationLocationId;

  public java.lang.String getLegDestinationLocationId() {
    return this.legDestinationLocationId;
  }

  public void setLegDestinationLocationId(java.lang.String legDestinationLocationId) {
    this.legDestinationLocationId = legDestinationLocationId;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedRateType rateType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedRateType getRateType() {
    return this.rateType;
  }

  public void setRateType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnedRateType rateType) {
    this.rateType = rateType;
  }

  private java.lang.String rateScale;

  public java.lang.String getRateScale() {
    return this.rateScale;
  }

  public void setRateScale(java.lang.String rateScale) {
    this.rateScale = rateScale;
  }

  private java.lang.String rateZone;

  public java.lang.String getRateZone() {
    return this.rateZone;
  }

  public void setRateZone(java.lang.String rateZone) {
    this.rateZone = rateZone;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PricingCodeType pricingCode;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PricingCodeType getPricingCode() {
    return this.pricingCode;
  }

  public void setPricingCode(be.e1.bssv.J564200.com.beone.fedex.beshipments.PricingCodeType pricingCode) {
    this.pricingCode = pricingCode;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RatedWeightMethod ratedWeightMethod;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RatedWeightMethod getRatedWeightMethod() {
    return this.ratedWeightMethod;
  }

  public void setRatedWeightMethod(be.e1.bssv.J564200.com.beone.fedex.beshipments.RatedWeightMethod ratedWeightMethod) {
    this.ratedWeightMethod = ratedWeightMethod;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.MinimumChargeType minimumChargeType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.MinimumChargeType getMinimumChargeType() {
    return this.minimumChargeType;
  }

  public void setMinimumChargeType(be.e1.bssv.J564200.com.beone.fedex.beshipments.MinimumChargeType minimumChargeType) {
    this.minimumChargeType = minimumChargeType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CurrencyExchangeRate currencyExchangeRate;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CurrencyExchangeRate getCurrencyExchangeRate() {
    return this.currencyExchangeRate;
  }

  public void setCurrencyExchangeRate(be.e1.bssv.J564200.com.beone.fedex.beshipments.CurrencyExchangeRate currencyExchangeRate) {
    this.currencyExchangeRate = currencyExchangeRate;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SpecialRatingAppliedType[] specialRatingApplied;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SpecialRatingAppliedType[] getSpecialRatingApplied() {
    return this.specialRatingApplied;
  }

  public void setSpecialRatingApplied(be.e1.bssv.J564200.com.beone.fedex.beshipments.SpecialRatingAppliedType[] specialRatingApplied) {
    this.specialRatingApplied = specialRatingApplied;
  }

  private java.math.BigInteger dimDivisor;

  public java.math.BigInteger getDimDivisor() {
    return this.dimDivisor;
  }

  public void setDimDivisor(java.math.BigInteger dimDivisor) {
    this.dimDivisor = dimDivisor;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDimensionalDivisorType dimDivisorType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDimensionalDivisorType getDimDivisorType() {
    return this.dimDivisorType;
  }

  public void setDimDivisorType(be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDimensionalDivisorType dimDivisorType) {
    this.dimDivisorType = dimDivisorType;
  }

  private java.math.BigDecimal fuelSurchargePercent;

  public java.math.BigDecimal getFuelSurchargePercent() {
    return this.fuelSurchargePercent;
  }

  public void setFuelSurchargePercent(java.math.BigDecimal fuelSurchargePercent) {
    this.fuelSurchargePercent = fuelSurchargePercent;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight totalBillingWeight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getTotalBillingWeight() {
    return this.totalBillingWeight;
  }

  public void setTotalBillingWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight totalBillingWeight) {
    this.totalBillingWeight = totalBillingWeight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight totalDimWeight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getTotalDimWeight() {
    return this.totalDimWeight;
  }

  public void setTotalDimWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight totalDimWeight) {
    this.totalDimWeight = totalDimWeight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalBaseCharge;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalBaseCharge() {
    return this.totalBaseCharge;
  }

  public void setTotalBaseCharge(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalBaseCharge) {
    this.totalBaseCharge = totalBaseCharge;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalFreightDiscounts;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalFreightDiscounts() {
    return this.totalFreightDiscounts;
  }

  public void setTotalFreightDiscounts(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalFreightDiscounts) {
    this.totalFreightDiscounts = totalFreightDiscounts;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalNetFreight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalNetFreight() {
    return this.totalNetFreight;
  }

  public void setTotalNetFreight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalNetFreight) {
    this.totalNetFreight = totalNetFreight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalSurcharges;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalSurcharges() {
    return this.totalSurcharges;
  }

  public void setTotalSurcharges(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalSurcharges) {
    this.totalSurcharges = totalSurcharges;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalNetFedExCharge;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalNetFedExCharge() {
    return this.totalNetFedExCharge;
  }

  public void setTotalNetFedExCharge(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalNetFedExCharge) {
    this.totalNetFedExCharge = totalNetFedExCharge;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalTaxes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalTaxes() {
    return this.totalTaxes;
  }

  public void setTotalTaxes(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalNetCharge;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalNetCharge() {
    return this.totalNetCharge;
  }

  public void setTotalNetCharge(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalNetCharge) {
    this.totalNetCharge = totalNetCharge;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalRebates;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalRebates() {
    return this.totalRebates;
  }

  public void setTotalRebates(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalRebates) {
    this.totalRebates = totalRebates;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalDutiesAndTaxes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalDutiesAndTaxes() {
    return this.totalDutiesAndTaxes;
  }

  public void setTotalDutiesAndTaxes(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalDutiesAndTaxes) {
    this.totalDutiesAndTaxes = totalDutiesAndTaxes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalNetChargeWithDutiesAndTaxes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalNetChargeWithDutiesAndTaxes() {
    return this.totalNetChargeWithDutiesAndTaxes;
  }

  public void setTotalNetChargeWithDutiesAndTaxes(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalNetChargeWithDutiesAndTaxes) {
    this.totalNetChargeWithDutiesAndTaxes = totalNetChargeWithDutiesAndTaxes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateDetail freightRateDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateDetail getFreightRateDetail() {
    return this.freightRateDetail;
  }

  public void setFreightRateDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateDetail freightRateDetail) {
    this.freightRateDetail = freightRateDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscount[] freightDiscounts;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscount[] getFreightDiscounts() {
    return this.freightDiscounts;
  }

  public void setFreightDiscounts(be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscount[] freightDiscounts) {
    this.freightDiscounts = freightDiscounts;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Rebate[] rebates;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Rebate[] getRebates() {
    return this.rebates;
  }

  public void setRebates(be.e1.bssv.J564200.com.beone.fedex.beshipments.Rebate[] rebates) {
    this.rebates = rebates;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Surcharge[] surcharges;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Surcharge[] getSurcharges() {
    return this.surcharges;
  }

  public void setSurcharges(be.e1.bssv.J564200.com.beone.fedex.beshipments.Surcharge[] surcharges) {
    this.surcharges = surcharges;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Tax[] taxes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Tax[] getTaxes() {
    return this.taxes;
  }

  public void setTaxes(be.e1.bssv.J564200.com.beone.fedex.beshipments.Tax[] taxes) {
    this.taxes = taxes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtCommodityTax[] dutiesAndTaxes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtCommodityTax[] getDutiesAndTaxes() {
    return this.dutiesAndTaxes;
  }

  public void setDutiesAndTaxes(be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtCommodityTax[] dutiesAndTaxes) {
    this.dutiesAndTaxes = dutiesAndTaxes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingCharges variableHandlingCharges;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingCharges getVariableHandlingCharges() {
    return this.variableHandlingCharges;
  }

  public void setVariableHandlingCharges(be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingCharges variableHandlingCharges) {
    this.variableHandlingCharges = variableHandlingCharges;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingCharges totalVariableHandlingCharges;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingCharges getTotalVariableHandlingCharges() {
    return this.totalVariableHandlingCharges;
  }

  public void setTotalVariableHandlingCharges(be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingCharges totalVariableHandlingCharges) {
    this.totalVariableHandlingCharges = totalVariableHandlingCharges;
  }

}
