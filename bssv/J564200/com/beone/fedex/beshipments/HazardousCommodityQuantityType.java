/**
 * Generated from schema type t=HazardousCommodityQuantityType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HazardousCommodityQuantityType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HazardousCommodityQuantityType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _gross = "GROSS";

  public static final java.lang.String _net = "NET";

  public static final HazardousCommodityQuantityType gross = new HazardousCommodityQuantityType(_gross);

  public static final HazardousCommodityQuantityType net = new HazardousCommodityQuantityType(_net);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HazardousCommodityQuantityType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HazardousCommodityQuantityType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HazardousCommodityQuantityType fromString(String value) {
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
    if (!(obj instanceof HazardousCommodityQuantityType)) return false;
    final HazardousCommodityQuantityType x = (HazardousCommodityQuantityType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_gross, gross);
    map.put(_net, net);
  }

}
