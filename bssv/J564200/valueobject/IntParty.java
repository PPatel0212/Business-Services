package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Address;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxpayerIdentification;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntParty extends ValueObject implements Serializable
{  
  private String accountNumber = null;
  private IntTaxpayerIdentification[] tins = null;
  private IntContact contact = null;
  private IntAddress address = null;

  public void setAccountNumber(String accountNumber)
  {
    this.accountNumber = accountNumber;
  }

  public String getAccountNumber()
  {
    return accountNumber;
  }

  public void setTins(IntTaxpayerIdentification[] tins)
  {
    this.tins = tins;
  }

  public IntTaxpayerIdentification[] getTins()
  {
    return tins;
  }

  public void setContact(IntContact contact)
  {
    this.contact = contact;
  }

  public IntContact getContact()
  {
    return contact;
  }

  public void setAddress(IntAddress address)
  {
    this.address = address;
  }

  public IntAddress getAddress()
  {
    return address;
  }
  
  public void copyToParty(Party outData)
  {
    if(outData != null)
    {
      outData.setAccountNumber(this.accountNumber);
      
      if(this.address != null)
      {
        Address addy = new Address();
        this.address.copyToAddress(addy);
        outData.setAddress(addy);
      }
      
      if(this.contact != null)
      {
        Contact ct = new Contact();
        this.contact.copyToContact(ct);
        outData.setContact(ct);
      }
      
      if(this.tins != null)
      {
        TaxpayerIdentification[] tpiArr = new TaxpayerIdentification[this.tins.length];
        for(int x=0; x<this.tins.length; x++)
        {
          tpiArr[x] = new TaxpayerIdentification();
          this.tins[x].copyToTaxpayerIdentification(tpiArr[x]);
        }
        outData.setTins(tpiArr);
      }
    }
  }
  
  public static IntParty createFromParty(Party inData)
  {
    IntParty pty = null;
    if(inData != null)
    {
      pty = new IntParty();
      pty.setAccountNumber(inData.getAccountNumber());
      pty.address = IntAddress.createFromAddress(inData.getAddress());
      pty.contact = IntContact.createFromContact(inData.getContact());
      
      TaxpayerIdentification[] tpiArr = inData.getTins();
      if(tpiArr != null)
      {
        IntTaxpayerIdentification[] iTpiArr = new IntTaxpayerIdentification[tpiArr.length];
        for(int x=0; x<tpiArr.length; x++)
        {
          iTpiArr[x] = IntTaxpayerIdentification.createFromTaxpayerIdentification(tpiArr[x]);
        }
        pty.setTins(iTpiArr);
      }
    }
    return pty;
  }
}
