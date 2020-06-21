/**
 * Generated from schema type t=NaftaProducerDeterminationCode@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class NaftaProducerDeterminationCode implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected NaftaProducerDeterminationCode(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _no_1 = "NO_1";

  public static final java.lang.String _no_2 = "NO_2";

  public static final java.lang.String _no_3 = "NO_3";

  public static final java.lang.String _yes = "YES";

  public static final NaftaProducerDeterminationCode no_1 = new NaftaProducerDeterminationCode(_no_1);

  public static final NaftaProducerDeterminationCode no_2 = new NaftaProducerDeterminationCode(_no_2);

  public static final NaftaProducerDeterminationCode no_3 = new NaftaProducerDeterminationCode(_no_3);

  public static final NaftaProducerDeterminationCode yes = new NaftaProducerDeterminationCode(_yes);

  public java.lang.String getValue() {
    return this.value;
  }

  public static NaftaProducerDeterminationCode fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (NaftaProducerDeterminationCode) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static NaftaProducerDeterminationCode fromString(String value) {
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
    if (!(obj instanceof NaftaProducerDeterminationCode)) return false;
    final NaftaProducerDeterminationCode x = (NaftaProducerDeterminationCode) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_no_1, no_1);
    map.put(_no_2, no_2);
    map.put(_no_3, no_3);
    map.put(_yes, yes);
  }

}
