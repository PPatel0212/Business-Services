package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalTransactionLine extends ValueObject implements Serializable
{
  private InternalProduct product;
  private java.lang.String userDefined;
  private InternalTransactionParty party;

  public void setProduct(InternalProduct product)
  {
    this.product = product;
  }

  public InternalProduct getProduct()
  {
    return product;
  }

  public void setUserDefined(String userDefined)
  {
    this.userDefined = userDefined;
  }

  public String getUserDefined()
  {
    return userDefined;
  }

  public void setParty(InternalTransactionParty party)
  {
    this.party = party;
  }

  public InternalTransactionParty getParty()
  {
    return party;
  }
}
