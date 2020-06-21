/**
 * Generated from schema type t=SmartPostAncillaryEndorsementType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class SmartPostAncillaryEndorsementType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected SmartPostAncillaryEndorsementType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _address_CORRECTION = "ADDRESS_CORRECTION";

  public static final java.lang.String _carrier_LEAVE_IF_NO_RESPONSE = "CARRIER_LEAVE_IF_NO_RESPONSE";

  public static final java.lang.String _change_SERVICE = "CHANGE_SERVICE";

  public static final java.lang.String _forwarding_SERVICE = "FORWARDING_SERVICE";

  public static final java.lang.String _return_SERVICE = "RETURN_SERVICE";

  public static final SmartPostAncillaryEndorsementType address_CORRECTION = new SmartPostAncillaryEndorsementType(_address_CORRECTION);

  public static final SmartPostAncillaryEndorsementType carrier_LEAVE_IF_NO_RESPONSE = new SmartPostAncillaryEndorsementType(_carrier_LEAVE_IF_NO_RESPONSE);

  public static final SmartPostAncillaryEndorsementType change_SERVICE = new SmartPostAncillaryEndorsementType(_change_SERVICE);

  public static final SmartPostAncillaryEndorsementType forwarding_SERVICE = new SmartPostAncillaryEndorsementType(_forwarding_SERVICE);

  public static final SmartPostAncillaryEndorsementType return_SERVICE = new SmartPostAncillaryEndorsementType(_return_SERVICE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static SmartPostAncillaryEndorsementType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (SmartPostAncillaryEndorsementType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static SmartPostAncillaryEndorsementType fromString(String value) {
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
    if (!(obj instanceof SmartPostAncillaryEndorsementType)) return false;
    final SmartPostAncillaryEndorsementType x = (SmartPostAncillaryEndorsementType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_address_CORRECTION, address_CORRECTION);
    map.put(_carrier_LEAVE_IF_NO_RESPONSE, carrier_LEAVE_IF_NO_RESPONSE);
    map.put(_change_SERVICE, change_SERVICE);
    map.put(_forwarding_SERVICE, forwarding_SERVICE);
    map.put(_return_SERVICE, return_SERVICE);
  }

}
