/**
 * Generated from schema type t=DayOfWeekType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class DayOfWeekType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected DayOfWeekType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _fri = "FRI";

  public static final java.lang.String _mon = "MON";

  public static final java.lang.String _sat = "SAT";

  public static final java.lang.String _sun = "SUN";

  public static final java.lang.String _thu = "THU";

  public static final java.lang.String _tue = "TUE";

  public static final java.lang.String _wed = "WED";

  public static final DayOfWeekType fri = new DayOfWeekType(_fri);

  public static final DayOfWeekType mon = new DayOfWeekType(_mon);

  public static final DayOfWeekType sat = new DayOfWeekType(_sat);

  public static final DayOfWeekType sun = new DayOfWeekType(_sun);

  public static final DayOfWeekType thu = new DayOfWeekType(_thu);

  public static final DayOfWeekType tue = new DayOfWeekType(_tue);

  public static final DayOfWeekType wed = new DayOfWeekType(_wed);

  public java.lang.String getValue() {
    return this.value;
  }

  public static DayOfWeekType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (DayOfWeekType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static DayOfWeekType fromString(String value) {
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
    if (!(obj instanceof DayOfWeekType)) return false;
    final DayOfWeekType x = (DayOfWeekType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_fri, fri);
    map.put(_mon, mon);
    map.put(_sat, sat);
    map.put(_sun, sun);
    map.put(_thu, thu);
    map.put(_tue, tue);
    map.put(_wed, wed);
  }

}
