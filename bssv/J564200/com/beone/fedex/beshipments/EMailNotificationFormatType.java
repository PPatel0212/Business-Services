/**
 * Generated from schema type t=EMailNotificationFormatType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class EMailNotificationFormatType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected EMailNotificationFormatType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _html = "HTML";

  public static final java.lang.String _text = "TEXT";

  public static final java.lang.String _wireless = "WIRELESS";

  public static final EMailNotificationFormatType html = new EMailNotificationFormatType(_html);

  public static final EMailNotificationFormatType text = new EMailNotificationFormatType(_text);

  public static final EMailNotificationFormatType wireless = new EMailNotificationFormatType(_wireless);

  public java.lang.String getValue() {
    return this.value;
  }

  public static EMailNotificationFormatType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (EMailNotificationFormatType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static EMailNotificationFormatType fromString(String value) {
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
    if (!(obj instanceof EMailNotificationFormatType)) return false;
    final EMailNotificationFormatType x = (EMailNotificationFormatType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_html, html);
    map.put(_text, text);
    map.put(_wireless, wireless);
  }

}
