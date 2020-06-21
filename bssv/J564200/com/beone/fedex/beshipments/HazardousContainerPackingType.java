/**
 * Generated from schema type t=HazardousContainerPackingType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HazardousContainerPackingType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HazardousContainerPackingType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _all_PACKED_IN_ONE = "ALL_PACKED_IN_ONE";

  public static final HazardousContainerPackingType all_PACKED_IN_ONE = new HazardousContainerPackingType(_all_PACKED_IN_ONE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HazardousContainerPackingType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HazardousContainerPackingType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HazardousContainerPackingType fromString(String value) {
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
    if (!(obj instanceof HazardousContainerPackingType)) return false;
    final HazardousContainerPackingType x = (HazardousContainerPackingType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_all_PACKED_IN_ONE, all_PACKED_IN_ONE);
  }

}
