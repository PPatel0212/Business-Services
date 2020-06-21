/**
 * Generated from schema type t=InternationalControlledExportType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class InternationalControlledExportType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected InternationalControlledExportType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _dea_036 = "DEA_036";

  public static final java.lang.String _dea_236 = "DEA_236";

  public static final java.lang.String _dea_486 = "DEA_486";

  public static final java.lang.String _dsp_05 = "DSP_05";

  public static final java.lang.String _dsp_61 = "DSP_61";

  public static final java.lang.String _dsp_73 = "DSP_73";

  public static final java.lang.String _dsp_85 = "DSP_85";

  public static final java.lang.String _dsp_94 = "DSP_94";

  public static final java.lang.String _dsp_LICENSE_AGREEMENT = "DSP_LICENSE_AGREEMENT";

  public static final java.lang.String _from_FOREIGN_TRADE_ZONE = "FROM_FOREIGN_TRADE_ZONE";

  public static final java.lang.String _warehouse_WITHDRAWAL = "WAREHOUSE_WITHDRAWAL";

  public static final InternationalControlledExportType dea_036 = new InternationalControlledExportType(_dea_036);

  public static final InternationalControlledExportType dea_236 = new InternationalControlledExportType(_dea_236);

  public static final InternationalControlledExportType dea_486 = new InternationalControlledExportType(_dea_486);

  public static final InternationalControlledExportType dsp_05 = new InternationalControlledExportType(_dsp_05);

  public static final InternationalControlledExportType dsp_61 = new InternationalControlledExportType(_dsp_61);

  public static final InternationalControlledExportType dsp_73 = new InternationalControlledExportType(_dsp_73);

  public static final InternationalControlledExportType dsp_85 = new InternationalControlledExportType(_dsp_85);

  public static final InternationalControlledExportType dsp_94 = new InternationalControlledExportType(_dsp_94);

  public static final InternationalControlledExportType dsp_LICENSE_AGREEMENT = new InternationalControlledExportType(_dsp_LICENSE_AGREEMENT);

  public static final InternationalControlledExportType from_FOREIGN_TRADE_ZONE = new InternationalControlledExportType(_from_FOREIGN_TRADE_ZONE);

  public static final InternationalControlledExportType warehouse_WITHDRAWAL = new InternationalControlledExportType(_warehouse_WITHDRAWAL);

  public java.lang.String getValue() {
    return this.value;
  }

  public static InternationalControlledExportType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (InternationalControlledExportType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static InternationalControlledExportType fromString(String value) {
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
    if (!(obj instanceof InternationalControlledExportType)) return false;
    final InternationalControlledExportType x = (InternationalControlledExportType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_dea_036, dea_036);
    map.put(_dea_236, dea_236);
    map.put(_dea_486, dea_486);
    map.put(_dsp_05, dsp_05);
    map.put(_dsp_61, dsp_61);
    map.put(_dsp_73, dsp_73);
    map.put(_dsp_85, dsp_85);
    map.put(_dsp_94, dsp_94);
    map.put(_dsp_LICENSE_AGREEMENT, dsp_LICENSE_AGREEMENT);
    map.put(_from_FOREIGN_TRADE_ZONE, from_FOREIGN_TRADE_ZONE);
    map.put(_warehouse_WITHDRAWAL, warehouse_WITHDRAWAL);
  }

}
