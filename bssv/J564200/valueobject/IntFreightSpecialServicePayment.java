package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentRoleType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightSpecialServicePayment;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentSpecialServiceType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightSpecialServicePayment extends ValueObject implements Serializable
{
  private IntShipmentSpecialServiceType specialService = null;
  private IntFreightShipmentRoleType paymentType = null;

  public void setSpecialService(IntShipmentSpecialServiceType specialService)
  {
    this.specialService = specialService;
  }

  public IntShipmentSpecialServiceType getSpecialService()
  {
    return specialService;
  }

  public void setPaymentType(IntFreightShipmentRoleType paymentType)
  {
    this.paymentType = paymentType;
  }

  public IntFreightShipmentRoleType getPaymentType()
  {
    return paymentType;
  }
  
  public void copyToFreightSpecialServicePayment(FreightSpecialServicePayment outData)
  {
    if(outData != null)
    {
      if(this.specialService != null)
      {
        ShipmentSpecialServiceType ssst = ShipmentSpecialServiceType.fromString(this.specialService.getValue());
        outData.setSpecialService(ssst);
      }
      if(this.paymentType != null)
      {
        FreightShipmentRoleType fsrt = FreightShipmentRoleType.fromString(this.paymentType.getValue());
        outData.setPaymentType(fsrt);
      }
    }
  }
}
