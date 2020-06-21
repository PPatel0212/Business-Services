package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalClassify extends ValueObject implements Serializable
{
  private java.lang.String type;
  private java.lang.String label;
  private InternalClassification classification;

  public void setType(String type)
  {
    this.type = type;
  }

  public String getType()
  {
    return type;
  }

  public void setLabel(String label)
  {
    this.label = label;
  }

  public String getLabel()
  {
    return label;
  }

  public void setClassification(InternalClassification classification)
  {
    this.classification = classification;
  }

  public InternalClassification getClassification()
  {
    return classification;
  }
}
