package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.GroundDeliveryEligibilityType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntGroundDeliveryEligibilityType extends ValueObject implements Serializable
{
  private String value = null;

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public static IntGroundDeliveryEligibilityType createFromGroundDeliveryEligibilityType(GroundDeliveryEligibilityType inData)
  {
    IntGroundDeliveryEligibilityType gdet = null;
    if(inData != null)
    {
      gdet = new IntGroundDeliveryEligibilityType();
      gdet.setValue(inData.getValue());
    }
    return gdet;
  }
}
