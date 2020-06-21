package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtExciseCondition;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntEdtExciseCondition extends ValueObject implements Serializable
{
  private String category = null;
  private String value = null;

  public void setCategory(String category)
  {
    this.category = category;
  }

  public String getCategory()
  {
    return category;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public void copyToEdtExciseCondition(EdtExciseCondition outData)
  {
    if(outData != null)
    {
      outData.setCategory(this.category);
      outData.setValue(this.value);
    }
  }
}
