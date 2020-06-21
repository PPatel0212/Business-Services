/**
 * Generated from schema type t=PendingShipmentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PendingShipmentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PendingShipmentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _email = "EMAIL";

  public static final PendingShipmentType email = new PendingShipmentType(_email);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PendingShipmentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PendingShipmentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PendingShipmentType fromString(String value) {
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
    if (!(obj instanceof PendingShipmentType)) return false;
    final PendingShipmentType x = (PendingShipmentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_email, email);
  }

}
