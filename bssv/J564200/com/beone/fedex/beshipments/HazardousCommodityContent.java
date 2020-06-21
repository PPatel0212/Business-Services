/**
 * Generated from schema type t=HazardousCommodityContent@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class HazardousCommodityContent implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescription description;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescription getDescription() {
    return this.description;
  }

  public void setDescription(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescription description) {
    this.description = description;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail quantity;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail getQuantity() {
    return this.quantity;
  }

  public void setQuantity(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail quantity) {
    this.quantity = quantity;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityInnerReceptacleDetail[] innerReceptacles;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityInnerReceptacleDetail[] getInnerReceptacles() {
    return this.innerReceptacles;
  }

  public void setInnerReceptacles(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityInnerReceptacleDetail[] innerReceptacles) {
    this.innerReceptacles = innerReceptacles;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionDetail options;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionDetail getOptions() {
    return this.options;
  }

  public void setOptions(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionDetail options) {
    this.options = options;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RadionuclideDetail radionuclideDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RadionuclideDetail getRadionuclideDetail() {
    return this.radionuclideDetail;
  }

  public void setRadionuclideDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.RadionuclideDetail radionuclideDetail) {
    this.radionuclideDetail = radionuclideDetail;
  }

}
