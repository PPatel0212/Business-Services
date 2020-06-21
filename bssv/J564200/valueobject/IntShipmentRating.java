package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentRateDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentRating;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShipmentRating extends ValueObject implements Serializable
{
  private IntReturnedRateType actualRateType = null;
  private IntMoney effectiveNetDiscount = null;
  private IntShipmentRateDetail[] shipmentRateDetails = null;

  public void setActualRateType(IntReturnedRateType actualRateType)
  {
    this.actualRateType = actualRateType;
  }

  public IntReturnedRateType getActualRateType()
  {
    return actualRateType;
  }

  public void setEffectiveNetDiscount(IntMoney effectiveNetDiscount)
  {
    this.effectiveNetDiscount = effectiveNetDiscount;
  }

  public IntMoney getEffectiveNetDiscount()
  {
    return effectiveNetDiscount;
  }

  public void setShipmentRateDetails(IntShipmentRateDetail[] shipmentRateDetails)
  {
    this.shipmentRateDetails = shipmentRateDetails;
  }

  public IntShipmentRateDetail[] getShipmentRateDetails()
  {
    return shipmentRateDetails;
  }
  
  public static IntShipmentRating createFromShipmentRating(ShipmentRating inData)
  {
    IntShipmentRating shipRate = null;
    if(inData != null)
    {
      shipRate = new IntShipmentRating();
      
      shipRate.actualRateType = IntReturnedRateType.createFromReturnedRateType(inData.getActualRateType());
      shipRate.effectiveNetDiscount = IntMoney.createFromMoney(inData.getEffectiveNetDiscount());
      
      ShipmentRateDetail[] srdArr = inData.getShipmentRateDetails();
      if(srdArr != null)
      {
        IntShipmentRateDetail[] iSrdArr = new IntShipmentRateDetail[srdArr.length];
        for(int x=0; x<srdArr.length; x++)
        {
          iSrdArr[x] = IntShipmentRateDetail.createFromShipmentRateDetail(srdArr[x]);
        }
        shipRate.setShipmentRateDetails(iSrdArr);
      }
    }
    return shipRate;
  }
}
