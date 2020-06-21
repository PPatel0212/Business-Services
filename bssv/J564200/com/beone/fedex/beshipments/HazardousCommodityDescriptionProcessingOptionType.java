/**
 * Generated from schema type t=HazardousCommodityDescriptionProcessingOptionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HazardousCommodityDescriptionProcessingOptionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HazardousCommodityDescriptionProcessingOptionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _include_SPECIAL_PROVISIONS = "INCLUDE_SPECIAL_PROVISIONS";

  public static final HazardousCommodityDescriptionProcessingOptionType include_SPECIAL_PROVISIONS = new HazardousCommodityDescriptionProcessingOptionType(_include_SPECIAL_PROVISIONS);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HazardousCommodityDescriptionProcessingOptionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HazardousCommodityDescriptionProcessingOptionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HazardousCommodityDescriptionProcessingOptionType fromString(String value) {
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
    if (!(obj instanceof HazardousCommodityDescriptionProcessingOptionType)) return false;
    final HazardousCommodityDescriptionProcessingOptionType x = (HazardousCommodityDescriptionProcessingOptionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_include_SPECIAL_PROVISIONS, include_SPECIAL_PROVISIONS);
  }

}
