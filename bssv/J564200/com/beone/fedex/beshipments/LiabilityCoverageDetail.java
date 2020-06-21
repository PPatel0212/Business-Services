/**
 * Generated from schema type t=LiabilityCoverageDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class LiabilityCoverageDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageType coverageType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageType getCoverageType() {
    return this.coverageType;
  }

  public void setCoverageType(be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageType coverageType) {
    this.coverageType = coverageType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money coverageAmount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getCoverageAmount() {
    return this.coverageAmount;
  }

  public void setCoverageAmount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money coverageAmount) {
    this.coverageAmount = coverageAmount;
  }

}
