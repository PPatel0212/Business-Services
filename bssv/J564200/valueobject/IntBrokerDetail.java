package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BrokerDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BrokerType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntBrokerDetail extends ValueObject implements Serializable
{
  private IntBrokerType type = null;
  private IntParty broker = null;

  public void setType(IntBrokerType type)
  {
    this.type = type;
  }

  public IntBrokerType getType()
  {
    return type;
  }

  public void setBroker(IntParty broker)
  {
    this.broker = broker;
  }

  public IntParty getBroker()
  {
    return broker;
  }
  
  public void copyToBrokerDetail(BrokerDetail outData)
  {
    if(outData != null)
    {
      if(this.type != null)
      {
        BrokerType bt = BrokerType.fromString(this.type.getValue());
        outData.setType(bt);
      }
      
      if(this.broker != null)
      {
        Party pty = new Party();
        this.broker.copyToParty(pty);
        outData.setBroker(pty);
      }
    }
  }
}
