package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntTaxType extends ValueObject implements Serializable
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
  
  public static IntTaxType createFromTaxType(TaxType inData)
  {
    IntTaxType ttype = null;
    if(inData != null)
    {
      ttype = new IntTaxType();
      ttype.setValue(inData.getValue());
    }
    return ttype;
  }
}
