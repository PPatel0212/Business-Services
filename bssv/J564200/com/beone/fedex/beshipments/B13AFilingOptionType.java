/**
 * Generated from schema type t=B13AFilingOptionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class B13AFilingOptionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected B13AFilingOptionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _fedex_TO_STAMP = "FEDEX_TO_STAMP";

  public static final java.lang.String _filed_ELECTRONICALLY = "FILED_ELECTRONICALLY";

  public static final java.lang.String _manually_ATTACHED = "MANUALLY_ATTACHED";

  public static final java.lang.String _not_REQUIRED = "NOT_REQUIRED";

  public static final java.lang.String _summary_REPORTING = "SUMMARY_REPORTING";

  public static final B13AFilingOptionType fedex_TO_STAMP = new B13AFilingOptionType(_fedex_TO_STAMP);

  public static final B13AFilingOptionType filed_ELECTRONICALLY = new B13AFilingOptionType(_filed_ELECTRONICALLY);

  public static final B13AFilingOptionType manually_ATTACHED = new B13AFilingOptionType(_manually_ATTACHED);

  public static final B13AFilingOptionType not_REQUIRED = new B13AFilingOptionType(_not_REQUIRED);

  public static final B13AFilingOptionType summary_REPORTING = new B13AFilingOptionType(_summary_REPORTING);

  public java.lang.String getValue() {
    return this.value;
  }

  public static B13AFilingOptionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (B13AFilingOptionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static B13AFilingOptionType fromString(String value) {
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
    if (!(obj instanceof B13AFilingOptionType)) return false;
    final B13AFilingOptionType x = (B13AFilingOptionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_fedex_TO_STAMP, fedex_TO_STAMP);
    map.put(_filed_ELECTRONICALLY, filed_ELECTRONICALLY);
    map.put(_manually_ATTACHED, manually_ATTACHED);
    map.put(_not_REQUIRED, not_REQUIRED);
    map.put(_summary_REPORTING, summary_REPORTING);
  }

}
