/**
 * Generated from schema type t=CodAdjustmentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CodAdjustmentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CodAdjustmentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _charges_ADDED = "CHARGES_ADDED";

  public static final java.lang.String _none = "NONE";

  public static final CodAdjustmentType charges_ADDED = new CodAdjustmentType(_charges_ADDED);

  public static final CodAdjustmentType none = new CodAdjustmentType(_none);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CodAdjustmentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CodAdjustmentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CodAdjustmentType fromString(String value) {
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
    if (!(obj instanceof CodAdjustmentType)) return false;
    final CodAdjustmentType x = (CodAdjustmentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_charges_ADDED, charges_ADDED);
    map.put(_none, none);
  }

}
