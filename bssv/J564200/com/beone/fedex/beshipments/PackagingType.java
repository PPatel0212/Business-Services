/**
 * Generated from schema type t=PackagingType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PackagingType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PackagingType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _fedex_10KG_BOX = "FEDEX_10KG_BOX";

  public static final java.lang.String _fedex_25KG_BOX = "FEDEX_25KG_BOX";

  public static final java.lang.String _fedex_BOX = "FEDEX_BOX";

  public static final java.lang.String _fedex_ENVELOPE = "FEDEX_ENVELOPE";

  public static final java.lang.String _fedex_PAK = "FEDEX_PAK";

  public static final java.lang.String _fedex_TUBE = "FEDEX_TUBE";

  public static final java.lang.String _your_PACKAGING = "YOUR_PACKAGING";

  public static final PackagingType fedex_10KG_BOX = new PackagingType(_fedex_10KG_BOX);

  public static final PackagingType fedex_25KG_BOX = new PackagingType(_fedex_25KG_BOX);

  public static final PackagingType fedex_BOX = new PackagingType(_fedex_BOX);

  public static final PackagingType fedex_ENVELOPE = new PackagingType(_fedex_ENVELOPE);

  public static final PackagingType fedex_PAK = new PackagingType(_fedex_PAK);

  public static final PackagingType fedex_TUBE = new PackagingType(_fedex_TUBE);

  public static final PackagingType your_PACKAGING = new PackagingType(_your_PACKAGING);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PackagingType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PackagingType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PackagingType fromString(String value) {
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
    if (!(obj instanceof PackagingType)) return false;
    final PackagingType x = (PackagingType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_fedex_10KG_BOX, fedex_10KG_BOX);
    map.put(_fedex_25KG_BOX, fedex_25KG_BOX);
    map.put(_fedex_BOX, fedex_BOX);
    map.put(_fedex_ENVELOPE, fedex_ENVELOPE);
    map.put(_fedex_PAK, fedex_PAK);
    map.put(_fedex_TUBE, fedex_TUBE);
    map.put(_your_PACKAGING, your_PACKAGING);
  }

}
