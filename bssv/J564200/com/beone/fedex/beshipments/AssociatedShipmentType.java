/**
 * Generated from schema type t=AssociatedShipmentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class AssociatedShipmentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected AssociatedShipmentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _cod_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN = "COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN";

  public static final java.lang.String _cod_RETURN = "COD_RETURN";

  public static final java.lang.String _delivery_ON_INVOICE_ACCEPTANCE_RETURN = "DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN";

  public static final AssociatedShipmentType cod_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN = new AssociatedShipmentType(_cod_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN);

  public static final AssociatedShipmentType cod_RETURN = new AssociatedShipmentType(_cod_RETURN);

  public static final AssociatedShipmentType delivery_ON_INVOICE_ACCEPTANCE_RETURN = new AssociatedShipmentType(_delivery_ON_INVOICE_ACCEPTANCE_RETURN);

  public java.lang.String getValue() {
    return this.value;
  }

  public static AssociatedShipmentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (AssociatedShipmentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static AssociatedShipmentType fromString(String value) {
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
    if (!(obj instanceof AssociatedShipmentType)) return false;
    final AssociatedShipmentType x = (AssociatedShipmentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_cod_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN, cod_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN);
    map.put(_cod_RETURN, cod_RETURN);
    map.put(_delivery_ON_INVOICE_ACCEPTANCE_RETURN, delivery_ON_INVOICE_ACCEPTANCE_RETURN);
  }

}
