/**
 * Generated from schema type t=GroundDeliveryEligibilityType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class GroundDeliveryEligibilityType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected GroundDeliveryEligibilityType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _alternate_DAY_SERVICE = "ALTERNATE_DAY_SERVICE";

  public static final java.lang.String _cartage_AGENT_DELIVERY = "CARTAGE_AGENT_DELIVERY";

  public static final java.lang.String _saturday_DELIVERY = "SATURDAY_DELIVERY";

  public static final java.lang.String _usps_DELIVERY = "USPS_DELIVERY";

  public static final GroundDeliveryEligibilityType alternate_DAY_SERVICE = new GroundDeliveryEligibilityType(_alternate_DAY_SERVICE);

  public static final GroundDeliveryEligibilityType cartage_AGENT_DELIVERY = new GroundDeliveryEligibilityType(_cartage_AGENT_DELIVERY);

  public static final GroundDeliveryEligibilityType saturday_DELIVERY = new GroundDeliveryEligibilityType(_saturday_DELIVERY);

  public static final GroundDeliveryEligibilityType usps_DELIVERY = new GroundDeliveryEligibilityType(_usps_DELIVERY);

  public java.lang.String getValue() {
    return this.value;
  }

  public static GroundDeliveryEligibilityType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (GroundDeliveryEligibilityType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static GroundDeliveryEligibilityType fromString(String value) {
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
    if (!(obj instanceof GroundDeliveryEligibilityType)) return false;
    final GroundDeliveryEligibilityType x = (GroundDeliveryEligibilityType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_alternate_DAY_SERVICE, alternate_DAY_SERVICE);
    map.put(_cartage_AGENT_DELIVERY, cartage_AGENT_DELIVERY);
    map.put(_saturday_DELIVERY, saturday_DELIVERY);
    map.put(_usps_DELIVERY, usps_DELIVERY);
  }

}
