/**
 * Generated from schema type t=TermsOfSaleType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class TermsOfSaleType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected TermsOfSaleType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _cfr_OR_CPT = "CFR_OR_CPT";

  public static final java.lang.String _cif_OR_CIP = "CIF_OR_CIP";

  public static final java.lang.String _dap = "DAP";

  public static final java.lang.String _dat = "DAT";

  public static final java.lang.String _ddp = "DDP";

  public static final java.lang.String _ddu = "DDU";

  public static final java.lang.String _exw = "EXW";

  public static final java.lang.String _fob_OR_FCA = "FOB_OR_FCA";

  public static final TermsOfSaleType cfr_OR_CPT = new TermsOfSaleType(_cfr_OR_CPT);

  public static final TermsOfSaleType cif_OR_CIP = new TermsOfSaleType(_cif_OR_CIP);

  public static final TermsOfSaleType dap = new TermsOfSaleType(_dap);

  public static final TermsOfSaleType dat = new TermsOfSaleType(_dat);

  public static final TermsOfSaleType ddp = new TermsOfSaleType(_ddp);

  public static final TermsOfSaleType ddu = new TermsOfSaleType(_ddu);

  public static final TermsOfSaleType exw = new TermsOfSaleType(_exw);

  public static final TermsOfSaleType fob_OR_FCA = new TermsOfSaleType(_fob_OR_FCA);

  public java.lang.String getValue() {
    return this.value;
  }

  public static TermsOfSaleType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (TermsOfSaleType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static TermsOfSaleType fromString(String value) {
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
    if (!(obj instanceof TermsOfSaleType)) return false;
    final TermsOfSaleType x = (TermsOfSaleType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_cfr_OR_CPT, cfr_OR_CPT);
    map.put(_cif_OR_CIP, cif_OR_CIP);
    map.put(_dap, dap);
    map.put(_dat, dat);
    map.put(_ddp, ddp);
    map.put(_ddu, ddu);
    map.put(_exw, exw);
    map.put(_fob_OR_FCA, fob_OR_FCA);
  }

}
