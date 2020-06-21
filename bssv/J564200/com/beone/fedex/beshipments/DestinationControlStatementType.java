/**
 * Generated from schema type t=DestinationControlStatementType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class DestinationControlStatementType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected DestinationControlStatementType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _department_OF_COMMERCE = "DEPARTMENT_OF_COMMERCE";

  public static final java.lang.String _department_OF_STATE = "DEPARTMENT_OF_STATE";

  public static final DestinationControlStatementType department_OF_COMMERCE = new DestinationControlStatementType(_department_OF_COMMERCE);

  public static final DestinationControlStatementType department_OF_STATE = new DestinationControlStatementType(_department_OF_STATE);

  public java.lang.String getValue() {
    return this.value;
  }

  public static DestinationControlStatementType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (DestinationControlStatementType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static DestinationControlStatementType fromString(String value) {
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
    if (!(obj instanceof DestinationControlStatementType)) return false;
    final DestinationControlStatementType x = (DestinationControlStatementType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_department_OF_COMMERCE, department_OF_COMMERCE);
    map.put(_department_OF_STATE, department_OF_STATE);
  }

}
