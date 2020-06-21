/**
 * Generated from schema type t=NaftaPreferenceCriterionCode@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class NaftaPreferenceCriterionCode implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected NaftaPreferenceCriterionCode(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _a = "A";

  public static final java.lang.String _b = "B";

  public static final java.lang.String _c = "C";

  public static final java.lang.String _d = "D";

  public static final java.lang.String _e = "E";

  public static final java.lang.String _f = "F";

  public static final NaftaPreferenceCriterionCode a = new NaftaPreferenceCriterionCode(_a);

  public static final NaftaPreferenceCriterionCode b = new NaftaPreferenceCriterionCode(_b);

  public static final NaftaPreferenceCriterionCode c = new NaftaPreferenceCriterionCode(_c);

  public static final NaftaPreferenceCriterionCode d = new NaftaPreferenceCriterionCode(_d);

  public static final NaftaPreferenceCriterionCode e = new NaftaPreferenceCriterionCode(_e);

  public static final NaftaPreferenceCriterionCode f = new NaftaPreferenceCriterionCode(_f);

  public java.lang.String getValue() {
    return this.value;
  }

  public static NaftaPreferenceCriterionCode fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (NaftaPreferenceCriterionCode) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static NaftaPreferenceCriterionCode fromString(String value) {
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
    if (!(obj instanceof NaftaPreferenceCriterionCode)) return false;
    final NaftaPreferenceCriterionCode x = (NaftaPreferenceCriterionCode) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_a, a);
    map.put(_b, b);
    map.put(_c, c);
    map.put(_d, d);
    map.put(_e, e);
    map.put(_f, f);
  }

}
