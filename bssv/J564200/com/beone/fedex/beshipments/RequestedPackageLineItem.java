/**
 * Generated from schema type t=RequestedPackageLineItem@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class RequestedPackageLineItem implements java.io.Serializable {

  private java.math.BigInteger sequenceNumber;

  public java.math.BigInteger getSequenceNumber() {
    return this.sequenceNumber;
  }

  public void setSequenceNumber(java.math.BigInteger sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  private java.math.BigInteger groupNumber;

  public java.math.BigInteger getGroupNumber() {
    return this.groupNumber;
  }

  public void setGroupNumber(java.math.BigInteger groupNumber) {
    this.groupNumber = groupNumber;
  }

  private java.math.BigInteger groupPackageCount;

  public java.math.BigInteger getGroupPackageCount() {
    return this.groupPackageCount;
  }

  public void setGroupPackageCount(java.math.BigInteger groupPackageCount) {
    this.groupPackageCount = groupPackageCount;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail variableHandlingChargeDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
    return this.variableHandlingChargeDetail;
  }

  public void setVariableHandlingChargeDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail variableHandlingChargeDetail) {
    this.variableHandlingChargeDetail = variableHandlingChargeDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money insuredValue;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getInsuredValue() {
    return this.insuredValue;
  }

  public void setInsuredValue(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money insuredValue) {
    this.insuredValue = insuredValue;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight weight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getWeight() {
    return this.weight;
  }

  public void setWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight weight) {
    this.weight = weight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions dimensions;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions getDimensions() {
    return this.dimensions;
  }

  public void setDimensions(be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalPackagingType physicalPackaging;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalPackagingType getPhysicalPackaging() {
    return this.physicalPackaging;
  }

  public void setPhysicalPackaging(be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalPackagingType physicalPackaging) {
    this.physicalPackaging = physicalPackaging;
  }

  private java.lang.String itemDescription;

  public java.lang.String getItemDescription() {
    return this.itemDescription;
  }

  public void setItemDescription(java.lang.String itemDescription) {
    this.itemDescription = itemDescription;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] customerReferences;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] getCustomerReferences() {
    return this.customerReferences;
  }

  public void setCustomerReferences(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] customerReferences) {
    this.customerReferences = customerReferences;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServicesRequested specialServicesRequested;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServicesRequested getSpecialServicesRequested() {
    return this.specialServicesRequested;
  }

  public void setSpecialServicesRequested(be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServicesRequested specialServicesRequested) {
    this.specialServicesRequested = specialServicesRequested;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ContentRecord[] contentRecords;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ContentRecord[] getContentRecords() {
    return this.contentRecords;
  }

  public void setContentRecords(be.e1.bssv.J564200.com.beone.fedex.beshipments.ContentRecord[] contentRecords) {
    this.contentRecords = contentRecords;
  }

}
