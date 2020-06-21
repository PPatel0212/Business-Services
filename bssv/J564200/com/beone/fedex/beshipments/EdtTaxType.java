/**
 * Generated from schema type t=EdtTaxType@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

import java.util.HashMap;
import java.util.Map;
import com.bea.xbean.util.XsTypeConverter;

public class EdtTaxType implements java.io.Serializable {

  private java.lang.String value;

  private static Map map = new HashMap();

  protected EdtTaxType(java.lang.String value) {
    this.value = value;
  }

  public static final java.lang.String _additional_TAXES = "ADDITIONAL_TAXES";

  public static final java.lang.String _consular_INVOICE_FEE = "CONSULAR_INVOICE_FEE";

  public static final java.lang.String _customs_SURCHARGES = "CUSTOMS_SURCHARGES";

  public static final java.lang.String _duty = "DUTY";

  public static final java.lang.String _excise_TAX = "EXCISE_TAX";

  public static final java.lang.String _foreign_EXCHANGE_TAX = "FOREIGN_EXCHANGE_TAX";

  public static final java.lang.String _general_SALES_TAX = "GENERAL_SALES_TAX";

  public static final java.lang.String _import_LICENSE_FEE = "IMPORT_LICENSE_FEE";

  public static final java.lang.String _internal_ADDITIONAL_TAXES = "INTERNAL_ADDITIONAL_TAXES";

  public static final java.lang.String _internal_SENSITIVE_PRODUCTS_TAX = "INTERNAL_SENSITIVE_PRODUCTS_TAX";

  public static final java.lang.String _other = "OTHER";

  public static final java.lang.String _sensitive_PRODUCTS_TAX = "SENSITIVE_PRODUCTS_TAX";

  public static final java.lang.String _stamp_TAX = "STAMP_TAX";

  public static final java.lang.String _statistical_TAX = "STATISTICAL_TAX";

  public static final java.lang.String _transport_FACILITIES_TAX = "TRANSPORT_FACILITIES_TAX";

  public static final EdtTaxType additional_TAXES = new EdtTaxType(_additional_TAXES);

  public static final EdtTaxType consular_INVOICE_FEE = new EdtTaxType(_consular_INVOICE_FEE);

  public static final EdtTaxType customs_SURCHARGES = new EdtTaxType(_customs_SURCHARGES);

  public static final EdtTaxType duty = new EdtTaxType(_duty);

  public static final EdtTaxType excise_TAX = new EdtTaxType(_excise_TAX);

  public static final EdtTaxType foreign_EXCHANGE_TAX = new EdtTaxType(_foreign_EXCHANGE_TAX);

  public static final EdtTaxType general_SALES_TAX = new EdtTaxType(_general_SALES_TAX);

  public static final EdtTaxType import_LICENSE_FEE = new EdtTaxType(_import_LICENSE_FEE);

  public static final EdtTaxType internal_ADDITIONAL_TAXES = new EdtTaxType(_internal_ADDITIONAL_TAXES);

  public static final EdtTaxType internal_SENSITIVE_PRODUCTS_TAX = new EdtTaxType(_internal_SENSITIVE_PRODUCTS_TAX);

  public static final EdtTaxType other = new EdtTaxType(_other);

  public static final EdtTaxType sensitive_PRODUCTS_TAX = new EdtTaxType(_sensitive_PRODUCTS_TAX);

  public static final EdtTaxType stamp_TAX = new EdtTaxType(_stamp_TAX);

  public static final EdtTaxType statistical_TAX = new EdtTaxType(_statistical_TAX);

  public static final EdtTaxType transport_FACILITIES_TAX = new EdtTaxType(_transport_FACILITIES_TAX);

  public java.lang.String getValue() {
    return this.value;
  }

  public static EdtTaxType fromValue(java.lang.String value) {
    if (map.containsKey(value)) return (EdtTaxType) map.get(value);
    else throw new IllegalArgumentException();
  }

  public static EdtTaxType fromString(String value) {
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
    if (!(obj instanceof EdtTaxType)) return false;
    final EdtTaxType x = (EdtTaxType) obj;
    if (x.value.equals(value)) return true;
    return false;
  }

  public int hashCode() {
    return value.hashCode();
  }

  static {
    map.put(_additional_TAXES, additional_TAXES);
    map.put(_consular_INVOICE_FEE, consular_INVOICE_FEE);
    map.put(_customs_SURCHARGES, customs_SURCHARGES);
    map.put(_duty, duty);
    map.put(_excise_TAX, excise_TAX);
    map.put(_foreign_EXCHANGE_TAX, foreign_EXCHANGE_TAX);
    map.put(_general_SALES_TAX, general_SALES_TAX);
    map.put(_import_LICENSE_FEE, import_LICENSE_FEE);
    map.put(_internal_ADDITIONAL_TAXES, internal_ADDITIONAL_TAXES);
    map.put(_internal_SENSITIVE_PRODUCTS_TAX, internal_SENSITIVE_PRODUCTS_TAX);
    map.put(_other, other);
    map.put(_sensitive_PRODUCTS_TAX, sensitive_PRODUCTS_TAX);
    map.put(_stamp_TAX, stamp_TAX);
    map.put(_statistical_TAX, statistical_TAX);
    map.put(_transport_FACILITIES_TAX, transport_FACILITIES_TAX);
  }

}
