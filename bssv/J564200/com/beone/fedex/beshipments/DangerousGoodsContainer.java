/**
 * Generated from schema type t=DangerousGoodsContainer@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class DangerousGoodsContainer implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousContainerPackingType packingType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousContainerPackingType getPackingType() {
    return this.packingType;
  }

  public void setPackingType(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousContainerPackingType packingType) {
    this.packingType = packingType;
  }

  private java.lang.String containerType;

  public java.lang.String getContainerType() {
    return this.containerType;
  }

  public void setContainerType(java.lang.String containerType) {
    this.containerType = containerType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactiveContainerClassType radioactiveContainerClass;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactiveContainerClassType getRadioactiveContainerClass() {
    return this.radioactiveContainerClass;
  }

  public void setRadioactiveContainerClass(be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactiveContainerClassType radioactiveContainerClass) {
    this.radioactiveContainerClass = radioactiveContainerClass;
  }

  private java.math.BigInteger numberOfContainers;

  public java.math.BigInteger getNumberOfContainers() {
    return this.numberOfContainers;
  }

  public void setNumberOfContainers(java.math.BigInteger numberOfContainers) {
    this.numberOfContainers = numberOfContainers;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityContent[] hazardousCommodities;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityContent[] getHazardousCommodities() {
    return this.hazardousCommodities;
  }

  public void setHazardousCommodities(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityContent[] hazardousCommodities) {
    this.hazardousCommodities = hazardousCommodities;
  }

}
