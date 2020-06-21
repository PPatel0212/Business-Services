/**
 * Generated from schema type t=RadioactivityUnitOfMeasure@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class RadioactivityUnitOfMeasure implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected RadioactivityUnitOfMeasure(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _bq = "BQ";

  public static final java.lang.String _gbq = "GBQ";

  public static final java.lang.String _kbq = "KBQ";

  public static final java.lang.String _mbq = "MBQ";

  public static final java.lang.String _pbq = "PBQ";

  public static final java.lang.String _tbq = "TBQ";

  public static final RadioactivityUnitOfMeasure bq = new RadioactivityUnitOfMeasure(_bq);

  public static final RadioactivityUnitOfMeasure gbq = new RadioactivityUnitOfMeasure(_gbq);

  public static final RadioactivityUnitOfMeasure kbq = new RadioactivityUnitOfMeasure(_kbq);

  public static final RadioactivityUnitOfMeasure mbq = new RadioactivityUnitOfMeasure(_mbq);

  public static final RadioactivityUnitOfMeasure pbq = new RadioactivityUnitOfMeasure(_pbq);

  public static final RadioactivityUnitOfMeasure tbq = new RadioactivityUnitOfMeasure(_tbq);

  public java.lang.String getValue() {
    return this.value;
  }

  public static RadioactivityUnitOfMeasure fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (RadioactivityUnitOfMeasure) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static RadioactivityUnitOfMeasure fromString(String value) {
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
    if (!(obj instanceof RadioactivityUnitOfMeasure)) return false;
    final RadioactivityUnitOfMeasure x = (RadioactivityUnitOfMeasure) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_bq, bq);
    map.put(_gbq, gbq);
    map.put(_kbq, kbq);
    map.put(_mbq, mbq);
    map.put(_pbq, pbq);
    map.put(_tbq, tbq);
  }

}
