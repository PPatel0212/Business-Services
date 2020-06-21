/**
 * Generated from schema type t=PriorityAlertEnhancementType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PriorityAlertEnhancementType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PriorityAlertEnhancementType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _priority_ALERT_PLUS = "PRIORITY_ALERT_PLUS";

  public static final PriorityAlertEnhancementType priority_ALERT_PLUS = new PriorityAlertEnhancementType(_priority_ALERT_PLUS);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PriorityAlertEnhancementType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PriorityAlertEnhancementType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PriorityAlertEnhancementType fromString(String value) {
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
    if (!(obj instanceof PriorityAlertEnhancementType)) return false;
    final PriorityAlertEnhancementType x = (PriorityAlertEnhancementType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_priority_ALERT_PLUS, priority_ALERT_PLUS);
  }

}
