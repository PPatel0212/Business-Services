/**
 * Generated from schema type t=HazardousCommodityLabelTextOptionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HazardousCommodityLabelTextOptionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HazardousCommodityLabelTextOptionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _append = "APPEND";

  public static final java.lang.String _override = "OVERRIDE";

  public static final java.lang.String _standard = "STANDARD";

  public static final HazardousCommodityLabelTextOptionType append = new HazardousCommodityLabelTextOptionType(_append);

  public static final HazardousCommodityLabelTextOptionType override = new HazardousCommodityLabelTextOptionType(_override);

  public static final HazardousCommodityLabelTextOptionType standard = new HazardousCommodityLabelTextOptionType(_standard);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HazardousCommodityLabelTextOptionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HazardousCommodityLabelTextOptionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HazardousCommodityLabelTextOptionType fromString(String value) {
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
    if (!(obj instanceof HazardousCommodityLabelTextOptionType)) return false;
    final HazardousCommodityLabelTextOptionType x = (HazardousCommodityLabelTextOptionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_append, append);
    map.put(_override, override);
    map.put(_standard, standard);
  }

}
