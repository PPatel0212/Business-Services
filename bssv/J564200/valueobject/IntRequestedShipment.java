package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsClearanceDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DropoffType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtRequestType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ExpressFreightDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelSpecification;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackagingType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Payment;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PickupDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateRequestType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedPackageLineItem;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShipment;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ServiceType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentConfigurationData;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServicesRequested;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostShipmentDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight;

import java.io.Serializable;

import java.math.BigInteger;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntRequestedShipment extends ValueObject implements Serializable
{
  private Date shipDateStamp = null;
  private MathNumeric shipTimeStamp = null;
  private IntDropoffType dropOffType = null;
  private IntServiceType serviceType = null;
  private IntPackagingType packagingType = null;
  private IntWeight totalWeight = null;
  private IntMoney totalInsuredValue = null;
  private String preferredCurrency = null;
  private IntParty shipper = null;
  private IntParty recipient = null;
  private String recipientLocationNumber = null;
  private IntContactAndAddress origin = null;
  private IntPayment shippingChargesPayment = null;
  private IntShipmentSpecialServicesRequested specialServicesRequested = null;
  private IntExpressFreightDetail expressFreightDetail = null;
  private IntFreightShipmentDetail freightShipmentDetail = null;
  private String deliveryInstructions = null;
  private IntVariableHandlingChargeDetail variableHandlingChargeDetail = null;
  private IntCustomsClearanceDetail customsClearanceDetail = null;
  private IntPickupDetail pickupDetail = null;
  private IntSmartPostShipmentDetail smartPostDetail = null;
  private String blockInsightVisibility = null;
  private IntLabelSpecification labelSpecification = null;
  private IntRateRequestType[] rateRequestTypes = null;
  private IntEdtRequestType edtRequestType = null;
  private IntTrackingId masterTrackingId = null;
  private Integer packageCount = null;
  private IntShipmentConfigurationData configurationData = null;
  private IntRequestedPackageLineItem[] requestedPackageLineItems = null;

  public void setShipDateStamp(Date shipDateStamp)
  {
    this.shipDateStamp = shipDateStamp;
  }

  public Date getShipDateStamp()
  {
    return shipDateStamp;
  }

  public void setShipTimeStamp(MathNumeric shipTimeStamp)
  {
    this.shipTimeStamp = shipTimeStamp;
  }

  public MathNumeric getShipTimeStamp()
  {
    return shipTimeStamp;
  }

  public void setDropOffType(IntDropoffType dropOffType)
  {
    this.dropOffType = dropOffType;
  }

  public IntDropoffType getDropOffType()
  {
    return dropOffType;
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

  public void setTotalWeight(IntWeight totalWeight)
  {
    this.totalWeight = totalWeight;
  }

  public IntWeight getTotalWeight()
  {
    return totalWeight;
  }

  public void setTotalInsuredValue(IntMoney totalInsuredValue)
  {
    this.totalInsuredValue = totalInsuredValue;
  }

  public IntMoney getTotalInsuredValue()
  {
    return totalInsuredValue;
  }

  public void setPreferredCurrency(String preferredCurrency)
  {
    this.preferredCurrency = preferredCurrency;
  }

  public String getPreferredCurrency()
  {
    return preferredCurrency;
  }

  public void setShipper(IntParty shipper)
  {
    this.shipper = shipper;
  }

  public IntParty getShipper()
  {
    return shipper;
  }

  public void setRecipient(IntParty recipient)
  {
    this.recipient = recipient;
  }

  public IntParty getRecipient()
  {
    return recipient;
  }

  public void setRecipientLocationNumber(String recipientLocationNumber)
  {
    this.recipientLocationNumber = recipientLocationNumber;
  }

  public String getRecipientLocationNumber()
  {
    return recipientLocationNumber;
  }

  public void setOrigin(IntContactAndAddress origin)
  {
    this.origin = origin;
  }

  public IntContactAndAddress getOrigin()
  {
    return origin;
  }

  public void setShippingChargesPayment(IntPayment shippingChargesPayment)
  {
    this.shippingChargesPayment = shippingChargesPayment;
  }

  public IntPayment getShippingChargesPayment()
  {
    return shippingChargesPayment;
  }

  public void setSpecialServicesRequested(IntShipmentSpecialServicesRequested specialServicesRequested)
  {
    this.specialServicesRequested = specialServicesRequested;
  }

  public IntShipmentSpecialServicesRequested getSpecialServicesRequested()
  {
    return specialServicesRequested;
  }

  public void setExpressFreightDetail(IntExpressFreightDetail expressFreightDetail)
  {
    this.expressFreightDetail = expressFreightDetail;
  }

  public IntExpressFreightDetail getExpressFreightDetail()
  {
    return expressFreightDetail;
  }

  public void setFreightShipmentDetail(IntFreightShipmentDetail freightShipmentDetail)
  {
    this.freightShipmentDetail = freightShipmentDetail;
  }

  public IntFreightShipmentDetail getFreightShipmentDetail()
  {
    return freightShipmentDetail;
  }

  public void setDeliveryInstructions(String deliveryInstructions)
  {
    this.deliveryInstructions = deliveryInstructions;
  }

  public String getDeliveryInstructions()
  {
    return deliveryInstructions;
  }

  public void setVariableHandlingChargeDetail(IntVariableHandlingChargeDetail variableHandlingChargeDetail)
  {
    this.variableHandlingChargeDetail = variableHandlingChargeDetail;
  }

  public IntVariableHandlingChargeDetail getVariableHandlingChargeDetail()
  {
    return variableHandlingChargeDetail;
  }

  public void setCustomsClearanceDetail(IntCustomsClearanceDetail customsClearanceDetail)
  {
    this.customsClearanceDetail = customsClearanceDetail;
  }

  public IntCustomsClearanceDetail getCustomsClearanceDetail()
  {
    return customsClearanceDetail;
  }

  public void setPickupDetail(IntPickupDetail pickupDetail)
  {
    this.pickupDetail = pickupDetail;
  }

  public IntPickupDetail getPickupDetail()
  {
    return pickupDetail;
  }

  public void setSmartPostDetail(IntSmartPostShipmentDetail smartPostDetail)
  {
    this.smartPostDetail = smartPostDetail;
  }

  public IntSmartPostShipmentDetail getSmartPostDetail()
  {
    return smartPostDetail;
  }

  public void setBlockInsightVisibility(String blockInsightVisibility)
  {
    this.blockInsightVisibility = blockInsightVisibility;
  }

  public String getBlockInsightVisibility()
  {
    return blockInsightVisibility;
  }

  public void setLabelSpecification(IntLabelSpecification labelSpecification)
  {
    this.labelSpecification = labelSpecification;
  }

  public IntLabelSpecification getLabelSpecification()
  {
    return labelSpecification;
  }

  public void setRateRequestTypes(IntRateRequestType[] rateRequestTypes)
  {
    this.rateRequestTypes = rateRequestTypes;
  }

  public IntRateRequestType[] getRateRequestTypes()
  {
    return rateRequestTypes;
  }

  public void setEdtRequestType(IntEdtRequestType edtRequestType)
  {
    this.edtRequestType = edtRequestType;
  }

  public IntEdtRequestType getEdtRequestType()
  {
    return edtRequestType;
  }

  public void setMasterTrackingId(IntTrackingId masterTrackingId)
  {
    this.masterTrackingId = masterTrackingId;
  }

  public IntTrackingId getMasterTrackingId()
  {
    return masterTrackingId;
  }

  public void setPackageCount(Integer packageCount)
  {
    this.packageCount = packageCount;
  }

  public Integer getPackageCount()
  {
    return packageCount;
  }

  public void setConfigurationData(IntShipmentConfigurationData configurationData)
  {
    this.configurationData = configurationData;
  }

  public IntShipmentConfigurationData getConfigurationData()
  {
    return configurationData;
  }

  public void setRequestedPackageLineItems(IntRequestedPackageLineItem[] requestedPackageLineItems)
  {
    this.requestedPackageLineItems = requestedPackageLineItems;
  }

  public IntRequestedPackageLineItem[] getRequestedPackageLineItems()
  {
    return requestedPackageLineItems;
  }
  
  public Calendar convertMathNumericToTime(MathNumeric time)
  {
    Calendar cal = Calendar.getInstance();
    if(time != null)
    {
      int iTime = time.intValue();
      int hour = (iTime/10000)%24;
      int minute = ((iTime - (hour * 10000))/100)%60;
      int second = (iTime - ((hour * 10000)+(minute * 100)));
      cal.set(0, 0, 0, hour, minute, second);
    }
    return cal;
  }
  
  public void copyToRequestedShipment(RequestedShipment outData)
  {
    if(outData != null)
    {
      outData.setBlockInsightVisibility(false);
      if(this.blockInsightVisibility != null)
      {
        if(this.blockInsightVisibility.compareToIgnoreCase("Y") == 0)
          outData.setBlockInsightVisibility(true);
      }
      
      if(this.configurationData != null)
      {
        ShipmentConfigurationData scd = new ShipmentConfigurationData();
        this.configurationData.copyToShipmentConfigurationData(scd);
        outData.setConfigurationData(scd);
      }
      
      if(this.customsClearanceDetail != null)
      {
        CustomsClearanceDetail ccd = new CustomsClearanceDetail();
        this.customsClearanceDetail.copyToCustomsClearanceDetail(ccd);
        outData.setCustomsClearanceDetail(ccd);
      }
      
      outData.setDeliveryInstructions(this.deliveryInstructions);
      outData.setPreferredCurrency(this.preferredCurrency);
      outData.setRecipientLocationNumber(this.recipientLocationNumber);
      
      if(this.dropOffType != null)
      {
        DropoffType dropType = DropoffType.fromString(this.dropOffType.getValue());
        outData.setDropoffType(dropType);
      }
      
      if(this.edtRequestType != null)
      {
        EdtRequestType edtType = EdtRequestType.fromString(this.edtRequestType.getValue());
        outData.setEdtRequestType(edtType);
      }
      
      if(this.expressFreightDetail != null)
      {
        ExpressFreightDetail efd = new ExpressFreightDetail();
        this.expressFreightDetail.copyToExpressFreightDetail(efd);
        outData.setExpressFreightDetail(efd);
      }
      
      if(this.freightShipmentDetail != null)
      {
        FreightShipmentDetail fsd = new FreightShipmentDetail();
        this.freightShipmentDetail.copyToFreightShipmentDetail(fsd);
        outData.setFreightShipmentDetail(fsd);
      }
      
      if(this.labelSpecification != null)
      {
        LabelSpecification labelSpec = new LabelSpecification();
        this.labelSpecification.copyToLabelSpecification(labelSpec);
        outData.setLabelSpecification(labelSpec);
      }
      
      if(this.masterTrackingId != null)
      {
        TrackingId tid = new TrackingId();
        this.masterTrackingId.copyToTrackingId(tid);
        outData.setMasterTrackingId(tid);
      }
      
      if(this.origin != null)
      {
        ContactAndAddress cta = new ContactAndAddress();
        this.origin.copyToContactAndAddress(cta);
        outData.setOrigin(cta);
      }
      
      if(this.packageCount != null)
      {
        outData.setPackageCount(BigInteger.valueOf(this.packageCount.intValue()));
      }
      
      if(this.packagingType != null)
      {
        PackagingType pkgType = PackagingType.fromString(this.packagingType.getValue());
        outData.setPackagingType(pkgType);
      }
      
      if(this.pickupDetail != null)
      {
        PickupDetail pd = new PickupDetail();
        this.pickupDetail.copyToPickupDetail(pd);
        outData.setPickupDetail(pd);
      }
      
      if(this.rateRequestTypes != null)
      {
        RateRequestType[] rrtArr = new RateRequestType[this.rateRequestTypes.length];
        for(int x=0; x<this.rateRequestTypes.length; x++)
        {
          rrtArr[x] = RateRequestType.fromString(this.rateRequestTypes[x].getValue());
        }
        outData.setRateRequestTypes(rrtArr);
      }
      
      if(this.recipient != null)
      {
        Party pty = new Party();
        this.recipient.copyToParty(pty);
        outData.setRecipient(pty);
      }
      
      if(this.requestedPackageLineItems != null)
      {
        RequestedPackageLineItem[] lineItemArr = new RequestedPackageLineItem[this.requestedPackageLineItems.length];
        for(int x=0; x<this.requestedPackageLineItems.length; x++)
        {
          lineItemArr[x] = new RequestedPackageLineItem();
          this.requestedPackageLineItems[x].copyToRequestedPackageLineItem(lineItemArr[x]);
        }
        outData.setRequestedPackageLineItems(lineItemArr);
      }
      
      if(this.serviceType != null)
      {
        ServiceType stype = ServiceType.fromString(this.serviceType.getValue());
        outData.setServiceType(stype);
      }
      
      Calendar tsCal = null;
      if(this.shipTimeStamp != null)
      {
        tsCal = convertMathNumericToTime(this.shipTimeStamp);
      }
      if(this.shipDateStamp != null)
      {
        if(tsCal == null)
          tsCal = Calendar.getInstance();
        tsCal.setTime(this.shipDateStamp);
      }
      if(tsCal != null)
        outData.setShipTimestamp(tsCal);
      
      if(this.shipper != null)
      {
        Party pty = new Party();
        this.shipper.copyToParty(pty);
        outData.setShipper(pty);
      }
      
      if(this.shippingChargesPayment != null)
      {
        Payment pmt = new Payment();
        this.shippingChargesPayment.copyToPayment(pmt);
        outData.setShippingChargesPayment(pmt);
      }
      
      if(this.smartPostDetail != null)
      {
        SmartPostShipmentDetail spsd = new SmartPostShipmentDetail();
        this.smartPostDetail.copyToSmartPostShipmentDetail(spsd);
        outData.setSmartPostDetail(spsd);
      }
      
      if(this.specialServicesRequested != null)
      {
        ShipmentSpecialServicesRequested sssr = new ShipmentSpecialServicesRequested();
        this.specialServicesRequested.copyToShipmentSpecialServicesRequested(sssr);
        outData.setSpecialServicesRequested(sssr);
      }
      
      if(this.totalInsuredValue != null)
      {
        Money mny = new Money();
        this.totalInsuredValue.copyToMoney(mny);
        outData.setTotalInsuredValue(mny);
      }
      
      if(this.totalWeight != null)
      {
        Weight wgt = new Weight();
        this.totalWeight.copyToWeight(wgt);
        outData.setTotalWeight(wgt);
      }
      
      if(this.variableHandlingChargeDetail != null)
      {
        VariableHandlingChargeDetail vhcd = new VariableHandlingChargeDetail();
        this.variableHandlingChargeDetail.copyToVariableHandlingChargeDetail(vhcd);
        outData.setVariableHandlingChargeDetail(vhcd);
      }
    }
  }
}
