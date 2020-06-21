package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntContact extends ValueObject implements Serializable
{
  private String contactId = null;
  private String personName = null;
  private String title = null;
  private String companyName = null;
  private String phoneNumber = null;
  private String phoneExtension = null;
  private String tollFreePhoneNumber = null;
  private String pagerNumber = null;
  private String faxNumber = null;
  private String emailAddress = null;

  public void setContactId(String contactId)
  {
    this.contactId = contactId;
  }

  public String getContactId()
  {
    return contactId;
  }

  public void setPersonName(String personName)
  {
    this.personName = personName;
  }

  public String getPersonName()
  {
    return personName;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getTitle()
  {
    return title;
  }

  public void setCompanyName(String companyName)
  {
    this.companyName = companyName;
  }

  public String getCompanyName()
  {
    return companyName;
  }

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setPhoneExtension(String phoneExtension)
  {
    this.phoneExtension = phoneExtension;
  }

  public String getPhoneExtension()
  {
    return phoneExtension;
  }

  public void setTollFreePhoneNumber(String tollFreePhoneNumber)
  {
    this.tollFreePhoneNumber = tollFreePhoneNumber;
  }

  public String getTollFreePhoneNumber()
  {
    return tollFreePhoneNumber;
  }

  public void setPagerNumber(String pagerNumber)
  {
    this.pagerNumber = pagerNumber;
  }

  public String getPagerNumber()
  {
    return pagerNumber;
  }

  public void setFaxNumber(String faxNumber)
  {
    this.faxNumber = faxNumber;
  }

  public String getFaxNumber()
  {
    return faxNumber;
  }

  public void setEmailAddress(String emailAddress)
  {
    this.emailAddress = emailAddress;
  }

  public String getEmailAddress()
  {
    return emailAddress;
  }
  
  public void copyToContact(Contact outData)
  {
    if(outData != null)
    {
      outData.setContactId(this.contactId);
      outData.setPersonName(this.personName);
      outData.setTitle(this.title);
      outData.setCompanyName(this.companyName);
      outData.setPhoneNumber(this.phoneNumber);
      outData.setPhoneExtension(this.phoneExtension);
      outData.setTollFreePhoneNumber(this.tollFreePhoneNumber);
      outData.setPagerNumber(this.pagerNumber);
      outData.setFaxNumber(this.faxNumber);
      outData.setEMailAddress(this.emailAddress);
    }
  }
  
  public static IntContact createFromContact(Contact inData)
  {
    IntContact contact = null;
    if(inData != null)
    {
      contact = new IntContact();
      
      contact.setCompanyName(inData.getCompanyName());
      contact.setContactId(inData.getContactId());
      contact.setEmailAddress(inData.getEMailAddress());
      contact.setFaxNumber(inData.getFaxNumber());
      contact.setPagerNumber(inData.getPagerNumber());
      contact.setPersonName(inData.getPersonName());
      contact.setPhoneExtension(inData.getPhoneExtension());
      contact.setPhoneNumber(inData.getPhoneNumber());
      contact.setTitle(inData.getTitle());
      contact.setTollFreePhoneNumber(inData.getTollFreePhoneNumber());
    }
    return contact;
  }
}
