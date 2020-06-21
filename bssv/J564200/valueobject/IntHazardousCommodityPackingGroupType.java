package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingGroupType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityPackingGroupType extends ValueObject implements Serializable
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
  
  public static IntHazardousCommodityPackingGroupType createFromHazardousCommodityPackingGroupType(HazardousCommodityPackingGroupType inData)
  {
    IntHazardousCommodityPackingGroupType hcpgt = null;
    if(inData != null)
    {
      hcpgt = new IntHazardousCommodityPackingGroupType();
      hcpgt.setValue(inData.getValue());
    }
    return hcpgt;
  }
}
