/**
 * Generated from schema type t=ClearanceBrokerageType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ClearanceBrokerageType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ClearanceBrokerageType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _broker_INCLUSIVE = "BROKER_INCLUSIVE";

  public static final java.lang.String _broker_INCLUSIVE_NON_RESIDENT_IMPORTER = "BROKER_INCLUSIVE_NON_RESIDENT_IMPORTER";

  public static final java.lang.String _broker_SELECT = "BROKER_SELECT";

  public static final java.lang.String _broker_SELECT_NON_RESIDENT_IMPORTER = "BROKER_SELECT_NON_RESIDENT_IMPORTER";

  public static final java.lang.String _broker_UNASSIGNED = "BROKER_UNASSIGNED";

  public static final ClearanceBrokerageType broker_INCLUSIVE = new ClearanceBrokerageType(_broker_INCLUSIVE);

  public static final ClearanceBrokerageType broker_INCLUSIVE_NON_RESIDENT_IMPORTER = new ClearanceBrokerageType(_broker_INCLUSIVE_NON_RESIDENT_IMPORTER);

  public static final ClearanceBrokerageType broker_SELECT = new ClearanceBrokerageType(_broker_SELECT);

  public static final ClearanceBrokerageType broker_SELECT_NON_RESIDENT_IMPORTER = new ClearanceBrokerageType(_broker_SELECT_NON_RESIDENT_IMPORTER);

  public static final ClearanceBrokerageType broker_UNASSIGNED = new ClearanceBrokerageType(_broker_UNASSIGNED);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ClearanceBrokerageType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ClearanceBrokerageType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ClearanceBrokerageType fromString(String value) {
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
    if (!(obj instanceof ClearanceBrokerageType)) return false;
    final ClearanceBrokerageType x = (ClearanceBrokerageType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_broker_INCLUSIVE, broker_INCLUSIVE);
    map.put(_broker_INCLUSIVE_NON_RESIDENT_IMPORTER, broker_INCLUSIVE_NON_RESIDENT_IMPORTER);
    map.put(_broker_SELECT, broker_SELECT);
    map.put(_broker_SELECT_NON_RESIDENT_IMPORTER, broker_SELECT_NON_RESIDENT_IMPORTER);
    map.put(_broker_UNASSIGNED, broker_UNASSIGNED);
  }

}
