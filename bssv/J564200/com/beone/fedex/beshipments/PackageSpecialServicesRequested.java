/**
 * Generated from schema type t=PackageSpecialServicesRequested@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class PackageSpecialServicesRequested implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServiceType[] specialServiceTypes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServiceType[] getSpecialServiceTypes() {
    return this.specialServiceTypes;
  }

  public void setSpecialServiceTypes(be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServiceType[] specialServiceTypes) {
    this.specialServiceTypes = specialServiceTypes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CodDetail codDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CodDetail getCodDetail() {
    return this.codDetail;
  }

  public void setCodDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.CodDetail codDetail) {
    this.codDetail = codDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsDetail dangerousGoodsDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsDetail getDangerousGoodsDetail() {
    return this.dangerousGoodsDetail;
  }

  public void setDangerousGoodsDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsDetail dangerousGoodsDetail) {
    this.dangerousGoodsDetail = dangerousGoodsDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight dryIceWeight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getDryIceWeight() {
    return this.dryIceWeight;
  }

  public void setDryIceWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight dryIceWeight) {
    this.dryIceWeight = dryIceWeight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionDetail signatureOptionDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionDetail getSignatureOptionDetail() {
    return this.signatureOptionDetail;
  }

  public void setSignatureOptionDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionDetail signatureOptionDetail) {
    this.signatureOptionDetail = signatureOptionDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertDetail priorityAlertDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertDetail getPriorityAlertDetail() {
    return this.priorityAlertDetail;
  }

  public void setPriorityAlertDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertDetail priorityAlertDetail) {
    this.priorityAlertDetail = priorityAlertDetail;
  }

}
