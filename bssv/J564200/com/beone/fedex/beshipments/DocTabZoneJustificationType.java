/**
 * Generated from schema type t=DocTabZoneJustificationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class DocTabZoneJustificationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected DocTabZoneJustificationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _left = "LEFT";

  public static final java.lang.String _right = "RIGHT";

  public static final DocTabZoneJustificationType left = new DocTabZoneJustificationType(_left);

  public static final DocTabZoneJustificationType right = new DocTabZoneJustificationType(_right);

  public java.lang.String getValue() {
    return this.value;
  }

  public static DocTabZoneJustificationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (DocTabZoneJustificationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static DocTabZoneJustificationType fromString(String value) {
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
    if (!(obj instanceof DocTabZoneJustificationType)) return false;
    final DocTabZoneJustificationType x = (DocTabZoneJustificationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_left, left);
    map.put(_right, right);
  }

}
