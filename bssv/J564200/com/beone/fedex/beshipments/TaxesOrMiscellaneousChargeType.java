/**
 * Generated from schema type t=TaxesOrMiscellaneousChargeType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class TaxesOrMiscellaneousChargeType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected TaxesOrMiscellaneousChargeType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _commissions = "COMMISSIONS";

  public static final java.lang.String _discounts = "DISCOUNTS";

  public static final java.lang.String _handling_FEES = "HANDLING_FEES";

  public static final java.lang.String _other = "OTHER";

  public static final java.lang.String _royalties_AND_LICENSE_FEES = "ROYALTIES_AND_LICENSE_FEES";

  public static final java.lang.String _taxes = "TAXES";

  public static final TaxesOrMiscellaneousChargeType commissions = new TaxesOrMiscellaneousChargeType(_commissions);

  public static final TaxesOrMiscellaneousChargeType discounts = new TaxesOrMiscellaneousChargeType(_discounts);

  public static final TaxesOrMiscellaneousChargeType handling_FEES = new TaxesOrMiscellaneousChargeType(_handling_FEES);

  public static final TaxesOrMiscellaneousChargeType other = new TaxesOrMiscellaneousChargeType(_other);

  public static final TaxesOrMiscellaneousChargeType royalties_AND_LICENSE_FEES = new TaxesOrMiscellaneousChargeType(_royalties_AND_LICENSE_FEES);

  public static final TaxesOrMiscellaneousChargeType taxes = new TaxesOrMiscellaneousChargeType(_taxes);

  public java.lang.String getValue() {
    return this.value;
  }

  public static TaxesOrMiscellaneousChargeType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (TaxesOrMiscellaneousChargeType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static TaxesOrMiscellaneousChargeType fromString(String value) {
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
    if (!(obj instanceof TaxesOrMiscellaneousChargeType)) return false;
    final TaxesOrMiscellaneousChargeType x = (TaxesOrMiscellaneousChargeType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_commissions, commissions);
    map.put(_discounts, discounts);
    map.put(_handling_FEES, handling_FEES);
    map.put(_other, other);
    map.put(_royalties_AND_LICENSE_FEES, royalties_AND_LICENSE_FEES);
    map.put(_taxes, taxes);
  }

}
