/**
 * Generated from schema type t=FreightOnValueType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FreightOnValueType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FreightOnValueType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _carrier_RISK = "CARRIER_RISK";

  public static final java.lang.String _own_RISK = "OWN_RISK";

  public static final FreightOnValueType carrier_RISK = new FreightOnValueType(_carrier_RISK);

  public static final FreightOnValueType own_RISK = new FreightOnValueType(_own_RISK);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FreightOnValueType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FreightOnValueType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FreightOnValueType fromString(String value) {
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
    if (!(obj instanceof FreightOnValueType)) return false;
    final FreightOnValueType x = (FreightOnValueType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_carrier_RISK, carrier_RISK);
    map.put(_own_RISK, own_RISK);
  }

}
