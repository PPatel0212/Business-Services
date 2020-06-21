/**
 * Generated from schema type t=EMailNotificationRecipientType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class EMailNotificationRecipientType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected EMailNotificationRecipientType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _broker = "BROKER";

  public static final java.lang.String _other = "OTHER";

  public static final java.lang.String _recipient = "RECIPIENT";

  public static final java.lang.String _shipper = "SHIPPER";

  public static final java.lang.String _third_PARTY = "THIRD_PARTY";

  public static final EMailNotificationRecipientType broker = new EMailNotificationRecipientType(_broker);

  public static final EMailNotificationRecipientType other = new EMailNotificationRecipientType(_other);

  public static final EMailNotificationRecipientType recipient = new EMailNotificationRecipientType(_recipient);

  public static final EMailNotificationRecipientType shipper = new EMailNotificationRecipientType(_shipper);

  public static final EMailNotificationRecipientType third_PARTY = new EMailNotificationRecipientType(_third_PARTY);

  public java.lang.String getValue() {
    return this.value;
  }

  public static EMailNotificationRecipientType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (EMailNotificationRecipientType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static EMailNotificationRecipientType fromString(String value) {
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
    if (!(obj instanceof EMailNotificationRecipientType)) return false;
    final EMailNotificationRecipientType x = (EMailNotificationRecipientType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_broker, broker);
    map.put(_other, other);
    map.put(_recipient, recipient);
    map.put(_shipper, shipper);
    map.put(_third_PARTY, third_PARTY);
  }

}
