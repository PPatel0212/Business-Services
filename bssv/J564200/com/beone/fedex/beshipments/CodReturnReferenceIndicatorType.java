/**
 * Generated from schema type t=CodReturnReferenceIndicatorType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class CodReturnReferenceIndicatorType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected CodReturnReferenceIndicatorType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _invoice = "INVOICE";

  public static final java.lang.String _po = "PO";

  public static final java.lang.String _reference = "REFERENCE";

  public static final java.lang.String _tracking = "TRACKING";

  public static final CodReturnReferenceIndicatorType invoice = new CodReturnReferenceIndicatorType(_invoice);

  public static final CodReturnReferenceIndicatorType po = new CodReturnReferenceIndicatorType(_po);

  public static final CodReturnReferenceIndicatorType reference = new CodReturnReferenceIndicatorType(_reference);

  public static final CodReturnReferenceIndicatorType tracking = new CodReturnReferenceIndicatorType(_tracking);

  public java.lang.String getValue() {
    return this.value;
  }

  public static CodReturnReferenceIndicatorType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (CodReturnReferenceIndicatorType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static CodReturnReferenceIndicatorType fromString(String value) {
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
    if (!(obj instanceof CodReturnReferenceIndicatorType)) return false;
    final CodReturnReferenceIndicatorType x = (CodReturnReferenceIndicatorType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_invoice, invoice);
    map.put(_po, po);
    map.put(_reference, reference);
    map.put(_tracking, tracking);
  }

}
