/**
 * Generated from schema type t=NaftaImporterSpecificationType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class NaftaImporterSpecificationType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected NaftaImporterSpecificationType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _importer_OF_RECORD = "IMPORTER_OF_RECORD";

  public static final java.lang.String _recipient = "RECIPIENT";

  public static final java.lang.String _unknown = "UNKNOWN";

  public static final java.lang.String _various = "VARIOUS";

  public static final NaftaImporterSpecificationType importer_OF_RECORD = new NaftaImporterSpecificationType(_importer_OF_RECORD);

  public static final NaftaImporterSpecificationType recipient = new NaftaImporterSpecificationType(_recipient);

  public static final NaftaImporterSpecificationType unknown = new NaftaImporterSpecificationType(_unknown);

  public static final NaftaImporterSpecificationType various = new NaftaImporterSpecificationType(_various);

  public java.lang.String getValue() {
    return this.value;
  }

  public static NaftaImporterSpecificationType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (NaftaImporterSpecificationType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static NaftaImporterSpecificationType fromString(String value) {
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
    if (!(obj instanceof NaftaImporterSpecificationType)) return false;
    final NaftaImporterSpecificationType x = (NaftaImporterSpecificationType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_importer_OF_RECORD, importer_OF_RECORD);
    map.put(_recipient, recipient);
    map.put(_unknown, unknown);
    map.put(_various, various);
  }

}
