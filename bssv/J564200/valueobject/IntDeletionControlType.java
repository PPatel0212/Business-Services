package be.e1.bssv.J564200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDeletionControlType extends ValueObject implements Serializable
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
}
