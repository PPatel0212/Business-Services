/**
 * Generated from schema type t=AdditionalLabelsType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class AdditionalLabelsType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected AdditionalLabelsType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _broker = "BROKER";

  public static final java.lang.String _consignee = "CONSIGNEE";

  public static final java.lang.String _customs = "CUSTOMS";

  public static final java.lang.String _destination = "DESTINATION";

  public static final java.lang.String _freight_REFERENCE = "FREIGHT_REFERENCE";

  public static final java.lang.String _manifest = "MANIFEST";

  public static final java.lang.String _origin = "ORIGIN";

  public static final java.lang.String _recipient = "RECIPIENT";

  public static final java.lang.String _shipper = "SHIPPER";

  public static final AdditionalLabelsType broker = new AdditionalLabelsType(_broker);

  public static final AdditionalLabelsType consignee = new AdditionalLabelsType(_consignee);

  public static final AdditionalLabelsType customs = new AdditionalLabelsType(_customs);

  public static final AdditionalLabelsType destination = new AdditionalLabelsType(_destination);

  public static final AdditionalLabelsType freight_REFERENCE = new AdditionalLabelsType(_freight_REFERENCE);

  public static final AdditionalLabelsType manifest = new AdditionalLabelsType(_manifest);

  public static final AdditionalLabelsType origin = new AdditionalLabelsType(_origin);

  public static final AdditionalLabelsType recipient = new AdditionalLabelsType(_recipient);

  public static final AdditionalLabelsType shipper = new AdditionalLabelsType(_shipper);

  public java.lang.String getValue() {
    return this.value;
  }

  public static AdditionalLabelsType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (AdditionalLabelsType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static AdditionalLabelsType fromString(String value) {
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
    if (!(obj instanceof AdditionalLabelsType)) return false;
    final AdditionalLabelsType x = (AdditionalLabelsType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_broker, broker);
    map.put(_consignee, consignee);
    map.put(_customs, customs);
    map.put(_destination, destination);
    map.put(_freight_REFERENCE, freight_REFERENCE);
    map.put(_manifest, manifest);
    map.put(_origin, origin);
    map.put(_recipient, recipient);
    map.put(_shipper, shipper);
  }

}
