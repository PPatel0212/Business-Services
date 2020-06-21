package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.AssociatedShipmentDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntAssociatedShipmentDetail extends ValueObject implements Serializable
{
  private IntAssociatedShipmentType type = null;
  private IntParty sender = null;
  private IntParty recipient = null;
  private IntServiceType serviceType = null;
  private IntPackagingType packagingType = null;
  private IntTrackingId trackingId = null;
  private IntCustomerReference[] customerReferences = null;
  private IntShipmentOperationalDetail shipmentOperationalDetail = null;
  private IntPackageOperationalDetail packageOperationalDetail = null;
  private IntShippingDocument label = null;

  public void setType(IntAssociatedShipmentType type)
  {
    this.type = type;
  }

  public IntAssociatedShipmentType getType()
  {
    return type;
  }

  public void setSender(IntParty sender)
  {
    this.sender = sender;
  }

  public IntParty getSender()
  {
    return sender;
  }

  public void setRecipient(IntParty recipient)
  {
    this.recipient = recipient;
  }

  public IntParty getRecipient()
  {
    return recipient;
  }

  public void setServiceType(IntServiceType serviceType)
  {
    this.serviceType = serviceType;
  }

  public IntServiceType getServiceType()
  {
    return serviceType;
  }

  public void setPackagingType(IntPackagingType packagingType)
  {
    this.packagingType = packagingType;
  }

  public IntPackagingType getPackagingType()
  {
    return packagingType;
  }

  public void setTrackingId(IntTrackingId trackingId)
  {
    this.trackingId = trackingId;
  }

  public IntTrackingId getTrackingId()
  {
    return trackingId;
  }

  public void setCustomerReferences(IntCustomerReference[] customerReferences)
  {
    this.customerReferences = customerReferences;
  }

  public IntCustomerReference[] getCustomerReferences()
  {
    return customerReferences;
  }

  public void setShipmentOperationalDetail(IntShipmentOperationalDetail shipmentOperationalDetail)
  {
    this.shipmentOperationalDetail = shipmentOperationalDetail;
  }

  public IntShipmentOperationalDetail getShipmentOperationalDetail()
  {
    return shipmentOperationalDetail;
  }

  public void setPackageOperationalDetail(IntPackageOperationalDetail packageOperationalDetail)
  {
    this.packageOperationalDetail = packageOperationalDetail;
  }

  public IntPackageOperationalDetail getPackageOperationalDetail()
  {
    return packageOperationalDetail;
  }

  public void setLabel(IntShippingDocument label)
  {
    this.label = label;
  }

  public IntShippingDocument getLabel()
  {
    return label;
  }
  
  public static IntAssociatedShipmentDetail createFromAssociatedShipmentDetail(AssociatedShipmentDetail inData)
  {
    IntAssociatedShipmentDetail asd = null;
    if(inData != null)
    {
      asd = new IntAssociatedShipmentDetail();
      
      asd.label = IntShippingDocument.createFromShippingDocument(inData.getLabel());
      asd.packageOperationalDetail = IntPackageOperationalDetail.createFromPackageOperationalDetail(inData.getPackageOperationalDetail());
      asd.packagingType = IntPackagingType.createFromPackagingType(inData.getPackagingType());
      asd.recipient = IntParty.createFromParty(inData.getRecipient());
      asd.sender = IntParty.createFromParty(inData.getSender());
      asd.serviceType = IntServiceType.createFromServiceType(inData.getServiceType());
      asd.shipmentOperationalDetail = IntShipmentOperationalDetail.createFromShipmentOperationalDetail(inData.getShipmentOperationalDetail());
      asd.trackingId = IntTrackingId.createFromTrackingId(inData.getTrackingId());
      asd.type = IntAssociatedShipmentType.createFromAssociatedShipmentType(inData.getType());
    }
    return asd;
  }
}
