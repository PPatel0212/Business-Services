/**
 * Generated from schema type t=FreightShipmentRoleType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FreightShipmentRoleType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FreightShipmentRoleType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _consignee = "CONSIGNEE";

  public static final java.lang.String _shipper = "SHIPPER";

  public static final FreightShipmentRoleType consignee = new FreightShipmentRoleType(_consignee);

  public static final FreightShipmentRoleType shipper = new FreightShipmentRoleType(_shipper);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FreightShipmentRoleType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FreightShipmentRoleType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FreightShipmentRoleType fromString(String value) {
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
    if (!(obj instanceof FreightShipmentRoleType)) return false;
    final FreightShipmentRoleType x = (FreightShipmentRoleType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_consignee, consignee);
    map.put(_shipper, shipper);
  }

}
