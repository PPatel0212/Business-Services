/**
 * Generated from schema type t=WeightUnits@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class WeightUnits implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected WeightUnits(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _kg = "KG";

  public static final java.lang.String _lb = "LB";

  public static final WeightUnits kg = new WeightUnits(_kg);

  public static final WeightUnits lb = new WeightUnits(_lb);

  public java.lang.String getValue() {
    return this.value;
  }

  public static WeightUnits fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (WeightUnits) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static WeightUnits fromString(String value) {
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
    if (!(obj instanceof WeightUnits)) return false;
    final WeightUnits x = (WeightUnits) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_kg, kg);
    map.put(_lb, lb);
  }

}
