/**
 * Generated from schema type t=CurrencyExchangeRate@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CurrencyExchangeRate implements java.io.Serializable {

  private java.lang.String fromCurrency;

  public java.lang.String getFromCurrency() {
    return this.fromCurrency;
  }

  public void setFromCurrency(java.lang.String fromCurrency) {
    this.fromCurrency = fromCurrency;
  }

  private java.lang.String intoCurrency;

  public java.lang.String getIntoCurrency() {
    return this.intoCurrency;
  }

  public void setIntoCurrency(java.lang.String intoCurrency) {
    this.intoCurrency = intoCurrency;
  }

  private java.math.BigDecimal rate;

  public java.math.BigDecimal getRate() {
    return this.rate;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }

}
