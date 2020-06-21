/**
 * Generated from schema type t=Surcharge@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Surcharge implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SurchargeType surchargeType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SurchargeType getSurchargeType() {
    return this.surchargeType;
  }

  public void setSurchargeType(be.e1.bssv.J564200.com.beone.fedex.beshipments.SurchargeType surchargeType) {
    this.surchargeType = surchargeType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SurchargeLevelType level;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SurchargeLevelType getLevel() {
    return this.level;
  }

  public void setLevel(be.e1.bssv.J564200.com.beone.fedex.beshipments.SurchargeLevelType level) {
    this.level = level;
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

}
