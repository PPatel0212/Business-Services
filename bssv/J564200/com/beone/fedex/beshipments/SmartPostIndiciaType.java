/**
 * Generated from schema type t=SmartPostIndiciaType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class SmartPostIndiciaType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected SmartPostIndiciaType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _media_MAIL = "MEDIA_MAIL";

  public static final java.lang.String _parcel_RETURN = "PARCEL_RETURN";

  public static final java.lang.String _parcel_SELECT = "PARCEL_SELECT";

  public static final java.lang.String _presorted_BOUND_PRINTED_MATTER = "PRESORTED_BOUND_PRINTED_MATTER";

  public static final java.lang.String _presorted_STANDARD = "PRESORTED_STANDARD";

  public static final SmartPostIndiciaType media_MAIL = new SmartPostIndiciaType(_media_MAIL);

  public static final SmartPostIndiciaType parcel_RETURN = new SmartPostIndiciaType(_parcel_RETURN);

  public static final SmartPostIndiciaType parcel_SELECT = new SmartPostIndiciaType(_parcel_SELECT);

  public static final SmartPostIndiciaType presorted_BOUND_PRINTED_MATTER = new SmartPostIndiciaType(_presorted_BOUND_PRINTED_MATTER);

  public static final SmartPostIndiciaType presorted_STANDARD = new SmartPostIndiciaType(_presorted_STANDARD);

  public java.lang.String getValue() {
    return this.value;
  }

  public static SmartPostIndiciaType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (SmartPostIndiciaType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static SmartPostIndiciaType fromString(String value) {
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
    if (!(obj instanceof SmartPostIndiciaType)) return false;
    final SmartPostIndiciaType x = (SmartPostIndiciaType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_media_MAIL, media_MAIL);
    map.put(_parcel_RETURN, parcel_RETURN);
    map.put(_parcel_SELECT, parcel_SELECT);
    map.put(_presorted_BOUND_PRINTED_MATTER, presorted_BOUND_PRINTED_MATTER);
    map.put(_presorted_STANDARD, presorted_STANDARD);
  }

}
