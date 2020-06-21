package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityRegulationType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntHazardousCommodityRegulationType extends ValueObject implements Serializable
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
  
  public static IntHazardousCommodityRegulationType createFromHazardousCommodityRegulationType(HazardousCommodityRegulationType inData)
  {
    IntHazardousCommodityRegulationType hcrt = null;
    if(inData != null)
    {
      hcrt = new IntHazardousCommodityRegulationType();
      hcrt.setValue(inData.getValue());
    }
    return hcrt;
  }
}
