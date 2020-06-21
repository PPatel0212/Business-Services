/**
 * Generated from schema type t=FedExLocationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FedExLocationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FedExLocationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _fedex_EXPRESS_STATION = "FEDEX_EXPRESS_STATION";

  public static final java.lang.String _fedex_FACILITY = "FEDEX_FACILITY";

  public static final java.lang.String _fedex_FREIGHT_SERVICE_CENTER = "FEDEX_FREIGHT_SERVICE_CENTER";

  public static final java.lang.String _fedex_GROUND_TERMINAL = "FEDEX_GROUND_TERMINAL";

  public static final java.lang.String _fedex_HOME_DELIVERY_STATION = "FEDEX_HOME_DELIVERY_STATION";

  public static final java.lang.String _fedex_OFFICE = "FEDEX_OFFICE";

  public static final java.lang.String _fedex_SHIPSITE = "FEDEX_SHIPSITE";

  public static final java.lang.String _fedex_SMART_POST_HUB = "FEDEX_SMART_POST_HUB";

  public static final FedExLocationType fedex_EXPRESS_STATION = new FedExLocationType(_fedex_EXPRESS_STATION);

  public static final FedExLocationType fedex_FACILITY = new FedExLocationType(_fedex_FACILITY);

  public static final FedExLocationType fedex_FREIGHT_SERVICE_CENTER = new FedExLocationType(_fedex_FREIGHT_SERVICE_CENTER);

  public static final FedExLocationType fedex_GROUND_TERMINAL = new FedExLocationType(_fedex_GROUND_TERMINAL);

  public static final FedExLocationType fedex_HOME_DELIVERY_STATION = new FedExLocationType(_fedex_HOME_DELIVERY_STATION);

  public static final FedExLocationType fedex_OFFICE = new FedExLocationType(_fedex_OFFICE);

  public static final FedExLocationType fedex_SHIPSITE = new FedExLocationType(_fedex_SHIPSITE);

  public static final FedExLocationType fedex_SMART_POST_HUB = new FedExLocationType(_fedex_SMART_POST_HUB);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FedExLocationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FedExLocationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FedExLocationType fromString(String value) {
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
    if (!(obj instanceof FedExLocationType)) return false;
    final FedExLocationType x = (FedExLocationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_fedex_EXPRESS_STATION, fedex_EXPRESS_STATION);
    map.put(_fedex_FACILITY, fedex_FACILITY);
    map.put(_fedex_FREIGHT_SERVICE_CENTER, fedex_FREIGHT_SERVICE_CENTER);
    map.put(_fedex_GROUND_TERMINAL, fedex_GROUND_TERMINAL);
    map.put(_fedex_HOME_DELIVERY_STATION, fedex_HOME_DELIVERY_STATION);
    map.put(_fedex_OFFICE, fedex_OFFICE);
    map.put(_fedex_SHIPSITE, fedex_SHIPSITE);
    map.put(_fedex_SMART_POST_HUB, fedex_SMART_POST_HUB);
  }

}
