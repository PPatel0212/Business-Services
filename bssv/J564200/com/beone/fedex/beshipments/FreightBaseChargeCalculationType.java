/**
 * Generated from schema type t=FreightBaseChargeCalculationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FreightBaseChargeCalculationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FreightBaseChargeCalculationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _beyond = "BEYOND";

  public static final java.lang.String _line_ITEMS = "LINE_ITEMS";

  public static final java.lang.String _unit_PRICING = "UNIT_PRICING";

  public static final FreightBaseChargeCalculationType beyond = new FreightBaseChargeCalculationType(_beyond);

  public static final FreightBaseChargeCalculationType line_ITEMS = new FreightBaseChargeCalculationType(_line_ITEMS);

  public static final FreightBaseChargeCalculationType unit_PRICING = new FreightBaseChargeCalculationType(_unit_PRICING);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FreightBaseChargeCalculationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FreightBaseChargeCalculationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FreightBaseChargeCalculationType fromString(String value) {
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
    if (!(obj instanceof FreightBaseChargeCalculationType)) return false;
    final FreightBaseChargeCalculationType x = (FreightBaseChargeCalculationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_beyond, beyond);
    map.put(_line_ITEMS, line_ITEMS);
    map.put(_unit_PRICING, unit_PRICING);
  }

}
