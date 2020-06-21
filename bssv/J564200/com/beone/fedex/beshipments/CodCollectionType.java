/**
 * Generated from schema type t=CodCollectionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CodCollectionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CodCollectionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _any = "ANY";

  public static final java.lang.String _cash = "CASH";

  public static final java.lang.String _company_CHECK = "COMPANY_CHECK";

  public static final java.lang.String _guaranteed_FUNDS = "GUARANTEED_FUNDS";

  public static final java.lang.String _personal_CHECK = "PERSONAL_CHECK";

  public static final CodCollectionType any = new CodCollectionType(_any);

  public static final CodCollectionType cash = new CodCollectionType(_cash);

  public static final CodCollectionType company_CHECK = new CodCollectionType(_company_CHECK);

  public static final CodCollectionType guaranteed_FUNDS = new CodCollectionType(_guaranteed_FUNDS);

  public static final CodCollectionType personal_CHECK = new CodCollectionType(_personal_CHECK);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CodCollectionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CodCollectionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CodCollectionType fromString(String value) {
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
    if (!(obj instanceof CodCollectionType)) return false;
    final CodCollectionType x = (CodCollectionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_any, any);
    map.put(_cash, cash);
    map.put(_company_CHECK, company_CHECK);
    map.put(_guaranteed_FUNDS, guaranteed_FUNDS);
    map.put(_personal_CHECK, personal_CHECK);
  }

}
