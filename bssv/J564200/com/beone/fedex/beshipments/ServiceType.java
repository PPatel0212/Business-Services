/**
 * Generated from schema type t=ServiceType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ServiceType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ServiceType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _europe_FIRST_INTERNATIONAL_PRIORITY = "EUROPE_FIRST_INTERNATIONAL_PRIORITY";

  public static final java.lang.String _fedex_1_DAY_FREIGHT = "FEDEX_1_DAY_FREIGHT";

  public static final java.lang.String _fedex_2_DAY = "FEDEX_2_DAY";

  public static final java.lang.String _fedex_2_DAY_AM = "FEDEX_2_DAY_AM";

  public static final java.lang.String _fedex_2_DAY_FREIGHT = "FEDEX_2_DAY_FREIGHT";

  public static final java.lang.String _fedex_3_DAY_FREIGHT = "FEDEX_3_DAY_FREIGHT";

  public static final java.lang.String _fedex_DISTANCE_DEFERRED = "FEDEX_DISTANCE_DEFERRED";

  public static final java.lang.String _fedex_EXPRESS_SAVER = "FEDEX_EXPRESS_SAVER";

  public static final java.lang.String _fedex_FIRST_FREIGHT = "FEDEX_FIRST_FREIGHT";

  public static final java.lang.String _fedex_FREIGHT_ECONOMY = "FEDEX_FREIGHT_ECONOMY";

  public static final java.lang.String _fedex_FREIGHT_PRIORITY = "FEDEX_FREIGHT_PRIORITY";

  public static final java.lang.String _fedex_GROUND = "FEDEX_GROUND";

  public static final java.lang.String _fedex_NEXT_DAY_AFTERNOON = "FEDEX_NEXT_DAY_AFTERNOON";

  public static final java.lang.String _fedex_NEXT_DAY_EARLY_MORNING = "FEDEX_NEXT_DAY_EARLY_MORNING";

  public static final java.lang.String _fedex_NEXT_DAY_END_OF_DAY = "FEDEX_NEXT_DAY_END_OF_DAY";

  public static final java.lang.String _fedex_NEXT_DAY_FREIGHT = "FEDEX_NEXT_DAY_FREIGHT";

  public static final java.lang.String _fedex_NEXT_DAY_MID_MORNING = "FEDEX_NEXT_DAY_MID_MORNING";

  public static final java.lang.String _first_OVERNIGHT = "FIRST_OVERNIGHT";

  public static final java.lang.String _ground_HOME_DELIVERY = "GROUND_HOME_DELIVERY";

  public static final java.lang.String _international_ECONOMY = "INTERNATIONAL_ECONOMY";

  public static final java.lang.String _international_ECONOMY_FREIGHT = "INTERNATIONAL_ECONOMY_FREIGHT";

  public static final java.lang.String _international_FIRST = "INTERNATIONAL_FIRST";

  public static final java.lang.String _international_PRIORITY = "INTERNATIONAL_PRIORITY";

  public static final java.lang.String _international_PRIORITY_FREIGHT = "INTERNATIONAL_PRIORITY_FREIGHT";

  public static final java.lang.String _priority_OVERNIGHT = "PRIORITY_OVERNIGHT";

  public static final java.lang.String _same_DAY = "SAME_DAY";

  public static final java.lang.String _same_DAY_CITY = "SAME_DAY_CITY";

  public static final java.lang.String _smart_POST = "SMART_POST";

  public static final java.lang.String _standard_OVERNIGHT = "STANDARD_OVERNIGHT";

  public static final ServiceType europe_FIRST_INTERNATIONAL_PRIORITY = new ServiceType(_europe_FIRST_INTERNATIONAL_PRIORITY);

  public static final ServiceType fedex_1_DAY_FREIGHT = new ServiceType(_fedex_1_DAY_FREIGHT);

  public static final ServiceType fedex_2_DAY = new ServiceType(_fedex_2_DAY);

  public static final ServiceType fedex_2_DAY_AM = new ServiceType(_fedex_2_DAY_AM);

  public static final ServiceType fedex_2_DAY_FREIGHT = new ServiceType(_fedex_2_DAY_FREIGHT);

  public static final ServiceType fedex_3_DAY_FREIGHT = new ServiceType(_fedex_3_DAY_FREIGHT);

  public static final ServiceType fedex_DISTANCE_DEFERRED = new ServiceType(_fedex_DISTANCE_DEFERRED);

  public static final ServiceType fedex_EXPRESS_SAVER = new ServiceType(_fedex_EXPRESS_SAVER);

  public static final ServiceType fedex_FIRST_FREIGHT = new ServiceType(_fedex_FIRST_FREIGHT);

  public static final ServiceType fedex_FREIGHT_ECONOMY = new ServiceType(_fedex_FREIGHT_ECONOMY);

  public static final ServiceType fedex_FREIGHT_PRIORITY = new ServiceType(_fedex_FREIGHT_PRIORITY);

  public static final ServiceType fedex_GROUND = new ServiceType(_fedex_GROUND);

  public static final ServiceType fedex_NEXT_DAY_AFTERNOON = new ServiceType(_fedex_NEXT_DAY_AFTERNOON);

  public static final ServiceType fedex_NEXT_DAY_EARLY_MORNING = new ServiceType(_fedex_NEXT_DAY_EARLY_MORNING);

  public static final ServiceType fedex_NEXT_DAY_END_OF_DAY = new ServiceType(_fedex_NEXT_DAY_END_OF_DAY);

  public static final ServiceType fedex_NEXT_DAY_FREIGHT = new ServiceType(_fedex_NEXT_DAY_FREIGHT);

  public static final ServiceType fedex_NEXT_DAY_MID_MORNING = new ServiceType(_fedex_NEXT_DAY_MID_MORNING);

  public static final ServiceType first_OVERNIGHT = new ServiceType(_first_OVERNIGHT);

  public static final ServiceType ground_HOME_DELIVERY = new ServiceType(_ground_HOME_DELIVERY);

  public static final ServiceType international_ECONOMY = new ServiceType(_international_ECONOMY);

  public static final ServiceType international_ECONOMY_FREIGHT = new ServiceType(_international_ECONOMY_FREIGHT);

  public static final ServiceType international_FIRST = new ServiceType(_international_FIRST);

  public static final ServiceType international_PRIORITY = new ServiceType(_international_PRIORITY);

  public static final ServiceType international_PRIORITY_FREIGHT = new ServiceType(_international_PRIORITY_FREIGHT);

  public static final ServiceType priority_OVERNIGHT = new ServiceType(_priority_OVERNIGHT);

  public static final ServiceType same_DAY = new ServiceType(_same_DAY);

  public static final ServiceType same_DAY_CITY = new ServiceType(_same_DAY_CITY);

  public static final ServiceType smart_POST = new ServiceType(_smart_POST);

  public static final ServiceType standard_OVERNIGHT = new ServiceType(_standard_OVERNIGHT);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ServiceType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ServiceType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ServiceType fromString(String value) {
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
    if (!(obj instanceof ServiceType)) return false;
    final ServiceType x = (ServiceType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_europe_FIRST_INTERNATIONAL_PRIORITY, europe_FIRST_INTERNATIONAL_PRIORITY);
    map.put(_fedex_1_DAY_FREIGHT, fedex_1_DAY_FREIGHT);
    map.put(_fedex_2_DAY, fedex_2_DAY);
    map.put(_fedex_2_DAY_AM, fedex_2_DAY_AM);
    map.put(_fedex_2_DAY_FREIGHT, fedex_2_DAY_FREIGHT);
    map.put(_fedex_3_DAY_FREIGHT, fedex_3_DAY_FREIGHT);
    map.put(_fedex_DISTANCE_DEFERRED, fedex_DISTANCE_DEFERRED);
    map.put(_fedex_EXPRESS_SAVER, fedex_EXPRESS_SAVER);
    map.put(_fedex_FIRST_FREIGHT, fedex_FIRST_FREIGHT);
    map.put(_fedex_FREIGHT_ECONOMY, fedex_FREIGHT_ECONOMY);
    map.put(_fedex_FREIGHT_PRIORITY, fedex_FREIGHT_PRIORITY);
    map.put(_fedex_GROUND, fedex_GROUND);
    map.put(_fedex_NEXT_DAY_AFTERNOON, fedex_NEXT_DAY_AFTERNOON);
    map.put(_fedex_NEXT_DAY_EARLY_MORNING, fedex_NEXT_DAY_EARLY_MORNING);
    map.put(_fedex_NEXT_DAY_END_OF_DAY, fedex_NEXT_DAY_END_OF_DAY);
    map.put(_fedex_NEXT_DAY_FREIGHT, fedex_NEXT_DAY_FREIGHT);
    map.put(_fedex_NEXT_DAY_MID_MORNING, fedex_NEXT_DAY_MID_MORNING);
    map.put(_first_OVERNIGHT, first_OVERNIGHT);
    map.put(_ground_HOME_DELIVERY, ground_HOME_DELIVERY);
    map.put(_international_ECONOMY, international_ECONOMY);
    map.put(_international_ECONOMY_FREIGHT, international_ECONOMY_FREIGHT);
    map.put(_international_FIRST, international_FIRST);
    map.put(_international_PRIORITY, international_PRIORITY);
    map.put(_international_PRIORITY_FREIGHT, international_PRIORITY_FREIGHT);
    map.put(_priority_OVERNIGHT, priority_OVERNIGHT);
    map.put(_same_DAY, same_DAY);
    map.put(_same_DAY_CITY, same_DAY_CITY);
    map.put(_smart_POST, smart_POST);
    map.put(_standard_OVERNIGHT, standard_OVERNIGHT);
  }

}
