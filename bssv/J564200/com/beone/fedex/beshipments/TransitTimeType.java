/**
 * Generated from schema type t=TransitTimeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class TransitTimeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected TransitTimeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _eighteen_DAYS = "EIGHTEEN_DAYS";

  public static final java.lang.String _eight_DAYS = "EIGHT_DAYS";

  public static final java.lang.String _eleven_DAYS = "ELEVEN_DAYS";

  public static final java.lang.String _fifteen_DAYS = "FIFTEEN_DAYS";

  public static final java.lang.String _five_DAYS = "FIVE_DAYS";

  public static final java.lang.String _fourteen_DAYS = "FOURTEEN_DAYS";

  public static final java.lang.String _four_DAYS = "FOUR_DAYS";

  public static final java.lang.String _nineteen_DAYS = "NINETEEN_DAYS";

  public static final java.lang.String _nine_DAYS = "NINE_DAYS";

  public static final java.lang.String _one_DAY = "ONE_DAY";

  public static final java.lang.String _seventeen_DAYS = "SEVENTEEN_DAYS";

  public static final java.lang.String _seven_DAYS = "SEVEN_DAYS";

  public static final java.lang.String _sixteen_DAYS = "SIXTEEN_DAYS";

  public static final java.lang.String _six_DAYS = "SIX_DAYS";

  public static final java.lang.String _ten_DAYS = "TEN_DAYS";

  public static final java.lang.String _thirteen_DAYS = "THIRTEEN_DAYS";

  public static final java.lang.String _three_DAYS = "THREE_DAYS";

  public static final java.lang.String _twelve_DAYS = "TWELVE_DAYS";

  public static final java.lang.String _twenty_DAYS = "TWENTY_DAYS";

  public static final java.lang.String _two_DAYS = "TWO_DAYS";

  public static final java.lang.String _unknown = "UNKNOWN";

  public static final TransitTimeType eighteen_DAYS = new TransitTimeType(_eighteen_DAYS);

  public static final TransitTimeType eight_DAYS = new TransitTimeType(_eight_DAYS);

  public static final TransitTimeType eleven_DAYS = new TransitTimeType(_eleven_DAYS);

  public static final TransitTimeType fifteen_DAYS = new TransitTimeType(_fifteen_DAYS);

  public static final TransitTimeType five_DAYS = new TransitTimeType(_five_DAYS);

  public static final TransitTimeType fourteen_DAYS = new TransitTimeType(_fourteen_DAYS);

  public static final TransitTimeType four_DAYS = new TransitTimeType(_four_DAYS);

  public static final TransitTimeType nineteen_DAYS = new TransitTimeType(_nineteen_DAYS);

  public static final TransitTimeType nine_DAYS = new TransitTimeType(_nine_DAYS);

  public static final TransitTimeType one_DAY = new TransitTimeType(_one_DAY);

  public static final TransitTimeType seventeen_DAYS = new TransitTimeType(_seventeen_DAYS);

  public static final TransitTimeType seven_DAYS = new TransitTimeType(_seven_DAYS);

  public static final TransitTimeType sixteen_DAYS = new TransitTimeType(_sixteen_DAYS);

  public static final TransitTimeType six_DAYS = new TransitTimeType(_six_DAYS);

  public static final TransitTimeType ten_DAYS = new TransitTimeType(_ten_DAYS);

  public static final TransitTimeType thirteen_DAYS = new TransitTimeType(_thirteen_DAYS);

  public static final TransitTimeType three_DAYS = new TransitTimeType(_three_DAYS);

  public static final TransitTimeType twelve_DAYS = new TransitTimeType(_twelve_DAYS);

  public static final TransitTimeType twenty_DAYS = new TransitTimeType(_twenty_DAYS);

  public static final TransitTimeType two_DAYS = new TransitTimeType(_two_DAYS);

  public static final TransitTimeType unknown = new TransitTimeType(_unknown);

  public java.lang.String getValue() {
    return this.value;
  }

  public static TransitTimeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (TransitTimeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static TransitTimeType fromString(String value) {
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
    if (!(obj instanceof TransitTimeType)) return false;
    final TransitTimeType x = (TransitTimeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_eighteen_DAYS, eighteen_DAYS);
    map.put(_eight_DAYS, eight_DAYS);
    map.put(_eleven_DAYS, eleven_DAYS);
    map.put(_fifteen_DAYS, fifteen_DAYS);
    map.put(_five_DAYS, five_DAYS);
    map.put(_fourteen_DAYS, fourteen_DAYS);
    map.put(_four_DAYS, four_DAYS);
    map.put(_nineteen_DAYS, nineteen_DAYS);
    map.put(_nine_DAYS, nine_DAYS);
    map.put(_one_DAY, one_DAY);
    map.put(_seventeen_DAYS, seventeen_DAYS);
    map.put(_seven_DAYS, seven_DAYS);
    map.put(_sixteen_DAYS, sixteen_DAYS);
    map.put(_six_DAYS, six_DAYS);
    map.put(_ten_DAYS, ten_DAYS);
    map.put(_thirteen_DAYS, thirteen_DAYS);
    map.put(_three_DAYS, three_DAYS);
    map.put(_twelve_DAYS, twelve_DAYS);
    map.put(_twenty_DAYS, twenty_DAYS);
    map.put(_two_DAYS, two_DAYS);
    map.put(_unknown, unknown);
  }

}
