/**
 * Generated from schema type t=RadioactiveContainerClassType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RadioactiveContainerClassType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RadioactiveContainerClassType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _excepted_PACKAGE = "EXCEPTED_PACKAGE";

  public static final java.lang.String _industrial_IP1 = "INDUSTRIAL_IP1";

  public static final java.lang.String _industrial_IP2 = "INDUSTRIAL_IP2";

  public static final java.lang.String _industrial_IP3 = "INDUSTRIAL_IP3";

  public static final java.lang.String _type_A = "TYPE_A";

  public static final java.lang.String _type_B_M = "TYPE_B_M";

  public static final java.lang.String _type_B_U = "TYPE_B_U";

  public static final java.lang.String _type_C = "TYPE_C";

  public static final RadioactiveContainerClassType excepted_PACKAGE = new RadioactiveContainerClassType(_excepted_PACKAGE);

  public static final RadioactiveContainerClassType industrial_IP1 = new RadioactiveContainerClassType(_industrial_IP1);

  public static final RadioactiveContainerClassType industrial_IP2 = new RadioactiveContainerClassType(_industrial_IP2);

  public static final RadioactiveContainerClassType industrial_IP3 = new RadioactiveContainerClassType(_industrial_IP3);

  public static final RadioactiveContainerClassType type_A = new RadioactiveContainerClassType(_type_A);

  public static final RadioactiveContainerClassType type_B_M = new RadioactiveContainerClassType(_type_B_M);

  public static final RadioactiveContainerClassType type_B_U = new RadioactiveContainerClassType(_type_B_U);

  public static final RadioactiveContainerClassType type_C = new RadioactiveContainerClassType(_type_C);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RadioactiveContainerClassType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RadioactiveContainerClassType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RadioactiveContainerClassType fromString(String value) {
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
    if (!(obj instanceof RadioactiveContainerClassType)) return false;
    final RadioactiveContainerClassType x = (RadioactiveContainerClassType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_excepted_PACKAGE, excepted_PACKAGE);
    map.put(_industrial_IP1, industrial_IP1);
    map.put(_industrial_IP2, industrial_IP2);
    map.put(_industrial_IP3, industrial_IP3);
    map.put(_type_A, type_A);
    map.put(_type_B_M, type_B_M);
    map.put(_type_B_U, type_B_U);
    map.put(_type_C, type_C);
  }

}
