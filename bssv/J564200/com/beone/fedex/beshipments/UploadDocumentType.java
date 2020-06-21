/**
 * Generated from schema type t=UploadDocumentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class UploadDocumentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected UploadDocumentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _certificate_OF_ORIGIN = "CERTIFICATE_OF_ORIGIN";

  public static final java.lang.String _commercial_INVOICE = "COMMERCIAL_INVOICE";

  public static final java.lang.String _etd_LABEL = "ETD_LABEL";

  public static final java.lang.String _nafta_CERTIFICATE_OF_ORIGIN = "NAFTA_CERTIFICATE_OF_ORIGIN";

  public static final java.lang.String _other = "OTHER";

  public static final java.lang.String _pro_FORMA_INVOICE = "PRO_FORMA_INVOICE";

  public static final UploadDocumentType certificate_OF_ORIGIN = new UploadDocumentType(_certificate_OF_ORIGIN);

  public static final UploadDocumentType commercial_INVOICE = new UploadDocumentType(_commercial_INVOICE);

  public static final UploadDocumentType etd_LABEL = new UploadDocumentType(_etd_LABEL);

  public static final UploadDocumentType nafta_CERTIFICATE_OF_ORIGIN = new UploadDocumentType(_nafta_CERTIFICATE_OF_ORIGIN);

  public static final UploadDocumentType other = new UploadDocumentType(_other);

  public static final UploadDocumentType pro_FORMA_INVOICE = new UploadDocumentType(_pro_FORMA_INVOICE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static UploadDocumentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (UploadDocumentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static UploadDocumentType fromString(String value) {
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
    if (!(obj instanceof UploadDocumentType)) return false;
    final UploadDocumentType x = (UploadDocumentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_certificate_OF_ORIGIN, certificate_OF_ORIGIN);
    map.put(_commercial_INVOICE, commercial_INVOICE);
    map.put(_etd_LABEL, etd_LABEL);
    map.put(_nafta_CERTIFICATE_OF_ORIGIN, nafta_CERTIFICATE_OF_ORIGIN);
    map.put(_other, other);
    map.put(_pro_FORMA_INVOICE, pro_FORMA_INVOICE);
  }

}
