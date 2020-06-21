/**
 * Generated from schema type t=MinimumChargeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class MinimumChargeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected MinimumChargeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _customer = "CUSTOMER";

  public static final java.lang.String _customer_FREIGHT_WEIGHT = "CUSTOMER_FREIGHT_WEIGHT";

  public static final java.lang.String _earned_DISCOUNT = "EARNED_DISCOUNT";

  public static final java.lang.String _mixed = "MIXED";

  public static final java.lang.String _rate_SCALE = "RATE_SCALE";

  public static final MinimumChargeType customer = new MinimumChargeType(_customer);

  public static final MinimumChargeType customer_FREIGHT_WEIGHT = new MinimumChargeType(_customer_FREIGHT_WEIGHT);

  public static final MinimumChargeType earned_DISCOUNT = new MinimumChargeType(_earned_DISCOUNT);

  public static final MinimumChargeType mixed = new MinimumChargeType(_mixed);

  public static final MinimumChargeType rate_SCALE = new MinimumChargeType(_rate_SCALE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static MinimumChargeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (MinimumChargeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static MinimumChargeType fromString(String value) {
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
    if (!(obj instanceof MinimumChargeType)) return false;
    final MinimumChargeType x = (MinimumChargeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_customer, customer);
    map.put(_customer_FREIGHT_WEIGHT, customer_FREIGHT_WEIGHT);
    map.put(_earned_DISCOUNT, earned_DISCOUNT);
    map.put(_mixed, mixed);
    map.put(_rate_SCALE, rate_SCALE);
  }

}
