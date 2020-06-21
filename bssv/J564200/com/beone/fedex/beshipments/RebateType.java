/**
 * Generated from schema type t=RebateType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RebateType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RebateType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _bonus = "BONUS";

  public static final java.lang.String _earned = "EARNED";

  public static final java.lang.String _other = "OTHER";

  public static final RebateType bonus = new RebateType(_bonus);

  public static final RebateType earned = new RebateType(_earned);

  public static final RebateType other = new RebateType(_other);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RebateType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RebateType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RebateType fromString(String value) {
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
    if (!(obj instanceof RebateType)) return false;
    final RebateType x = (RebateType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_bonus, bonus);
    map.put(_earned, earned);
    map.put(_other, other);
  }

}
