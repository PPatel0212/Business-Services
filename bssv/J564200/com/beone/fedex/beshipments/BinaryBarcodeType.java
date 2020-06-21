/**
 * Generated from schema type t=BinaryBarcodeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class BinaryBarcodeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected BinaryBarcodeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _common_2D = "COMMON_2D";

  public static final BinaryBarcodeType common_2D = new BinaryBarcodeType(_common_2D);

  public java.lang.String getValue() {
    return this.value;
  }

  public static BinaryBarcodeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (BinaryBarcodeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static BinaryBarcodeType fromString(String value) {
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
    if (!(obj instanceof BinaryBarcodeType)) return false;
    final BinaryBarcodeType x = (BinaryBarcodeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_common_2D, common_2D);
  }

}
