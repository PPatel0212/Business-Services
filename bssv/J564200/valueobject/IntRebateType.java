package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RebateType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRebateType extends ValueObject implements Serializable
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
  
  public static IntRebateType createFromRebateType(RebateType inData)
  {
    IntRebateType rbt = null;
    if(inData != null)
    {
      rbt = new IntRebateType();
      rbt.setValue(inData.getValue());
    }
    return rbt;
  }
}
