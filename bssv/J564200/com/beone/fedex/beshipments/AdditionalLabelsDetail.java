/**
 * Generated from schema type t=AdditionalLabelsDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class AdditionalLabelsDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsType type) {
    this.type = type;
  }

  private java.math.BigInteger count;

  public java.math.BigInteger getCount() {
    return this.count;
  }

  public void setCount(java.math.BigInteger count) {
    this.count = count;
  }

}
