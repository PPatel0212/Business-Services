/**
 * Generated from schema type t=CustomerReferenceType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CustomerReferenceType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CustomerReferenceType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _bill_OF_LADING = "BILL_OF_LADING";

  public static final java.lang.String _customer_REFERENCE = "CUSTOMER_REFERENCE";

  public static final java.lang.String _department_NUMBER = "DEPARTMENT_NUMBER";

  public static final java.lang.String _electronic_PRODUCT_CODE = "ELECTRONIC_PRODUCT_CODE";

  public static final java.lang.String _intracountry_REGULATORY_REFERENCE = "INTRACOUNTRY_REGULATORY_REFERENCE";

  public static final java.lang.String _invoice_NUMBER = "INVOICE_NUMBER";

  public static final java.lang.String _p_O_NUMBER = "P_O_NUMBER";

  public static final java.lang.String _rma_ASSOCIATION = "RMA_ASSOCIATION";

  public static final java.lang.String _shipment_INTEGRITY = "SHIPMENT_INTEGRITY";

  public static final java.lang.String _store_NUMBER = "STORE_NUMBER";

  public static final CustomerReferenceType bill_OF_LADING = new CustomerReferenceType(_bill_OF_LADING);

  public static final CustomerReferenceType customer_REFERENCE = new CustomerReferenceType(_customer_REFERENCE);

  public static final CustomerReferenceType department_NUMBER = new CustomerReferenceType(_department_NUMBER);

  public static final CustomerReferenceType electronic_PRODUCT_CODE = new CustomerReferenceType(_electronic_PRODUCT_CODE);

  public static final CustomerReferenceType intracountry_REGULATORY_REFERENCE = new CustomerReferenceType(_intracountry_REGULATORY_REFERENCE);

  public static final CustomerReferenceType invoice_NUMBER = new CustomerReferenceType(_invoice_NUMBER);

  public static final CustomerReferenceType p_O_NUMBER = new CustomerReferenceType(_p_O_NUMBER);

  public static final CustomerReferenceType rma_ASSOCIATION = new CustomerReferenceType(_rma_ASSOCIATION);

  public static final CustomerReferenceType shipment_INTEGRITY = new CustomerReferenceType(_shipment_INTEGRITY);

  public static final CustomerReferenceType store_NUMBER = new CustomerReferenceType(_store_NUMBER);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CustomerReferenceType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CustomerReferenceType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CustomerReferenceType fromString(String value) {
    return fromValue(value);
  }

  public String toXML() {
    return XsTypeConverter.printString(this.value).toString();
  }

  public String toString() {
    return String.valueOf(value);
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof CustomerReferenceType)) return false;
    final CustomerReferenceType x = (CustomerReferenceType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_bill_OF_LADING, bill_OF_LADING);
    map.put(_customer_REFERENCE, customer_REFERENCE);
    map.put(_department_NUMBER, department_NUMBER);
    map.put(_electronic_PRODUCT_CODE, electronic_PRODUCT_CODE);
    map.put(_intracountry_REGULATORY_REFERENCE, intracountry_REGULATORY_REFERENCE);
    map.put(_invoice_NUMBER, invoice_NUMBER);
    map.put(_p_O_NUMBER, p_O_NUMBER);
    map.put(_rma_ASSOCIATION, rma_ASSOCIATION);
    map.put(_shipment_INTEGRITY, shipment_INTEGRITY);
    map.put(_store_NUMBER, store_NUMBER);
  }

}
