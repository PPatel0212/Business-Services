package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Address;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntContactAndAddress extends ValueObject implements Serializable
{
  private IntContact contact = null;
  private IntAddress address = null;

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
  
  public void copyToContactAndAddress(ContactAndAddress outData)
  {
    if(outData != null)
    {
      if(this.address != null)
      {
        Address addr = new Address();
        this.address.copyToAddress(addr);
        outData.setAddress(addr);
      }
      
      if(this.contact != null)
      {
        Contact ct = new Contact();
        this.contact.copyToContact(ct);
        outData.setContact(ct);
      }
    }
  }
  
  public static IntContactAndAddress createFromContactAndAddress(ContactAndAddress inData)
  {
    IntContactAndAddress addy = null;
    if(inData != null)
    {
      addy = new IntContactAndAddress();
      addy.setAddress(IntAddress.createFromAddress(inData.getAddress()));
      addy.setContact(IntContact.createFromContact(inData.getContact()));
    }
    return addy;
  }
}
