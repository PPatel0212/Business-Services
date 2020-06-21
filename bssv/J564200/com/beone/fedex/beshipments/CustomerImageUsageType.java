/**
 * Generated from schema type t=CustomerImageUsageType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CustomerImageUsageType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CustomerImageUsageType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _letter_HEAD = "LETTER_HEAD";

  public static final java.lang.String _signature = "SIGNATURE";

  public static final CustomerImageUsageType letter_HEAD = new CustomerImageUsageType(_letter_HEAD);

  public static final CustomerImageUsageType signature = new CustomerImageUsageType(_signature);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CustomerImageUsageType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CustomerImageUsageType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CustomerImageUsageType fromString(String value) {
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
    if (!(obj instanceof CustomerImageUsageType)) return false;
    final CustomerImageUsageType x = (CustomerImageUsageType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_letter_HEAD, letter_HEAD);
    map.put(_signature, signature);
  }

}
