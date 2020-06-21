package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityLabelTextOptionType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityLabelTextOptionType extends ValueObject implements Serializable
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
  
  public static IntHazardousCommodityLabelTextOptionType createFromHazardousCommodityLabelTextOptionType(HazardousCommodityLabelTextOptionType inData)
  {
    IntHazardousCommodityLabelTextOptionType labelTextOpt = null;
    if(inData != null)
    {
      labelTextOpt = new IntHazardousCommodityLabelTextOptionType();
      labelTextOpt.setValue(inData.getValue());
    }
    return labelTextOpt;
  }
}
