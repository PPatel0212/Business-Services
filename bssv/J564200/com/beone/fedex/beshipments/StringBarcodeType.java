/**
 * Generated from schema type t=StringBarcodeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class StringBarcodeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected StringBarcodeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _address = "ADDRESS";

  public static final java.lang.String _astra = "ASTRA";

  public static final java.lang.String _fedex_1D = "FEDEX_1D";

  public static final java.lang.String _ground = "GROUND";

  public static final java.lang.String _postal = "POSTAL";

  public static final java.lang.String _usps = "USPS";

  public static final StringBarcodeType address = new StringBarcodeType(_address);

  public static final StringBarcodeType astra = new StringBarcodeType(_astra);

  public static final StringBarcodeType fedex_1D = new StringBarcodeType(_fedex_1D);

  public static final StringBarcodeType ground = new StringBarcodeType(_ground);

  public static final StringBarcodeType postal = new StringBarcodeType(_postal);

  public static final StringBarcodeType usps = new StringBarcodeType(_usps);

  public java.lang.String getValue() {
    return this.value;
  }

  public static StringBarcodeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (StringBarcodeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static StringBarcodeType fromString(String value) {
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
    if (!(obj instanceof StringBarcodeType)) return false;
    final StringBarcodeType x = (StringBarcodeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_address, address);
    map.put(_astra, astra);
    map.put(_fedex_1D, fedex_1D);
    map.put(_ground, ground);
    map.put(_postal, postal);
    map.put(_usps, usps);
  }

}
