/**
 * Generated from schema type t=CompletedCodDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CompletedCodDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money collectionAmount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getCollectionAmount() {
    return this.collectionAmount;
  }

  public void setCollectionAmount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money collectionAmount) {
    this.collectionAmount = collectionAmount;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAdjustmentType adjustmentType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAdjustmentType getAdjustmentType() {
    return this.adjustmentType;
  }

  public void setAdjustmentType(be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAdjustmentType adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

}
