/**
 * Generated from schema type t=RateDiscount@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class RateDiscount implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscountType rateDiscountType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscountType getRateDiscountType() {
    return this.rateDiscountType;
  }

  public void setRateDiscountType(be.e1.bssv.J564200.com.beone.fedex.beshipments.RateDiscountType rateDiscountType) {
    this.rateDiscountType = rateDiscountType;
  }

  private java.lang.String description;

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money amount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getAmount() {
    return this.amount;
  }

  public void setAmount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money amount) {
    this.amount = amount;
  }

  private java.math.BigDecimal percent;

  public java.math.BigDecimal getPercent() {
    return this.percent;
  }

  public void setPercent(java.math.BigDecimal percent) {
    this.percent = percent;
  }

}
