/**
 * Generated from schema type t=ContactAndAddress@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ContactAndAddress implements java.io.Serializable {

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
