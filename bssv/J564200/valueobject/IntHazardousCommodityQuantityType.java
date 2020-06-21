package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityQuantityType extends ValueObject implements Serializable
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
  
  public static IntHazardousCommodityQuantityType createFromHazardousCommodityQuantityType(HazardousCommodityQuantityType inData)
  {
    IntHazardousCommodityQuantityType hcqt = null;
    if(inData != null)
    {
      hcqt = new IntHazardousCommodityQuantityType();
      hcqt.setValue(inData.getValue());
    }
    return hcqt;
  }
}
