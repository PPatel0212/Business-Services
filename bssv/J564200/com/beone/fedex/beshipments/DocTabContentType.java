/**
 * Generated from schema type t=DocTabContentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class DocTabContentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected DocTabContentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _barcoded = "BARCODED";

  public static final java.lang.String _minimum = "MINIMUM";

  public static final java.lang.String _standard = "STANDARD";

  public static final java.lang.String _zone001 = "ZONE001";

  public static final DocTabContentType barcoded = new DocTabContentType(_barcoded);

  public static final DocTabContentType minimum = new DocTabContentType(_minimum);

  public static final DocTabContentType standard = new DocTabContentType(_standard);

  public static final DocTabContentType zone001 = new DocTabContentType(_zone001);

  public java.lang.String getValue() {
    return this.value;
  }

  public static DocTabContentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (DocTabContentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static DocTabContentType fromString(String value) {
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
    if (!(obj instanceof DocTabContentType)) return false;
    final DocTabContentType x = (DocTabContentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_barcoded, barcoded);
    map.put(_minimum, minimum);
    map.put(_standard, standard);
    map.put(_zone001, zone001);
  }

}
