/**
 * Generated from schema type t=PackageSpecialServiceType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PackageSpecialServiceType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PackageSpecialServiceType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _alcohol = "ALCOHOL";

  public static final java.lang.String _appointment_DELIVERY = "APPOINTMENT_DELIVERY";

  public static final java.lang.String _cod = "COD";

  public static final java.lang.String _dangerous_GOODS = "DANGEROUS_GOODS";

  public static final java.lang.String _dry_ICE = "DRY_ICE";

  public static final java.lang.String _non_STANDARD_CONTAINER = "NON_STANDARD_CONTAINER";

  public static final java.lang.String _priority_ALERT = "PRIORITY_ALERT";

  public static final java.lang.String _signature_OPTION = "SIGNATURE_OPTION";

  public static final PackageSpecialServiceType alcohol = new PackageSpecialServiceType(_alcohol);

  public static final PackageSpecialServiceType appointment_DELIVERY = new PackageSpecialServiceType(_appointment_DELIVERY);

  public static final PackageSpecialServiceType cod = new PackageSpecialServiceType(_cod);

  public static final PackageSpecialServiceType dangerous_GOODS = new PackageSpecialServiceType(_dangerous_GOODS);

  public static final PackageSpecialServiceType dry_ICE = new PackageSpecialServiceType(_dry_ICE);

  public static final PackageSpecialServiceType non_STANDARD_CONTAINER = new PackageSpecialServiceType(_non_STANDARD_CONTAINER);

  public static final PackageSpecialServiceType priority_ALERT = new PackageSpecialServiceType(_priority_ALERT);

  public static final PackageSpecialServiceType signature_OPTION = new PackageSpecialServiceType(_signature_OPTION);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PackageSpecialServiceType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PackageSpecialServiceType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PackageSpecialServiceType fromString(String value) {
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
    if (!(obj instanceof PackageSpecialServiceType)) return false;
    final PackageSpecialServiceType x = (PackageSpecialServiceType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_alcohol, alcohol);
    map.put(_appointment_DELIVERY, appointment_DELIVERY);
    map.put(_cod, cod);
    map.put(_dangerous_GOODS, dangerous_GOODS);
    map.put(_dry_ICE, dry_ICE);
    map.put(_non_STANDARD_CONTAINER, non_STANDARD_CONTAINER);
    map.put(_priority_ALERT, priority_ALERT);
    map.put(_signature_OPTION, signature_OPTION);
  }

}
