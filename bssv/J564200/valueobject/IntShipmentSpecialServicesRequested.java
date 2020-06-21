package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomDeliveryWindowDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DeliveryOnInvoiceAcceptanceDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailNotificationDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.EtdDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightGuaranteeDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.HoldAtLocationDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.HomeDeliveryPremiumDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalControlledExportDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalTrafficInArmsRegulationsDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PendingShipmentDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnShipmentDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentDryIceDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServiceType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServicesRequested;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShipmentSpecialServicesRequested extends ValueObject implements Serializable
{
  private IntShipmentSpecialServiceType[] specialServiceTypes = null;
  private IntCodDetail codDetail = null;
  private IntDeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail = null;
  private IntHoldAtLocationDetail holdAtLocationDetail = null;
  private IntEMailNotificationDetail emailNotificationDetail = null;
  private IntReturnShipmentDetail returnShipmentDetail = null;
  private IntPendingShipmentDetail pendingShipmentDetail = null;
  private IntInternationalControlledExportDetail internationalControlledExportDetail = null;
  private IntInternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail = null;
  private IntShipmentDryIceDetail shipmentDryIceDetail = null;
  private IntHomeDeliveryPremiumDetail homeDeliveryPremiumDetail = null;
  private IntFreightGuaranteeDetail freightGuaranteeDetail = null;
  private IntEtdDetail etdDetail = null;
  private IntCustomDeliveryWindowDetail customDeliveryWindowDetail = null;

  public void setSpecialServiceTypes(IntShipmentSpecialServiceType[] specialServiceTypes)
  {
    this.specialServiceTypes = specialServiceTypes;
  }

  public IntShipmentSpecialServiceType[] getSpecialServiceTypes()
  {
    return specialServiceTypes;
  }

  public void setCodDetail(IntCodDetail codDetail)
  {
    this.codDetail = codDetail;
  }

  public IntCodDetail getCodDetail()
  {
    return codDetail;
  }

  public void setDeliveryOnInvoiceAcceptanceDetail(IntDeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail)
  {
    this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
  }

  public IntDeliveryOnInvoiceAcceptanceDetail getDeliveryOnInvoiceAcceptanceDetail()
  {
    return deliveryOnInvoiceAcceptanceDetail;
  }

  public void setHoldAtLocationDetail(IntHoldAtLocationDetail holdAtLocationDetail)
  {
    this.holdAtLocationDetail = holdAtLocationDetail;
  }

  public IntHoldAtLocationDetail getHoldAtLocationDetail()
  {
    return holdAtLocationDetail;
  }

  public void setEmailNotificationDetail(IntEMailNotificationDetail emailNotificationDetail)
  {
    this.emailNotificationDetail = emailNotificationDetail;
  }

  public IntEMailNotificationDetail getEmailNotificationDetail()
  {
    return emailNotificationDetail;
  }

  public void setReturnShipmentDetail(IntReturnShipmentDetail returnShipmentDetail)
  {
    this.returnShipmentDetail = returnShipmentDetail;
  }

  public IntReturnShipmentDetail getReturnShipmentDetail()
  {
    return returnShipmentDetail;
  }

  public void setPendingShipmentDetail(IntPendingShipmentDetail pendingShipmentDetail)
  {
    this.pendingShipmentDetail = pendingShipmentDetail;
  }

  public IntPendingShipmentDetail getPendingShipmentDetail()
  {
    return pendingShipmentDetail;
  }

  public void setInternationalControlledExportDetail(IntInternationalControlledExportDetail internationalControlledExportDetail)
  {
    this.internationalControlledExportDetail = internationalControlledExportDetail;
  }

  public IntInternationalControlledExportDetail getInternationalControlledExportDetail()
  {
    return internationalControlledExportDetail;
  }

  public void setInternationalTrafficInArmsRegulationsDetail(IntInternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail)
  {
    this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
  }

  public IntInternationalTrafficInArmsRegulationsDetail getInternationalTrafficInArmsRegulationsDetail()
  {
    return internationalTrafficInArmsRegulationsDetail;
  }

  public void setShipmentDryIceDetail(IntShipmentDryIceDetail shipmentDryIceDetail)
  {
    this.shipmentDryIceDetail = shipmentDryIceDetail;
  }

  public IntShipmentDryIceDetail getShipmentDryIceDetail()
  {
    return shipmentDryIceDetail;
  }

  public void setHomeDeliveryPremiumDetail(IntHomeDeliveryPremiumDetail homeDeliveryPremiumDetail)
  {
    this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
  }

  public IntHomeDeliveryPremiumDetail getHomeDeliveryPremiumDetail()
  {
    return homeDeliveryPremiumDetail;
  }

  public void setFreightGuaranteeDetail(IntFreightGuaranteeDetail freightGuaranteeDetail)
  {
    this.freightGuaranteeDetail = freightGuaranteeDetail;
  }

  public IntFreightGuaranteeDetail getFreightGuaranteeDetail()
  {
    return freightGuaranteeDetail;
  }

  public void setEtdDetail(IntEtdDetail etdDetail)
  {
    this.etdDetail = etdDetail;
  }

  public IntEtdDetail getEtdDetail()
  {
    return etdDetail;
  }

  public void setCustomDeliveryWindowDetail(IntCustomDeliveryWindowDetail customDeliveryWindowDetail)
  {
    this.customDeliveryWindowDetail = customDeliveryWindowDetail;
  }

  public IntCustomDeliveryWindowDetail getCustomDeliveryWindowDetail()
  {
    return customDeliveryWindowDetail;
  }
  
  public void copyToShipmentSpecialServicesRequested(ShipmentSpecialServicesRequested outData)
  {
    if(outData != null)
    {
      if(this.codDetail != null)
      {
        CodDetail cod = new CodDetail();
        this.codDetail.copyToCodDetail(cod);
        outData.setCodDetail(cod);
      }
      
      if(this.customDeliveryWindowDetail != null)
      {
        CustomDeliveryWindowDetail cdwd = new CustomDeliveryWindowDetail();
        this.customDeliveryWindowDetail.copyToCustomDeliveryWindowDetail(cdwd);
        outData.setCustomDeliveryWindowDetail(cdwd);
      }
      
      if(this.deliveryOnInvoiceAcceptanceDetail != null)
      {
        DeliveryOnInvoiceAcceptanceDetail accept = new DeliveryOnInvoiceAcceptanceDetail();
        this.deliveryOnInvoiceAcceptanceDetail.copyToDeliveryOnInvoiceAcceptanceDetail(accept);
        outData.setDeliveryOnInvoiceAcceptanceDetail(accept);
      }
      
      if(this.emailNotificationDetail != null)
      {
        EMailNotificationDetail notify = new EMailNotificationDetail();
        this.emailNotificationDetail.copyToEMailNotificationDetail(notify);
        outData.setEMailNotificationDetail(notify);
      }
      
      if(this.etdDetail != null)
      {
        EtdDetail edt = new EtdDetail();
        this.etdDetail.copyToEtdDetail(edt);
        outData.setEtdDetail(edt);
      }
      
      if(this.freightGuaranteeDetail != null)
      {
        FreightGuaranteeDetail fgd = new FreightGuaranteeDetail();
        this.freightGuaranteeDetail.copyToFreightGuaranteeDetail(fgd);
        outData.setFreightGuaranteeDetail(fgd);
      }
      
      if(this.holdAtLocationDetail != null)
      {
        HoldAtLocationDetail hold = new HoldAtLocationDetail();
        this.holdAtLocationDetail.copyToHoldAtLocationDetail(hold);
        outData.setHoldAtLocationDetail(hold);
      }
      
      if(this.homeDeliveryPremiumDetail != null)
      {
        HomeDeliveryPremiumDetail delPrem = new HomeDeliveryPremiumDetail();
        this.homeDeliveryPremiumDetail.copyToHomeDeliveryPremiumDetail(delPrem);
        outData.setHomeDeliveryPremiumDetail(delPrem);
      }
      
      if(this.internationalControlledExportDetail != null)
      {
        InternationalControlledExportDetail expCtrl = new InternationalControlledExportDetail();
        this.internationalControlledExportDetail.copyToInternationalControlledExportDetail(expCtrl);
        outData.setInternationalControlledExportDetail(expCtrl);
      }
      
      if(this.internationalTrafficInArmsRegulationsDetail != null)
      {
        InternationalTrafficInArmsRegulationsDetail armsDetail = new InternationalTrafficInArmsRegulationsDetail();
        this.internationalTrafficInArmsRegulationsDetail.copyToInternationalTrafficInArmsRegulationsDetail(armsDetail);
        outData.setInternationalTrafficInArmsRegulationsDetail(armsDetail);
      }
      
      if(this.pendingShipmentDetail != null)
      {
        PendingShipmentDetail psd = new PendingShipmentDetail();
        this.pendingShipmentDetail.copyToPendingShipmentDetail(psd);
        outData.setPendingShipmentDetail(psd);
      }
      
      if(this.returnShipmentDetail != null)
      {
        ReturnShipmentDetail rsd = new ReturnShipmentDetail();
        this.returnShipmentDetail.copyToReturnShipmentDetail(rsd);
        outData.setReturnShipmentDetail(rsd);
      }
      
      if(this.shipmentDryIceDetail != null)
      {
        ShipmentDryIceDetail sdid = new ShipmentDryIceDetail();
        this.shipmentDryIceDetail.copyToShipmentDryIceDetail(sdid);
        outData.setShipmentDryIceDetail(sdid);
      }
      
      if(this.specialServiceTypes != null)
      {
        ShipmentSpecialServiceType[] srvTypeArr = new ShipmentSpecialServiceType[this.specialServiceTypes.length];
        for(int x=0; x<this.specialServiceTypes.length; x++)
        {
          srvTypeArr[x] = ShipmentSpecialServiceType.fromString(this.specialServiceTypes[x].getValue());
        }
        outData.setSpecialServiceTypes(srvTypeArr);
      }
    }
  }
}
