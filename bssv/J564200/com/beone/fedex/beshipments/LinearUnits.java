/**
 * Generated from schema type t=LinearUnits@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class LinearUnits implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected LinearUnits(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _cm = "CM";

  public static final java.lang.String _in = "IN";

  public static final LinearUnits cm = new LinearUnits(_cm);

  public static final LinearUnits in = new LinearUnits(_in);

  public java.lang.String getValue() {
    return this.value;
  }

  public static LinearUnits fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (LinearUnits) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static LinearUnits fromString(String value) {
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
    if (!(obj instanceof LinearUnits)) return false;
    final LinearUnits x = (LinearUnits) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_cm, cm);
    map.put(_in, in);
  }

}
