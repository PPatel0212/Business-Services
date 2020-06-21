/**
 * Generated from schema type t=UploadImageStatusType@http://www.beone.com/fedex/beuploadimage
 */
package be.e1.bssv.J564200.com.beone.fedex.beuploadimage;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class UploadImageStatusType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected UploadImageStatusType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _error = "ERROR";

  public static final java.lang.String _failure = "FAILURE";

  public static final java.lang.String _success = "SUCCESS";

  public static final UploadImageStatusType error = new UploadImageStatusType(_error);

  public static final UploadImageStatusType failure = new UploadImageStatusType(_failure);

  public static final UploadImageStatusType success = new UploadImageStatusType(_success);

  public java.lang.String getValue() {
    return this.value;
  }

  public static UploadImageStatusType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (UploadImageStatusType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static UploadImageStatusType fromString(String value) {
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
    if (!(obj instanceof UploadImageStatusType)) return false;
    final UploadImageStatusType x = (UploadImageStatusType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_error, error);
    map.put(_failure, failure);
    map.put(_success, success);
  }

}
