/**
 * Generated from schema type t=CustomDeliveryWindowType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CustomDeliveryWindowType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CustomDeliveryWindowType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _after = "AFTER";

  public static final java.lang.String _before = "BEFORE";

  public static final java.lang.String _between = "BETWEEN";

  public static final java.lang.String _on = "ON";

  public static final CustomDeliveryWindowType after = new CustomDeliveryWindowType(_after);

  public static final CustomDeliveryWindowType before = new CustomDeliveryWindowType(_before);

  public static final CustomDeliveryWindowType between = new CustomDeliveryWindowType(_between);

  public static final CustomDeliveryWindowType on = new CustomDeliveryWindowType(_on);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CustomDeliveryWindowType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CustomDeliveryWindowType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CustomDeliveryWindowType fromString(String value) {
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
    if (!(obj instanceof CustomDeliveryWindowType)) return false;
    final CustomDeliveryWindowType x = (CustomDeliveryWindowType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_after, after);
    map.put(_before, before);
    map.put(_between, between);
    map.put(_on, on);
  }

}
