package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ProcessShipmentReply;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ProcessShipmentRequest;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntFedexShipmentProcess extends ValueObject implements Serializable
{
  private IntProcessShipmentRequest request = null;
  private IntProcessShipmentReply reply = null;
  private IntBssvErrors error = null;

  public void setRequest(IntProcessShipmentRequest request)
  {
    this.request = request;
  }

  public IntProcessShipmentRequest getRequest()
  {
    return request;
  }

  public void setError(IntBssvErrors error)
  {
    this.error = error;
  }

  public IntBssvErrors getError()
  {
    return error;
  }

  public void setReply(IntProcessShipmentReply reply)
  {
    this.reply = reply;
  }

  public IntProcessShipmentReply getReply()
  {
    return reply;
  }
  
  public void copyToProcessShipmentRequest(ProcessShipmentRequest outData)
  {
    if(outData != null)
    {
      this.request.copyToProcessShipmentRequest(outData);
    }
  }
  
  public void loadReplyData(ProcessShipmentReply inData)
  {
    if(inData != null)
    {
      this.reply = IntProcessShipmentReply.createFromProcessShipmentReply(inData);
    }
  }
}
