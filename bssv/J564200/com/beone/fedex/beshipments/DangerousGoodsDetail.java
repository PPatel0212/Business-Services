/**
 * Generated from schema type t=DangerousGoodsDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class DangerousGoodsDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityRegulationType regulation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityRegulationType getRegulation() {
    return this.regulation;
  }

  public void setRegulation(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityRegulationType regulation) {
    this.regulation = regulation;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsAccessibilityType accessibility;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsAccessibilityType getAccessibility() {
    return this.accessibility;
  }

  public void setAccessibility(be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsAccessibilityType accessibility) {
    this.accessibility = accessibility;
  }

  private java.lang.Boolean cargoAircraftOnly;

  public java.lang.Boolean getCargoAircraftOnly() {
    return this.cargoAircraftOnly;
  }

  public void setCargoAircraftOnly(java.lang.Boolean cargoAircraftOnly) {
    this.cargoAircraftOnly = cargoAircraftOnly;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionType[] options;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionType[] getOptions() {
    return this.options;
  }

  public void setOptions(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionType[] options) {
    this.options = options;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsPackingOptionType packingOption;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsPackingOptionType getPackingOption() {
    return this.packingOption;
  }

  public void setPackingOption(be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsPackingOptionType packingOption) {
    this.packingOption = packingOption;
  }

  private java.lang.String referenceId;

  public java.lang.String getReferenceId() {
    return this.referenceId;
  }

  public void setReferenceId(java.lang.String referenceId) {
    this.referenceId = referenceId;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsContainer[] containers;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsContainer[] getContainers() {
    return this.containers;
  }

  public void setContainers(be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsContainer[] containers) {
    this.containers = containers;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackagingDetail packaging;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackagingDetail getPackaging() {
    return this.packaging;
  }

  public void setPackaging(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackagingDetail packaging) {
    this.packaging = packaging;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsSignatory signatory;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsSignatory getSignatory() {
    return this.signatory;
  }

  public void setSignatory(be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsSignatory signatory) {
    this.signatory = signatory;
  }

  private java.lang.String emergencyContactNumber;

  public java.lang.String getEmergencyContactNumber() {
    return this.emergencyContactNumber;
  }

  public void setEmergencyContactNumber(java.lang.String emergencyContactNumber) {
    this.emergencyContactNumber = emergencyContactNumber;
  }

  private java.lang.String offeror;

  public java.lang.String getOfferor() {
    return this.offeror;
  }

  public void setOfferor(java.lang.String offeror) {
    this.offeror = offeror;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact infectiousSubstanceResponsibleContact;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact getInfectiousSubstanceResponsibleContact() {
    return this.infectiousSubstanceResponsibleContact;
  }

  public void setInfectiousSubstanceResponsibleContact(be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact infectiousSubstanceResponsibleContact) {
    this.infectiousSubstanceResponsibleContact = infectiousSubstanceResponsibleContact;
  }

  private java.lang.String additionalHandling;

  public java.lang.String getAdditionalHandling() {
    return this.additionalHandling;
  }

  public void setAdditionalHandling(java.lang.String additionalHandling) {
    this.additionalHandling = additionalHandling;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactivityDetail radioactivityDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactivityDetail getRadioactivityDetail() {
    return this.radioactivityDetail;
  }

  public void setRadioactivityDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactivityDetail radioactivityDetail) {
    this.radioactivityDetail = radioactivityDetail;
  }

}
