/**
 * Generated from schema type t=ValidatedHazardousCommodityDescription@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ValidatedHazardousCommodityDescription implements java.io.Serializable {

  private java.lang.String id;

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  private java.math.BigInteger sequenceNumber;

  public java.math.BigInteger getSequenceNumber() {
    return this.sequenceNumber;
  }

  public void setSequenceNumber(java.math.BigInteger sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingGroupType packingGroup;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingGroupType getPackingGroup() {
    return this.packingGroup;
  }

  public void setPackingGroup(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingGroupType packingGroup) {
    this.packingGroup = packingGroup;
  }

  private java.lang.String packingInstructions;

  public java.lang.String getPackingInstructions() {
    return this.packingInstructions;
  }

  public void setPackingInstructions(java.lang.String packingInstructions) {
    this.packingInstructions = packingInstructions;
  }

  private java.lang.String properShippingName;

  public java.lang.String getProperShippingName() {
    return this.properShippingName;
  }

  public void setProperShippingName(java.lang.String properShippingName) {
    this.properShippingName = properShippingName;
  }

  private java.lang.String properShippingNameAndDescription;

  public java.lang.String getProperShippingNameAndDescription() {
    return this.properShippingNameAndDescription;
  }

  public void setProperShippingNameAndDescription(java.lang.String properShippingNameAndDescription) {
    this.properShippingNameAndDescription = properShippingNameAndDescription;
  }

  private java.lang.String technicalName;

  public java.lang.String getTechnicalName() {
    return this.technicalName;
  }

  public void setTechnicalName(java.lang.String technicalName) {
    this.technicalName = technicalName;
  }

  private java.lang.String hazardClass;

  public java.lang.String getHazardClass() {
    return this.hazardClass;
  }

  public void setHazardClass(java.lang.String hazardClass) {
    this.hazardClass = hazardClass;
  }

  private java.lang.String[] subsidiaryClasses;

  public java.lang.String[] getSubsidiaryClasses() {
    return this.subsidiaryClasses;
  }

  public void setSubsidiaryClasses(java.lang.String[] subsidiaryClasses) {
    this.subsidiaryClasses = subsidiaryClasses;
  }

  private java.lang.String symbols;

  public java.lang.String getSymbols() {
    return this.symbols;
  }

  public void setSymbols(java.lang.String symbols) {
    this.symbols = symbols;
  }

  private java.lang.String tunnelRestrictionCode;

  public java.lang.String getTunnelRestrictionCode() {
    return this.tunnelRestrictionCode;
  }

  public void setTunnelRestrictionCode(java.lang.String tunnelRestrictionCode) {
    this.tunnelRestrictionCode = tunnelRestrictionCode;
  }

  private java.lang.String specialProvisions;

  public java.lang.String getSpecialProvisions() {
    return this.specialProvisions;
  }

  public void setSpecialProvisions(java.lang.String specialProvisions) {
    this.specialProvisions = specialProvisions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityAttributeType[] attributes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityAttributeType[] getAttributes() {
    return this.attributes;
  }

  public void setAttributes(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityAttributeType[] attributes) {
    this.attributes = attributes;
  }

  private java.lang.String authorization;

  public java.lang.String getAuthorization() {
    return this.authorization;
  }

  public void setAuthorization(java.lang.String authorization) {
    this.authorization = authorization;
  }

  private java.lang.String labelText;

  public java.lang.String getLabelText() {
    return this.labelText;
  }

  public void setLabelText(java.lang.String labelText) {
    this.labelText = labelText;
  }

}
