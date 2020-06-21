/**
 * Generated from schema type t=NotificationSeverityType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class NotificationSeverityType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected NotificationSeverityType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _error = "ERROR";

  public static final java.lang.String _failure = "FAILURE";

  public static final java.lang.String _note = "NOTE";

  public static final java.lang.String _success = "SUCCESS";

  public static final java.lang.String _warning = "WARNING";

  public static final NotificationSeverityType error = new NotificationSeverityType(_error);

  public static final NotificationSeverityType failure = new NotificationSeverityType(_failure);

  public static final NotificationSeverityType note = new NotificationSeverityType(_note);

  public static final NotificationSeverityType success = new NotificationSeverityType(_success);

  public static final NotificationSeverityType warning = new NotificationSeverityType(_warning);

  public java.lang.String getValue() {
    return this.value;
  }

  public static NotificationSeverityType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (NotificationSeverityType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static NotificationSeverityType fromString(String value) {
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
    if (!(obj instanceof NotificationSeverityType)) return false;
    final NotificationSeverityType x = (NotificationSeverityType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_error, error);
    map.put(_failure, failure);
    map.put(_note, note);
    map.put(_success, success);
    map.put(_warning, warning);
  }

}
