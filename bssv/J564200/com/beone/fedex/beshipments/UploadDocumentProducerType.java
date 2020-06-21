/**
 * Generated from schema type t=UploadDocumentProducerType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class UploadDocumentProducerType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected UploadDocumentProducerType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _customer = "CUSTOMER";

  public static final java.lang.String _fedex_CLS = "FEDEX_CLS";

  public static final java.lang.String _fedex_GTM = "FEDEX_GTM";

  public static final java.lang.String _other = "OTHER";

  public static final UploadDocumentProducerType customer = new UploadDocumentProducerType(_customer);

  public static final UploadDocumentProducerType fedex_CLS = new UploadDocumentProducerType(_fedex_CLS);

  public static final UploadDocumentProducerType fedex_GTM = new UploadDocumentProducerType(_fedex_GTM);

  public static final UploadDocumentProducerType other = new UploadDocumentProducerType(_other);

  public java.lang.String getValue() {
    return this.value;
  }

  public static UploadDocumentProducerType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (UploadDocumentProducerType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static UploadDocumentProducerType fromString(String value) {
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
    if (!(obj instanceof UploadDocumentProducerType)) return false;
    final UploadDocumentProducerType x = (UploadDocumentProducerType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_customer, customer);
    map.put(_fedex_CLS, fedex_CLS);
    map.put(_fedex_GTM, fedex_GTM);
    map.put(_other, other);
  }

}
