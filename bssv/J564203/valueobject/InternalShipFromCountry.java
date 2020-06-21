package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShipFromCountry extends ValueObject implements Serializable
{
  private InternalCountry shipFrom;

  public void setShipFrom(InternalCountry shipFrom)
  {
    this.shipFrom = shipFrom;
  }

  public InternalCountry getShipFrom()
  {
    return shipFrom;
  }
}
