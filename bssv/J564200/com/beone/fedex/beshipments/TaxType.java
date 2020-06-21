/**
 * Generated from schema type t=TaxType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class TaxType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected TaxType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _export = "EXPORT";

  public static final java.lang.String _gst = "GST";

  public static final java.lang.String _hst = "HST";

  public static final java.lang.String _intracountry = "INTRACOUNTRY";

  public static final java.lang.String _other = "OTHER";

  public static final java.lang.String _pst = "PST";

  public static final java.lang.String _vat = "VAT";

  public static final TaxType export = new TaxType(_export);

  public static final TaxType gst = new TaxType(_gst);

  public static final TaxType hst = new TaxType(_hst);

  public static final TaxType intracountry = new TaxType(_intracountry);

  public static final TaxType other = new TaxType(_other);

  public static final TaxType pst = new TaxType(_pst);

  public static final TaxType vat = new TaxType(_vat);

  public java.lang.String getValue() {
    return this.value;
  }

  public static TaxType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (TaxType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static TaxType fromString(String value) {
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
    if (!(obj instanceof TaxType)) return false;
    final TaxType x = (TaxType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_export, export);
    map.put(_gst, gst);
    map.put(_hst, hst);
    map.put(_intracountry, intracountry);
    map.put(_other, other);
    map.put(_pst, pst);
    map.put(_vat, vat);
  }

}
