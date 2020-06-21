/**
 * Generated from schema type t=NaftaNetCostMethodCode@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class NaftaNetCostMethodCode implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected NaftaNetCostMethodCode(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _nc = "NC";

  public static final java.lang.String _no = "NO";

  public static final NaftaNetCostMethodCode nc = new NaftaNetCostMethodCode(_nc);

  public static final NaftaNetCostMethodCode no = new NaftaNetCostMethodCode(_no);

  public java.lang.String getValue() {
    return this.value;
  }

  public static NaftaNetCostMethodCode fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (NaftaNetCostMethodCode) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static NaftaNetCostMethodCode fromString(String value) {
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
    if (!(obj instanceof NaftaNetCostMethodCode)) return false;
    final NaftaNetCostMethodCode x = (NaftaNetCostMethodCode) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_nc, nc);
    map.put(_no, no);
  }

}
