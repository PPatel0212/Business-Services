/**
 * Generated from schema type t=TrackingIdType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class TrackingIdType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected TrackingIdType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _express = "EXPRESS";

  public static final java.lang.String _fedex = "FEDEX";

  public static final java.lang.String _freight = "FREIGHT";

  public static final java.lang.String _ground = "GROUND";

  public static final java.lang.String _usps = "USPS";

  public static final TrackingIdType express = new TrackingIdType(_express);

  public static final TrackingIdType fedex = new TrackingIdType(_fedex);

  public static final TrackingIdType freight = new TrackingIdType(_freight);

  public static final TrackingIdType ground = new TrackingIdType(_ground);

  public static final TrackingIdType usps = new TrackingIdType(_usps);

  public java.lang.String getValue() {
    return this.value;
  }

  public static TrackingIdType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (TrackingIdType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static TrackingIdType fromString(String value) {
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
    if (!(obj instanceof TrackingIdType)) return false;
    final TrackingIdType x = (TrackingIdType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_express, express);
    map.put(_fedex, fedex);
    map.put(_freight, freight);
    map.put(_ground, ground);
    map.put(_usps, usps);
  }

}
