/**
 * Generated from schema type t=LabelPrintingOrientationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class LabelPrintingOrientationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected LabelPrintingOrientationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _bottom_EDGE_OF_TEXT_FIRST = "BOTTOM_EDGE_OF_TEXT_FIRST";

  public static final java.lang.String _top_EDGE_OF_TEXT_FIRST = "TOP_EDGE_OF_TEXT_FIRST";

  public static final LabelPrintingOrientationType bottom_EDGE_OF_TEXT_FIRST = new LabelPrintingOrientationType(_bottom_EDGE_OF_TEXT_FIRST);

  public static final LabelPrintingOrientationType top_EDGE_OF_TEXT_FIRST = new LabelPrintingOrientationType(_top_EDGE_OF_TEXT_FIRST);

  public java.lang.String getValue() {
    return this.value;
  }

  public static LabelPrintingOrientationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (LabelPrintingOrientationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static LabelPrintingOrientationType fromString(String value) {
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
    if (!(obj instanceof LabelPrintingOrientationType)) return false;
    final LabelPrintingOrientationType x = (LabelPrintingOrientationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_bottom_EDGE_OF_TEXT_FIRST, bottom_EDGE_OF_TEXT_FIRST);
    map.put(_top_EDGE_OF_TEXT_FIRST, top_EDGE_OF_TEXT_FIRST);
  }

}
