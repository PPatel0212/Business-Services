/**
 * Generated from schema type t=PricingCodeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PricingCodeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PricingCodeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _value1 = "ACTUAL";

  public static final java.lang.String _value2 = "ALTERNATE";

  public static final java.lang.String _value3 = "BASE";

  public static final java.lang.String _value4 = "HUNDREDWEIGHT";

  public static final java.lang.String _value5 = "HUNDREDWEIGHT_ALTERNATE";

  public static final java.lang.String _value6 = "INTERNATIONAL_DISTRIBUTION";

  public static final java.lang.String _value7 = "INTERNATIONAL_ECONOMY_SERVICE";

  public static final java.lang.String _value8 = "LTL_FREIGHT";

  public static final java.lang.String _value9 = "PACKAGE";

  public static final java.lang.String _value10 = "SHIPMENT";

  public static final java.lang.String _value11 = "SHIPMENT_FIVE_POUND_OPTIONAL";

  public static final java.lang.String _value12 = "SHIPMENT_OPTIONAL";

  public static final java.lang.String _value13 = "SPECIAL";

  public static final PricingCodeType value1 = new PricingCodeType(_value1);

  public static final PricingCodeType value2 = new PricingCodeType(_value2);

  public static final PricingCodeType value3 = new PricingCodeType(_value3);

  public static final PricingCodeType value4 = new PricingCodeType(_value4);

  public static final PricingCodeType value5 = new PricingCodeType(_value5);

  public static final PricingCodeType value6 = new PricingCodeType(_value6);

  public static final PricingCodeType value7 = new PricingCodeType(_value7);

  public static final PricingCodeType value8 = new PricingCodeType(_value8);

  public static final PricingCodeType value9 = new PricingCodeType(_value9);

  public static final PricingCodeType value10 = new PricingCodeType(_value10);

  public static final PricingCodeType value11 = new PricingCodeType(_value11);

  public static final PricingCodeType value12 = new PricingCodeType(_value12);

  public static final PricingCodeType value13 = new PricingCodeType(_value13);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PricingCodeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PricingCodeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PricingCodeType fromString(String value) {
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
    if (!(obj instanceof PricingCodeType)) return false;
    final PricingCodeType x = (PricingCodeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_value1, value1);
    map.put(_value2, value2);
    map.put(_value3, value3);
    map.put(_value4, value4);
    map.put(_value5, value5);
    map.put(_value6, value6);
    map.put(_value7, value7);
    map.put(_value8, value8);
    map.put(_value9, value9);
    map.put(_value10, value10);
    map.put(_value11, value11);
    map.put(_value12, value12);
    map.put(_value13, value13);
  }

}
