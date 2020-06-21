/**
 * Generated from schema type t=LabelRotationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class LabelRotationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected LabelRotationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _left = "LEFT";

  public static final java.lang.String _none = "NONE";

  public static final java.lang.String _right = "RIGHT";

  public static final java.lang.String _upside_DOWN = "UPSIDE_DOWN";

  public static final LabelRotationType left = new LabelRotationType(_left);

  public static final LabelRotationType none = new LabelRotationType(_none);

  public static final LabelRotationType right = new LabelRotationType(_right);

  public static final LabelRotationType upside_DOWN = new LabelRotationType(_upside_DOWN);

  public java.lang.String getValue() {
    return this.value;
  }

  public static LabelRotationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (LabelRotationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static LabelRotationType fromString(String value) {
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
    if (!(obj instanceof LabelRotationType)) return false;
    final LabelRotationType x = (LabelRotationType) obj;
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
