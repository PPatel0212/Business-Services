/**
 * Generated from schema type t=HazardousCommodityDescription@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class HazardousCommodityDescription implements java.io.Serializable {

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

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingDetail packingDetails;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingDetail getPackingDetails() {
    return this.packingDetails;
  }

  public void setPackingDetails(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingDetail packingDetails) {
    this.packingDetails = packingDetails;
  }

  private java.lang.Boolean reportableQuantity;

  public java.lang.Boolean getReportableQuantity() {
    return this.reportableQuantity;
  }

  public void setReportableQuantity(java.lang.Boolean reportableQuantity) {
    this.reportableQuantity = reportableQuantity;
  }

  private java.lang.String properShippingName;

  public java.lang.String getProperShippingName() {
    return this.properShippingName;
  }

  public void setProperShippingName(java.lang.String properShippingName) {
    this.properShippingName = properShippingName;
  }

  private java.lang.String technicalName;

  public java.lang.String getTechnicalName() {
    return this.technicalName;
  }

  public void setTechnicalName(java.lang.String technicalName) {
    this.technicalName = technicalName;
  }

  private java.math.BigDecimal percentage;

  public java.math.BigDecimal getPercentage() {
    return this.percentage;
  }

  public void setPercentage(java.math.BigDecimal percentage) {
    this.percentage = percentage;
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

  private java.lang.String labelText;

  public java.lang.String getLabelText() {
    return this.labelText;
  }

  public void setLabelText(java.lang.String labelText) {
    this.labelText = labelText;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescriptionProcessingOptionType[] processingOptions;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescriptionProcessingOptionType[] getProcessingOptions() {
    return this.processingOptions;
  }

  public void setProcessingOptions(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescriptionProcessingOptionType[] processingOptions) {
    this.processingOptions = processingOptions;
  }

  private java.lang.String authorization;

  public java.lang.String getAuthorization() {
    return this.authorization;
  }

  public void setAuthorization(java.lang.String authorization) {
    this.authorization = authorization;
  }

}
