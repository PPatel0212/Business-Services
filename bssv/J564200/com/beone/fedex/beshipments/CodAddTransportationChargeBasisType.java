/**
 * Generated from schema type t=CodAddTransportationChargeBasisType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CodAddTransportationChargeBasisType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CodAddTransportationChargeBasisType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _cod_SURCHARGE = "COD_SURCHARGE";

  public static final java.lang.String _net_CHARGE = "NET_CHARGE";

  public static final java.lang.String _net_FREIGHT = "NET_FREIGHT";

  public static final java.lang.String _total_CUSTOMER_CHARGE = "TOTAL_CUSTOMER_CHARGE";

  public static final CodAddTransportationChargeBasisType cod_SURCHARGE = new CodAddTransportationChargeBasisType(_cod_SURCHARGE);

  public static final CodAddTransportationChargeBasisType net_CHARGE = new CodAddTransportationChargeBasisType(_net_CHARGE);

  public static final CodAddTransportationChargeBasisType net_FREIGHT = new CodAddTransportationChargeBasisType(_net_FREIGHT);

  public static final CodAddTransportationChargeBasisType total_CUSTOMER_CHARGE = new CodAddTransportationChargeBasisType(_total_CUSTOMER_CHARGE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CodAddTransportationChargeBasisType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CodAddTransportationChargeBasisType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CodAddTransportationChargeBasisType fromString(String value) {
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
    if (!(obj instanceof CodAddTransportationChargeBasisType)) return false;
    final CodAddTransportationChargeBasisType x = (CodAddTransportationChargeBasisType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_cod_SURCHARGE, cod_SURCHARGE);
    map.put(_net_CHARGE, net_CHARGE);
    map.put(_net_FREIGHT, net_FREIGHT);
    map.put(_total_CUSTOMER_CHARGE, total_CUSTOMER_CHARGE);
  }

}
