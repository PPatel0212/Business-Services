/**
 * Generated from schema type t=NaftaProducerSpecificationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class NaftaProducerSpecificationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected NaftaProducerSpecificationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _available_UPON_REQUEST = "AVAILABLE_UPON_REQUEST";

  public static final java.lang.String _multiple_SPECIFIED = "MULTIPLE_SPECIFIED";

  public static final java.lang.String _same = "SAME";

  public static final java.lang.String _single_SPECIFIED = "SINGLE_SPECIFIED";

  public static final java.lang.String _unknown = "UNKNOWN";

  public static final NaftaProducerSpecificationType available_UPON_REQUEST = new NaftaProducerSpecificationType(_available_UPON_REQUEST);

  public static final NaftaProducerSpecificationType multiple_SPECIFIED = new NaftaProducerSpecificationType(_multiple_SPECIFIED);

  public static final NaftaProducerSpecificationType same = new NaftaProducerSpecificationType(_same);

  public static final NaftaProducerSpecificationType single_SPECIFIED = new NaftaProducerSpecificationType(_single_SPECIFIED);

  public static final NaftaProducerSpecificationType unknown = new NaftaProducerSpecificationType(_unknown);

  public java.lang.String getValue() {
    return this.value;
  }

  public static NaftaProducerSpecificationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (NaftaProducerSpecificationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static NaftaProducerSpecificationType fromString(String value) {
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
    if (!(obj instanceof NaftaProducerSpecificationType)) return false;
    final NaftaProducerSpecificationType x = (NaftaProducerSpecificationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_available_UPON_REQUEST, available_UPON_REQUEST);
    map.put(_multiple_SPECIFIED, multiple_SPECIFIED);
    map.put(_same, same);
    map.put(_single_SPECIFIED, single_SPECIFIED);
    map.put(_unknown, unknown);
  }

}
