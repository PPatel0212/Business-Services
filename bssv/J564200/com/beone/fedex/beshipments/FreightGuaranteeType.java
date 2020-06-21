/**
 * Generated from schema type t=FreightGuaranteeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FreightGuaranteeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FreightGuaranteeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _guaranteed_DATE = "GUARANTEED_DATE";

  public static final java.lang.String _guaranteed_MORNING = "GUARANTEED_MORNING";

  public static final FreightGuaranteeType guaranteed_DATE = new FreightGuaranteeType(_guaranteed_DATE);

  public static final FreightGuaranteeType guaranteed_MORNING = new FreightGuaranteeType(_guaranteed_MORNING);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FreightGuaranteeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FreightGuaranteeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FreightGuaranteeType fromString(String value) {
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
    if (!(obj instanceof FreightGuaranteeType)) return false;
    final FreightGuaranteeType x = (FreightGuaranteeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_guaranteed_DATE, guaranteed_DATE);
    map.put(_guaranteed_MORNING, guaranteed_MORNING);
  }

}
