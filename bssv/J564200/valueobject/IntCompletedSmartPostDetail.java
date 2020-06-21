package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedSmartPostDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCompletedSmartPostDetail extends ValueObject implements Serializable
{
  private IntCarrierCodeType pickUpCarrier = null;
  private String machinable = null;

  public void setPickUpCarrier(IntCarrierCodeType pickUpCarrier)
  {
    this.pickUpCarrier = pickUpCarrier;
  }

  public IntCarrierCodeType getPickUpCarrier()
  {
    return pickUpCarrier;
  }

  public void setMachinable(String machinable)
  {
    this.machinable = machinable;
  }

  public String getMachinable()
  {
    return machinable;
  }
  
  public static IntCompletedSmartPostDetail createFromCompletedSmartPostDetail(CompletedSmartPostDetail inData)
  {
    IntCompletedSmartPostDetail cspd = null;
    if(inData != null)
    {
      cspd = new IntCompletedSmartPostDetail();
      
      cspd.setMachinable("N");
      if(inData.getMachinable() != null && inData.getMachinable() == true)
      {
        cspd.setMachinable("Y");
      }
      
      cspd.pickUpCarrier = IntCarrierCodeType.createFromCarrierCodeType(inData.getPickUpCarrier());
    }
    return cspd;
  }
}
