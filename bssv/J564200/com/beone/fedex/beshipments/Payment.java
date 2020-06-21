/**
 * Generated from schema type t=Payment@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class Payment implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PaymentType paymentType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PaymentType getPaymentType() {
    return this.paymentType;
  }

  public void setPaymentType(be.e1.bssv.J564200.com.beone.fedex.beshipments.PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Payor payor;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Payor getPayor() {
    return this.payor;
  }

  public void setPayor(be.e1.bssv.J564200.com.beone.fedex.beshipments.Payor payor) {
    this.payor = payor;
  }

}
