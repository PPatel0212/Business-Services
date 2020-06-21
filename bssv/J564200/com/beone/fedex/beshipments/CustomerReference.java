/**
 * Generated from schema type t=CustomerReference@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomerReference implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReferenceType customerReferenceType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReferenceType getCustomerReferenceType() {
    return this.customerReferenceType;
  }

  public void setCustomerReferenceType(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReferenceType customerReferenceType) {
    this.customerReferenceType = customerReferenceType;
  }

  private java.lang.String value;

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

}
