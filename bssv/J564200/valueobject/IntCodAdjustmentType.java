package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAdjustmentType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCodAdjustmentType extends ValueObject implements Serializable
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
  
  public static IntCodAdjustmentType createFromCodAdjustmentType(CodAdjustmentType inData)
  {
    IntCodAdjustmentType cat = null;
    if(cat != null)
    {
      cat = new IntCodAdjustmentType();
      cat.setValue(inData.getValue());
    }
    return cat;
  }
}
