/**
 * Generated from schema type t=CompletedHazardousPackageDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CompletedHazardousPackageDetail implements java.io.Serializable {

  private java.lang.String referenceId;

  public java.lang.String getReferenceId() {
    return this.referenceId;
  }

  public void setReferenceId(java.lang.String referenceId) {
    this.referenceId = referenceId;
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

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityRegulationType regulation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityRegulationType getRegulation() {
    return this.regulation;
  }

  public void setRegulation(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityRegulationType regulation) {
    this.regulation = regulation;
  }

  private java.math.BigDecimal radioactiveTransportIndex;

  public java.math.BigDecimal getRadioactiveTransportIndex() {
    return this.radioactiveTransportIndex;
  }

  public void setRadioactiveTransportIndex(java.math.BigDecimal radioactiveTransportIndex) {
    this.radioactiveTransportIndex = radioactiveTransportIndex;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactiveLabelType labelType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactiveLabelType getLabelType() {
    return this.labelType;
  }

  public void setLabelType(be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactiveLabelType labelType) {
    this.labelType = labelType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousContainer[] containers;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousContainer[] getContainers() {
    return this.containers;
  }

  public void setContainers(be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousContainer[] containers) {
    this.containers = containers;
  }

}
