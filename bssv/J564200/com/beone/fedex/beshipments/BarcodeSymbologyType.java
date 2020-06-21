/**
 * Generated from schema type t=BarcodeSymbologyType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class BarcodeSymbologyType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected BarcodeSymbologyType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _codabar = "CODABAR";

  public static final java.lang.String _code128 = "CODE128";

  public static final java.lang.String _code128B = "CODE128B";

  public static final java.lang.String _code128C = "CODE128C";

  public static final java.lang.String _code128_WIDEBAR = "CODE128_WIDEBAR";

  public static final java.lang.String _code39 = "CODE39";

  public static final java.lang.String _code93 = "CODE93";

  public static final java.lang.String _i2OF5 = "I2OF5";

  public static final java.lang.String _pdf417 = "PDF417";

  public static final java.lang.String _postnet = "POSTNET";

  public static final java.lang.String _qr_CODE = "QR_CODE";

  public static final java.lang.String _ucc128 = "UCC128";

  public static final BarcodeSymbologyType codabar = new BarcodeSymbologyType(_codabar);

  public static final BarcodeSymbologyType code128 = new BarcodeSymbologyType(_code128);

  public static final BarcodeSymbologyType code128B = new BarcodeSymbologyType(_code128B);

  public static final BarcodeSymbologyType code128C = new BarcodeSymbologyType(_code128C);

  public static final BarcodeSymbologyType code128_WIDEBAR = new BarcodeSymbologyType(_code128_WIDEBAR);

  public static final BarcodeSymbologyType code39 = new BarcodeSymbologyType(_code39);

  public static final BarcodeSymbologyType code93 = new BarcodeSymbologyType(_code93);

  public static final BarcodeSymbologyType i2OF5 = new BarcodeSymbologyType(_i2OF5);

  public static final BarcodeSymbologyType pdf417 = new BarcodeSymbologyType(_pdf417);

  public static final BarcodeSymbologyType postnet = new BarcodeSymbologyType(_postnet);

  public static final BarcodeSymbologyType qr_CODE = new BarcodeSymbologyType(_qr_CODE);

  public static final BarcodeSymbologyType ucc128 = new BarcodeSymbologyType(_ucc128);

  public java.lang.String getValue() {
    return this.value;
  }

  public static BarcodeSymbologyType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (BarcodeSymbologyType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static BarcodeSymbologyType fromString(String value) {
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
    if (!(obj instanceof BarcodeSymbologyType)) return false;
    final BarcodeSymbologyType x = (BarcodeSymbologyType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_codabar, codabar);
    map.put(_code128, code128);
    map.put(_code128B, code128B);
    map.put(_code128C, code128C);
    map.put(_code128_WIDEBAR, code128_WIDEBAR);
    map.put(_code39, code39);
    map.put(_code93, code93);
    map.put(_i2OF5, i2OF5);
    map.put(_pdf417, pdf417);
    map.put(_postnet, postnet);
    map.put(_qr_CODE, qr_CODE);
    map.put(_ucc128, ucc128);
  }

}
