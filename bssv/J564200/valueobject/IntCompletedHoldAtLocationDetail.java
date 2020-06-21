package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHoldAtLocationDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.HoldAtLocationDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCompletedHoldAtLocationDetail extends ValueObject implements Serializable
{
  private IntContactAndAddress holdingLocation = null;
  private IntFedExLocationType holdingLocationType = null;

  public void setHoldingLocation(IntContactAndAddress holdingLocation)
  {
    this.holdingLocation = holdingLocation;
  }

  public IntContactAndAddress getHoldingLocation()
  {
    return holdingLocation;
  }

  public void setHoldingLocationType(IntFedExLocationType holdingLocationType)
  {
    this.holdingLocationType = holdingLocationType;
  }

  public IntFedExLocationType getHoldingLocationType()
  {
    return holdingLocationType;
  }
  
  public static IntCompletedHoldAtLocationDetail createFromCompletedHoldAtLocationDetail(CompletedHoldAtLocationDetail inData)
  {
    IntCompletedHoldAtLocationDetail hald = null;
    if(inData != null)
    {
      hald = new IntCompletedHoldAtLocationDetail();
      hald.setHoldingLocation(IntContactAndAddress.createFromContactAndAddress(inData.getHoldingLocation()));
      hald.setHoldingLocationType(IntFedExLocationType.createFromFedExLocationType(inData.getHoldingLocationType()));
    }
    return hald;
  }
}
