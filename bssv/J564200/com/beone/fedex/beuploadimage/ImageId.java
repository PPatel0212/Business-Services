/**
 * Generated from schema type t=ImageId@http://www.beone.com/fedex/beuploadimage
 */
package be.e1.bssv.J564200.com.beone.fedex.beuploadimage;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ImageId implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ImageId(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _image_1 = "IMAGE_1";

  public static final java.lang.String _image_2 = "IMAGE_2";

  public static final java.lang.String _image_3 = "IMAGE_3";

  public static final java.lang.String _image_4 = "IMAGE_4";

  public static final java.lang.String _image_5 = "IMAGE_5";

  public static final ImageId image_1 = new ImageId(_image_1);

  public static final ImageId image_2 = new ImageId(_image_2);

  public static final ImageId image_3 = new ImageId(_image_3);

  public static final ImageId image_4 = new ImageId(_image_4);

  public static final ImageId image_5 = new ImageId(_image_5);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ImageId fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ImageId) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ImageId fromString(String value) {
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
    if (!(obj instanceof ImageId)) return false;
    final ImageId x = (ImageId) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_image_1, image_1);
    map.put(_image_2, image_2);
    map.put(_image_3, image_3);
    map.put(_image_4, image_4);
    map.put(_image_5, image_5);
  }

}
