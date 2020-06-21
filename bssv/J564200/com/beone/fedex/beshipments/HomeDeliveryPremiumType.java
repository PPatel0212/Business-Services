/**
 * Generated from schema type t=HomeDeliveryPremiumType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HomeDeliveryPremiumType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HomeDeliveryPremiumType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _appointment = "APPOINTMENT";

  public static final java.lang.String _date_CERTAIN = "DATE_CERTAIN";

  public static final java.lang.String _evening = "EVENING";

  public static final HomeDeliveryPremiumType appointment = new HomeDeliveryPremiumType(_appointment);

  public static final HomeDeliveryPremiumType date_CERTAIN = new HomeDeliveryPremiumType(_date_CERTAIN);

  public static final HomeDeliveryPremiumType evening = new HomeDeliveryPremiumType(_evening);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HomeDeliveryPremiumType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HomeDeliveryPremiumType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HomeDeliveryPremiumType fromString(String value) {
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
    if (!(obj instanceof HomeDeliveryPremiumType)) return false;
    final HomeDeliveryPremiumType x = (HomeDeliveryPremiumType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_appointment, appointment);
    map.put(_date_CERTAIN, date_CERTAIN);
    map.put(_evening, evening);
  }

}
