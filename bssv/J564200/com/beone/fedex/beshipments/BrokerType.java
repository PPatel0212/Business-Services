/**
 * Generated from schema type t=BrokerType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class BrokerType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected BrokerType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _value1 = "EXPORT";

  public static final java.lang.String _value2 = "IMPORT";

  public static final BrokerType value1 = new BrokerType(_value1);

  public static final BrokerType value2 = new BrokerType(_value2);

  public java.lang.String getValue() {
    return this.value;
  }

  public static BrokerType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (BrokerType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static BrokerType fromString(String value) {
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
    if (!(obj instanceof BrokerType)) return false;
    final BrokerType x = (BrokerType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_value1, value1);
    map.put(_value2, value2);
  }

}
