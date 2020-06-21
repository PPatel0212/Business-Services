/**
 * Generated from schema type t=ChargeBasisLevelType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ChargeBasisLevelType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ChargeBasisLevelType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _current_PACKAGE = "CURRENT_PACKAGE";

  public static final java.lang.String _sum_OF_PACKAGES = "SUM_OF_PACKAGES";

  public static final ChargeBasisLevelType current_PACKAGE = new ChargeBasisLevelType(_current_PACKAGE);

  public static final ChargeBasisLevelType sum_OF_PACKAGES = new ChargeBasisLevelType(_sum_OF_PACKAGES);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ChargeBasisLevelType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ChargeBasisLevelType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ChargeBasisLevelType fromString(String value) {
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
    if (!(obj instanceof ChargeBasisLevelType)) return false;
    final ChargeBasisLevelType x = (ChargeBasisLevelType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_current_PACKAGE, current_PACKAGE);
    map.put(_sum_OF_PACKAGES, sum_OF_PACKAGES);
  }

}
