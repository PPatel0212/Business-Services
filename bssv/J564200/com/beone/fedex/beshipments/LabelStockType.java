/**
 * Generated from schema type t=LabelStockType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class LabelStockType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected LabelStockType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _paper_4X6 = "PAPER_4X6";

  public static final java.lang.String _paper_4X8 = "PAPER_4X8";

  public static final java.lang.String _paper_4X9 = "PAPER_4X9";

  public static final java.lang.String _paper_7X475 = "PAPER_7X4.75";

  public static final java.lang.String _paper_85X11_BOTTOM_HALF_LABEL = "PAPER_8.5X11_BOTTOM_HALF_LABEL";

  public static final java.lang.String _paper_85X11_TOP_HALF_LABEL = "PAPER_8.5X11_TOP_HALF_LABEL";

  public static final java.lang.String _paper_LETTER = "PAPER_LETTER";

  public static final java.lang.String _stock_4X6 = "STOCK_4X6";

  public static final java.lang.String _stock_4X675_LEADING_DOC_TAB = "STOCK_4X6.75_LEADING_DOC_TAB";

  public static final java.lang.String _stock_4X675_TRAILING_DOC_TAB = "STOCK_4X6.75_TRAILING_DOC_TAB";

  public static final java.lang.String _stock_4X8 = "STOCK_4X8";

  public static final java.lang.String _stock_4X9_LEADING_DOC_TAB = "STOCK_4X9_LEADING_DOC_TAB";

  public static final java.lang.String _stock_4X9_TRAILING_DOC_TAB = "STOCK_4X9_TRAILING_DOC_TAB";

  public static final LabelStockType paper_4X6 = new LabelStockType(_paper_4X6);

  public static final LabelStockType paper_4X8 = new LabelStockType(_paper_4X8);

  public static final LabelStockType paper_4X9 = new LabelStockType(_paper_4X9);

  public static final LabelStockType paper_7X475 = new LabelStockType(_paper_7X475);

  public static final LabelStockType paper_85X11_BOTTOM_HALF_LABEL = new LabelStockType(_paper_85X11_BOTTOM_HALF_LABEL);

  public static final LabelStockType paper_85X11_TOP_HALF_LABEL = new LabelStockType(_paper_85X11_TOP_HALF_LABEL);

  public static final LabelStockType paper_LETTER = new LabelStockType(_paper_LETTER);

  public static final LabelStockType stock_4X6 = new LabelStockType(_stock_4X6);

  public static final LabelStockType stock_4X675_LEADING_DOC_TAB = new LabelStockType(_stock_4X675_LEADING_DOC_TAB);

  public static final LabelStockType stock_4X675_TRAILING_DOC_TAB = new LabelStockType(_stock_4X675_TRAILING_DOC_TAB);

  public static final LabelStockType stock_4X8 = new LabelStockType(_stock_4X8);

  public static final LabelStockType stock_4X9_LEADING_DOC_TAB = new LabelStockType(_stock_4X9_LEADING_DOC_TAB);

  public static final LabelStockType stock_4X9_TRAILING_DOC_TAB = new LabelStockType(_stock_4X9_TRAILING_DOC_TAB);

  public java.lang.String getValue() {
    return this.value;
  }

  public static LabelStockType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (LabelStockType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static LabelStockType fromString(String value) {
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
    if (!(obj instanceof LabelStockType)) return false;
    final LabelStockType x = (LabelStockType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_paper_4X6, paper_4X6);
    map.put(_paper_4X8, paper_4X8);
    map.put(_paper_4X9, paper_4X9);
    map.put(_paper_7X475, paper_7X475);
    map.put(_paper_85X11_BOTTOM_HALF_LABEL, paper_85X11_BOTTOM_HALF_LABEL);
    map.put(_paper_85X11_TOP_HALF_LABEL, paper_85X11_TOP_HALF_LABEL);
    map.put(_paper_LETTER, paper_LETTER);
    map.put(_stock_4X6, stock_4X6);
    map.put(_stock_4X675_LEADING_DOC_TAB, stock_4X675_LEADING_DOC_TAB);
    map.put(_stock_4X675_TRAILING_DOC_TAB, stock_4X675_TRAILING_DOC_TAB);
    map.put(_stock_4X8, stock_4X8);
    map.put(_stock_4X9_LEADING_DOC_TAB, stock_4X9_LEADING_DOC_TAB);
    map.put(_stock_4X9_TRAILING_DOC_TAB, stock_4X9_TRAILING_DOC_TAB);
  }

}
