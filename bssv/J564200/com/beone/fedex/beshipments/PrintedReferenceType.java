/**
 * Generated from schema type t=PrintedReferenceType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class PrintedReferenceType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected PrintedReferenceType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _bill_OF_LADING = "BILL_OF_LADING";

  public static final java.lang.String _consignee_ID_NUMBER = "CONSIGNEE_ID_NUMBER";

  public static final java.lang.String _shipper_ID_NUMBER = "SHIPPER_ID_NUMBER";

  public static final PrintedReferenceType bill_OF_LADING = new PrintedReferenceType(_bill_OF_LADING);

  public static final PrintedReferenceType consignee_ID_NUMBER = new PrintedReferenceType(_consignee_ID_NUMBER);

  public static final PrintedReferenceType shipper_ID_NUMBER = new PrintedReferenceType(_shipper_ID_NUMBER);

  public java.lang.String getValue() {
    return this.value;
  }

  public static PrintedReferenceType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (PrintedReferenceType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static PrintedReferenceType fromString(String value) {
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
    if (!(obj instanceof PrintedReferenceType)) return false;
    final PrintedReferenceType x = (PrintedReferenceType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_bill_OF_LADING, bill_OF_LADING);
    map.put(_consignee_ID_NUMBER, consignee_ID_NUMBER);
    map.put(_shipper_ID_NUMBER, shipper_ID_NUMBER);
  }

}
