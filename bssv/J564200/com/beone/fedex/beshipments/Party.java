/**
 * Generated from schema type t=Party@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Party implements java.io.Serializable {

  private java.lang.String accountNumber;

  public java.lang.String getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(java.lang.String accountNumber) {
    this.accountNumber = accountNumber;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxpayerIdentification[] tins;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxpayerIdentification[] getTins() {
    return this.tins;
  }

  public void setTins(be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxpayerIdentification[] tins) {
    this.tins = tins;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact contact;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact getContact() {
    return this.contact;
  }

  public void setContact(be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact contact) {
    this.contact = contact;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Address address;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Address getAddress() {
    return this.address;
  }

  public void setAddress(be.e1.bssv.J564200.com.beone.fedex.beshipments.Address address) {
    this.address = address;
  }

}
