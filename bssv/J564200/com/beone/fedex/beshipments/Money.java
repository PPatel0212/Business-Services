/**
 * Generated from schema type t=Money@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Money implements java.io.Serializable {

  private java.lang.String currency;

  public java.lang.String getCurrency() {
    return this.currency;
  }

  public void setCurrency(java.lang.String currency) {
    this.currency = currency;
  }

  private java.math.BigDecimal amount;

  public java.math.BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

}
