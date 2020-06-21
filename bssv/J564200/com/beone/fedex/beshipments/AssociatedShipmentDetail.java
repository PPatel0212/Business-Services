/**
 * Generated from schema type t=AssociatedShipmentDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class AssociatedShipmentDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.AssociatedShipmentType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.AssociatedShipmentType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.AssociatedShipmentType type) {
    this.type = type;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Party sender;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Party getSender() {
    return this.sender;
  }

  public void setSender(be.e1.bssv.J564200.com.beone.fedex.beshipments.Party sender) {
    this.sender = sender;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Party recipient;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Party getRecipient() {
    return this.recipient;
  }

  public void setRecipient(be.e1.bssv.J564200.com.beone.fedex.beshipments.Party recipient) {
    this.recipient = recipient;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ServiceType serviceType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ServiceType getServiceType() {
    return this.serviceType;
  }

  public void setServiceType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PackagingType packagingType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PackagingType getPackagingType() {
    return this.packagingType;
  }

  public void setPackagingType(be.e1.bssv.J564200.com.beone.fedex.beshipments.PackagingType packagingType) {
    this.packagingType = packagingType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId trackingId;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId getTrackingId() {
    return this.trackingId;
  }

  public void setTrackingId(be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId trackingId) {
    this.trackingId = trackingId;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] customerReferences;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] getCustomerReferences() {
    return this.customerReferences;
  }

  public void setCustomerReferences(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference[] customerReferences) {
    this.customerReferences = customerReferences;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentOperationalDetail shipmentOperationalDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentOperationalDetail getShipmentOperationalDetail() {
    return this.shipmentOperationalDetail;
  }

  public void setShipmentOperationalDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentOperationalDetail shipmentOperationalDetail) {
    this.shipmentOperationalDetail = shipmentOperationalDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageOperationalDetail packageOperationalDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageOperationalDetail getPackageOperationalDetail() {
    return this.packageOperationalDetail;
  }

  public void setPackageOperationalDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageOperationalDetail packageOperationalDetail) {
    this.packageOperationalDetail = packageOperationalDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument label;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument getLabel() {
    return this.label;
  }

  public void setLabel(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument label) {
    this.label = label;
  }

}
