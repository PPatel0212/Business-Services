/**
 * Generated from schema type t=UploadImageStatusInfoType@http://www.beone.com/fedex/beuploadimage
 */
package be.e1.bssv.J564200.com.beone.fedex.beuploadimage;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class UploadImageStatusInfoType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected UploadImageStatusInfoType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _image_EXCEEDS_MAX_RESOLUTION = "IMAGE_EXCEEDS_MAX_RESOLUTION";

  public static final java.lang.String _image_EXCEEDS_MAX_SIZE = "IMAGE_EXCEEDS_MAX_SIZE";

  public static final java.lang.String _image_FAILED_VIRUS_CHECK = "IMAGE_FAILED_VIRUS_CHECK";

  public static final java.lang.String _image_ID_INVALID = "IMAGE_ID_INVALID";

  public static final java.lang.String _image_ID_MISSING = "IMAGE_ID_MISSING";

  public static final java.lang.String _image_MISSING = "IMAGE_MISSING";

  public static final java.lang.String _image_TYPE_INVALID = "IMAGE_TYPE_INVALID";

  public static final java.lang.String _image_TYPE_MISSING = "IMAGE_TYPE_MISSING";

  public static final UploadImageStatusInfoType image_EXCEEDS_MAX_RESOLUTION = new UploadImageStatusInfoType(_image_EXCEEDS_MAX_RESOLUTION);

  public static final UploadImageStatusInfoType image_EXCEEDS_MAX_SIZE = new UploadImageStatusInfoType(_image_EXCEEDS_MAX_SIZE);

  public static final UploadImageStatusInfoType image_FAILED_VIRUS_CHECK = new UploadImageStatusInfoType(_image_FAILED_VIRUS_CHECK);

  public static final UploadImageStatusInfoType image_ID_INVALID = new UploadImageStatusInfoType(_image_ID_INVALID);

  public static final UploadImageStatusInfoType image_ID_MISSING = new UploadImageStatusInfoType(_image_ID_MISSING);

  public static final UploadImageStatusInfoType image_MISSING = new UploadImageStatusInfoType(_image_MISSING);

  public static final UploadImageStatusInfoType image_TYPE_INVALID = new UploadImageStatusInfoType(_image_TYPE_INVALID);

  public static final UploadImageStatusInfoType image_TYPE_MISSING = new UploadImageStatusInfoType(_image_TYPE_MISSING);

  public java.lang.String getValue() {
    return this.value;
  }

  public static UploadImageStatusInfoType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (UploadImageStatusInfoType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static UploadImageStatusInfoType fromString(String value) {
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
    if (!(obj instanceof UploadImageStatusInfoType)) return false;
    final UploadImageStatusInfoType x = (UploadImageStatusInfoType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_image_EXCEEDS_MAX_RESOLUTION, image_EXCEEDS_MAX_RESOLUTION);
    map.put(_image_EXCEEDS_MAX_SIZE, image_EXCEEDS_MAX_SIZE);
    map.put(_image_FAILED_VIRUS_CHECK, image_FAILED_VIRUS_CHECK);
    map.put(_image_ID_INVALID, image_ID_INVALID);
    map.put(_image_ID_MISSING, image_ID_MISSING);
    map.put(_image_MISSING, image_MISSING);
    map.put(_image_TYPE_INVALID, image_TYPE_INVALID);
    map.put(_image_TYPE_MISSING, image_TYPE_MISSING);
  }

}
