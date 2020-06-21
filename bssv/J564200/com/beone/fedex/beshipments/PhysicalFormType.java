/**
 * Generated from schema type t=PhysicalFormType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PhysicalFormType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PhysicalFormType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _gas = "GAS";

  public static final java.lang.String _liquid = "LIQUID";

  public static final java.lang.String _solid = "SOLID";

  public static final java.lang.String _special = "SPECIAL";

  public static final PhysicalFormType gas = new PhysicalFormType(_gas);

  public static final PhysicalFormType liquid = new PhysicalFormType(_liquid);

  public static final PhysicalFormType solid = new PhysicalFormType(_solid);

  public static final PhysicalFormType special = new PhysicalFormType(_special);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PhysicalFormType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PhysicalFormType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PhysicalFormType fromString(String value) {
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
    if (!(obj instanceof PhysicalFormType)) return false;
    final PhysicalFormType x = (PhysicalFormType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_gas, gas);
    map.put(_liquid, liquid);
    map.put(_solid, solid);
    map.put(_special, special);
  }

}
