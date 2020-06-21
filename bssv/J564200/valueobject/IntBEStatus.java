package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BEStatus;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntBEStatus
  extends ValueObject
  implements Serializable
{
  private Integer statusCode = null;
  private String statusMessage = null;

  public void setStatusCode(Integer statusCode)
  {
    this.statusCode = statusCode;
  }

  public Integer getStatusCode()
  {
    return statusCode;
  }

  public void setStatusMessage(String statusMessage)
  {
    this.statusMessage = statusMessage;
  }

  public String getStatusMessage()
  {
    return statusMessage;
  }
  
  public static IntBEStatus createFromBEStatus(BEStatus inData)
  {
    IntBEStatus status = null;
    if(inData != null)
    {
      status = new IntBEStatus();
      
      status.setStatusMessage(inData.getStatusMessage());
      BigInteger val = inData.getStatusCode();
      if(val != null)
      {
        status.setStatusCode(new Integer(val.intValue()));
      }
    }
    return status;
  }
}
