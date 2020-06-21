/**
 * Generated from schema type t=SecondaryBarcodeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class SecondaryBarcodeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected SecondaryBarcodeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _common_2D = "COMMON_2D";

  public static final java.lang.String _none = "NONE";

  public static final java.lang.String _sscc_18 = "SSCC_18";

  public static final java.lang.String _usps = "USPS";

  public static final SecondaryBarcodeType common_2D = new SecondaryBarcodeType(_common_2D);

  public static final SecondaryBarcodeType none = new SecondaryBarcodeType(_none);

  public static final SecondaryBarcodeType sscc_18 = new SecondaryBarcodeType(_sscc_18);

  public static final SecondaryBarcodeType usps = new SecondaryBarcodeType(_usps);

  public java.lang.String getValue() {
    return this.value;
  }

  public static SecondaryBarcodeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (SecondaryBarcodeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static SecondaryBarcodeType fromString(String value) {
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
    if (!(obj instanceof SecondaryBarcodeType)) return false;
    final SecondaryBarcodeType x = (SecondaryBarcodeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_common_2D, common_2D);
    map.put(_none, none);
    map.put(_sscc_18, sscc_18);
    map.put(_usps, usps);
  }

}
