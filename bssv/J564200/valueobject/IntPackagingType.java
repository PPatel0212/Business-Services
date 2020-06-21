package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackagingType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPackagingType extends ValueObject implements Serializable
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
  
  public static IntPackagingType createFromPackagingType(PackagingType inData)
  {
    IntPackagingType pt = null;
    if(inData != null)
    {
      pt = new IntPackagingType();
      pt.setValue(inData.getValue());
    }
    return pt;
  }
}
