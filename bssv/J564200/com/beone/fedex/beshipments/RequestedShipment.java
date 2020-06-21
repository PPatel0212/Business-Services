/**
 * Generated from schema type t=RequestedShipment@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class RequestedShipment implements java.io.Serializable {

  private java.util.Calendar shipTimestamp;

  public java.util.Calendar getShipTimestamp() {
    return this.shipTimestamp;
  }

  public void setShipTimestamp(java.util.Calendar shipTimestamp) {
    this.shipTimestamp = shipTimestamp;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DropoffType dropoffType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DropoffType getDropoffType() {
    return this.dropoffType;
  }

  public void setDropoffType(be.e1.bssv.J564200.com.beone.fedex.beshipments.DropoffType dropoffType) {
    this.dropoffType = dropoffType;
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

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight totalWeight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getTotalWeight() {
    return this.totalWeight;
  }

  public void setTotalWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight totalWeight) {
    this.totalWeight = totalWeight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalInsuredValue;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getTotalInsuredValue() {
    return this.totalInsuredValue;
  }

  public void setTotalInsuredValue(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money totalInsuredValue) {
    this.totalInsuredValue = totalInsuredValue;
  }

  private java.lang.String preferredCurrency;

  public java.lang.String getPreferredCurrency() {
    return this.preferredCurrency;
  }

  public void setPreferredCurrency(java.lang.String preferredCurrency) {
    this.preferredCurrency = preferredCurrency;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Party shipper;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Party getShipper() {
    return this.shipper;
  }

  public void setShipper(be.e1.bssv.J564200.com.beone.fedex.beshipments.Party shipper) {
    this.shipper = shipper;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Party recipient;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Party getRecipient() {
    return this.recipient;
  }

  public void setRecipient(be.e1.bssv.J564200.com.beone.fedex.beshipments.Party recipient) {
    this.recipient = recipient;
  }

  private java.lang.String recipientLocationNumber;

  public java.lang.String getRecipientLocationNumber() {
    return this.recipientLocationNumber;
  }

  public void setRecipientLocationNumber(java.lang.String recipientLocationNumber) {
    this.recipientLocationNumber = recipientLocationNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress origin;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress getOrigin() {
    return this.origin;
  }

  public void setOrigin(be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress origin) {
    this.origin = origin;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Payment shippingChargesPayment;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Payment getShippingChargesPayment() {
    return this.shippingChargesPayment;
  }

  public void setShippingChargesPayment(be.e1.bssv.J564200.com.beone.fedex.beshipments.Payment shippingChargesPayment) {
    this.shippingChargesPayment = shippingChargesPayment;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServicesRequested specialServicesRequested;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServicesRequested getSpecialServicesRequested() {
    return this.specialServicesRequested;
  }

  public void setSpecialServicesRequested(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServicesRequested specialServicesRequested) {
    this.specialServicesRequested = specialServicesRequested;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ExpressFreightDetail expressFreightDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ExpressFreightDetail getExpressFreightDetail() {
    return this.expressFreightDetail;
  }

  public void setExpressFreightDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.ExpressFreightDetail expressFreightDetail) {
    this.expressFreightDetail = expressFreightDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentDetail freightShipmentDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentDetail getFreightShipmentDetail() {
    return this.freightShipmentDetail;
  }

  public void setFreightShipmentDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentDetail freightShipmentDetail) {
    this.freightShipmentDetail = freightShipmentDetail;
  }

  private java.lang.String deliveryInstructions;

  public java.lang.String getDeliveryInstructions() {
    return this.deliveryInstructions;
  }

  public void setDeliveryInstructions(java.lang.String deliveryInstructions) {
    this.deliveryInstructions = deliveryInstructions;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail variableHandlingChargeDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
    return this.variableHandlingChargeDetail;
  }

  public void setVariableHandlingChargeDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail variableHandlingChargeDetail) {
    this.variableHandlingChargeDetail = variableHandlingChargeDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsClearanceDetail customsClearanceDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsClearanceDetail getCustomsClearanceDetail() {
    return this.customsClearanceDetail;
  }

  public void setCustomsClearanceDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsClearanceDetail customsClearanceDetail) {
    this.customsClearanceDetail = customsClearanceDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupDetail pickupDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupDetail getPickupDetail() {
    return this.pickupDetail;
  }

  public void setPickupDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupDetail pickupDetail) {
    this.pickupDetail = pickupDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostShipmentDetail smartPostDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostShipmentDetail getSmartPostDetail() {
    return this.smartPostDetail;
  }

  public void setSmartPostDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostShipmentDetail smartPostDetail) {
    this.smartPostDetail = smartPostDetail;
  }

  private java.lang.Boolean blockInsightVisibility;

  public java.lang.Boolean getBlockInsightVisibility() {
    return this.blockInsightVisibility;
  }

  public void setBlockInsightVisibility(java.lang.Boolean blockInsightVisibility) {
    this.blockInsightVisibility = blockInsightVisibility;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelSpecification labelSpecification;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelSpecification getLabelSpecification() {
    return this.labelSpecification;
  }

  public void setLabelSpecification(be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelSpecification labelSpecification) {
    this.labelSpecification = labelSpecification;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentSpecification shippingDocumentSpecification;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentSpecification getShippingDocumentSpecification() {
    return this.shippingDocumentSpecification;
  }

  public void setShippingDocumentSpecification(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentSpecification shippingDocumentSpecification) {
    this.shippingDocumentSpecification = shippingDocumentSpecification;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RateRequestType[] rateRequestTypes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RateRequestType[] getRateRequestTypes() {
    return this.rateRequestTypes;
  }

  public void setRateRequestTypes(be.e1.bssv.J564200.com.beone.fedex.beshipments.RateRequestType[] rateRequestTypes) {
    this.rateRequestTypes = rateRequestTypes;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtRequestType edtRequestType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtRequestType getEdtRequestType() {
    return this.edtRequestType;
  }

  public void setEdtRequestType(be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtRequestType edtRequestType) {
    this.edtRequestType = edtRequestType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId masterTrackingId;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId getMasterTrackingId() {
    return this.masterTrackingId;
  }

  public void setMasterTrackingId(be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId masterTrackingId) {
    this.masterTrackingId = masterTrackingId;
  }

  private java.math.BigInteger packageCount;

  public java.math.BigInteger getPackageCount() {
    return this.packageCount;
  }

  public void setPackageCount(java.math.BigInteger packageCount) {
    this.packageCount = packageCount;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentConfigurationData configurationData;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentConfigurationData getConfigurationData() {
    return this.configurationData;
  }

  public void setConfigurationData(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentConfigurationData configurationData) {
    this.configurationData = configurationData;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedPackageLineItem[] requestedPackageLineItems;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedPackageLineItem[] getRequestedPackageLineItems() {
    return this.requestedPackageLineItems;
  }

  public void setRequestedPackageLineItems(be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedPackageLineItem[] requestedPackageLineItems) {
    this.requestedPackageLineItems = requestedPackageLineItems;
  }

}
