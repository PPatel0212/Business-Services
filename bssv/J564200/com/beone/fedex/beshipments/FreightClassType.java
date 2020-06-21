/**
 * Generated from schema type t=FreightClassType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class FreightClassType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected FreightClassType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _class_050 = "CLASS_050";

  public static final java.lang.String _class_055 = "CLASS_055";

  public static final java.lang.String _class_060 = "CLASS_060";

  public static final java.lang.String _class_065 = "CLASS_065";

  public static final java.lang.String _class_070 = "CLASS_070";

  public static final java.lang.String _class_077_5 = "CLASS_077_5";

  public static final java.lang.String _class_085 = "CLASS_085";

  public static final java.lang.String _class_092_5 = "CLASS_092_5";

  public static final java.lang.String _class_100 = "CLASS_100";

  public static final java.lang.String _class_110 = "CLASS_110";

  public static final java.lang.String _class_125 = "CLASS_125";

  public static final java.lang.String _class_150 = "CLASS_150";

  public static final java.lang.String _class_175 = "CLASS_175";

  public static final java.lang.String _class_200 = "CLASS_200";

  public static final java.lang.String _class_250 = "CLASS_250";

  public static final java.lang.String _class_300 = "CLASS_300";

  public static final java.lang.String _class_400 = "CLASS_400";

  public static final java.lang.String _class_500 = "CLASS_500";

  public static final FreightClassType class_050 = new FreightClassType(_class_050);

  public static final FreightClassType class_055 = new FreightClassType(_class_055);

  public static final FreightClassType class_060 = new FreightClassType(_class_060);

  public static final FreightClassType class_065 = new FreightClassType(_class_065);

  public static final FreightClassType class_070 = new FreightClassType(_class_070);

  public static final FreightClassType class_077_5 = new FreightClassType(_class_077_5);

  public static final FreightClassType class_085 = new FreightClassType(_class_085);

  public static final FreightClassType class_092_5 = new FreightClassType(_class_092_5);

  public static final FreightClassType class_100 = new FreightClassType(_class_100);

  public static final FreightClassType class_110 = new FreightClassType(_class_110);

  public static final FreightClassType class_125 = new FreightClassType(_class_125);

  public static final FreightClassType class_150 = new FreightClassType(_class_150);

  public static final FreightClassType class_175 = new FreightClassType(_class_175);

  public static final FreightClassType class_200 = new FreightClassType(_class_200);

  public static final FreightClassType class_250 = new FreightClassType(_class_250);

  public static final FreightClassType class_300 = new FreightClassType(_class_300);

  public static final FreightClassType class_400 = new FreightClassType(_class_400);

  public static final FreightClassType class_500 = new FreightClassType(_class_500);

  public java.lang.String getValue() {
    return this.value;
  }

  public static FreightClassType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (FreightClassType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static FreightClassType fromString(String value) {
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
    if (!(obj instanceof FreightClassType)) return false;
    final FreightClassType x = (FreightClassType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_class_050, class_050);
    map.put(_class_055, class_055);
    map.put(_class_060, class_060);
    map.put(_class_065, class_065);
    map.put(_class_070, class_070);
    map.put(_class_077_5, class_077_5);
    map.put(_class_085, class_085);
    map.put(_class_092_5, class_092_5);
    map.put(_class_100, class_100);
    map.put(_class_110, class_110);
    map.put(_class_125, class_125);
    map.put(_class_150, class_150);
    map.put(_class_175, class_175);
    map.put(_class_200, class_200);
    map.put(_class_250, class_250);
    map.put(_class_300, class_300);
    map.put(_class_400, class_400);
    map.put(_class_500, class_500);
  }

}
