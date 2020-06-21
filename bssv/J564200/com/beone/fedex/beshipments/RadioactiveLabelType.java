/**
 * Generated from schema type t=RadioactiveLabelType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RadioactiveLabelType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RadioactiveLabelType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _iii_YELLOW = "III_YELLOW";

  public static final java.lang.String _ii_YELLOW = "II_YELLOW";

  public static final java.lang.String _i_WHITE = "I_WHITE";

  public static final RadioactiveLabelType iii_YELLOW = new RadioactiveLabelType(_iii_YELLOW);

  public static final RadioactiveLabelType ii_YELLOW = new RadioactiveLabelType(_ii_YELLOW);

  public static final RadioactiveLabelType i_WHITE = new RadioactiveLabelType(_i_WHITE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RadioactiveLabelType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RadioactiveLabelType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RadioactiveLabelType fromString(String value) {
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
    if (!(obj instanceof RadioactiveLabelType)) return false;
    final RadioactiveLabelType x = (RadioactiveLabelType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_iii_YELLOW, iii_YELLOW);
    map.put(_ii_YELLOW, ii_YELLOW);
    map.put(_i_WHITE, i_WHITE);
  }

}
