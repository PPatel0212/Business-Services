/**
 * Generated from schema type t=HazardousCommodityRegulationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HazardousCommodityRegulationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HazardousCommodityRegulationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _adr = "ADR";

  public static final java.lang.String _dot = "DOT";

  public static final java.lang.String _iata = "IATA";

  public static final java.lang.String _ormd = "ORMD";

  public static final HazardousCommodityRegulationType adr = new HazardousCommodityRegulationType(_adr);

  public static final HazardousCommodityRegulationType dot = new HazardousCommodityRegulationType(_dot);

  public static final HazardousCommodityRegulationType iata = new HazardousCommodityRegulationType(_iata);

  public static final HazardousCommodityRegulationType ormd = new HazardousCommodityRegulationType(_ormd);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HazardousCommodityRegulationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HazardousCommodityRegulationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HazardousCommodityRegulationType fromString(String value) {
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
    if (!(obj instanceof HazardousCommodityRegulationType)) return false;
    final HazardousCommodityRegulationType x = (HazardousCommodityRegulationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_adr, adr);
    map.put(_dot, dot);
    map.put(_iata, iata);
    map.put(_ormd, ormd);
  }

}
