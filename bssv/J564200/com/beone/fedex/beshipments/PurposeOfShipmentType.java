/**
 * Generated from schema type t=PurposeOfShipmentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PurposeOfShipmentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PurposeOfShipmentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _gift = "GIFT";

  public static final java.lang.String _not_SOLD = "NOT_SOLD";

  public static final java.lang.String _personal_EFFECTS = "PERSONAL_EFFECTS";

  public static final java.lang.String _repair_AND_RETURN = "REPAIR_AND_RETURN";

  public static final java.lang.String _sample = "SAMPLE";

  public static final java.lang.String _sold = "SOLD";

  public static final PurposeOfShipmentType gift = new PurposeOfShipmentType(_gift);

  public static final PurposeOfShipmentType not_SOLD = new PurposeOfShipmentType(_not_SOLD);

  public static final PurposeOfShipmentType personal_EFFECTS = new PurposeOfShipmentType(_personal_EFFECTS);

  public static final PurposeOfShipmentType repair_AND_RETURN = new PurposeOfShipmentType(_repair_AND_RETURN);

  public static final PurposeOfShipmentType sample = new PurposeOfShipmentType(_sample);

  public static final PurposeOfShipmentType sold = new PurposeOfShipmentType(_sold);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PurposeOfShipmentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PurposeOfShipmentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PurposeOfShipmentType fromString(String value) {
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
    if (!(obj instanceof PurposeOfShipmentType)) return false;
    final PurposeOfShipmentType x = (PurposeOfShipmentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_gift, gift);
    map.put(_not_SOLD, not_SOLD);
    map.put(_personal_EFFECTS, personal_EFFECTS);
    map.put(_repair_AND_RETURN, repair_AND_RETURN);
    map.put(_sample, sample);
    map.put(_sold, sold);
  }

}
