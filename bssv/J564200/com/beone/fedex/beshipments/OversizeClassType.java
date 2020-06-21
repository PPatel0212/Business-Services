/**
 * Generated from schema type t=OversizeClassType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class OversizeClassType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected OversizeClassType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _oversize_1 = "OVERSIZE_1";

  public static final java.lang.String _oversize_2 = "OVERSIZE_2";

  public static final java.lang.String _oversize_3 = "OVERSIZE_3";

  public static final OversizeClassType oversize_1 = new OversizeClassType(_oversize_1);

  public static final OversizeClassType oversize_2 = new OversizeClassType(_oversize_2);

  public static final OversizeClassType oversize_3 = new OversizeClassType(_oversize_3);

  public java.lang.String getValue() {
    return this.value;
  }

  public static OversizeClassType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (OversizeClassType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static OversizeClassType fromString(String value) {
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
    if (!(obj instanceof OversizeClassType)) return false;
    final OversizeClassType x = (OversizeClassType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_oversize_1, oversize_1);
    map.put(_oversize_2, oversize_2);
    map.put(_oversize_3, oversize_3);
  }

}
