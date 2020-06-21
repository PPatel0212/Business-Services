/**
 * Generated from schema type t=HazardousCommodityPackingGroupType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HazardousCommodityPackingGroupType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HazardousCommodityPackingGroupType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _value1 = "DEFAULT";

  public static final java.lang.String _value2 = "I";

  public static final java.lang.String _value3 = "II";

  public static final java.lang.String _value4 = "III";

  public static final HazardousCommodityPackingGroupType value1 = new HazardousCommodityPackingGroupType(_value1);

  public static final HazardousCommodityPackingGroupType value2 = new HazardousCommodityPackingGroupType(_value2);

  public static final HazardousCommodityPackingGroupType value3 = new HazardousCommodityPackingGroupType(_value3);

  public static final HazardousCommodityPackingGroupType value4 = new HazardousCommodityPackingGroupType(_value4);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HazardousCommodityPackingGroupType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HazardousCommodityPackingGroupType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HazardousCommodityPackingGroupType fromString(String value) {
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
    if (!(obj instanceof HazardousCommodityPackingGroupType)) return false;
    final HazardousCommodityPackingGroupType x = (HazardousCommodityPackingGroupType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_value1, value1);
    map.put(_value2, value2);
    map.put(_value3, value3);
    map.put(_value4, value4);
  }

}
