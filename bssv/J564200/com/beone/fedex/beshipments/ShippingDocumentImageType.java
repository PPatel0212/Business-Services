/**
 * Generated from schema type t=ShippingDocumentImageType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ShippingDocumentImageType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ShippingDocumentImageType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _doc = "DOC";

  public static final java.lang.String _dpl = "DPL";

  public static final java.lang.String _epl2 = "EPL2";

  public static final java.lang.String _pdf = "PDF";

  public static final java.lang.String _png = "PNG";

  public static final java.lang.String _rtf = "RTF";

  public static final java.lang.String _text = "TEXT";

  public static final java.lang.String _zplii = "ZPLII";

  public static final ShippingDocumentImageType doc = new ShippingDocumentImageType(_doc);

  public static final ShippingDocumentImageType dpl = new ShippingDocumentImageType(_dpl);

  public static final ShippingDocumentImageType epl2 = new ShippingDocumentImageType(_epl2);

  public static final ShippingDocumentImageType pdf = new ShippingDocumentImageType(_pdf);

  public static final ShippingDocumentImageType png = new ShippingDocumentImageType(_png);

  public static final ShippingDocumentImageType rtf = new ShippingDocumentImageType(_rtf);

  public static final ShippingDocumentImageType text = new ShippingDocumentImageType(_text);

  public static final ShippingDocumentImageType zplii = new ShippingDocumentImageType(_zplii);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ShippingDocumentImageType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ShippingDocumentImageType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ShippingDocumentImageType fromString(String value) {
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
    if (!(obj instanceof ShippingDocumentImageType)) return false;
    final ShippingDocumentImageType x = (ShippingDocumentImageType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_doc, doc);
    map.put(_dpl, dpl);
    map.put(_epl2, epl2);
    map.put(_pdf, pdf);
    map.put(_png, png);
    map.put(_rtf, rtf);
    map.put(_text, text);
    map.put(_zplii, zplii);
  }

}
