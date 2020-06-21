/**
 * Generated from schema type t=Rebate@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Rebate implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RebateType rebateType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RebateType getRebateType() {
    return this.rebateType;
  }

  public void setRebateType(be.e1.bssv.J564200.com.beone.fedex.beshipments.RebateType rebateType) {
    this.rebateType = rebateType;
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
