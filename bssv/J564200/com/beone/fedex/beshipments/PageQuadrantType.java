/**
 * Generated from schema type t=PageQuadrantType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PageQuadrantType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PageQuadrantType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _bottom_LEFT = "BOTTOM_LEFT";

  public static final java.lang.String _bottom_RIGHT = "BOTTOM_RIGHT";

  public static final java.lang.String _top_LEFT = "TOP_LEFT";

  public static final java.lang.String _top_RIGHT = "TOP_RIGHT";

  public static final PageQuadrantType bottom_LEFT = new PageQuadrantType(_bottom_LEFT);

  public static final PageQuadrantType bottom_RIGHT = new PageQuadrantType(_bottom_RIGHT);

  public static final PageQuadrantType top_LEFT = new PageQuadrantType(_top_LEFT);

  public static final PageQuadrantType top_RIGHT = new PageQuadrantType(_top_RIGHT);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PageQuadrantType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PageQuadrantType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PageQuadrantType fromString(String value) {
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
    if (!(obj instanceof PageQuadrantType)) return false;
    final PageQuadrantType x = (PageQuadrantType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_bottom_LEFT, bottom_LEFT);
    map.put(_bottom_RIGHT, bottom_RIGHT);
    map.put(_top_LEFT, top_LEFT);
    map.put(_top_RIGHT, top_RIGHT);
  }

}
