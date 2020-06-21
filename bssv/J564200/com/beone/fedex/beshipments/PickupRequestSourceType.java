/**
 * Generated from schema type t=PickupRequestSourceType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PickupRequestSourceType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PickupRequestSourceType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _automation = "AUTOMATION";

  public static final java.lang.String _customer_SERVICE = "CUSTOMER_SERVICE";

  public static final PickupRequestSourceType automation = new PickupRequestSourceType(_automation);

  public static final PickupRequestSourceType customer_SERVICE = new PickupRequestSourceType(_customer_SERVICE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PickupRequestSourceType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PickupRequestSourceType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PickupRequestSourceType fromString(String value) {
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
    if (!(obj instanceof PickupRequestSourceType)) return false;
    final PickupRequestSourceType x = (PickupRequestSourceType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_automation, automation);
    map.put(_customer_SERVICE, customer_SERVICE);
  }

}
