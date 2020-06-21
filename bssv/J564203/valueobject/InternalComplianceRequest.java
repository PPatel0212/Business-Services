package be.e1.bssv.J564203.valueobject;

import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CompliantScreeningRequest;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalComplianceRequest extends ValueObject implements Serializable
{
  private InternalAdmin admin = null;
  private InternalTransaction transaction = null;

  public void setAdmin(InternalAdmin admin)
  {
    this.admin = admin;
  }

  public InternalAdmin getAdmin()
  {
    return admin;
  }

  public void setTransaction(InternalTransaction transaction)
  {
    this.transaction = transaction;
  }

  public InternalTransaction getTransaction()
  {
    return transaction;
  }
}
