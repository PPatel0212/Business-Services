package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Rma;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRma extends ValueObject implements Serializable
{
  private String reason = null;

  public void setReason(String reason)
  {
    this.reason = reason;
  }

  public String getReason()
  {
    return reason;
  }
  
  public void copyToRma(Rma outData)
  {
    if(outData != null)
    {
      outData.setReason(this.reason);
    }
  }
}
