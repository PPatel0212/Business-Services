package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SpecialRatingAppliedType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntSpecialRatingAppliedType extends ValueObject implements Serializable
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
  
  public static IntSpecialRatingAppliedType createFromSpecialRatingAppliedType(SpecialRatingAppliedType inData)
  {
    IntSpecialRatingAppliedType srat = null;
    if(inData != null)
    {
      srat = new IntSpecialRatingAppliedType();
      srat.setValue(inData.getValue());
    }
    return srat;
  }
}
