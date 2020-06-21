package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalParameters extends ValueObject implements Serializable
{
  private java.lang.String threshold;
  private java.lang.String countryMatch;
  private java.lang.String redFlag;
  private java.lang.String exactMatch;

  public void setThreshold(String threshold)
  {
    this.threshold = threshold;
  }

  public String getThreshold()
  {
    return threshold;
  }

  public void setCountryMatch(String countryMatch)
  {
    this.countryMatch = countryMatch;
  }

  public String getCountryMatch()
  {
    return countryMatch;
  }

  public void setRedFlag(String redFlag)
  {
    this.redFlag = redFlag;
  }

  public String getRedFlag()
  {
    return redFlag;
  }

  public void setExactMatch(String exactMatch)
  {
    this.exactMatch = exactMatch;
  }

  public String getExactMatch()
  {
    return exactMatch;
  }
}
