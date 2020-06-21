/**
 * Generated from schema type t=RateRequestType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RateRequestType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RateRequestType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _account = "ACCOUNT";

  public static final java.lang.String _list = "LIST";

  public static final java.lang.String _preferred = "PREFERRED";

  public static final RateRequestType account = new RateRequestType(_account);

  public static final RateRequestType list = new RateRequestType(_list);

  public static final RateRequestType preferred = new RateRequestType(_preferred);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RateRequestType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RateRequestType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RateRequestType fromString(String value) {
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
    if (!(obj instanceof RateRequestType)) return false;
    final RateRequestType x = (RateRequestType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_account, account);
    map.put(_list, list);
    map.put(_preferred, preferred);
  }

}
