/**
 * Generated from schema type t=SignatureOptionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class SignatureOptionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected SignatureOptionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _adult = "ADULT";

  public static final java.lang.String _direct = "DIRECT";

  public static final java.lang.String _indirect = "INDIRECT";

  public static final java.lang.String _no_SIGNATURE_REQUIRED = "NO_SIGNATURE_REQUIRED";

  public static final java.lang.String _service_DEFAULT = "SERVICE_DEFAULT";

  public static final SignatureOptionType adult = new SignatureOptionType(_adult);

  public static final SignatureOptionType direct = new SignatureOptionType(_direct);

  public static final SignatureOptionType indirect = new SignatureOptionType(_indirect);

  public static final SignatureOptionType no_SIGNATURE_REQUIRED = new SignatureOptionType(_no_SIGNATURE_REQUIRED);

  public static final SignatureOptionType service_DEFAULT = new SignatureOptionType(_service_DEFAULT);

  public java.lang.String getValue() {
    return this.value;
  }

  public static SignatureOptionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (SignatureOptionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static SignatureOptionType fromString(String value) {
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
    if (!(obj instanceof SignatureOptionType)) return false;
    final SignatureOptionType x = (SignatureOptionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_adult, adult);
    map.put(_direct, direct);
    map.put(_indirect, indirect);
    map.put(_no_SIGNATURE_REQUIRED, no_SIGNATURE_REQUIRED);
    map.put(_service_DEFAULT, service_DEFAULT);
  }

}
