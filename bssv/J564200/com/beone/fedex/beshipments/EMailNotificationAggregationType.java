/**
 * Generated from schema type t=EMailNotificationAggregationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class EMailNotificationAggregationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected EMailNotificationAggregationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _per_PACKAGE = "PER_PACKAGE";

  public static final java.lang.String _per_SHIPMENT = "PER_SHIPMENT";

  public static final EMailNotificationAggregationType per_PACKAGE = new EMailNotificationAggregationType(_per_PACKAGE);

  public static final EMailNotificationAggregationType per_SHIPMENT = new EMailNotificationAggregationType(_per_SHIPMENT);

  public java.lang.String getValue() {
    return this.value;
  }

  public static EMailNotificationAggregationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (EMailNotificationAggregationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static EMailNotificationAggregationType fromString(String value) {
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
    if (!(obj instanceof EMailNotificationAggregationType)) return false;
    final EMailNotificationAggregationType x = (EMailNotificationAggregationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_per_PACKAGE, per_PACKAGE);
    map.put(_per_SHIPMENT, per_SHIPMENT);
  }

}
