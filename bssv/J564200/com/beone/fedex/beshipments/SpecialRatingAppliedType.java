/**
 * Generated from schema type t=SpecialRatingAppliedType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class SpecialRatingAppliedType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected SpecialRatingAppliedType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _fixed_FUEL_SURCHARGE = "FIXED_FUEL_SURCHARGE";

  public static final java.lang.String _import_PRICING = "IMPORT_PRICING";

  public static final SpecialRatingAppliedType fixed_FUEL_SURCHARGE = new SpecialRatingAppliedType(_fixed_FUEL_SURCHARGE);

  public static final SpecialRatingAppliedType import_PRICING = new SpecialRatingAppliedType(_import_PRICING);

  public java.lang.String getValue() {
    return this.value;
  }

  public static SpecialRatingAppliedType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (SpecialRatingAppliedType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static SpecialRatingAppliedType fromString(String value) {
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
    if (!(obj instanceof SpecialRatingAppliedType)) return false;
    final SpecialRatingAppliedType x = (SpecialRatingAppliedType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_fixed_FUEL_SURCHARGE, fixed_FUEL_SURCHARGE);
    map.put(_import_PRICING, import_PRICING);
  }

}
