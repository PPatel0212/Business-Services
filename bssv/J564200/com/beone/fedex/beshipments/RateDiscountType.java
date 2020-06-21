/**
 * Generated from schema type t=RateDiscountType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RateDiscountType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RateDiscountType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _bonus = "BONUS";

  public static final java.lang.String _coupon = "COUPON";

  public static final java.lang.String _earned = "EARNED";

  public static final java.lang.String _incentive = "INCENTIVE";

  public static final java.lang.String _other = "OTHER";

  public static final java.lang.String _volume = "VOLUME";

  public static final RateDiscountType bonus = new RateDiscountType(_bonus);

  public static final RateDiscountType coupon = new RateDiscountType(_coupon);

  public static final RateDiscountType earned = new RateDiscountType(_earned);

  public static final RateDiscountType incentive = new RateDiscountType(_incentive);

  public static final RateDiscountType other = new RateDiscountType(_other);

  public static final RateDiscountType volume = new RateDiscountType(_volume);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RateDiscountType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RateDiscountType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RateDiscountType fromString(String value) {
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
    if (!(obj instanceof RateDiscountType)) return false;
    final RateDiscountType x = (RateDiscountType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_bonus, bonus);
    map.put(_coupon, coupon);
    map.put(_earned, earned);
    map.put(_incentive, incentive);
    map.put(_other, other);
    map.put(_volume, volume);
  }

}
