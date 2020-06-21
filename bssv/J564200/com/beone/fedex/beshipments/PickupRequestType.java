/**
 * Generated from schema type t=PickupRequestType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PickupRequestType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PickupRequestType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _future_DAY = "FUTURE_DAY";

  public static final java.lang.String _same_DAY = "SAME_DAY";

  public static final PickupRequestType future_DAY = new PickupRequestType(_future_DAY);

  public static final PickupRequestType same_DAY = new PickupRequestType(_same_DAY);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PickupRequestType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PickupRequestType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PickupRequestType fromString(String value) {
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
    if (!(obj instanceof PickupRequestType)) return false;
    final PickupRequestType x = (PickupRequestType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_future_DAY, future_DAY);
    map.put(_same_DAY, same_DAY);
  }

}
