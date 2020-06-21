package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactiveLabelType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRadioactiveLabelType extends ValueObject implements Serializable
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
  
  public static IntRadioactiveLabelType createFromRadioactiveLabelType(RadioactiveLabelType inData)
  {
    IntRadioactiveLabelType rlt = null;
    if(inData != null)
    {
      rlt = new IntRadioactiveLabelType();
      rlt.setValue(inData.getValue());
    }
    return rlt;
  }
}
