package be.e1.bssv.util.J56CS01.valueobject;

import be.e1.bssv.util.JP56CS01.valueobject.CompliancePartyRequest;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class CompliancePartyVO extends ValueObject implements Serializable
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
   * EnterpriseOne Next Number: 01/1 <br>
   */
  private MathNumeric mnAddressNumber = null;

  /**
   * Type - Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ANTY <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne User Defined Code: 40/AN <br>
   */
  private String cAddressType = null;

  /**
   * Name - Mailing
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MLNM <br>
   * EnterpriseOne field length:  40 <br>
   * EnterpriseOne Edit Rule:NE <br>
   */
  private String szMailingName = null;

  /**
   * Address Line
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ADD <br>
   * EnterpriseOne field length:  240 <br>
   */
  private String szAddressLine = null;

  /**
   * City
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CTY1 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szCity = null;

  /**
   * County
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CNT2 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szState = null;

  /**
   * Postal Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ADDZ <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String szZipCode = null;

  /**
   * Country
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CTR <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne User Defined Code: 00/CN <br>
   */
  private String szCountry = null;

  /**
   * Electronic Address
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EMAL <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String szEmail = null;

  /**
   * Phone Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PH1 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String szPhoneNumber = null;

  /**
   * Case Fax Number 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CFAX1 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String szFaxNumber = null;

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
  private MathNumeric mnRelatedOrderNumber = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String szRelatedOrderType = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String szRelatedOrderCompany = null;

  /**
   * Customer Contact
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CCNT <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String szCustomerContact = null;

  public CompliancePartyVO(CompliancePartyRequest inData)
  {
    this.cAddressType = inData.getAddressType();
    this.mnAddressNumber = new MathNumeric(inData.getAddressNumber());
  }
  
  public void setMnAddressNumber(MathNumeric mnAddressNumber)
  {
    this.mnAddressNumber = mnAddressNumber;
  }

  public MathNumeric getMnAddressNumber()
  {
    return mnAddressNumber;
  }

  public void setCAddressType(String cAddressType)
  {
    this.cAddressType = cAddressType;
  }

  public String getCAddressType()
  {
    return cAddressType;
  }

  public void setSzMailingName(String szMailingName)
  {
    this.szMailingName = szMailingName;
  }

  public String getSzMailingName()
  {
    return szMailingName;
  }

  public void setSzAddressLine(String szAddressLine)
  {
    this.szAddressLine = szAddressLine;
  }

  public String getSzAddressLine()
  {
    return szAddressLine;
  }

  public void setSzCity(String szCity)
  {
    this.szCity = szCity;
  }

  public String getSzCity()
  {
    return szCity;
  }

  public void setSzState(String szState)
  {
    this.szState = szState;
  }

  public String getSzState()
  {
    return szState;
  }

  public void setSzZipCode(String szZipCode)
  {
    this.szZipCode = szZipCode;
  }

  public String getSzZipCode()
  {
    return szZipCode;
  }

  public void setSzCountry(String szCountry)
  {
    this.szCountry = szCountry;
  }

  public String getSzCountry()
  {
    return szCountry;
  }

  public void setSzEmail(String szEmail)
  {
    this.szEmail = szEmail;
  }

  public String getSzEmail()
  {
    return szEmail;
  }

  public void setSzPhoneNumber(String szPhoneNumber)
  {
    this.szPhoneNumber = szPhoneNumber;
  }

  public String getSzPhoneNumber()
  {
    return szPhoneNumber;
  }

  public void setSzFaxNumber(String szFaxNumber)
  {
    this.szFaxNumber = szFaxNumber;
  }

  public String getSzFaxNumber()
  {
    return szFaxNumber;
  }

  public void setMnRelatedOrderNumber(MathNumeric mnRelatedOrderNumber)
  {
    this.mnRelatedOrderNumber = mnRelatedOrderNumber;
  }

  public MathNumeric getMnRelatedOrderNumber()
  {
    return mnRelatedOrderNumber;
  }

  public void setSzRelatedOrderType(String szRelatedOrderType)
  {
    this.szRelatedOrderType = szRelatedOrderType;
  }

  public String getSzRelatedOrderType()
  {
    return szRelatedOrderType;
  }

  public void setSzRelatedOrderCompany(String szRelatedOrderCompany)
  {
    this.szRelatedOrderCompany = szRelatedOrderCompany;
  }

  public String getSzRelatedOrderCompany()
  {
    return szRelatedOrderCompany;
  }

  public void setSzCustomerContact(String szCustomerContact)
  {
    this.szCustomerContact = szCustomerContact;
  }

  public String getSzCustomerContact()
  {
    return szCustomerContact;
  }
}
