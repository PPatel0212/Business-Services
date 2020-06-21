/**
 * Generated from schema type t=DropoffType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class DropoffType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected DropoffType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _business_SERVICE_CENTER = "BUSINESS_SERVICE_CENTER";

  public static final java.lang.String _drop_BOX = "DROP_BOX";

  public static final java.lang.String _regular_PICKUP = "REGULAR_PICKUP";

  public static final java.lang.String _request_COURIER = "REQUEST_COURIER";

  public static final java.lang.String _station = "STATION";

  public static final DropoffType business_SERVICE_CENTER = new DropoffType(_business_SERVICE_CENTER);

  public static final DropoffType drop_BOX = new DropoffType(_drop_BOX);

  public static final DropoffType regular_PICKUP = new DropoffType(_regular_PICKUP);

  public static final DropoffType request_COURIER = new DropoffType(_request_COURIER);

  public static final DropoffType station = new DropoffType(_station);

  public java.lang.String getValue() {
    return this.value;
  }

  public static DropoffType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (DropoffType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static DropoffType fromString(String value) {
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
    if (!(obj instanceof DropoffType)) return false;
    final DropoffType x = (DropoffType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_business_SERVICE_CENTER, business_SERVICE_CENTER);
    map.put(_drop_BOX, drop_BOX);
    map.put(_regular_PICKUP, regular_PICKUP);
    map.put(_request_COURIER, request_COURIER);
    map.put(_station, station);
  }

}
