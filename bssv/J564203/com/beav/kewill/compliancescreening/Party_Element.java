/**
 * Generated from schema type t|e=party|t|e=TransactionRequest|t|e=CompliantScreeningRequest|d=CompliantScreeningRequest@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class Party_Element implements java.io.Serializable {
  private java.lang.String type;

  public java.lang.String getType() {
    return this.type;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  private java.lang.String name;

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private java.lang.String contact;

  public java.lang.String getContact() {
    return this.contact;
  }

  public void setContact(java.lang.String contact) {
    this.contact = contact;
  }

  private java.lang.String addresses;

  public java.lang.String getAddresses() {
    return this.addresses;
  }

  public void setAddresses(java.lang.String addresses) {
    this.addresses = addresses;
  }

  private java.lang.String city;

  public java.lang.String getCity() {
    return this.city;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  private java.lang.String subDivision;

  public java.lang.String getSubDivision() {
    return this.subDivision;
  }

  public void setSubDivision(java.lang.String subDivision) {
    this.subDivision = subDivision;
  }

  private java.lang.String postalCode;

  public java.lang.String getPostalCode() {
    return this.postalCode;
  }

  public void setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Country_Element country;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Country_Element getCountry() {
    return this.country;
  }

  public void setCountry(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Country_Element country) {
    this.country = country;
  }

  private java.lang.String email;

  public java.lang.String getEmail() {
    return this.email;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  private java.lang.String phone;

  public java.lang.String getPhone() {
    return this.phone;
  }

  public void setPhone(java.lang.String phone) {
    this.phone = phone;
  }

  private java.lang.String fax;

  public java.lang.String getFax() {
    return this.fax;
  }

  public void setFax(java.lang.String fax) {
    this.fax = fax;
  }

  private java.lang.String endUserType;

  public java.lang.String getEndUserType() {
    return this.endUserType;
  }

  public void setEndUserType(java.lang.String endUserType) {
    this.endUserType = endUserType;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.EndUserParty endUserParty;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.EndUserParty getEndUserParty() {
    return this.endUserParty;
  }

  public void setEndUserParty(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.EndUserParty endUserParty) {
    this.endUserParty = endUserParty;
  }

  private java.lang.String userDefined;

  public java.lang.String getUserDefined() {
    return this.userDefined;
  }

  public void setUserDefined(java.lang.String userDefined) {
    this.userDefined = userDefined;
  }

  private java.lang.String id;

  public void setId(String id)
  {
    this.id = id;
  }

  public String getId()
  {
    return id;
  }
}
