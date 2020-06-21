/**
 * Generated from schema type t=DeletionControlType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class DeletionControlType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected DeletionControlType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _delete_ALL_PACKAGES = "DELETE_ALL_PACKAGES";

  public static final java.lang.String _delete_ENTIRE_CONSOLIDATION = "DELETE_ENTIRE_CONSOLIDATION";

  public static final java.lang.String _delete_ONE_PACKAGE = "DELETE_ONE_PACKAGE";

  public static final java.lang.String _legacy = "LEGACY";

  public static final DeletionControlType delete_ALL_PACKAGES = new DeletionControlType(_delete_ALL_PACKAGES);

  public static final DeletionControlType delete_ENTIRE_CONSOLIDATION = new DeletionControlType(_delete_ENTIRE_CONSOLIDATION);

  public static final DeletionControlType delete_ONE_PACKAGE = new DeletionControlType(_delete_ONE_PACKAGE);

  public static final DeletionControlType legacy = new DeletionControlType(_legacy);

  public java.lang.String getValue() {
    return this.value;
  }

  public static DeletionControlType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (DeletionControlType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static DeletionControlType fromString(String value) {
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
    if (!(obj instanceof DeletionControlType)) return false;
    final DeletionControlType x = (DeletionControlType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_delete_ALL_PACKAGES, delete_ALL_PACKAGES);
    map.put(_delete_ENTIRE_CONSOLIDATION, delete_ENTIRE_CONSOLIDATION);
    map.put(_delete_ONE_PACKAGE, delete_ONE_PACKAGE);
    map.put(_legacy, legacy);
  }

}
