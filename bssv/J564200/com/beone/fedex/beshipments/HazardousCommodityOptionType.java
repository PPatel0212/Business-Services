/**
 * Generated from schema type t=HazardousCommodityOptionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class HazardousCommodityOptionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected HazardousCommodityOptionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _hazardous_MATERIALS = "HAZARDOUS_MATERIALS";

  public static final java.lang.String _limited_QUANTITIES_COMMODITIES = "LIMITED_QUANTITIES_COMMODITIES";

  public static final java.lang.String _lithium_BATTERY_EXCEPTION = "LITHIUM_BATTERY_EXCEPTION";

  public static final java.lang.String _orm_D = "ORM_D";

  public static final java.lang.String _reportable_QUANTITIES = "REPORTABLE_QUANTITIES";

  public static final java.lang.String _small_QUANTITY_EXCEPTION = "SMALL_QUANTITY_EXCEPTION";

  public static final HazardousCommodityOptionType hazardous_MATERIALS = new HazardousCommodityOptionType(_hazardous_MATERIALS);

  public static final HazardousCommodityOptionType limited_QUANTITIES_COMMODITIES = new HazardousCommodityOptionType(_limited_QUANTITIES_COMMODITIES);

  public static final HazardousCommodityOptionType lithium_BATTERY_EXCEPTION = new HazardousCommodityOptionType(_lithium_BATTERY_EXCEPTION);

  public static final HazardousCommodityOptionType orm_D = new HazardousCommodityOptionType(_orm_D);

  public static final HazardousCommodityOptionType reportable_QUANTITIES = new HazardousCommodityOptionType(_reportable_QUANTITIES);

  public static final HazardousCommodityOptionType small_QUANTITY_EXCEPTION = new HazardousCommodityOptionType(_small_QUANTITY_EXCEPTION);

  public java.lang.String getValue() {
    return this.value;
  }

  public static HazardousCommodityOptionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (HazardousCommodityOptionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static HazardousCommodityOptionType fromString(String value) {
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
    if (!(obj instanceof HazardousCommodityOptionType)) return false;
    final HazardousCommodityOptionType x = (HazardousCommodityOptionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_hazardous_MATERIALS, hazardous_MATERIALS);
    map.put(_limited_QUANTITIES_COMMODITIES, limited_QUANTITIES_COMMODITIES);
    map.put(_lithium_BATTERY_EXCEPTION, lithium_BATTERY_EXCEPTION);
    map.put(_orm_D, orm_D);
    map.put(_reportable_QUANTITIES, reportable_QUANTITIES);
    map.put(_small_QUANTITY_EXCEPTION, small_QUANTITY_EXCEPTION);
  }

}
