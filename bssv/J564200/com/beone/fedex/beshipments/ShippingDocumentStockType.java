/**
 * Generated from schema type t=ShippingDocumentStockType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class ShippingDocumentStockType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected ShippingDocumentStockType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _op_900_LG_B = "OP_900_LG_B";

  public static final java.lang.String _op_900_LL_B = "OP_900_LL_B";

  public static final java.lang.String _op_950 = "OP_950";

  public static final java.lang.String _paper_4X6 = "PAPER_4X6";

  public static final java.lang.String _paper_4_PER_PAGE_PORTRAIT = "PAPER_4_PER_PAGE_PORTRAIT";

  public static final java.lang.String _paper_LETTER = "PAPER_LETTER";

  public static final java.lang.String _stock_4X6 = "STOCK_4X6";

  public static final java.lang.String _stock_4X675_LEADING_DOC_TAB = "STOCK_4X6.75_LEADING_DOC_TAB";

  public static final java.lang.String _stock_4X675_TRAILING_DOC_TAB = "STOCK_4X6.75_TRAILING_DOC_TAB";

  public static final java.lang.String _stock_4X8 = "STOCK_4X8";

  public static final java.lang.String _stock_4X9_LEADING_DOC_TAB = "STOCK_4X9_LEADING_DOC_TAB";

  public static final java.lang.String _stock_4X9_TRAILING_DOC_TAB = "STOCK_4X9_TRAILING_DOC_TAB";

  public static final ShippingDocumentStockType op_900_LG_B = new ShippingDocumentStockType(_op_900_LG_B);

  public static final ShippingDocumentStockType op_900_LL_B = new ShippingDocumentStockType(_op_900_LL_B);

  public static final ShippingDocumentStockType op_950 = new ShippingDocumentStockType(_op_950);

  public static final ShippingDocumentStockType paper_4X6 = new ShippingDocumentStockType(_paper_4X6);

  public static final ShippingDocumentStockType paper_4_PER_PAGE_PORTRAIT = new ShippingDocumentStockType(_paper_4_PER_PAGE_PORTRAIT);

  public static final ShippingDocumentStockType paper_LETTER = new ShippingDocumentStockType(_paper_LETTER);

  public static final ShippingDocumentStockType stock_4X6 = new ShippingDocumentStockType(_stock_4X6);

  public static final ShippingDocumentStockType stock_4X675_LEADING_DOC_TAB = new ShippingDocumentStockType(_stock_4X675_LEADING_DOC_TAB);

  public static final ShippingDocumentStockType stock_4X675_TRAILING_DOC_TAB = new ShippingDocumentStockType(_stock_4X675_TRAILING_DOC_TAB);

  public static final ShippingDocumentStockType stock_4X8 = new ShippingDocumentStockType(_stock_4X8);

  public static final ShippingDocumentStockType stock_4X9_LEADING_DOC_TAB = new ShippingDocumentStockType(_stock_4X9_LEADING_DOC_TAB);

  public static final ShippingDocumentStockType stock_4X9_TRAILING_DOC_TAB = new ShippingDocumentStockType(_stock_4X9_TRAILING_DOC_TAB);

  public java.lang.String getValue() {
    return this.value;
  }

  public static ShippingDocumentStockType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (ShippingDocumentStockType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static ShippingDocumentStockType fromString(String value) {
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
    if (!(obj instanceof ShippingDocumentStockType)) return false;
    final ShippingDocumentStockType x = (ShippingDocumentStockType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_op_900_LG_B, op_900_LG_B);
    map.put(_op_900_LL_B, op_900_LL_B);
    map.put(_op_950, op_950);
    map.put(_paper_4X6, paper_4X6);
    map.put(_paper_4_PER_PAGE_PORTRAIT, paper_4_PER_PAGE_PORTRAIT);
    map.put(_paper_LETTER, paper_LETTER);
    map.put(_stock_4X6, stock_4X6);
    map.put(_stock_4X675_LEADING_DOC_TAB, stock_4X675_LEADING_DOC_TAB);
    map.put(_stock_4X675_TRAILING_DOC_TAB, stock_4X675_TRAILING_DOC_TAB);
    map.put(_stock_4X8, stock_4X8);
    map.put(_stock_4X9_LEADING_DOC_TAB, stock_4X9_LEADING_DOC_TAB);
    map.put(_stock_4X9_TRAILING_DOC_TAB, stock_4X9_TRAILING_DOC_TAB);
  }

}
