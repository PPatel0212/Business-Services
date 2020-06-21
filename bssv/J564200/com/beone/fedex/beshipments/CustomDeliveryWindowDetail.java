/**
 * Generated from schema type t=CustomDeliveryWindowDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomDeliveryWindowDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomDeliveryWindowType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomDeliveryWindowType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomDeliveryWindowType type) {
    this.type = type;
  }

  private java.util.Calendar requestTime;

  public java.util.Calendar getRequestTime() {
    return this.requestTime;
  }

  public void setRequestTime(java.util.Calendar requestTime) {
    this.requestTime = requestTime;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange requestRange;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange getRequestRange() {
    return this.requestRange;
  }

  public void setRequestRange(be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange requestRange) {
    this.requestRange = requestRange;
  }

  private java.util.Calendar requestDate;

  public java.util.Calendar getRequestDate() {
    return this.requestDate;
  }

  public void setRequestDate(java.util.Calendar requestDate) {
    this.requestDate = requestDate;
  }

}
