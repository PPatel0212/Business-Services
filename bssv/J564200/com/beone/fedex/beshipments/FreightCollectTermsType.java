/**
 * Generated from schema type t=FreightCollectTermsType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FreightCollectTermsType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FreightCollectTermsType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _non_RECOURSE_SHIPPER_SIGNED = "NON_RECOURSE_SHIPPER_SIGNED";

  public static final java.lang.String _standard = "STANDARD";

  public static final FreightCollectTermsType non_RECOURSE_SHIPPER_SIGNED = new FreightCollectTermsType(_non_RECOURSE_SHIPPER_SIGNED);

  public static final FreightCollectTermsType standard = new FreightCollectTermsType(_standard);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FreightCollectTermsType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FreightCollectTermsType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FreightCollectTermsType fromString(String value) {
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
    if (!(obj instanceof FreightCollectTermsType)) return false;
    final FreightCollectTermsType x = (FreightCollectTermsType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_non_RECOURSE_SHIPPER_SIGNED, non_RECOURSE_SHIPPER_SIGNED);
    map.put(_standard, standard);
  }

}
