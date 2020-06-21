package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShipToCountry extends ValueObject implements Serializable
{
  private InternalCountry shipTo;

  public void setShipTo(InternalCountry shipTo)
  {
    this.shipTo = shipTo;
  }

  public InternalCountry getShipTo()
  {
    return shipTo;
  }
}
