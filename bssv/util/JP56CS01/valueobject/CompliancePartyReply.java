package be.e1.bssv.util.JP56CS01.valueobject;

import be.e1.bssv.util.J56CS01.valueobject.CompliancePartyVO;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CompliancePartyReply extends MessageValueObject implements Serializable
{
  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer addressNumber = null;

  /**
   * Type - Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ANTY <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String addressType = null;

  /**
   * Name - Mailing
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MLNM <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String mailingName = null;

  /**
   * Address Line
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ADD <br>
   * EnterpriseOne field length:  240 <br>
   */
  private String addressLine = null;

  /**
   * City
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CTY1 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String city = null;

  /**
   * County
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CNT2 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String state = null;

  /**
   * Postal Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ADDZ <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String postalCode = null;

  /**
   * Country
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CTR <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String country = null;

  /**
   * Electronic Address
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMAL <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String electronicAddress = null;

  /**
   * Phone Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PH1 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String phoneNumber = null;

  /**
   * Case Fax Number 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CFAX1 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String faxNumber = null;

  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer relatedOrderNumber = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String relatedOrderType = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String relatedOrderCompany = null;

  /**
   * Customer Contact
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CCNT <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String customerContact = null;

  /**
   * TODO: Default public constructor for instantiating: CompliancePartyReply
   */
  public CompliancePartyReply()
  {
  }
  
  public CompliancePartyReply(CompliancePartyVO inData)
  {
    if(inData != null)
    {
      this.addressLine = inData.getSzAddressLine();
      this.addressType = inData.getCAddressType();
      this.city = inData.getSzCity();
      this.country = inData.getSzCountry();
      this.customerContact = inData.getSzCustomerContact();
      this.electronicAddress = inData.getSzEmail();
      this.faxNumber = inData.getSzFaxNumber();
      this.mailingName = inData.getSzMailingName();
      this.phoneNumber = inData.getSzPhoneNumber();
      this.postalCode = inData.getSzZipCode();
      this.relatedOrderCompany = inData.getSzRelatedOrderCompany();
      this.relatedOrderType = inData.getSzRelatedOrderType();
      this.state = inData.getSzState();
      
      if(inData.getMnAddressNumber() != null)
        this.addressNumber = inData.getMnAddressNumber().intValue();
      if(inData.getMnRelatedOrderNumber() != null)
        this.relatedOrderNumber = inData.getMnRelatedOrderNumber().intValue();
    }
  }

  public void setAddressNumber(Integer addressNumber)
  {
    this.addressNumber = addressNumber;
  }

  public Integer getAddressNumber()
  {
    return addressNumber;
  }

  public void setAddressType(String addressType)
  {
    this.addressType = addressType;
  }

  public String getAddressType()
  {
    return addressType;
  }

  public void setMailingName(String mailingName)
  {
    this.mailingName = mailingName;
  }

  public String getMailingName()
  {
    return mailingName;
  }

  public void setAddressLine(String addressLine)
  {
    this.addressLine = addressLine;
  }

  public String getAddressLine()
  {
    return addressLine;
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

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String getCountry()
  {
    return country;
  }

  public void setElectronicAddress(String electronicAddress)
  {
    this.electronicAddress = electronicAddress;
  }

  public String getElectronicAddress()
  {
    return electronicAddress;
  }

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setFaxNumber(String faxNumber)
  {
    this.faxNumber = faxNumber;
  }

  public String getFaxNumber()
  {
    return faxNumber;
  }

  public void setRelatedOrderNumber(Integer relatedOrderNumber)
  {
    this.relatedOrderNumber = relatedOrderNumber;
  }

  public Integer getRelatedOrderNumber()
  {
    return relatedOrderNumber;
  }

  public void setRelatedOrderType(String relatedOrderType)
  {
    this.relatedOrderType = relatedOrderType;
  }

  public String getRelatedOrderType()
  {
    return relatedOrderType;
  }

  public void setRelatedOrderCompany(String relatedOrderCompany)
  {
    this.relatedOrderCompany = relatedOrderCompany;
  }

  public String getRelatedOrderCompany()
  {
    return relatedOrderCompany;
  }

  public void setCustomerContact(String customerContact)
  {
    this.customerContact = customerContact;
  }

  public String getCustomerContact()
  {
    return customerContact;
  }
}
