package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SurchargeLevelType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntSurchargeLevelType extends ValueObject implements Serializable
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
  
  public static IntSurchargeLevelType createFromSurchargeLevelType(SurchargeLevelType inData)
  {
    IntSurchargeLevelType slt = null;
    if(inData != null)
    {
      slt = new IntSurchargeLevelType();
      slt.setValue(inData.getValue());
    }
    return null;
  }
}
