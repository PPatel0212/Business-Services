/**
 * Generated from schema type t=RateDimensionalDivisorType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RateDimensionalDivisorType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RateDimensionalDivisorType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _country = "COUNTRY";

  public static final java.lang.String _customer = "CUSTOMER";

  public static final java.lang.String _other = "OTHER";

  public static final java.lang.String _product = "PRODUCT";

  public static final java.lang.String _waived = "WAIVED";

  public static final RateDimensionalDivisorType country = new RateDimensionalDivisorType(_country);

  public static final RateDimensionalDivisorType customer = new RateDimensionalDivisorType(_customer);

  public static final RateDimensionalDivisorType other = new RateDimensionalDivisorType(_other);

  public static final RateDimensionalDivisorType product = new RateDimensionalDivisorType(_product);

  public static final RateDimensionalDivisorType waived = new RateDimensionalDivisorType(_waived);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RateDimensionalDivisorType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RateDimensionalDivisorType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RateDimensionalDivisorType fromString(String value) {
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
    if (!(obj instanceof RateDimensionalDivisorType)) return false;
    final RateDimensionalDivisorType x = (RateDimensionalDivisorType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_country, country);
    map.put(_customer, customer);
    map.put(_other, other);
    map.put(_product, product);
    map.put(_waived, waived);
  }

}
