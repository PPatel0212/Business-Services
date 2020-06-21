/**
 * Generated from schema type t=ReturnedRateType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ReturnedRateType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ReturnedRateType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _incentive = "INCENTIVE";

  public static final java.lang.String _payor_ACCOUNT_PACKAGE = "PAYOR_ACCOUNT_PACKAGE";

  public static final java.lang.String _payor_ACCOUNT_SHIPMENT = "PAYOR_ACCOUNT_SHIPMENT";

  public static final java.lang.String _payor_LIST_PACKAGE = "PAYOR_LIST_PACKAGE";

  public static final java.lang.String _payor_LIST_SHIPMENT = "PAYOR_LIST_SHIPMENT";

  public static final java.lang.String _preferred_ACCOUNT_PACKAGE = "PREFERRED_ACCOUNT_PACKAGE";

  public static final java.lang.String _preferred_ACCOUNT_SHIPMENT = "PREFERRED_ACCOUNT_SHIPMENT";

  public static final java.lang.String _preferred_LIST_PACKAGE = "PREFERRED_LIST_PACKAGE";

  public static final java.lang.String _preferred_LIST_SHIPMENT = "PREFERRED_LIST_SHIPMENT";

  public static final java.lang.String _rated_ACCOUNT_PACKAGE = "RATED_ACCOUNT_PACKAGE";

  public static final java.lang.String _rated_ACCOUNT_SHIPMENT = "RATED_ACCOUNT_SHIPMENT";

  public static final java.lang.String _rated_LIST_PACKAGE = "RATED_LIST_PACKAGE";

  public static final java.lang.String _rated_LIST_SHIPMENT = "RATED_LIST_SHIPMENT";

  public static final ReturnedRateType incentive = new ReturnedRateType(_incentive);

  public static final ReturnedRateType payor_ACCOUNT_PACKAGE = new ReturnedRateType(_payor_ACCOUNT_PACKAGE);

  public static final ReturnedRateType payor_ACCOUNT_SHIPMENT = new ReturnedRateType(_payor_ACCOUNT_SHIPMENT);

  public static final ReturnedRateType payor_LIST_PACKAGE = new ReturnedRateType(_payor_LIST_PACKAGE);

  public static final ReturnedRateType payor_LIST_SHIPMENT = new ReturnedRateType(_payor_LIST_SHIPMENT);

  public static final ReturnedRateType preferred_ACCOUNT_PACKAGE = new ReturnedRateType(_preferred_ACCOUNT_PACKAGE);

  public static final ReturnedRateType preferred_ACCOUNT_SHIPMENT = new ReturnedRateType(_preferred_ACCOUNT_SHIPMENT);

  public static final ReturnedRateType preferred_LIST_PACKAGE = new ReturnedRateType(_preferred_LIST_PACKAGE);

  public static final ReturnedRateType preferred_LIST_SHIPMENT = new ReturnedRateType(_preferred_LIST_SHIPMENT);

  public static final ReturnedRateType rated_ACCOUNT_PACKAGE = new ReturnedRateType(_rated_ACCOUNT_PACKAGE);

  public static final ReturnedRateType rated_ACCOUNT_SHIPMENT = new ReturnedRateType(_rated_ACCOUNT_SHIPMENT);

  public static final ReturnedRateType rated_LIST_PACKAGE = new ReturnedRateType(_rated_LIST_PACKAGE);

  public static final ReturnedRateType rated_LIST_SHIPMENT = new ReturnedRateType(_rated_LIST_SHIPMENT);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ReturnedRateType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ReturnedRateType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ReturnedRateType fromString(String value) {
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
    if (!(obj instanceof ReturnedRateType)) return false;
    final ReturnedRateType x = (ReturnedRateType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_incentive, incentive);
    map.put(_payor_ACCOUNT_PACKAGE, payor_ACCOUNT_PACKAGE);
    map.put(_payor_ACCOUNT_SHIPMENT, payor_ACCOUNT_SHIPMENT);
    map.put(_payor_LIST_PACKAGE, payor_LIST_PACKAGE);
    map.put(_payor_LIST_SHIPMENT, payor_LIST_SHIPMENT);
    map.put(_preferred_ACCOUNT_PACKAGE, preferred_ACCOUNT_PACKAGE);
    map.put(_preferred_ACCOUNT_SHIPMENT, preferred_ACCOUNT_SHIPMENT);
    map.put(_preferred_LIST_PACKAGE, preferred_LIST_PACKAGE);
    map.put(_preferred_LIST_SHIPMENT, preferred_LIST_SHIPMENT);
    map.put(_rated_ACCOUNT_PACKAGE, rated_ACCOUNT_PACKAGE);
    map.put(_rated_ACCOUNT_SHIPMENT, rated_ACCOUNT_SHIPMENT);
    map.put(_rated_LIST_PACKAGE, rated_LIST_PACKAGE);
    map.put(_rated_LIST_SHIPMENT, rated_LIST_SHIPMENT);
  }

}
