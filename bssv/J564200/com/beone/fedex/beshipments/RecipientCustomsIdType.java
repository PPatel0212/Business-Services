/**
 * Generated from schema type t=RecipientCustomsIdType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RecipientCustomsIdType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RecipientCustomsIdType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _company = "COMPANY";

  public static final java.lang.String _individual = "INDIVIDUAL";

  public static final java.lang.String _passport = "PASSPORT";

  public static final RecipientCustomsIdType company = new RecipientCustomsIdType(_company);

  public static final RecipientCustomsIdType individual = new RecipientCustomsIdType(_individual);

  public static final RecipientCustomsIdType passport = new RecipientCustomsIdType(_passport);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RecipientCustomsIdType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RecipientCustomsIdType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RecipientCustomsIdType fromString(String value) {
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
    if (!(obj instanceof RecipientCustomsIdType)) return false;
    final RecipientCustomsIdType x = (RecipientCustomsIdType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_company, company);
    map.put(_individual, individual);
    map.put(_passport, passport);
  }

}
