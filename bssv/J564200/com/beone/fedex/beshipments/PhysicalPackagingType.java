/**
 * Generated from schema type t=PhysicalPackagingType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PhysicalPackagingType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PhysicalPackagingType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _value1 = "BAG";

  public static final java.lang.String _value2 = "BARREL";

  public static final java.lang.String _value3 = "BASKET";

  public static final java.lang.String _value4 = "BOX";

  public static final java.lang.String _value5 = "BUCKET";

  public static final java.lang.String _value6 = "BUNDLE";

  public static final java.lang.String _value7 = "CARTON";

  public static final java.lang.String _value8 = "CASE";

  public static final java.lang.String _value9 = "CONTAINER";

  public static final java.lang.String _value10 = "CRATE";

  public static final java.lang.String _value11 = "CYLINDER";

  public static final java.lang.String _value12 = "DRUM";

  public static final java.lang.String _value13 = "ENVELOPE";

  public static final java.lang.String _value14 = "HAMPER";

  public static final java.lang.String _value15 = "OTHER";

  public static final java.lang.String _value16 = "PAIL";

  public static final java.lang.String _value17 = "PALLET";

  public static final java.lang.String _value18 = "PIECE";

  public static final java.lang.String _value19 = "REEL";

  public static final java.lang.String _value20 = "ROLL";

  public static final java.lang.String _value21 = "SKID";

  public static final java.lang.String _value22 = "TANK";

  public static final java.lang.String _value23 = "TUBE";

  public static final PhysicalPackagingType value1 = new PhysicalPackagingType(_value1);

  public static final PhysicalPackagingType value2 = new PhysicalPackagingType(_value2);

  public static final PhysicalPackagingType value3 = new PhysicalPackagingType(_value3);

  public static final PhysicalPackagingType value4 = new PhysicalPackagingType(_value4);

  public static final PhysicalPackagingType value5 = new PhysicalPackagingType(_value5);

  public static final PhysicalPackagingType value6 = new PhysicalPackagingType(_value6);

  public static final PhysicalPackagingType value7 = new PhysicalPackagingType(_value7);

  public static final PhysicalPackagingType value8 = new PhysicalPackagingType(_value8);

  public static final PhysicalPackagingType value9 = new PhysicalPackagingType(_value9);

  public static final PhysicalPackagingType value10 = new PhysicalPackagingType(_value10);

  public static final PhysicalPackagingType value11 = new PhysicalPackagingType(_value11);

  public static final PhysicalPackagingType value12 = new PhysicalPackagingType(_value12);

  public static final PhysicalPackagingType value13 = new PhysicalPackagingType(_value13);

  public static final PhysicalPackagingType value14 = new PhysicalPackagingType(_value14);

  public static final PhysicalPackagingType value15 = new PhysicalPackagingType(_value15);

  public static final PhysicalPackagingType value16 = new PhysicalPackagingType(_value16);

  public static final PhysicalPackagingType value17 = new PhysicalPackagingType(_value17);

  public static final PhysicalPackagingType value18 = new PhysicalPackagingType(_value18);

  public static final PhysicalPackagingType value19 = new PhysicalPackagingType(_value19);

  public static final PhysicalPackagingType value20 = new PhysicalPackagingType(_value20);

  public static final PhysicalPackagingType value21 = new PhysicalPackagingType(_value21);

  public static final PhysicalPackagingType value22 = new PhysicalPackagingType(_value22);

  public static final PhysicalPackagingType value23 = new PhysicalPackagingType(_value23);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PhysicalPackagingType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PhysicalPackagingType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PhysicalPackagingType fromString(String value) {
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
    if (!(obj instanceof PhysicalPackagingType)) return false;
    final PhysicalPackagingType x = (PhysicalPackagingType) obj;
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
    map.put(_value14, value14);
    map.put(_value15, value15);
    map.put(_value16, value16);
    map.put(_value17, value17);
    map.put(_value18, value18);
    map.put(_value19, value19);
    map.put(_value20, value20);
    map.put(_value21, value21);
    map.put(_value22, value22);
    map.put(_value23, value23);
  }

}
