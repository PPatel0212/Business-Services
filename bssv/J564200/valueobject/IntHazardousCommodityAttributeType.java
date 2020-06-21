package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityAttributeType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityAttributeType extends ValueObject implements Serializable
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
  
  public static IntHazardousCommodityAttributeType createFromHazardousCommodityAttributeType(HazardousCommodityAttributeType inData)
  {
    IntHazardousCommodityAttributeType hcat = null;
    if(inData != null)
    {
      hcat = new IntHazardousCommodityAttributeType();
      hcat.setValue(inData.getValue());
    }
    return hcat;
  }
}
