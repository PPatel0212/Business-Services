/**
 * Generated from schema type t=PaymentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PaymentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PaymentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _account = "ACCOUNT";

  public static final java.lang.String _collect = "COLLECT";

  public static final java.lang.String _recipient = "RECIPIENT";

  public static final java.lang.String _sender = "SENDER";

  public static final java.lang.String _third_PARTY = "THIRD_PARTY";

  public static final PaymentType account = new PaymentType(_account);

  public static final PaymentType collect = new PaymentType(_collect);

  public static final PaymentType recipient = new PaymentType(_recipient);

  public static final PaymentType sender = new PaymentType(_sender);

  public static final PaymentType third_PARTY = new PaymentType(_third_PARTY);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PaymentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PaymentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PaymentType fromString(String value) {
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
    if (!(obj instanceof PaymentType)) return false;
    final PaymentType x = (PaymentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_account, account);
    map.put(_collect, collect);
    map.put(_recipient, recipient);
    map.put(_sender, sender);
    map.put(_third_PARTY, third_PARTY);
  }

}
