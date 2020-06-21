/**
 * Generated from schema type t=ShippingDocumentDispositionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ShippingDocumentDispositionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ShippingDocumentDispositionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _confirmed = "CONFIRMED";

  public static final java.lang.String _deferred_RETURNED = "DEFERRED_RETURNED";

  public static final java.lang.String _deferred_STORED = "DEFERRED_STORED";

  public static final java.lang.String _emailed = "EMAILED";

  public static final java.lang.String _queued = "QUEUED";

  public static final java.lang.String _returned = "RETURNED";

  public static final java.lang.String _stored = "STORED";

  public static final ShippingDocumentDispositionType confirmed = new ShippingDocumentDispositionType(_confirmed);

  public static final ShippingDocumentDispositionType deferred_RETURNED = new ShippingDocumentDispositionType(_deferred_RETURNED);

  public static final ShippingDocumentDispositionType deferred_STORED = new ShippingDocumentDispositionType(_deferred_STORED);

  public static final ShippingDocumentDispositionType emailed = new ShippingDocumentDispositionType(_emailed);

  public static final ShippingDocumentDispositionType queued = new ShippingDocumentDispositionType(_queued);

  public static final ShippingDocumentDispositionType returned = new ShippingDocumentDispositionType(_returned);

  public static final ShippingDocumentDispositionType stored = new ShippingDocumentDispositionType(_stored);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ShippingDocumentDispositionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ShippingDocumentDispositionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ShippingDocumentDispositionType fromString(String value) {
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
    if (!(obj instanceof ShippingDocumentDispositionType)) return false;
    final ShippingDocumentDispositionType x = (ShippingDocumentDispositionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_confirmed, confirmed);
    map.put(_deferred_RETURNED, deferred_RETURNED);
    map.put(_deferred_STORED, deferred_STORED);
    map.put(_emailed, emailed);
    map.put(_queued, queued);
    map.put(_returned, returned);
    map.put(_stored, stored);
  }

}
