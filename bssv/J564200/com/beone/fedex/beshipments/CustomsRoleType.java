/**
 * Generated from schema type t=CustomsRoleType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CustomsRoleType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CustomsRoleType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _exporter = "EXPORTER";

  public static final java.lang.String _importer = "IMPORTER";

  public static final java.lang.String _legal_AGENT = "LEGAL_AGENT";

  public static final java.lang.String _producer = "PRODUCER";

  public static final CustomsRoleType exporter = new CustomsRoleType(_exporter);

  public static final CustomsRoleType importer = new CustomsRoleType(_importer);

  public static final CustomsRoleType legal_AGENT = new CustomsRoleType(_legal_AGENT);

  public static final CustomsRoleType producer = new CustomsRoleType(_producer);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CustomsRoleType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CustomsRoleType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CustomsRoleType fromString(String value) {
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
    if (!(obj instanceof CustomsRoleType)) return false;
    final CustomsRoleType x = (CustomsRoleType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_exporter, exporter);
    map.put(_importer, importer);
    map.put(_legal_AGENT, legal_AGENT);
    map.put(_producer, producer);
  }

}
