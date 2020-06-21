/**
 * Generated from schema type t=LabelMaskableDataType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class LabelMaskableDataType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected LabelMaskableDataType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _customs_VALUE = "CUSTOMS_VALUE";

  public static final java.lang.String _duties_AND_TAXES_PAYOR_ACCOUNT_NUMBER = "DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER";

  public static final java.lang.String _shipper_ACCOUNT_NUMBER = "SHIPPER_ACCOUNT_NUMBER";

  public static final java.lang.String _terms_AND_CONDITIONS = "TERMS_AND_CONDITIONS";

  public static final java.lang.String _transportation_CHARGES_PAYOR_ACCOUNT_NUMBER = "TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER";

  public static final LabelMaskableDataType customs_VALUE = new LabelMaskableDataType(_customs_VALUE);

  public static final LabelMaskableDataType duties_AND_TAXES_PAYOR_ACCOUNT_NUMBER = new LabelMaskableDataType(_duties_AND_TAXES_PAYOR_ACCOUNT_NUMBER);

  public static final LabelMaskableDataType shipper_ACCOUNT_NUMBER = new LabelMaskableDataType(_shipper_ACCOUNT_NUMBER);

  public static final LabelMaskableDataType terms_AND_CONDITIONS = new LabelMaskableDataType(_terms_AND_CONDITIONS);

  public static final LabelMaskableDataType transportation_CHARGES_PAYOR_ACCOUNT_NUMBER = new LabelMaskableDataType(_transportation_CHARGES_PAYOR_ACCOUNT_NUMBER);

  public java.lang.String getValue() {
    return this.value;
  }

  public static LabelMaskableDataType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (LabelMaskableDataType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static LabelMaskableDataType fromString(String value) {
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
    if (!(obj instanceof LabelMaskableDataType)) return false;
    final LabelMaskableDataType x = (LabelMaskableDataType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_customs_VALUE, customs_VALUE);
    map.put(_duties_AND_TAXES_PAYOR_ACCOUNT_NUMBER, duties_AND_TAXES_PAYOR_ACCOUNT_NUMBER);
    map.put(_shipper_ACCOUNT_NUMBER, shipper_ACCOUNT_NUMBER);
    map.put(_terms_AND_CONDITIONS, terms_AND_CONDITIONS);
    map.put(_transportation_CHARGES_PAYOR_ACCOUNT_NUMBER, transportation_CHARGES_PAYOR_ACCOUNT_NUMBER);
  }

}
