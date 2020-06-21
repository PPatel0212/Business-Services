/**
 * Generated from schema type t=RatedWeightMethod@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RatedWeightMethod implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RatedWeightMethod(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _actual = "ACTUAL";

  public static final java.lang.String _average_PACKAGE_WEIGHT_MINIMUM = "AVERAGE_PACKAGE_WEIGHT_MINIMUM";

  public static final java.lang.String _balloon = "BALLOON";

  public static final java.lang.String _dim = "DIM";

  public static final java.lang.String _freight_MINIMUM = "FREIGHT_MINIMUM";

  public static final java.lang.String _mixed = "MIXED";

  public static final java.lang.String _oversize = "OVERSIZE";

  public static final java.lang.String _oversize_1 = "OVERSIZE_1";

  public static final java.lang.String _oversize_2 = "OVERSIZE_2";

  public static final java.lang.String _oversize_3 = "OVERSIZE_3";

  public static final java.lang.String _packaging_MINIMUM = "PACKAGING_MINIMUM";

  public static final java.lang.String _weight_BREAK = "WEIGHT_BREAK";

  public static final RatedWeightMethod actual = new RatedWeightMethod(_actual);

  public static final RatedWeightMethod average_PACKAGE_WEIGHT_MINIMUM = new RatedWeightMethod(_average_PACKAGE_WEIGHT_MINIMUM);

  public static final RatedWeightMethod balloon = new RatedWeightMethod(_balloon);

  public static final RatedWeightMethod dim = new RatedWeightMethod(_dim);

  public static final RatedWeightMethod freight_MINIMUM = new RatedWeightMethod(_freight_MINIMUM);

  public static final RatedWeightMethod mixed = new RatedWeightMethod(_mixed);

  public static final RatedWeightMethod oversize = new RatedWeightMethod(_oversize);

  public static final RatedWeightMethod oversize_1 = new RatedWeightMethod(_oversize_1);

  public static final RatedWeightMethod oversize_2 = new RatedWeightMethod(_oversize_2);

  public static final RatedWeightMethod oversize_3 = new RatedWeightMethod(_oversize_3);

  public static final RatedWeightMethod packaging_MINIMUM = new RatedWeightMethod(_packaging_MINIMUM);

  public static final RatedWeightMethod weight_BREAK = new RatedWeightMethod(_weight_BREAK);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RatedWeightMethod fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RatedWeightMethod) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RatedWeightMethod fromString(String value) {
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
    if (!(obj instanceof RatedWeightMethod)) return false;
    final RatedWeightMethod x = (RatedWeightMethod) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_actual, actual);
    map.put(_average_PACKAGE_WEIGHT_MINIMUM, average_PACKAGE_WEIGHT_MINIMUM);
    map.put(_balloon, balloon);
    map.put(_dim, dim);
    map.put(_freight_MINIMUM, freight_MINIMUM);
    map.put(_mixed, mixed);
    map.put(_oversize, oversize);
    map.put(_oversize_1, oversize_1);
    map.put(_oversize_2, oversize_2);
    map.put(_oversize_3, oversize_3);
    map.put(_packaging_MINIMUM, packaging_MINIMUM);
    map.put(_weight_BREAK, weight_BREAK);
  }

}
