/**
 * Generated from schema type t=CustomsOptionType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CustomsOptionType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CustomsOptionType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _courtesy_RETURN_LABEL = "COURTESY_RETURN_LABEL";

  public static final java.lang.String _exhibition_TRADE_SHOW = "EXHIBITION_TRADE_SHOW";

  public static final java.lang.String _faulty_ITEM = "FAULTY_ITEM";

  public static final java.lang.String _following_REPAIR = "FOLLOWING_REPAIR";

  public static final java.lang.String _for_REPAIR = "FOR_REPAIR";

  public static final java.lang.String _item_FOR_LOAN = "ITEM_FOR_LOAN";

  public static final java.lang.String _other = "OTHER";

  public static final java.lang.String _rejected = "REJECTED";

  public static final java.lang.String _replacement = "REPLACEMENT";

  public static final java.lang.String _trial = "TRIAL";

  public static final CustomsOptionType courtesy_RETURN_LABEL = new CustomsOptionType(_courtesy_RETURN_LABEL);

  public static final CustomsOptionType exhibition_TRADE_SHOW = new CustomsOptionType(_exhibition_TRADE_SHOW);

  public static final CustomsOptionType faulty_ITEM = new CustomsOptionType(_faulty_ITEM);

  public static final CustomsOptionType following_REPAIR = new CustomsOptionType(_following_REPAIR);

  public static final CustomsOptionType for_REPAIR = new CustomsOptionType(_for_REPAIR);

  public static final CustomsOptionType item_FOR_LOAN = new CustomsOptionType(_item_FOR_LOAN);

  public static final CustomsOptionType other = new CustomsOptionType(_other);

  public static final CustomsOptionType rejected = new CustomsOptionType(_rejected);

  public static final CustomsOptionType replacement = new CustomsOptionType(_replacement);

  public static final CustomsOptionType trial = new CustomsOptionType(_trial);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CustomsOptionType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CustomsOptionType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CustomsOptionType fromString(String value) {
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
    if (!(obj instanceof CustomsOptionType)) return false;
    final CustomsOptionType x = (CustomsOptionType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_courtesy_RETURN_LABEL, courtesy_RETURN_LABEL);
    map.put(_exhibition_TRADE_SHOW, exhibition_TRADE_SHOW);
    map.put(_faulty_ITEM, faulty_ITEM);
    map.put(_following_REPAIR, following_REPAIR);
    map.put(_for_REPAIR, for_REPAIR);
    map.put(_item_FOR_LOAN, item_FOR_LOAN);
    map.put(_other, other);
    map.put(_rejected, rejected);
    map.put(_replacement, replacement);
    map.put(_trial, trial);
  }

}
