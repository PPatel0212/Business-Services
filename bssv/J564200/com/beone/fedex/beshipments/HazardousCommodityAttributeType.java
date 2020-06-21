/**
 * Generated from schema type t=HazardousCommodityAttributeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HazardousCommodityAttributeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HazardousCommodityAttributeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _not_SUBJECT_TO_REGULATIONS = "NOT_SUBJECT_TO_REGULATIONS";

  public static final java.lang.String _placarded_VEHICLE_REQUIRED = "PLACARDED_VEHICLE_REQUIRED";

  public static final HazardousCommodityAttributeType not_SUBJECT_TO_REGULATIONS = new HazardousCommodityAttributeType(_not_SUBJECT_TO_REGULATIONS);

  public static final HazardousCommodityAttributeType placarded_VEHICLE_REQUIRED = new HazardousCommodityAttributeType(_placarded_VEHICLE_REQUIRED);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HazardousCommodityAttributeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HazardousCommodityAttributeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HazardousCommodityAttributeType fromString(String value) {
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
    if (!(obj instanceof HazardousCommodityAttributeType)) return false;
    final HazardousCommodityAttributeType x = (HazardousCommodityAttributeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_not_SUBJECT_TO_REGULATIONS, not_SUBJECT_TO_REGULATIONS);
    map.put(_placarded_VEHICLE_REQUIRED, placarded_VEHICLE_REQUIRED);
  }

}
