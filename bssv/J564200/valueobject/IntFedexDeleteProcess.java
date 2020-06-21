package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DeleteShipmentRequest;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentReply;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntFedexDeleteProcess extends ValueObject implements Serializable
{
  private IntDeleteShipmentRequest request = null;
  private IntShipmentReply reply = null;
  private IntBssvErrors error = null;

  public void setRequest(IntDeleteShipmentRequest request)
  {
    this.request = request;
  }

  public IntDeleteShipmentRequest getRequest()
  {
    return request;
  }

  public void setReply(IntShipmentReply reply)
  {
    this.reply = reply;
  }

  public IntShipmentReply getReply()
  {
    return reply;
  }

  public void setError(IntBssvErrors error)
  {
    this.error = error;
  }

  public IntBssvErrors getError()
  {
    return error;
  }

  public void copyToDeleteShipmentRequest(DeleteShipmentRequest outData)
  {
    if (outData != null)
    {
      this.request.copyToDeleteShipmentRequest(outData);
    }
  }
  
  public void loadReplyData(ShipmentReply inData)
  {
    if(inData != null)
    {
      this.reply = IntShipmentReply.createFromShipmentReply(inData);
    }
  }
}
