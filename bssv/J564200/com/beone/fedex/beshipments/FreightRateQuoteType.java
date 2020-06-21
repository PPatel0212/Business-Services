/**
 * Generated from schema type t=FreightRateQuoteType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FreightRateQuoteType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FreightRateQuoteType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _automated = "AUTOMATED";

  public static final java.lang.String _manual = "MANUAL";

  public static final FreightRateQuoteType automated = new FreightRateQuoteType(_automated);

  public static final FreightRateQuoteType manual = new FreightRateQuoteType(_manual);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FreightRateQuoteType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FreightRateQuoteType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FreightRateQuoteType fromString(String value) {
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
    if (!(obj instanceof FreightRateQuoteType)) return false;
    final FreightRateQuoteType x = (FreightRateQuoteType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_automated, automated);
    map.put(_manual, manual);
  }

}
