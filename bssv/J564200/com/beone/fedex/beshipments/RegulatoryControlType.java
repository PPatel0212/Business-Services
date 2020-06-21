/**
 * Generated from schema type t=RegulatoryControlType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RegulatoryControlType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RegulatoryControlType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _eu_CIRCULATION = "EU_CIRCULATION";

  public static final java.lang.String _food_OR_PERISHABLE = "FOOD_OR_PERISHABLE";

  public static final java.lang.String _nafta = "NAFTA";

  public static final RegulatoryControlType eu_CIRCULATION = new RegulatoryControlType(_eu_CIRCULATION);

  public static final RegulatoryControlType food_OR_PERISHABLE = new RegulatoryControlType(_food_OR_PERISHABLE);

  public static final RegulatoryControlType nafta = new RegulatoryControlType(_nafta);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RegulatoryControlType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RegulatoryControlType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RegulatoryControlType fromString(String value) {
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
    if (!(obj instanceof RegulatoryControlType)) return false;
    final RegulatoryControlType x = (RegulatoryControlType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_eu_CIRCULATION, eu_CIRCULATION);
    map.put(_food_OR_PERISHABLE, food_OR_PERISHABLE);
    map.put(_nafta, nafta);
  }

}
