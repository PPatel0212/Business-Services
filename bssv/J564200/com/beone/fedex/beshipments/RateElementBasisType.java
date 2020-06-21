/**
 * Generated from schema type t=RateElementBasisType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RateElementBasisType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RateElementBasisType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _base_CHARGE = "BASE_CHARGE";

  public static final java.lang.String _net_CHARGE = "NET_CHARGE";

  public static final java.lang.String _net_CHARGE_EXCLUDING_TAXES = "NET_CHARGE_EXCLUDING_TAXES";

  public static final java.lang.String _net_FREIGHT = "NET_FREIGHT";

  public static final RateElementBasisType base_CHARGE = new RateElementBasisType(_base_CHARGE);

  public static final RateElementBasisType net_CHARGE = new RateElementBasisType(_net_CHARGE);

  public static final RateElementBasisType net_CHARGE_EXCLUDING_TAXES = new RateElementBasisType(_net_CHARGE_EXCLUDING_TAXES);

  public static final RateElementBasisType net_FREIGHT = new RateElementBasisType(_net_FREIGHT);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RateElementBasisType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RateElementBasisType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RateElementBasisType fromString(String value) {
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
    if (!(obj instanceof RateElementBasisType)) return false;
    final RateElementBasisType x = (RateElementBasisType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_base_CHARGE, base_CHARGE);
    map.put(_net_CHARGE, net_CHARGE);
    map.put(_net_CHARGE_EXCLUDING_TAXES, net_CHARGE_EXCLUDING_TAXES);
    map.put(_net_FREIGHT, net_FREIGHT);
  }

}
