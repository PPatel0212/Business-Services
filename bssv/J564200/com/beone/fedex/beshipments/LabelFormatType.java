/**
 * Generated from schema type t=LabelFormatType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class LabelFormatType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected LabelFormatType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _common2D = "COMMON2D";

  public static final java.lang.String _fedex_FREIGHT_STRAIGHT_BILL_OF_LADING = "FEDEX_FREIGHT_STRAIGHT_BILL_OF_LADING";

  public static final java.lang.String _label_DATA_ONLY = "LABEL_DATA_ONLY";

  public static final java.lang.String _vics_BILL_OF_LADING = "VICS_BILL_OF_LADING";

  public static final LabelFormatType common2D = new LabelFormatType(_common2D);

  public static final LabelFormatType fedex_FREIGHT_STRAIGHT_BILL_OF_LADING = new LabelFormatType(_fedex_FREIGHT_STRAIGHT_BILL_OF_LADING);

  public static final LabelFormatType label_DATA_ONLY = new LabelFormatType(_label_DATA_ONLY);

  public static final LabelFormatType vics_BILL_OF_LADING = new LabelFormatType(_vics_BILL_OF_LADING);

  public java.lang.String getValue() {
    return this.value;
  }

  public static LabelFormatType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (LabelFormatType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static LabelFormatType fromString(String value) {
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
    if (!(obj instanceof LabelFormatType)) return false;
    final LabelFormatType x = (LabelFormatType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_common2D, common2D);
    map.put(_fedex_FREIGHT_STRAIGHT_BILL_OF_LADING, fedex_FREIGHT_STRAIGHT_BILL_OF_LADING);
    map.put(_label_DATA_ONLY, label_DATA_ONLY);
    map.put(_vics_BILL_OF_LADING, vics_BILL_OF_LADING);
  }

}
