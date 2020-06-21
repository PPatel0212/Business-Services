/**
 * Generated from schema type t=RequestedShippingDocumentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RequestedShippingDocumentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RequestedShippingDocumentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _certificate_OF_ORIGIN = "CERTIFICATE_OF_ORIGIN";

  public static final java.lang.String _commercial_INVOICE = "COMMERCIAL_INVOICE";

  public static final java.lang.String _customer_SPECIFIED_LABELS = "CUSTOMER_SPECIFIED_LABELS";

  public static final java.lang.String _custom_PACKAGE_DOCUMENT = "CUSTOM_PACKAGE_DOCUMENT";

  public static final java.lang.String _custom_SHIPMENT_DOCUMENT = "CUSTOM_SHIPMENT_DOCUMENT";

  public static final java.lang.String _dangerous_GOODS_SHIPPERS_DECLARATION = "DANGEROUS_GOODS_SHIPPERS_DECLARATION";

  public static final java.lang.String _export_DECLARATION = "EXPORT_DECLARATION";

  public static final java.lang.String _freight_ADDRESS_LABEL = "FREIGHT_ADDRESS_LABEL";

  public static final java.lang.String _general_AGENCY_AGREEMENT = "GENERAL_AGENCY_AGREEMENT";

  public static final java.lang.String _label = "LABEL";

  public static final java.lang.String _nafta_CERTIFICATE_OF_ORIGIN = "NAFTA_CERTIFICATE_OF_ORIGIN";

  public static final java.lang.String _op_900 = "OP_900";

  public static final java.lang.String _pro_FORMA_INVOICE = "PRO_FORMA_INVOICE";

  public static final java.lang.String _return_INSTRUCTIONS = "RETURN_INSTRUCTIONS";

  public static final RequestedShippingDocumentType certificate_OF_ORIGIN = new RequestedShippingDocumentType(_certificate_OF_ORIGIN);

  public static final RequestedShippingDocumentType commercial_INVOICE = new RequestedShippingDocumentType(_commercial_INVOICE);

  public static final RequestedShippingDocumentType customer_SPECIFIED_LABELS = new RequestedShippingDocumentType(_customer_SPECIFIED_LABELS);

  public static final RequestedShippingDocumentType custom_PACKAGE_DOCUMENT = new RequestedShippingDocumentType(_custom_PACKAGE_DOCUMENT);

  public static final RequestedShippingDocumentType custom_SHIPMENT_DOCUMENT = new RequestedShippingDocumentType(_custom_SHIPMENT_DOCUMENT);

  public static final RequestedShippingDocumentType dangerous_GOODS_SHIPPERS_DECLARATION = new RequestedShippingDocumentType(_dangerous_GOODS_SHIPPERS_DECLARATION);

  public static final RequestedShippingDocumentType export_DECLARATION = new RequestedShippingDocumentType(_export_DECLARATION);

  public static final RequestedShippingDocumentType freight_ADDRESS_LABEL = new RequestedShippingDocumentType(_freight_ADDRESS_LABEL);

  public static final RequestedShippingDocumentType general_AGENCY_AGREEMENT = new RequestedShippingDocumentType(_general_AGENCY_AGREEMENT);

  public static final RequestedShippingDocumentType label = new RequestedShippingDocumentType(_label);

  public static final RequestedShippingDocumentType nafta_CERTIFICATE_OF_ORIGIN = new RequestedShippingDocumentType(_nafta_CERTIFICATE_OF_ORIGIN);

  public static final RequestedShippingDocumentType op_900 = new RequestedShippingDocumentType(_op_900);

  public static final RequestedShippingDocumentType pro_FORMA_INVOICE = new RequestedShippingDocumentType(_pro_FORMA_INVOICE);

  public static final RequestedShippingDocumentType return_INSTRUCTIONS = new RequestedShippingDocumentType(_return_INSTRUCTIONS);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RequestedShippingDocumentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RequestedShippingDocumentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RequestedShippingDocumentType fromString(String value) {
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
    if (!(obj instanceof RequestedShippingDocumentType)) return false;
    final RequestedShippingDocumentType x = (RequestedShippingDocumentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_certificate_OF_ORIGIN, certificate_OF_ORIGIN);
    map.put(_commercial_INVOICE, commercial_INVOICE);
    map.put(_customer_SPECIFIED_LABELS, customer_SPECIFIED_LABELS);
    map.put(_custom_PACKAGE_DOCUMENT, custom_PACKAGE_DOCUMENT);
    map.put(_custom_SHIPMENT_DOCUMENT, custom_SHIPMENT_DOCUMENT);
    map.put(_dangerous_GOODS_SHIPPERS_DECLARATION, dangerous_GOODS_SHIPPERS_DECLARATION);
    map.put(_export_DECLARATION, export_DECLARATION);
    map.put(_freight_ADDRESS_LABEL, freight_ADDRESS_LABEL);
    map.put(_general_AGENCY_AGREEMENT, general_AGENCY_AGREEMENT);
    map.put(_label, label);
    map.put(_nafta_CERTIFICATE_OF_ORIGIN, nafta_CERTIFICATE_OF_ORIGIN);
    map.put(_op_900, op_900);
    map.put(_pro_FORMA_INVOICE, pro_FORMA_INVOICE);
    map.put(_return_INSTRUCTIONS, return_INSTRUCTIONS);
  }

}
