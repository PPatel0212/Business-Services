/**
 * Generated from schema type t=TinType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class TinType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected TinType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _business_NATIONAL = "BUSINESS_NATIONAL";

  public static final java.lang.String _business_STATE = "BUSINESS_STATE";

  public static final java.lang.String _business_UNION = "BUSINESS_UNION";

  public static final java.lang.String _personal_NATIONAL = "PERSONAL_NATIONAL";

  public static final java.lang.String _personal_STATE = "PERSONAL_STATE";

  public static final TinType business_NATIONAL = new TinType(_business_NATIONAL);

  public static final TinType business_STATE = new TinType(_business_STATE);

  public static final TinType business_UNION = new TinType(_business_UNION);

  public static final TinType personal_NATIONAL = new TinType(_personal_NATIONAL);

  public static final TinType personal_STATE = new TinType(_personal_STATE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static TinType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (TinType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static TinType fromString(String value) {
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
    if (!(obj instanceof TinType)) return false;
    final TinType x = (TinType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_business_NATIONAL, business_NATIONAL);
    map.put(_business_STATE, business_STATE);
    map.put(_business_UNION, business_UNION);
    map.put(_personal_NATIONAL, personal_NATIONAL);
    map.put(_personal_STATE, personal_STATE);
  }

}
