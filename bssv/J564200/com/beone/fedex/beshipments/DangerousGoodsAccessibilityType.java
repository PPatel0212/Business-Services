/**
 * Generated from schema type t=DangerousGoodsAccessibilityType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class DangerousGoodsAccessibilityType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected DangerousGoodsAccessibilityType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _accessible = "ACCESSIBLE";

  public static final java.lang.String _inaccessible = "INACCESSIBLE";

  public static final DangerousGoodsAccessibilityType accessible = new DangerousGoodsAccessibilityType(_accessible);

  public static final DangerousGoodsAccessibilityType inaccessible = new DangerousGoodsAccessibilityType(_inaccessible);

  public java.lang.String getValue() {
    return this.value;
  }

  public static DangerousGoodsAccessibilityType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (DangerousGoodsAccessibilityType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static DangerousGoodsAccessibilityType fromString(String value) {
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
    if (!(obj instanceof DangerousGoodsAccessibilityType)) return false;
    final DangerousGoodsAccessibilityType x = (DangerousGoodsAccessibilityType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_accessible, accessible);
    map.put(_inaccessible, inaccessible);
  }

}
