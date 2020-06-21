/**
 * Generated from schema type t=RelativeVerticalPositionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RelativeVerticalPositionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RelativeVerticalPositionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _above = "ABOVE";

  public static final java.lang.String _below = "BELOW";

  public static final RelativeVerticalPositionType above = new RelativeVerticalPositionType(_above);

  public static final RelativeVerticalPositionType below = new RelativeVerticalPositionType(_below);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RelativeVerticalPositionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RelativeVerticalPositionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RelativeVerticalPositionType fromString(String value) {
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
    if (!(obj instanceof RelativeVerticalPositionType)) return false;
    final RelativeVerticalPositionType x = (RelativeVerticalPositionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_above, above);
    map.put(_below, below);
  }

}
