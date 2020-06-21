/**
 * Generated from schema type t=VolumeUnits@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class VolumeUnits implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected VolumeUnits(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _cubic_FT = "CUBIC_FT";

  public static final java.lang.String _cubic_M = "CUBIC_M";

  public static final VolumeUnits cubic_FT = new VolumeUnits(_cubic_FT);

  public static final VolumeUnits cubic_M = new VolumeUnits(_cubic_M);

  public java.lang.String getValue() {
    return this.value;
  }

  public static VolumeUnits fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (VolumeUnits) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static VolumeUnits fromString(String value) {
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
    if (!(obj instanceof VolumeUnits)) return false;
    final VolumeUnits x = (VolumeUnits) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_cubic_FT, cubic_FT);
    map.put(_cubic_M, cubic_M);
  }

}
