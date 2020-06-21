package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalDescriptor extends ValueObject implements Serializable
{
  private java.lang.String type;
  private InternalAttribute[] attribute;

  public void setType(String type)
  {
    this.type = type;
  }

  public String getType()
  {
    return type;
  }

  public void setAttribute(InternalAttribute[] attribute)
  {
    this.attribute = attribute;
  }

  public InternalAttribute[] getAttribute()
  {
    return attribute;
  }
}
