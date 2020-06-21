/**
 * Generated from schema type t=EMailNotificationEventType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class EMailNotificationEventType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected EMailNotificationEventType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _on_DELIVERY = "ON_DELIVERY";

  public static final java.lang.String _on_EXCEPTION = "ON_EXCEPTION";

  public static final java.lang.String _on_SHIPMENT = "ON_SHIPMENT";

  public static final java.lang.String _on_TENDER = "ON_TENDER";

  public static final EMailNotificationEventType on_DELIVERY = new EMailNotificationEventType(_on_DELIVERY);

  public static final EMailNotificationEventType on_EXCEPTION = new EMailNotificationEventType(_on_EXCEPTION);

  public static final EMailNotificationEventType on_SHIPMENT = new EMailNotificationEventType(_on_SHIPMENT);

  public static final EMailNotificationEventType on_TENDER = new EMailNotificationEventType(_on_TENDER);

  public java.lang.String getValue() {
    return this.value;
  }

  public static EMailNotificationEventType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (EMailNotificationEventType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static EMailNotificationEventType fromString(String value) {
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
    if (!(obj instanceof EMailNotificationEventType)) return false;
    final EMailNotificationEventType x = (EMailNotificationEventType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_on_DELIVERY, on_DELIVERY);
    map.put(_on_EXCEPTION, on_EXCEPTION);
    map.put(_on_SHIPMENT, on_SHIPMENT);
    map.put(_on_TENDER, on_TENDER);
  }

}
