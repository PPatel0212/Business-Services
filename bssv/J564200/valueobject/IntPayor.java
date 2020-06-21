package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Payor;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPayor extends ValueObject implements Serializable
{
  private IntParty responsibleParty = null;

  public void setResponsibleParty(IntParty responsibleParty)
  {
    this.responsibleParty = responsibleParty;
  }

  public IntParty getResponsibleParty()
  {
    return responsibleParty;
  }
  
  public void copyToPayor(Payor outData)
  {
    if(outData != null)
    {
      if(this.responsibleParty != null)
      {
        Party pty = new Party();    
        this.responsibleParty.copyToParty(pty);
        outData.setResponsibleParty(pty);
      }
    }
  }
}
