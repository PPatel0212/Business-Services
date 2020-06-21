package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducer;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntNaftaProducer extends ValueObject implements Serializable
{
  private String id = null;
  private IntParty producer = null;

  public void setId(String id)
  {
    this.id = id;
  }

  public String getId()
  {
    return id;
  }

  public void setProducer(IntParty producer)
  {
    this.producer = producer;
  }

  public IntParty getProducer()
  {
    return producer;
  }
  
  public void copyToNaftaProducer(NaftaProducer outData)
  {
    if(outData != null)
    {
      outData.setId(this.id);
      
      if(this.producer != null)
      {
        Party pty = new Party();
        this.producer.copyToParty(pty);
        outData.setProducer(pty);
      }
    }
  }
}
