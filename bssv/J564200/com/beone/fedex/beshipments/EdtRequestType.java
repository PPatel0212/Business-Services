/**
 * Generated from schema type t=EdtRequestType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class EdtRequestType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected EdtRequestType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _all = "ALL";

  public static final java.lang.String _none = "NONE";

  public static final EdtRequestType all = new EdtRequestType(_all);

  public static final EdtRequestType none = new EdtRequestType(_none);

  public java.lang.String getValue() {
    return this.value;
  }

  public static EdtRequestType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (EdtRequestType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static EdtRequestType fromString(String value) {
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
    if (!(obj instanceof EdtRequestType)) return false;
    final EdtRequestType x = (EdtRequestType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_all, all);
    map.put(_none, none);
  }

}
