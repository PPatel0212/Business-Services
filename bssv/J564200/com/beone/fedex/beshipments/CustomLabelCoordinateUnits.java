/**
 * Generated from schema type t=CustomLabelCoordinateUnits@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CustomLabelCoordinateUnits implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CustomLabelCoordinateUnits(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _mils = "MILS";

  public static final java.lang.String _pixels = "PIXELS";

  public static final CustomLabelCoordinateUnits mils = new CustomLabelCoordinateUnits(_mils);

  public static final CustomLabelCoordinateUnits pixels = new CustomLabelCoordinateUnits(_pixels);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CustomLabelCoordinateUnits fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CustomLabelCoordinateUnits) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CustomLabelCoordinateUnits fromString(String value) {
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
    if (!(obj instanceof CustomLabelCoordinateUnits)) return false;
    final CustomLabelCoordinateUnits x = (CustomLabelCoordinateUnits) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_mils, mils);
    map.put(_pixels, pixels);
  }

}
