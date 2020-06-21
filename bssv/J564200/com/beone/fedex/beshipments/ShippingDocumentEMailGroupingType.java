/**
 * Generated from schema type t=ShippingDocumentEMailGroupingType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ShippingDocumentEMailGroupingType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ShippingDocumentEMailGroupingType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _by_RECIPIENT = "BY_RECIPIENT";

  public static final java.lang.String _none = "NONE";

  public static final ShippingDocumentEMailGroupingType by_RECIPIENT = new ShippingDocumentEMailGroupingType(_by_RECIPIENT);

  public static final ShippingDocumentEMailGroupingType none = new ShippingDocumentEMailGroupingType(_none);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ShippingDocumentEMailGroupingType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ShippingDocumentEMailGroupingType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ShippingDocumentEMailGroupingType fromString(String value) {
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
    if (!(obj instanceof ShippingDocumentEMailGroupingType)) return false;
    final ShippingDocumentEMailGroupingType x = (ShippingDocumentEMailGroupingType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_by_RECIPIENT, by_RECIPIENT);
    map.put(_none, none);
  }

}
