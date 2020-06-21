/**
 * Generated from schema type t=FreightChargeBasisType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FreightChargeBasisType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FreightChargeBasisType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _cwt = "CWT";

  public static final java.lang.String _flat = "FLAT";

  public static final java.lang.String _minimum = "MINIMUM";

  public static final FreightChargeBasisType cwt = new FreightChargeBasisType(_cwt);

  public static final FreightChargeBasisType flat = new FreightChargeBasisType(_flat);

  public static final FreightChargeBasisType minimum = new FreightChargeBasisType(_minimum);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FreightChargeBasisType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FreightChargeBasisType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FreightChargeBasisType fromString(String value) {
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
    if (!(obj instanceof FreightChargeBasisType)) return false;
    final FreightChargeBasisType x = (FreightChargeBasisType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_cwt, cwt);
    map.put(_flat, flat);
    map.put(_minimum, minimum);
  }

}
