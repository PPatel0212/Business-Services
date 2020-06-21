package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalParty extends ValueObject implements Serializable
{
  private java.lang.String id;
  private java.lang.String type;
  private java.lang.String name;
  private java.lang.String contact;
  private java.lang.String addresses;
  private java.lang.String city;
  private java.lang.String state;
  private java.lang.String postalCode;
  private InternalCountry country;
  private java.lang.String email;
  private java.lang.String phone;
  private java.lang.String fax;
  private java.lang.String endUserType;
  private InternalEndUserParty endUserParty;
  private java.lang.String userDefined;

  public void setType(String type)
  {
    this.type = type;
  }

  public String getType()
  {
    return type;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setContact(String contact)
  {
    this.contact = contact;
  }

  public String getContact()
  {
    return contact;
  }

  public void setAddresses(String addresses)
  {
    this.addresses = addresses;
  }

  public String getAddresses()
  {
    return addresses;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCity()
  {
    return city;
  }

  public void setState(String state)
  {
    this.state = state;
  }

  public String getState()
  {
    return state;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setCountry(InternalCountry country)
  {
    this.country = country;
  }

  public InternalCountry getCountry()
  {
    return country;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getEmail()
  {
    return email;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setFax(String fax)
  {
    this.fax = fax;
  }

  public String getFax()
  {
    return fax;
  }

  public void setEndUserType(String endUserType)
  {
    this.endUserType = endUserType;
  }

  public String getEndUserType()
  {
    return endUserType;
  }

  public void setEndUserParty(InternalEndUserParty endUserParty)
  {
    this.endUserParty = endUserParty;
  }

  public InternalEndUserParty getEndUserParty()
  {
    return endUserParty;
  }

  public void setUserDefined(String userDefined)
  {
    this.userDefined = userDefined;
  }

  public String getUserDefined()
  {
    return userDefined;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public String getId()
  {
    return id;
  }
}
