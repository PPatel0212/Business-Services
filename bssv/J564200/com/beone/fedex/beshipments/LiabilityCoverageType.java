/**
 * Generated from schema type t=LiabilityCoverageType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class LiabilityCoverageType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected LiabilityCoverageType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _value1 = "NEW";

  public static final java.lang.String _value2 = "USED_OR_RECONDITIONED";

  public static final LiabilityCoverageType value1 = new LiabilityCoverageType(_value1);

  public static final LiabilityCoverageType value2 = new LiabilityCoverageType(_value2);

  public java.lang.String getValue() {
    return this.value;
  }

  public static LiabilityCoverageType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (LiabilityCoverageType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static LiabilityCoverageType fromString(String value) {
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
    if (!(obj instanceof LiabilityCoverageType)) return false;
    final LiabilityCoverageType x = (LiabilityCoverageType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_value1, value1);
    map.put(_value2, value2);
  }

}
