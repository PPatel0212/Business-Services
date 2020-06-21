/**
 * Generated from schema type t=FreightGuaranteeDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class FreightGuaranteeDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightGuaranteeType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightGuaranteeType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightGuaranteeType type) {
    this.type = type;
  }

  private java.util.Calendar date;

  public java.util.Calendar getDate() {
    return this.date;
  }

  public void setDate(java.util.Calendar date) {
    this.date = date;
  }

}
