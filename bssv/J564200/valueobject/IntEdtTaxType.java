package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntEdtTaxType extends ValueObject implements Serializable
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
  
  public static IntEdtTaxType createFromEdtTaxType(EdtTaxType inData)
  {
    IntEdtTaxType ett = null;
    if(inData != null)
    {
      ett = new IntEdtTaxType();
      ett.setValue(inData.getValue());
    }
    return ett;
  }
}
