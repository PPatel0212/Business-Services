/**
 * Generated from schema type t=CustomsDeclarationStatementType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CustomsDeclarationStatementType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CustomsDeclarationStatementType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _nafta_LOW_VALUE = "NAFTA_LOW_VALUE";

  public static final CustomsDeclarationStatementType nafta_LOW_VALUE = new CustomsDeclarationStatementType(_nafta_LOW_VALUE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CustomsDeclarationStatementType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CustomsDeclarationStatementType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CustomsDeclarationStatementType fromString(String value) {
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
    if (!(obj instanceof CustomsDeclarationStatementType)) return false;
    final CustomsDeclarationStatementType x = (CustomsDeclarationStatementType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_nafta_LOW_VALUE, nafta_LOW_VALUE);
  }

}
