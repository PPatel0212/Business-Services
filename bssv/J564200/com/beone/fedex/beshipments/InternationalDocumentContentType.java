/**
 * Generated from schema type t=InternationalDocumentContentType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class InternationalDocumentContentType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected InternationalDocumentContentType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _derived = "DERIVED";

  public static final java.lang.String _documents_ONLY = "DOCUMENTS_ONLY";

  public static final java.lang.String _non_DOCUMENTS = "NON_DOCUMENTS";

  public static final InternationalDocumentContentType derived = new InternationalDocumentContentType(_derived);

  public static final InternationalDocumentContentType documents_ONLY = new InternationalDocumentContentType(_documents_ONLY);

  public static final InternationalDocumentContentType non_DOCUMENTS = new InternationalDocumentContentType(_non_DOCUMENTS);

  public java.lang.String getValue() {
    return this.value;
  }

  public static InternationalDocumentContentType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (InternationalDocumentContentType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static InternationalDocumentContentType fromString(String value) {
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
    if (!(obj instanceof InternationalDocumentContentType)) return false;
    final InternationalDocumentContentType x = (InternationalDocumentContentType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_derived, derived);
    map.put(_documents_ONLY, documents_ONLY);
    map.put(_non_DOCUMENTS, non_DOCUMENTS);
  }

}
