/**
 * Generated from schema type t=CarrierCodeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CarrierCodeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CarrierCodeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _fdxc = "FDXC";

  public static final java.lang.String _fdxe = "FDXE";

  public static final java.lang.String _fdxg = "FDXG";

  public static final java.lang.String _fxcc = "FXCC";

  public static final java.lang.String _fxfr = "FXFR";

  public static final java.lang.String _fxsp = "FXSP";

  public static final CarrierCodeType fdxc = new CarrierCodeType(_fdxc);

  public static final CarrierCodeType fdxe = new CarrierCodeType(_fdxe);

  public static final CarrierCodeType fdxg = new CarrierCodeType(_fdxg);

  public static final CarrierCodeType fxcc = new CarrierCodeType(_fxcc);

  public static final CarrierCodeType fxfr = new CarrierCodeType(_fxfr);

  public static final CarrierCodeType fxsp = new CarrierCodeType(_fxsp);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CarrierCodeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CarrierCodeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CarrierCodeType fromString(String value) {
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
    if (!(obj instanceof CarrierCodeType)) return false;
    final CarrierCodeType x = (CarrierCodeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_fdxc, fdxc);
    map.put(_fdxe, fdxe);
    map.put(_fdxg, fdxg);
    map.put(_fxcc, fxcc);
    map.put(_fxfr, fxfr);
    map.put(_fxsp, fxsp);
  }

}
