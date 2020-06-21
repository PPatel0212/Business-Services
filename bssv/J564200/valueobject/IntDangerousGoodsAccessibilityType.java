package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsAccessibilityType;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntDangerousGoodsAccessibilityType
  extends ValueObject
  implements Serializable
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
  
  public static IntDangerousGoodsAccessibilityType createFromDangerousGoodsAccessibilityType(DangerousGoodsAccessibilityType inData)
  {
    IntDangerousGoodsAccessibilityType dgat = new IntDangerousGoodsAccessibilityType();
    if(inData != null)
    {
      dgat = new IntDangerousGoodsAccessibilityType();
      dgat.setValue(inData.getValue());
    }
    return dgat;
  }
}
