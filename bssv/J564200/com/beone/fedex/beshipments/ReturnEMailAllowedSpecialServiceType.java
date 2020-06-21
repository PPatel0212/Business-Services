/**
 * Generated from schema type t=ReturnEMailAllowedSpecialServiceType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ReturnEMailAllowedSpecialServiceType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ReturnEMailAllowedSpecialServiceType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _saturday_DELIVERY = "SATURDAY_DELIVERY";

  public static final java.lang.String _saturday_PICKUP = "SATURDAY_PICKUP";

  public static final ReturnEMailAllowedSpecialServiceType saturday_DELIVERY = new ReturnEMailAllowedSpecialServiceType(_saturday_DELIVERY);

  public static final ReturnEMailAllowedSpecialServiceType saturday_PICKUP = new ReturnEMailAllowedSpecialServiceType(_saturday_PICKUP);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ReturnEMailAllowedSpecialServiceType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ReturnEMailAllowedSpecialServiceType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ReturnEMailAllowedSpecialServiceType fromString(String value) {
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
    if (!(obj instanceof ReturnEMailAllowedSpecialServiceType)) return false;
    final ReturnEMailAllowedSpecialServiceType x = (ReturnEMailAllowedSpecialServiceType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_saturday_DELIVERY, saturday_DELIVERY);
    map.put(_saturday_PICKUP, saturday_PICKUP);
  }

}
