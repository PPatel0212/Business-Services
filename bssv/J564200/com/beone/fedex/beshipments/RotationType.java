/**
 * Generated from schema type t=RotationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RotationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RotationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _left = "LEFT";

  public static final java.lang.String _none = "NONE";

  public static final java.lang.String _right = "RIGHT";

  public static final java.lang.String _upside_DOWN = "UPSIDE_DOWN";

  public static final RotationType left = new RotationType(_left);

  public static final RotationType none = new RotationType(_none);

  public static final RotationType right = new RotationType(_right);

  public static final RotationType upside_DOWN = new RotationType(_upside_DOWN);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RotationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RotationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RotationType fromString(String value) {
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
    if (!(obj instanceof RotationType)) return false;
    final RotationType x = (RotationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_left, left);
    map.put(_none, none);
    map.put(_right, right);
    map.put(_upside_DOWN, upside_DOWN);
  }

}
