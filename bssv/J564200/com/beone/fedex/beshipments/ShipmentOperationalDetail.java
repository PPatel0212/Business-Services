/**
 * Generated from schema type t=ShipmentOperationalDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShipmentOperationalDetail implements java.io.Serializable {

  private java.lang.String ursaPrefixCode;

  public java.lang.String getUrsaPrefixCode() {
    return this.ursaPrefixCode;
  }

  public void setUrsaPrefixCode(java.lang.String ursaPrefixCode) {
    this.ursaPrefixCode = ursaPrefixCode;
  }

  private java.lang.String ursaSuffixCode;

  public java.lang.String getUrsaSuffixCode() {
    return this.ursaSuffixCode;
  }

  public void setUrsaSuffixCode(java.lang.String ursaSuffixCode) {
    this.ursaSuffixCode = ursaSuffixCode;
  }

  private java.lang.String originLocationId;

  public java.lang.String getOriginLocationId() {
    return this.originLocationId;
  }

  public void setOriginLocationId(java.lang.String originLocationId) {
    this.originLocationId = originLocationId;
  }

  private java.lang.Integer originLocationNumber;

  public java.lang.Integer getOriginLocationNumber() {
    return this.originLocationNumber;
  }

  public void setOriginLocationNumber(java.lang.Integer originLocationNumber) {
    this.originLocationNumber = originLocationNumber;
  }

  private java.lang.String originServiceArea;

  public java.lang.String getOriginServiceArea() {
    return this.originServiceArea;
  }

  public void setOriginServiceArea(java.lang.String originServiceArea) {
    this.originServiceArea = originServiceArea;
  }

  private java.lang.String destinationLocationId;

  public java.lang.String getDestinationLocationId() {
    return this.destinationLocationId;
  }

  public void setDestinationLocationId(java.lang.String destinationLocationId) {
    this.destinationLocationId = destinationLocationId;
  }

  private java.lang.Integer destinationLocationNumber;

  public java.lang.Integer getDestinationLocationNumber() {
    return this.destinationLocationNumber;
  }

  public void setDestinationLocationNumber(java.lang.Integer destinationLocationNumber) {
    this.destinationLocationNumber = destinationLocationNumber;
  }

  private java.lang.String destinationServiceArea;

  public java.lang.String getDestinationServiceArea() {
    return this.destinationServiceArea;
  }

  public void setDestinationServiceArea(java.lang.String destinationServiceArea) {
    this.destinationServiceArea = destinationServiceArea;
  }

  private java.lang.String destinationLocationStateOrProvinceCode;

  public java.lang.String getDestinationLocationStateOrProvinceCode() {
    return this.destinationLocationStateOrProvinceCode;
  }

  public void setDestinationLocationStateOrProvinceCode(java.lang.String destinationLocationStateOrProvinceCode) {
    this.destinationLocationStateOrProvinceCode = destinationLocationStateOrProvinceCode;
  }

  private java.util.Calendar deliveryDate;

  public java.util.Calendar getDeliveryDate() {
    return this.deliveryDate;
  }

  public void setDeliveryDate(java.util.Calendar deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DayOfWeekType deliveryDay;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DayOfWeekType getDeliveryDay() {
    return this.deliveryDay;
  }

  public void setDeliveryDay(be.e1.bssv.J564200.com.beone.fedex.beshipments.DayOfWeekType deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  private java.util.Calendar publishedDeliveryTime;

  public java.util.Calendar getPublishedDeliveryTime() {
    return this.publishedDeliveryTime;
  }

  public void setPublishedDeliveryTime(java.util.Calendar publishedDeliveryTime) {
    this.publishedDeliveryTime = publishedDeliveryTime;
  }

  private java.util.Calendar commitDate;

  public java.util.Calendar getCommitDate() {
    return this.commitDate;
  }

  public void setCommitDate(java.util.Calendar commitDate) {
    this.commitDate = commitDate;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DayOfWeekType commitDay;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DayOfWeekType getCommitDay() {
    return this.commitDay;
  }

  public void setCommitDay(be.e1.bssv.J564200.com.beone.fedex.beshipments.DayOfWeekType commitDay) {
    this.commitDay = commitDay;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType transitTime;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType getTransitTime() {
    return this.transitTime;
  }

  public void setTransitTime(be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType transitTime) {
    this.transitTime = transitTime;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType maximumTransitTime;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType getMaximumTransitTime() {
    return this.maximumTransitTime;
  }

  public void setMaximumTransitTime(be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType maximumTransitTime) {
    this.maximumTransitTime = maximumTransitTime;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType customTransitTime;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType getCustomTransitTime() {
    return this.customTransitTime;
  }

  public void setCustomTransitTime(be.e1.bssv.J564200.com.beone.fedex.beshipments.TransitTimeType customTransitTime) {
    this.customTransitTime = customTransitTime;
  }

  private java.lang.Boolean ineligibleForMoneyBackGuarantee;

  public java.lang.Boolean getIneligibleForMoneyBackGuarantee() {
    return this.ineligibleForMoneyBackGuarantee;
  }

  public void setIneligibleForMoneyBackGuarantee(java.lang.Boolean ineligibleForMoneyBackGuarantee) {
    this.ineligibleForMoneyBackGuarantee = ineligibleForMoneyBackGuarantee;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.GroundDeliveryEligibilityType[] deliveryEligibilities;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.GroundDeliveryEligibilityType[] getDeliveryEligibilities() {
    return this.deliveryEligibilities;
  }

  public void setDeliveryEligibilities(be.e1.bssv.J564200.com.beone.fedex.beshipments.GroundDeliveryEligibilityType[] deliveryEligibilities) {
    this.deliveryEligibilities = deliveryEligibilities;
  }

  private java.lang.String astraPlannedServiceLevel;

  public java.lang.String getAstraPlannedServiceLevel() {
    return this.astraPlannedServiceLevel;
  }

  public void setAstraPlannedServiceLevel(java.lang.String astraPlannedServiceLevel) {
    this.astraPlannedServiceLevel = astraPlannedServiceLevel;
  }

  private java.lang.String astraDescription;

  public java.lang.String getAstraDescription() {
    return this.astraDescription;
  }

  public void setAstraDescription(java.lang.String astraDescription) {
    this.astraDescription = astraDescription;
  }

  private java.lang.String postalCode;

  public java.lang.String getPostalCode() {
    return this.postalCode;
  }

  public void setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
  }

  private java.lang.String stateOrProvinceCode;

  public java.lang.String getStateOrProvinceCode() {
    return this.stateOrProvinceCode;
  }

  public void setStateOrProvinceCode(java.lang.String stateOrProvinceCode) {
    this.stateOrProvinceCode = stateOrProvinceCode;
  }

  private java.lang.String countryCode;

  public java.lang.String getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
  }

  private java.lang.String airportId;

  public java.lang.String getAirportId() {
    return this.airportId;
  }

  public void setAirportId(java.lang.String airportId) {
    this.airportId = airportId;
  }

  private java.lang.String serviceCode;

  public java.lang.String getServiceCode() {
    return this.serviceCode;
  }

  public void setServiceCode(java.lang.String serviceCode) {
    this.serviceCode = serviceCode;
  }

  private java.lang.String scac;

  public java.lang.String getScac() {
    return this.scac;
  }

  public void setScac(java.lang.String scac) {
    this.scac = scac;
  }

}
