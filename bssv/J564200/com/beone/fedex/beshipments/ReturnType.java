/**
 * Generated from schema type t=ReturnType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ReturnType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ReturnType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _fedex_TAG = "FEDEX_TAG";

  public static final java.lang.String _pending = "PENDING";

  public static final java.lang.String _print_RETURN_LABEL = "PRINT_RETURN_LABEL";

  public static final ReturnType fedex_TAG = new ReturnType(_fedex_TAG);

  public static final ReturnType pending = new ReturnType(_pending);

  public static final ReturnType print_RETURN_LABEL = new ReturnType(_print_RETURN_LABEL);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ReturnType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ReturnType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ReturnType fromString(String value) {
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
    if (!(obj instanceof ReturnType)) return false;
    final ReturnType x = (ReturnType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_fedex_TAG, fedex_TAG);
    map.put(_pending, pending);
    map.put(_print_RETURN_LABEL, print_RETURN_LABEL);
  }

}
