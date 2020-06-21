/**
 * Generated from schema type t=UploadDocumentIdProducer@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class UploadDocumentIdProducer implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected UploadDocumentIdProducer(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _customer = "CUSTOMER";

  public static final java.lang.String _fedex_CSHP = "FEDEX_CSHP";

  public static final java.lang.String _fedex_GTM = "FEDEX_GTM";

  public static final UploadDocumentIdProducer customer = new UploadDocumentIdProducer(_customer);

  public static final UploadDocumentIdProducer fedex_CSHP = new UploadDocumentIdProducer(_fedex_CSHP);

  public static final UploadDocumentIdProducer fedex_GTM = new UploadDocumentIdProducer(_fedex_GTM);

  public java.lang.String getValue() {
    return this.value;
  }

  public static UploadDocumentIdProducer fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (UploadDocumentIdProducer) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static UploadDocumentIdProducer fromString(String value) {
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
    if (!(obj instanceof UploadDocumentIdProducer)) return false;
    final UploadDocumentIdProducer x = (UploadDocumentIdProducer) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_customer, customer);
    map.put(_fedex_CSHP, fedex_CSHP);
    map.put(_fedex_GTM, fedex_GTM);
  }

}
