package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalAdjustHolds extends ValueObject implements Serializable
{
  private java.lang.String szOrderCompany;
  private MathNumeric mnOrderNumber;
  private java.lang.String szOrderType;
  private java.lang.String cDenialFlagYN;

  public void setSzOrderCompany(String szOrderCompany)
  {
    this.szOrderCompany = szOrderCompany;
  }

  public String getSzOrderCompany()
  {
    return szOrderCompany;
  }

  public void setMnOrderNumber(MathNumeric mnOrderNumber)
  {
    this.mnOrderNumber = mnOrderNumber;
  }

  public MathNumeric getMnOrderNumber()
  {
    return mnOrderNumber;
  }

  public void setSzOrderType(String szOrderType)
  {
    this.szOrderType = szOrderType;
  }

  public String getSzOrderType()
  {
    return szOrderType;
  }

  public void setCDenialFlagYN(String cDenialFlagYN)
  {
    this.cDenialFlagYN = cDenialFlagYN;
  }

  public String getCDenialFlagYN()
  {
    return cDenialFlagYN;
  }
}
