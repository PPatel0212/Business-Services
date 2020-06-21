/**
 * Generated from schema type t=ShipmentDryIceDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShipmentDryIceDetail implements java.io.Serializable {

  private java.math.BigInteger packageCount;

  public java.math.BigInteger getPackageCount() {
    return this.packageCount;
  }

  public void setPackageCount(java.math.BigInteger packageCount) {
    this.packageCount = packageCount;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight totalWeight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getTotalWeight() {
    return this.totalWeight;
  }

  public void setTotalWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight totalWeight) {
    this.totalWeight = totalWeight;
  }

}
