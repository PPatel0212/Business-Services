package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalEndUserParty extends ValueObject implements Serializable
{
  private java.lang.String endUser;
  private java.lang.String military;
  private java.lang.String endUserCertificate;
  private java.lang.String nonUSGovernment;
  private InternalDescriptor[] descriptor;

  public void setEndUser(String endUser)
  {
    this.endUser = endUser;
  }

  public String getEndUser()
  {
    return endUser;
  }

  public void setMilitary(String military)
  {
    this.military = military;
  }

  public String getMilitary()
  {
    return military;
  }

  public void setEndUserCertificate(String endUserCertificate)
  {
    this.endUserCertificate = endUserCertificate;
  }

  public String getEndUserCertificate()
  {
    return endUserCertificate;
  }

  public void setNonUSGovernment(String nonUSGovernment)
  {
    this.nonUSGovernment = nonUSGovernment;
  }

  public String getNonUSGovernment()
  {
    return nonUSGovernment;
  }

  public void setDescriptor(InternalDescriptor[] descriptor)
  {
    this.descriptor = descriptor;
  }

  public InternalDescriptor[] getDescriptor()
  {
    return descriptor;
  }
}
