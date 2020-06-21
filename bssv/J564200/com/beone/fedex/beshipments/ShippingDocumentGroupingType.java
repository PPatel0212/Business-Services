/**
 * Generated from schema type t=ShippingDocumentGroupingType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ShippingDocumentGroupingType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ShippingDocumentGroupingType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _consolidated_BY_DOCUMENT_TYPE = "CONSOLIDATED_BY_DOCUMENT_TYPE";

  public static final java.lang.String _individual = "INDIVIDUAL";

  public static final ShippingDocumentGroupingType consolidated_BY_DOCUMENT_TYPE = new ShippingDocumentGroupingType(_consolidated_BY_DOCUMENT_TYPE);

  public static final ShippingDocumentGroupingType individual = new ShippingDocumentGroupingType(_individual);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ShippingDocumentGroupingType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ShippingDocumentGroupingType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ShippingDocumentGroupingType fromString(String value) {
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
    if (!(obj instanceof ShippingDocumentGroupingType)) return false;
    final ShippingDocumentGroupingType x = (ShippingDocumentGroupingType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_consolidated_BY_DOCUMENT_TYPE, consolidated_BY_DOCUMENT_TYPE);
    map.put(_individual, individual);
  }

}
